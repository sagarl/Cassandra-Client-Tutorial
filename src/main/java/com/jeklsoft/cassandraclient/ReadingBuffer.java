// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reading_buffer.proto

package com.jeklsoft.cassandraclient;

public final class ReadingBuffer {
    private ReadingBuffer() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface ReadingOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required bytes sensor_id = 1;
        boolean hasSensorId();

        com.google.protobuf.ByteString getSensorId();

        // optional int64 timestamp = 2;
        boolean hasTimestamp();

        long getTimestamp();

        // optional bytes temperature = 3;
        boolean hasTemperature();

        com.google.protobuf.ByteString getTemperature();

        // optional int32 wind_speed = 4;
        boolean hasWindSpeed();

        int getWindSpeed();

        // optional string wind_direction = 5;
        boolean hasWindDirection();

        String getWindDirection();

        // optional bytes humidity = 6;
        boolean hasHumidity();

        com.google.protobuf.ByteString getHumidity();

        // optional bool bad_air_quality_detected = 7;
        boolean hasBadAirQualityDetected();

        boolean getBadAirQualityDetected();
    }

    public static final class Reading extends
            com.google.protobuf.GeneratedMessage
            implements ReadingOrBuilder {
        // Use Reading.newBuilder() to construct.
        private Reading(Builder builder) {
            super(builder);
        }

        private Reading(boolean noInit) {
        }

        private static final Reading defaultInstance;

        public static Reading getDefaultInstance() {
            return defaultInstance;
        }

        public Reading getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.jeklsoft.cassandraclient.ReadingBuffer.internal_static_com_jeklsoft_hector_Reading_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.jeklsoft.cassandraclient.ReadingBuffer.internal_static_com_jeklsoft_hector_Reading_fieldAccessorTable;
        }

        private int bitField0_;
        // required bytes sensor_id = 1;
        public static final int SENSOR_ID_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString sensorId_;

        public boolean hasSensorId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public com.google.protobuf.ByteString getSensorId() {
            return sensorId_;
        }

        // optional int64 timestamp = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private long timestamp_;

        public boolean hasTimestamp() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public long getTimestamp() {
            return timestamp_;
        }

        // optional bytes temperature = 3;
        public static final int TEMPERATURE_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString temperature_;

        public boolean hasTemperature() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public com.google.protobuf.ByteString getTemperature() {
            return temperature_;
        }

        // optional int32 wind_speed = 4;
        public static final int WIND_SPEED_FIELD_NUMBER = 4;
        private int windSpeed_;

        public boolean hasWindSpeed() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        public int getWindSpeed() {
            return windSpeed_;
        }

        // optional string wind_direction = 5;
        public static final int WIND_DIRECTION_FIELD_NUMBER = 5;
        private java.lang.Object windDirection_;

        public boolean hasWindDirection() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        public String getWindDirection() {
            java.lang.Object ref = windDirection_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    windDirection_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getWindDirectionBytes() {
            java.lang.Object ref = windDirection_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                windDirection_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional bytes humidity = 6;
        public static final int HUMIDITY_FIELD_NUMBER = 6;
        private com.google.protobuf.ByteString humidity_;

        public boolean hasHumidity() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }

        public com.google.protobuf.ByteString getHumidity() {
            return humidity_;
        }

        // optional bool bad_air_quality_detected = 7;
        public static final int BAD_AIR_QUALITY_DETECTED_FIELD_NUMBER = 7;
        private boolean badAirQualityDetected_;

        public boolean hasBadAirQualityDetected() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }

        public boolean getBadAirQualityDetected() {
            return badAirQualityDetected_;
        }

        private void initFields() {
            sensorId_ = com.google.protobuf.ByteString.EMPTY;
            timestamp_ = 0L;
            temperature_ = com.google.protobuf.ByteString.EMPTY;
            windSpeed_ = 0;
            windDirection_ = "";
            humidity_ = com.google.protobuf.ByteString.EMPTY;
            badAirQualityDetected_ = false;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSensorId()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, sensorId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt64(2, timestamp_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, temperature_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt32(4, windSpeed_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getWindDirectionBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBytes(6, humidity_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeBool(7, badAirQualityDetected_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, sensorId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(2, timestamp_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, temperature_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, windSpeed_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5, getWindDirectionBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(6, humidity_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(7, badAirQualityDetected_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static com.jeklsoft.cassandraclient.ReadingBuffer.Reading parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.jeklsoft.cassandraclient.ReadingBuffer.Reading prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements com.jeklsoft.cassandraclient.ReadingBuffer.ReadingOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.jeklsoft.cassandraclient.ReadingBuffer.internal_static_com_jeklsoft_hector_Reading_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.jeklsoft.cassandraclient.ReadingBuffer.internal_static_com_jeklsoft_hector_Reading_fieldAccessorTable;
            }

            // Construct using com.jeklsoft.cassandraclient.ReadingBuffer.Reading.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                sensorId_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                timestamp_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                temperature_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                windSpeed_ = 0;
                bitField0_ = (bitField0_ & ~0x00000008);
                windDirection_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                humidity_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000020);
                badAirQualityDetected_ = false;
                bitField0_ = (bitField0_ & ~0x00000040);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.jeklsoft.cassandraclient.ReadingBuffer.Reading.getDescriptor();
            }

            public com.jeklsoft.cassandraclient.ReadingBuffer.Reading getDefaultInstanceForType() {
                return com.jeklsoft.cassandraclient.ReadingBuffer.Reading.getDefaultInstance();
            }

            public com.jeklsoft.cassandraclient.ReadingBuffer.Reading build() {
                com.jeklsoft.cassandraclient.ReadingBuffer.Reading result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private com.jeklsoft.cassandraclient.ReadingBuffer.Reading buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                com.jeklsoft.cassandraclient.ReadingBuffer.Reading result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public com.jeklsoft.cassandraclient.ReadingBuffer.Reading buildPartial() {
                com.jeklsoft.cassandraclient.ReadingBuffer.Reading result = new com.jeklsoft.cassandraclient.ReadingBuffer.Reading(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sensorId_ = sensorId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.timestamp_ = timestamp_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.temperature_ = temperature_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.windSpeed_ = windSpeed_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.windDirection_ = windDirection_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.humidity_ = humidity_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.badAirQualityDetected_ = badAirQualityDetected_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.jeklsoft.cassandraclient.ReadingBuffer.Reading) {
                    return mergeFrom((com.jeklsoft.cassandraclient.ReadingBuffer.Reading) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.jeklsoft.cassandraclient.ReadingBuffer.Reading other) {
                if (other == com.jeklsoft.cassandraclient.ReadingBuffer.Reading.getDefaultInstance()) return this;
                if (other.hasSensorId()) {
                    setSensorId(other.getSensorId());
                }
                if (other.hasTimestamp()) {
                    setTimestamp(other.getTimestamp());
                }
                if (other.hasTemperature()) {
                    setTemperature(other.getTemperature());
                }
                if (other.hasWindSpeed()) {
                    setWindSpeed(other.getWindSpeed());
                }
                if (other.hasWindDirection()) {
                    setWindDirection(other.getWindDirection());
                }
                if (other.hasHumidity()) {
                    setHumidity(other.getHumidity());
                }
                if (other.hasBadAirQualityDetected()) {
                    setBadAirQualityDetected(other.getBadAirQualityDetected());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSensorId()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder(
                                this.getUnknownFields());
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            this.setUnknownFields(unknownFields.build());
                            onChanged();
                            return this;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                this.setUnknownFields(unknownFields.build());
                                onChanged();
                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            sensorId_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            timestamp_ = input.readInt64();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            temperature_ = input.readBytes();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            windSpeed_ = input.readInt32();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            windDirection_ = input.readBytes();
                            break;
                        }
                        case 50: {
                            bitField0_ |= 0x00000020;
                            humidity_ = input.readBytes();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            badAirQualityDetected_ = input.readBool();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // required bytes sensor_id = 1;
            private com.google.protobuf.ByteString sensorId_ = com.google.protobuf.ByteString.EMPTY;

            public boolean hasSensorId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public com.google.protobuf.ByteString getSensorId() {
                return sensorId_;
            }

            public Builder setSensorId(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                sensorId_ = value;
                onChanged();
                return this;
            }

            public Builder clearSensorId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sensorId_ = getDefaultInstance().getSensorId();
                onChanged();
                return this;
            }

            // optional int64 timestamp = 2;
            private long timestamp_;

            public boolean hasTimestamp() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public long getTimestamp() {
                return timestamp_;
            }

            public Builder setTimestamp(long value) {
                bitField0_ |= 0x00000002;
                timestamp_ = value;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                bitField0_ = (bitField0_ & ~0x00000002);
                timestamp_ = 0L;
                onChanged();
                return this;
            }

            // optional bytes temperature = 3;
            private com.google.protobuf.ByteString temperature_ = com.google.protobuf.ByteString.EMPTY;

            public boolean hasTemperature() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public com.google.protobuf.ByteString getTemperature() {
                return temperature_;
            }

            public Builder setTemperature(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                temperature_ = value;
                onChanged();
                return this;
            }

            public Builder clearTemperature() {
                bitField0_ = (bitField0_ & ~0x00000004);
                temperature_ = getDefaultInstance().getTemperature();
                onChanged();
                return this;
            }

            // optional int32 wind_speed = 4;
            private int windSpeed_;

            public boolean hasWindSpeed() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            public int getWindSpeed() {
                return windSpeed_;
            }

            public Builder setWindSpeed(int value) {
                bitField0_ |= 0x00000008;
                windSpeed_ = value;
                onChanged();
                return this;
            }

            public Builder clearWindSpeed() {
                bitField0_ = (bitField0_ & ~0x00000008);
                windSpeed_ = 0;
                onChanged();
                return this;
            }

            // optional string wind_direction = 5;
            private java.lang.Object windDirection_ = "";

            public boolean hasWindDirection() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            public String getWindDirection() {
                java.lang.Object ref = windDirection_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    windDirection_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setWindDirection(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                windDirection_ = value;
                onChanged();
                return this;
            }

            public Builder clearWindDirection() {
                bitField0_ = (bitField0_ & ~0x00000010);
                windDirection_ = getDefaultInstance().getWindDirection();
                onChanged();
                return this;
            }

            void setWindDirection(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000010;
                windDirection_ = value;
                onChanged();
            }

            // optional bytes humidity = 6;
            private com.google.protobuf.ByteString humidity_ = com.google.protobuf.ByteString.EMPTY;

            public boolean hasHumidity() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }

            public com.google.protobuf.ByteString getHumidity() {
                return humidity_;
            }

            public Builder setHumidity(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                humidity_ = value;
                onChanged();
                return this;
            }

            public Builder clearHumidity() {
                bitField0_ = (bitField0_ & ~0x00000020);
                humidity_ = getDefaultInstance().getHumidity();
                onChanged();
                return this;
            }

            // optional bool bad_air_quality_detected = 7;
            private boolean badAirQualityDetected_;

            public boolean hasBadAirQualityDetected() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }

            public boolean getBadAirQualityDetected() {
                return badAirQualityDetected_;
            }

            public Builder setBadAirQualityDetected(boolean value) {
                bitField0_ |= 0x00000040;
                badAirQualityDetected_ = value;
                onChanged();
                return this;
            }

            public Builder clearBadAirQualityDetected() {
                bitField0_ = (bitField0_ & ~0x00000040);
                badAirQualityDetected_ = false;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:com.jeklsoft.cassandraclient.Reading)
        }

        static {
            defaultInstance = new Reading(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:com.jeklsoft.cassandraclient.Reading)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_com_jeklsoft_hector_Reading_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_com_jeklsoft_hector_Reading_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\024reading_buffer.proto\022\023com.jeklsoft.hec" +
                        "tor\"\244\001\n\007Reading\022\021\n\tsensor_id\030\001 \002(\014\022\021\n\tti" +
                        "mestamp\030\002 \001(\003\022\023\n\013temperature\030\003 \001(\014\022\022\n\nwi" +
                        "nd_speed\030\004 \001(\005\022\026\n\016wind_direction\030\005 \001(\t\022\020" +
                        "\n\010humidity\030\006 \001(\014\022 \n\030bad_air_quality_dete" +
                        "cted\030\007 \001(\010B$\n\023com.jeklsoft.hectorB\rReadi" +
                        "ngBuffer"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_com_jeklsoft_hector_Reading_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_com_jeklsoft_hector_Reading_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_com_jeklsoft_hector_Reading_descriptor,
                                new java.lang.String[]{"SensorId", "Timestamp", "Temperature", "WindSpeed", "WindDirection", "Humidity", "BadAirQualityDetected",},
                                com.jeklsoft.cassandraclient.ReadingBuffer.Reading.class,
                                com.jeklsoft.cassandraclient.ReadingBuffer.Reading.Builder.class);
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
