package p133v0;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p015F0.AbstractC0131b;

/* renamed from: v0.D */
/* loaded from: classes.dex */
public final class C2844D implements InterfaceC2850e, IInterface {

    /* renamed from: a */
    public final IBinder f9393a;

    public C2844D(IBinder iBinder) {
        this.f9393a = iBinder;
    }

    /* renamed from: a */
    public final Account m5458a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f9393a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) AbstractC0131b.m425a(obtain, Account.CREATOR);
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9393a;
    }
}
