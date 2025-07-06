package io.appmetrica.analytics.protobuf.nano;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class FieldData implements Cloneable {
    private Extension<?, ?> cachedExtension;
    private List<UnknownFieldData> unknownFieldData;
    private Object value;

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldData(Extension<?, T> extension, T t2) {
        this.cachedExtension = extension;
        this.value = t2;
    }

    private byte[] toByteArray() {
        byte[] bArr = new byte[computeSerializedSize()];
        writeTo(CodedOutputByteBufferNano.newInstance(bArr));
        return bArr;
    }

    public void addUnknownField(UnknownFieldData unknownFieldData) {
        this.unknownFieldData.add(unknownFieldData);
    }

    public int computeSerializedSize() {
        Object obj = this.value;
        if (obj != null) {
            return this.cachedExtension.computeSerializedSize(obj);
        }
        Iterator<UnknownFieldData> it = this.unknownFieldData.iterator();
        int r12 = 0;
        while (it.hasNext()) {
            r12 += it.next().computeSerializedSize();
        }
        return r12;
    }

    public boolean equals(Object obj) {
        List<UnknownFieldData> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldData)) {
            return false;
        }
        FieldData fieldData = (FieldData) obj;
        if (this.value == null || fieldData.value == null) {
            List<UnknownFieldData> list2 = this.unknownFieldData;
            if (list2 != null && (list = fieldData.unknownFieldData) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), fieldData.toByteArray());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        Extension<?, ?> extension = this.cachedExtension;
        if (extension != fieldData.cachedExtension) {
            return false;
        }
        if (!extension.clazz.isArray()) {
            return this.value.equals(fieldData.value);
        }
        Object obj2 = this.value;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) fieldData.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) fieldData.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) fieldData.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) fieldData.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) fieldData.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) fieldData.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) fieldData.value);
    }

    public UnknownFieldData getUnknownField(int r3) {
        List<UnknownFieldData> list = this.unknownFieldData;
        if (list != null && r3 < list.size()) {
            return this.unknownFieldData.get(r3);
        }
        return null;
    }

    public int getUnknownFieldSize() {
        List<UnknownFieldData> list = this.unknownFieldData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getValue(Extension<?, T> extension) {
        if (this.value == null) {
            this.cachedExtension = extension;
            this.value = extension.getValueFrom(this.unknownFieldData);
            this.unknownFieldData = null;
        } else if (this.cachedExtension != extension) {
            throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return (T) this.value;
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void setValue(Extension<?, T> extension, T t2) {
        this.cachedExtension = extension;
        this.value = t2;
        this.unknownFieldData = null;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Object obj = this.value;
        if (obj != null) {
            this.cachedExtension.writeTo(obj, codedOutputByteBufferNano);
            return;
        }
        Iterator<UnknownFieldData> it = this.unknownFieldData.iterator();
        while (it.hasNext()) {
            it.next().writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldData m5539clone() {
        FieldData fieldData = new FieldData();
        try {
            fieldData.cachedExtension = this.cachedExtension;
            List<UnknownFieldData> list = this.unknownFieldData;
            if (list == null) {
                fieldData.unknownFieldData = null;
            } else {
                fieldData.unknownFieldData.addAll(list);
            }
            Object obj = this.value;
            if (obj != null) {
                if (obj instanceof MessageNano) {
                    fieldData.value = ((MessageNano) obj).mo5537clone();
                } else if (obj instanceof byte[]) {
                    fieldData.value = ((byte[]) obj).clone();
                } else {
                    int r3 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        fieldData.value = bArr2;
                        while (r3 < bArr.length) {
                            bArr2[r3] = (byte[]) bArr[r3].clone();
                            r3++;
                        }
                    } else if (obj instanceof boolean[]) {
                        fieldData.value = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        fieldData.value = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        fieldData.value = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        fieldData.value = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        fieldData.value = ((double[]) obj).clone();
                    } else if (obj instanceof MessageNano[]) {
                        MessageNano[] messageNanoArr = (MessageNano[]) obj;
                        MessageNano[] messageNanoArr2 = new MessageNano[messageNanoArr.length];
                        fieldData.value = messageNanoArr2;
                        while (r3 < messageNanoArr.length) {
                            messageNanoArr2[r3] = messageNanoArr[r3].mo5537clone();
                            r3++;
                        }
                    }
                }
            }
            return fieldData;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public FieldData() {
        this.unknownFieldData = new ArrayList();
    }
}
