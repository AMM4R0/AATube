package p138x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C2884f extends AbstractC0498b {
    public static final Parcelable.Creator<C2884f> CREATOR = new C0420d(9);

    /* renamed from: c */
    public SparseArray f9506c;

    public C2884f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] r12 = new int[readInt];
        parcel.readIntArray(r12);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f9506c = new SparseArray(readInt);
        for (int r7 = 0; r7 < readInt; r7++) {
            this.f9506c.append(r12[r7], readParcelableArray[r7]);
        }
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        super.writeToParcel(parcel, r7);
        SparseArray sparseArray = this.f9506c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] r2 = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int r12 = 0; r12 < size; r12++) {
            r2[r12] = this.f9506c.keyAt(r12);
            parcelableArr[r12] = (Parcelable) this.f9506c.valueAt(r12);
        }
        parcel.writeIntArray(r2);
        parcel.writeParcelableArray(parcelableArr, r7);
    }
}
