package p130u0;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p001A0.AbstractC0005b;
import p008C1.C0091w;
import p010D0.C0110h;
import p010D0.RunnableC0106d;
import p013E0.AbstractC0125b;
import p013E0.HandlerC0128e;
import p015F0.AbstractBinderC0130a;
import p020H0.AbstractC0184b;
import p023I0.C0203a;
import p023I0.C0206d;
import p023I0.C0208f;
import p121r0.C2718a;
import p124s0.C2731b;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;
import p133v0.AbstractC2863r;
import p133v0.C2859n;

/* renamed from: u0.t */
/* loaded from: classes.dex */
public final class BinderC2796t extends AbstractBinderC0130a implements InterfaceC2770g, InterfaceC2771h {

    /* renamed from: j */
    public static final C0110h f9138j = AbstractC0184b.f572a;

    /* renamed from: c */
    public final Context f9139c;

    /* renamed from: d */
    public final HandlerC0128e f9140d;

    /* renamed from: e */
    public final C0110h f9141e;

    /* renamed from: f */
    public final Set f9142f;

    /* renamed from: g */
    public final C0091w f9143g;

    /* renamed from: h */
    public C0203a f9144h;

    /* renamed from: i */
    public C2789m f9145i;

    public BinderC2796t(Context context, HandlerC0128e handlerC0128e, C0091w c0091w) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f9139c = context;
        this.f9140d = handlerC0128e;
        this.f9143g = c0091w;
        this.f9142f = (Set) c0091w.f294b;
        this.f9141e = f9138j;
    }

    @Override // p127t0.InterfaceC2771h
    /* renamed from: a */
    public final void mo5390a(C2731b c2731b) {
        this.f9145i.m5415b(c2731b);
    }

    @Override // p127t0.InterfaceC2770g
    /* renamed from: b */
    public final void mo5388b(int r12) {
        this.f9144h.mo2036h();
    }

    @Override // p127t0.InterfaceC2770g
    /* renamed from: c */
    public final void mo5389c() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        C0203a c0203a = this.f9144h;
        c0203a.getClass();
        try {
            c0203a.f611z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c0203a.f2701c;
                    ReentrantLock reentrantLock = C2718a.f8780c;
                    AbstractC2863r.m5474c(context);
                    ReentrantLock reentrantLock2 = C2718a.f8780c;
                    reentrantLock2.lock();
                    try {
                        if (C2718a.f8781d == null) {
                            C2718a.f8781d = new C2718a(context.getApplicationContext());
                        }
                        C2718a c2718a = C2718a.f8781d;
                        reentrantLock2.unlock();
                        String m5240a = c2718a.m5240a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(m5240a)) {
                            StringBuilder sb = new StringBuilder(20 + String.valueOf(m5240a).length());
                            sb.append("googleSignInAccount:");
                            sb.append(m5240a);
                            String m5240a2 = c2718a.m5240a(sb.toString());
                            if (m5240a2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.m2025a(m5240a2);
                                } catch (JSONException unused) {
                                }
                                Integer num = c0203a.f609B;
                                AbstractC2863r.m5474c(num);
                                C2859n c2859n = new C2859n(2, account, num.intValue(), googleSignInAccount);
                                C0206d c0206d = (C0206d) c0203a.m2040q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(c0206d.f372c);
                                int r5 = AbstractC0125b.f373a;
                                obtain.writeInt(1);
                                int m59Y = AbstractC0005b.m59Y(obtain, 20293);
                                AbstractC0005b.m61a0(obtain, 1, 4);
                                obtain.writeInt(1);
                                AbstractC0005b.m55U(obtain, 2, c2859n, 0);
                                AbstractC0005b.m60Z(obtain, m59Y);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                c0206d.f371a.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                c0206d.f371a.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = c0203a.f609B;
            AbstractC2863r.m5474c(num2);
            C2859n c2859n2 = new C2859n(2, account, num2.intValue(), googleSignInAccount);
            C0206d c0206d2 = (C0206d) c0203a.m2040q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0206d2.f372c);
            int r52 = AbstractC0125b.f373a;
            obtain.writeInt(1);
            int m59Y2 = AbstractC0005b.m59Y(obtain, 20293);
            AbstractC0005b.m61a0(obtain, 1, 4);
            obtain.writeInt(1);
            AbstractC0005b.m55U(obtain, 2, c2859n2, 0);
            AbstractC0005b.m60Z(obtain, m59Y2);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f9140d.post(new RunnableC0106d(this, new C0208f(1, new C2731b(8, null), null), 9, false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
