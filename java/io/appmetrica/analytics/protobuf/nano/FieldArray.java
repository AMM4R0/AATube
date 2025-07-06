package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    public FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] r5, int[] r6, int r7) {
        for (int r12 = 0; r12 < r7; r12++) {
            if (r5[r12] != r6[r12]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int r5) {
        int r02 = this.mSize - 1;
        int r12 = 0;
        while (r12 <= r02) {
            int r2 = (r12 + r02) >>> 1;
            int r3 = this.mFieldNumbers[r2];
            if (r3 < r5) {
                r12 = r2 + 1;
            } else {
                if (r3 <= r5) {
                    return r2;
                }
                r02 = r2 - 1;
            }
        }
        return ~r12;
    }

    /* renamed from: gc */
    private void m4762gc() {
        int r02 = this.mSize;
        int[] r12 = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int r5 = 0;
        for (int r4 = 0; r4 < r02; r4++) {
            FieldData fieldData = fieldDataArr[r4];
            if (fieldData != DELETED) {
                if (r4 != r5) {
                    r12[r5] = r12[r4];
                    fieldDataArr[r5] = fieldData;
                    fieldDataArr[r4] = null;
                }
                r5++;
            }
        }
        this.mGarbage = false;
        this.mSize = r5;
    }

    private int idealByteArraySize(int r3) {
        for (int r02 = 4; r02 < 32; r02++) {
            int r12 = (1 << r02) - 12;
            if (r3 <= r12) {
                return r12;
            }
        }
        return r3;
    }

    private int idealIntArraySize(int r12) {
        return idealByteArraySize(r12 * 4) / 4;
    }

    public FieldData dataAt(int r2) {
        if (this.mGarbage) {
            m4762gc();
        }
        return this.mData[r2];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        if (size() != fieldArray.size()) {
            return false;
        }
        return arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    public FieldData get(int r2) {
        FieldData fieldData;
        int binarySearch = binarySearch(r2);
        if (binarySearch < 0 || (fieldData = this.mData[binarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            m4762gc();
        }
        int r02 = 17;
        for (int r12 = 0; r12 < this.mSize; r12++) {
            r02 = (((r02 * 31) + this.mFieldNumbers[r12]) * 31) + this.mData[r12].hashCode();
        }
        return r02;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(int r7, FieldData fieldData) {
        int binarySearch = binarySearch(r7);
        if (binarySearch >= 0) {
            this.mData[binarySearch] = fieldData;
            return;
        }
        int r02 = ~binarySearch;
        int r12 = this.mSize;
        if (r02 < r12) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[r02] == DELETED) {
                this.mFieldNumbers[r02] = r7;
                fieldDataArr[r02] = fieldData;
                return;
            }
        }
        if (this.mGarbage && r12 >= this.mFieldNumbers.length) {
            m4762gc();
            r02 = ~binarySearch(r7);
        }
        int r13 = this.mSize;
        if (r13 >= this.mFieldNumbers.length) {
            int idealIntArraySize = idealIntArraySize(r13 + 1);
            int[] r2 = new int[idealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[idealIntArraySize];
            int[] r3 = this.mFieldNumbers;
            System.arraycopy(r3, 0, r2, 0, r3.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = r2;
            this.mData = fieldDataArr2;
        }
        int r14 = this.mSize - r02;
        if (r14 != 0) {
            int[] r22 = this.mFieldNumbers;
            int r32 = r02 + 1;
            System.arraycopy(r22, r02, r22, r32, r14);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, r02, fieldDataArr4, r32, this.mSize - r02);
        }
        this.mFieldNumbers[r02] = r7;
        this.mData[r02] = fieldData;
        this.mSize++;
    }

    public void remove(int r4) {
        int binarySearch = binarySearch(r4);
        if (binarySearch >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[binarySearch];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[binarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    public int size() {
        if (this.mGarbage) {
            m4762gc();
        }
        return this.mSize;
    }

    public FieldArray(int r3) {
        this.mGarbage = false;
        int idealIntArraySize = idealIntArraySize(r3);
        this.mFieldNumbers = new int[idealIntArraySize];
        this.mData = new FieldData[idealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int r7) {
        for (int r12 = 0; r12 < r7; r12++) {
            if (!fieldDataArr[r12].equals(fieldDataArr2[r12])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldArray m5538clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int r4 = 0; r4 < size; r4++) {
            FieldData fieldData = this.mData[r4];
            if (fieldData != null) {
                fieldArray.mData[r4] = fieldData.m5539clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
