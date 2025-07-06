package p044P0;

import android.os.Parcel;
import android.os.Parcelable;
import p047Q0.C0447b;
import p052S.AbstractC0498b;
import p065Y0.C0546a;
import p080e0.C0832O;
import p083f1.C0904c;
import p088h1.C0946z;
import p104l.C2563d1;
import p104l.C2605r1;
import p138x.C2884f;

/* renamed from: P0.d */
/* loaded from: classes.dex */
public final class C0420d implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f1086a;

    public /* synthetic */ C0420d(int r12) {
        this.f1086a = r12;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1086a) {
            case 0:
                return new C0421e(parcel, classLoader);
            case 1:
                return new C0447b(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0498b.f1262b;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new C0546a(parcel, classLoader);
            case 4:
                return new C0832O(parcel, classLoader);
            case 5:
                return new C0904c(parcel, classLoader);
            case 6:
                return new C0946z(parcel, classLoader);
            case 7:
                return new C2563d1(parcel, classLoader);
            case 8:
                return new C2605r1(parcel, classLoader);
            default:
                return new C2884f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch (this.f1086a) {
            case 0:
                return new C0421e[r2];
            case 1:
                return new C0447b[r2];
            case 2:
                return new AbstractC0498b[r2];
            case 3:
                return new C0546a[r2];
            case 4:
                return new C0832O[r2];
            case 5:
                return new C0904c[r2];
            case 6:
                return new C0946z[r2];
            case 7:
                return new C2563d1[r2];
            case 8:
                return new C2605r1[r2];
            default:
                return new C2884f[r2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1086a) {
            case 0:
                return new C0421e(parcel, (ClassLoader) null);
            case 1:
                return new C0447b(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0498b.f1262b;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new C0546a(parcel, null);
            case 4:
                return new C0832O(parcel, null);
            case 5:
                return new C0904c(parcel, (ClassLoader) null);
            case 6:
                return new C0946z(parcel, null);
            case 7:
                return new C2563d1(parcel, null);
            case 8:
                return new C2605r1(parcel, null);
            default:
                return new C2884f(parcel, null);
        }
    }
}
