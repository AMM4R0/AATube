package p133v0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p001A0.AbstractC0005b;
import p124s0.C2731b;
import p136w0.AbstractC2877a;

/* renamed from: v0.o */
/* loaded from: classes.dex */
public final class C2860o extends AbstractC2877a {
    public static final Parcelable.Creator<C2860o> CREATOR = new C2858m(2);

    /* renamed from: a */
    public final int f9445a;

    /* renamed from: b */
    public final IBinder f9446b;

    /* renamed from: c */
    public final C2731b f9447c;

    /* renamed from: d */
    public final boolean f9448d;

    /* renamed from: e */
    public final boolean f9449e;

    public C2860o(int r12, IBinder iBinder, C2731b c2731b, boolean z2, boolean z3) {
        this.f9445a = r12;
        this.f9446b = iBinder;
        this.f9447c = c2731b;
        this.f9448d = z2;
        this.f9449e = z3;
    }

    public final boolean equals(Object obj) {
        Object c2844d;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2860o)) {
            return false;
        }
        C2860o c2860o = (C2860o) obj;
        if (this.f9447c.equals(c2860o.f9447c)) {
            Object obj2 = null;
            IBinder iBinder = this.f9446b;
            if (iBinder == null) {
                c2844d = null;
            } else {
                int r5 = AbstractBinderC2846a.f9394c;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c2844d = queryLocalInterface instanceof InterfaceC2850e ? (InterfaceC2850e) queryLocalInterface : new C2844D(iBinder);
            }
            IBinder iBinder2 = c2860o.f9446b;
            if (iBinder2 != null) {
                int r3 = AbstractBinderC2846a.f9394c;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC2850e ? (InterfaceC2850e) queryLocalInterface2 : new C2844D(iBinder2);
            }
            if (AbstractC2863r.m5476e(c2844d, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f9445a);
        IBinder iBinder = this.f9446b;
        if (iBinder != null) {
            int m59Y2 = AbstractC0005b.m59Y(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            AbstractC0005b.m60Z(parcel, m59Y2);
        }
        AbstractC0005b.m55U(parcel, 3, this.f9447c, r6);
        AbstractC0005b.m61a0(parcel, 4, 4);
        parcel.writeInt(this.f9448d ? 1 : 0);
        AbstractC0005b.m61a0(parcel, 5, 4);
        parcel.writeInt(this.f9449e ? 1 : 0);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
