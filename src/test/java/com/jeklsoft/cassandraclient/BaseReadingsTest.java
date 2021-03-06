//Copyright 2012 Joe McTee
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.jeklsoft.cassandraclient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;

public class BaseReadingsTest {
    private static final Logger log = Logger.getLogger(BaseReadingsTest.class);

    protected static final String configurationPath = "target/cassandra";
    protected static final String cassandraHostname = "localhost";
    protected static final Integer cassandraPort = 9160;
    protected static final Integer cassandraEmbeddedPort = 9161;
    protected static final String cassandraKeySpaceName = "Climate";
    protected static final String cassandraClusterName = "SensorNet";
    protected static final String columnFamilyName = "BoulderSensors";

    protected void runAccessorTest(ReadingsPersistor persistor) {

        UUID sensorId1 = new UUID(0, 100);
        UUID sensorId2 = new UUID(0, 200);

        DateTime baseDate = new DateTime();
        int readingInterval = 15; // 15 minutes

        List<Reading> readings = new ArrayList<Reading>();

        for (int ii = 0; ii < 10; ii++) {

            BigDecimal temperature = new BigDecimal(230 + ii).movePointLeft(1);
            readings.add(new Reading(sensorId1, baseDate.plusMinutes(readingInterval * ii), temperature,
                    16, "W", BigInteger.valueOf(17L), false));

            temperature = new BigDecimal(195 - ii).movePointLeft(1);
            readings.add(new Reading(sensorId2, baseDate.plusMinutes(readingInterval * ii), temperature,
                    24, "ESE", BigInteger.valueOf(17L), false));
        }

        persistor.addReadings(readings);

        List<Reading> expectedReadings = new ArrayList<Reading>();
        for (int ii = 0; ii < 3; ii++) {
            BigDecimal temperature = new BigDecimal(234 + ii).movePointLeft(1);
            expectedReadings.add(new Reading(sensorId1, baseDate.plusMinutes(readingInterval * (ii + 4)),
                    temperature, 16, "W", BigInteger.valueOf(17L), false));
        }

        DateTime startTime = new DateTime(baseDate.plusMinutes(readingInterval * 4));
        DateTime endTime = new DateTime(baseDate.plusMinutes(readingInterval * 6));
        Duration duration = new Duration(startTime, endTime);
        Interval interval = new Interval(startTime, duration);

        List<Reading> returnedReadings = persistor.querySensorReadingsByInterval(sensorId1, interval, 10);

        assertEquals(expectedReadings.size(), returnedReadings.size());

        for (Reading expectedReading : expectedReadings) {
            log.info("Sensor1: " + expectedReading);
            assertTrue(returnedReadings.contains(expectedReading));
        }

        expectedReadings = new ArrayList<Reading>();
        for (int ii = 0; ii < 4; ii++) {
            BigDecimal temperature = new BigDecimal(195 - ii).movePointLeft(1);
            expectedReadings.add(new Reading(sensorId2, baseDate.plusMinutes(readingInterval * ii),
                    temperature, 24, "ESE", BigInteger.valueOf(17L), false));
        }

        startTime = new DateTime(baseDate);
        endTime = new DateTime(baseDate.plusMinutes(readingInterval * 3));
        duration = new Duration(startTime, endTime);
        interval = new Interval(startTime, duration);

        returnedReadings = persistor.querySensorReadingsByInterval(sensorId2, interval, 10);

        assertEquals(expectedReadings.size(), returnedReadings.size());

        for (Reading expectedReading : expectedReadings) {
            log.info("Sensor2: " + expectedReading);
            assertTrue(returnedReadings.contains(expectedReading));
        }
    }
}
