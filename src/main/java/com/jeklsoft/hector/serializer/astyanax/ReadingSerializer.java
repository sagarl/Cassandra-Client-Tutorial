package com.jeklsoft.hector.serializer.astyanax;

import com.jeklsoft.hector.Reading;
import com.jeklsoft.hector.serializer.ReadingSerializerUtils;
import com.netflix.astyanax.serializers.AbstractSerializer;
import org.apache.log4j.Logger;

import java.nio.ByteBuffer;

public class ReadingSerializer extends AbstractSerializer<Reading> {
    private static final Logger log = Logger.getLogger(ReadingSerializer.class);

    private static final ReadingSerializer instance = new ReadingSerializer();

    public static ReadingSerializer get() {
        return instance;
    }

    @Override
    public ByteBuffer toByteBuffer(Reading reading) {
        return ReadingSerializerUtils.toByteBuffer(reading);
    }

    @Override
    public Reading fromByteBuffer(ByteBuffer byteBuffer) {
        return ReadingSerializerUtils.fromByteBuffer(byteBuffer);
    }
}
