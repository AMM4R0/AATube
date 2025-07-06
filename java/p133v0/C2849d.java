package p133v0;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import p124s0.C2733d;
import p124s0.C2735f;
import p136w0.AbstractC2877a;

/* renamed from: v0.d */
/* loaded from: classes.dex */
public final class C2849d extends AbstractC2877a {
    public static final Parcelable.Creator<C2849d> CREATOR = new C2858m(6);

    /* renamed from: a */
    public final int f9401a;

    /* renamed from: b */
    public final int f9402b;

    /* renamed from: c */
    public final int f9403c;

    /* renamed from: d */
    public String f9404d;

    /* renamed from: e */
    public IBinder f9405e;

    /* renamed from: f */
    public Scope[] f9406f;

    /* renamed from: g */
    public Bundle f9407g;

    /* renamed from: h */
    public Account f9408h;

    /* renamed from: i */
    public C2733d[] f9409i;

    /* renamed from: j */
    public C2733d[] f9410j;

    /* renamed from: k */
    public final boolean f9411k;

    /* renamed from: l */
    public final int f9412l;

    /* renamed from: m */
    public boolean f9413m;

    /* renamed from: n */
    public final String f9414n;

    public C2849d(int r12, int r2, int r3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2733d[] c2733dArr, C2733d[] c2733dArr2, boolean z2, int r122, boolean z3, String str2) {
        this.f9401a = r12;
        this.f9402b = r2;
        this.f9403c = r3;
        if ("com.google.android.gms".equals(str)) {
            this.f9404d = "com.google.android.gms";
        } else {
            this.f9404d = str;
        }
        if (r12 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int r22 = AbstractBinderC2846a.f9394c;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface c2844d = queryLocalInterface instanceof InterfaceC2850e ? (InterfaceC2850e) queryLocalInterface : new C2844D(iBinder);
                if (c2844d != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C2844D) c2844d).m5458a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f9408h = account2;
        } else {
            this.f9405e = iBinder;
            this.f9408h = account;
        }
        this.f9406f = scopeArr;
        this.f9407g = bundle;
        this.f9409i = c2733dArr;
        this.f9410j = c2733dArr2;
        this.f9411k = z2;
        this.f9412l = r122;
        this.f9413m = z3;
        this.f9414n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        C2858m.m5466a(this, parcel, r2);
    }

    public C2849d(int r2, String str) {
        this.f9401a = 6;
        this.f9403c = C2735f.f8983a;
        this.f9402b = r2;
        this.f9411k = true;
        this.f9414n = str;
    }
}
