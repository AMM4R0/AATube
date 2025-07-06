package p052S;

import android.os.Parcel;
import android.os.Parcelable;
import p044P0.C0420d;

/* renamed from: S.b */
/* loaded from: classes.dex */
public abstract class AbstractC0498b implements Parcelable {

    /* renamed from: a */
    public final Parcelable f1263a;

    /* renamed from: b */
    public static final C0497a f1262b = new C0497a();
    public static final Parcelable.Creator<AbstractC0498b> CREATOR = new C0420d(2);

    public AbstractC0498b() {
        this.f1263a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeParcelable(this.f1263a, r3);
    }

    public AbstractC0498b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1263a = parcelable == f1262b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0498b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1263a = readParcelable == null ? f1262b : readParcelable;
    }
}
