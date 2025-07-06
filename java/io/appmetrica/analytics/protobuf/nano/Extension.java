package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Extension<M extends ExtendableMessageNano<M>, T> {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected final Class<T> clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    public static class PrimitiveExtension<M extends ExtendableMessageNano<M>, T> extends Extension<M, T> {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int r7, Class<T> cls, int r9, boolean z2, int r11, int r12) {
            super(r7, cls, r9, z2);
            this.nonPackedTag = r11;
            this.packedTag = r12;
        }

        private int computePackedDataSize(Object obj) {
            int r12;
            int length = Array.getLength(obj);
            int r2 = 0;
            switch (this.type) {
                case 1:
                case 6:
                case 16:
                    return length * 8;
                case 2:
                case 7:
                case 15:
                    return length * 4;
                case 3:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(obj, r2));
                        r2++;
                    }
                    break;
                case 4:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(obj, r2));
                        r2++;
                    }
                    break;
                case 5:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(obj, r2));
                        r2++;
                    }
                    break;
                case 8:
                    return length;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    throw new IllegalArgumentException("Unexpected non-packable type " + this.type);
                case 13:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(obj, r2));
                        r2++;
                    }
                    break;
                case 14:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(obj, r2));
                        r2++;
                    }
                    break;
                case 17:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(obj, r2));
                        r2++;
                    }
                    break;
                case 18:
                    r12 = 0;
                    while (r2 < length) {
                        r12 += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(obj, r2));
                        r2++;
                    }
                    break;
            }
            return r12;
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public int computeRepeatedSerializedSize(Object obj) {
            int r02 = this.tag;
            if (r02 == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(obj);
            }
            if (r02 == this.packedTag) {
                int computePackedDataSize = computePackedDataSize(obj);
                return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + CodedOutputByteBufferNano.computeRawVarint32Size(computePackedDataSize) + computePackedDataSize;
            }
            throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public final int computeSingularSerializedSize(Object obj) {
            int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1:
                    return CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumber, ((Double) obj).doubleValue());
                case 2:
                    return CodedOutputByteBufferNano.computeFloatSize(tagFieldNumber, ((Float) obj).floatValue());
                case 3:
                    return CodedOutputByteBufferNano.computeInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 4:
                    return CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 5:
                    return CodedOutputByteBufferNano.computeInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 6:
                    return CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 7:
                    return CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 8:
                    return CodedOutputByteBufferNano.computeBoolSize(tagFieldNumber, ((Boolean) obj).booleanValue());
                case 9:
                    return CodedOutputByteBufferNano.computeStringSize(tagFieldNumber, (String) obj);
                case 10:
                case 11:
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
                case 12:
                    return CodedOutputByteBufferNano.computeBytesSize(tagFieldNumber, (byte[]) obj);
                case 13:
                    return CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 14:
                    return CodedOutputByteBufferNano.computeEnumSize(tagFieldNumber, ((Integer) obj).intValue());
                case 15:
                    return CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 16:
                    return CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 17:
                    return CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 18:
                    return CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumber, ((Long) obj).longValue());
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                return codedInputByteBufferNano.readPrimitiveField(this.type);
            } catch (IOException e2) {
                throw new IllegalArgumentException("Error reading extension field", e2);
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
            if (unknownFieldData.tag == this.nonPackedTag) {
                list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
                return;
            }
            CodedInputByteBufferNano newInstance = CodedInputByteBufferNano.newInstance(unknownFieldData.bytes);
            try {
                newInstance.pushLimit(newInstance.readRawVarint32());
                while (!newInstance.isAtEnd()) {
                    list.add(readData(newInstance));
                }
            } catch (IOException e2) {
                throw new IllegalArgumentException("Error reading extension field", e2);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int r12 = this.tag;
            if (r12 == this.nonPackedTag) {
                super.writeRepeatedData(obj, codedOutputByteBufferNano);
                return;
            }
            if (r12 != this.packedTag) {
                throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
            }
            int length = Array.getLength(obj);
            int computePackedDataSize = computePackedDataSize(obj);
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                codedOutputByteBufferNano.writeRawVarint32(computePackedDataSize);
                int r3 = 0;
                switch (this.type) {
                    case 1:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeDoubleNoTag(Array.getDouble(obj, r3));
                            r3++;
                        }
                        return;
                    case 2:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeFloatNoTag(Array.getFloat(obj, r3));
                            r3++;
                        }
                        return;
                    case 3:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeInt64NoTag(Array.getLong(obj, r3));
                            r3++;
                        }
                        return;
                    case 4:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeUInt64NoTag(Array.getLong(obj, r3));
                            r3++;
                        }
                        return;
                    case 5:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeInt32NoTag(Array.getInt(obj, r3));
                            r3++;
                        }
                        return;
                    case 6:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeFixed64NoTag(Array.getLong(obj, r3));
                            r3++;
                        }
                        return;
                    case 7:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeFixed32NoTag(Array.getInt(obj, r3));
                            r3++;
                        }
                        return;
                    case 8:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeBoolNoTag(Array.getBoolean(obj, r3));
                            r3++;
                        }
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new IllegalArgumentException("Unpackable type " + this.type);
                    case 13:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeUInt32NoTag(Array.getInt(obj, r3));
                            r3++;
                        }
                        return;
                    case 14:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeEnumNoTag(Array.getInt(obj, r3));
                            r3++;
                        }
                        return;
                    case 15:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeSFixed32NoTag(Array.getInt(obj, r3));
                            r3++;
                        }
                        return;
                    case 16:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeSFixed64NoTag(Array.getLong(obj, r3));
                            r3++;
                        }
                        return;
                    case 17:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeSInt32NoTag(Array.getInt(obj, r3));
                            r3++;
                        }
                        return;
                    case 18:
                        while (r3 < length) {
                            codedOutputByteBufferNano.writeSInt64NoTag(Array.getLong(obj, r3));
                            r3++;
                        }
                        return;
                }
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public final void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 1:
                        codedOutputByteBufferNano.writeDoubleNoTag(((Double) obj).doubleValue());
                        return;
                    case 2:
                        codedOutputByteBufferNano.writeFloatNoTag(((Float) obj).floatValue());
                        return;
                    case 3:
                        codedOutputByteBufferNano.writeInt64NoTag(((Long) obj).longValue());
                        return;
                    case 4:
                        codedOutputByteBufferNano.writeUInt64NoTag(((Long) obj).longValue());
                        return;
                    case 5:
                        codedOutputByteBufferNano.writeInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 6:
                        codedOutputByteBufferNano.writeFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 7:
                        codedOutputByteBufferNano.writeFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 8:
                        codedOutputByteBufferNano.writeBoolNoTag(((Boolean) obj).booleanValue());
                        return;
                    case 9:
                        codedOutputByteBufferNano.writeStringNoTag((String) obj);
                        return;
                    case 10:
                    case 11:
                    default:
                        throw new IllegalArgumentException("Unknown type " + this.type);
                    case 12:
                        codedOutputByteBufferNano.writeBytesNoTag((byte[]) obj);
                        return;
                    case 13:
                        codedOutputByteBufferNano.writeUInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 14:
                        codedOutputByteBufferNano.writeEnumNoTag(((Integer) obj).intValue());
                        return;
                    case 15:
                        codedOutputByteBufferNano.writeSFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 16:
                        codedOutputByteBufferNano.writeSFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 17:
                        codedOutputByteBufferNano.writeSInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 18:
                        codedOutputByteBufferNano.writeSInt64NoTag(((Long) obj).longValue());
                        return;
                }
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    @Deprecated
    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int r2, Class<T> cls, int r4) {
        return new Extension<>(r2, cls, r4, false);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createPrimitiveTyped(int r8, Class<T> cls, long j2) {
        return new PrimitiveExtension(r8, cls, (int) j2, false, 0, 0);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T[]> createRepeatedMessageTyped(int r12, Class<T[]> cls, long j2) {
        return new Extension<>(r12, cls, (int) j2, true);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createRepeatedPrimitiveTyped(int r8, Class<T> cls, long j2, long j3, long j4) {
        return new PrimitiveExtension(r8, cls, (int) j2, true, (int) j3, (int) j4);
    }

    private T getRepeatedValueFrom(List<UnknownFieldData> list) {
        ArrayList arrayList = new ArrayList();
        for (int r2 = 0; r2 < list.size(); r2++) {
            UnknownFieldData unknownFieldData = list.get(r2);
            if (unknownFieldData.bytes.length != 0) {
                readDataInto(unknownFieldData, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        Class<T> cls = this.clazz;
        T cast = cls.cast(Array.newInstance(cls.getComponentType(), size));
        for (int r12 = 0; r12 < size; r12++) {
            Array.set(cast, r12, arrayList.get(r12));
        }
        return cast;
    }

    private T getSingularValueFrom(List<UnknownFieldData> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.clazz.cast(readData(CodedInputByteBufferNano.newInstance(list.get(list.size() - 1).bytes)));
    }

    public int computeRepeatedSerializedSize(Object obj) {
        int length = Array.getLength(obj);
        int r2 = 0;
        for (int r12 = 0; r12 < length; r12++) {
            if (Array.get(obj, r12) != null) {
                r2 = computeSingularSerializedSize(Array.get(obj, r12)) + r2;
            }
        }
        return r2;
    }

    public int computeSerializedSize(Object obj) {
        return this.repeated ? computeRepeatedSerializedSize(obj) : computeSingularSerializedSize(obj);
    }

    public int computeSingularSerializedSize(Object obj) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
        int r12 = this.type;
        if (r12 == 10) {
            return CodedOutputByteBufferNano.computeGroupSize(tagFieldNumber, (MessageNano) obj);
        }
        if (r12 == 11) {
            return CodedOutputByteBufferNano.computeMessageSize(tagFieldNumber, (MessageNano) obj);
        }
        throw new IllegalArgumentException("Unknown type " + this.type);
    }

    public final T getValueFrom(List<UnknownFieldData> list) {
        if (list == null) {
            return null;
        }
        return this.repeated ? getRepeatedValueFrom(list) : getSingularValueFrom(list);
    }

    public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
        Class componentType = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            int r3 = this.type;
            if (r3 == 10) {
                MessageNano messageNano = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                return messageNano;
            }
            if (r3 == 11) {
                MessageNano messageNano2 = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readMessage(messageNano2);
                return messageNano2;
            }
            throw new IllegalArgumentException("Unknown type " + this.type);
        } catch (IOException e2) {
            throw new IllegalArgumentException("Error reading extension field", e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e3);
        } catch (InstantiationException e4) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e4);
        }
    }

    public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
        list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int length = Array.getLength(obj);
        for (int r12 = 0; r12 < length; r12++) {
            Object obj2 = Array.get(obj, r12);
            if (obj2 != null) {
                writeSingularData(obj2, codedOutputByteBufferNano);
            }
        }
    }

    public void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.writeRawVarint32(this.tag);
            int r12 = this.type;
            if (r12 == 10) {
                int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
                codedOutputByteBufferNano.writeGroupNoTag((MessageNano) obj);
                codedOutputByteBufferNano.writeTag(tagFieldNumber, 4);
            } else if (r12 == 11) {
                codedOutputByteBufferNano.writeMessageNoTag((MessageNano) obj);
            } else {
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void writeTo(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.repeated) {
            writeRepeatedData(obj, codedOutputByteBufferNano);
        } else {
            writeSingularData(obj, codedOutputByteBufferNano);
        }
    }

    private Extension(int r12, Class<T> cls, int r3, boolean z2) {
        this.type = r12;
        this.clazz = cls;
        this.tag = r3;
        this.repeated = z2;
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int r12, Class<T> cls, long j2) {
        return new Extension<>(r12, cls, (int) j2, false);
    }
}
