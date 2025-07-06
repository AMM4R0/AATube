package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p008C1.C0091w;
import p010D0.C0104b;
import p010D0.RunnableC0107e;
import p022I.C0201j;
import p104l.C2579j;
import p124s0.C2731b;
import p124s0.C2733d;
import p124s0.C2734e;
import p127t0.InterfaceC2766c;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;
import p130u0.C2787k;
import p133v0.AbstractC2861p;
import p133v0.AbstractC2863r;
import p133v0.BinderC2865t;
import p133v0.C2842B;
import p133v0.C2844D;
import p133v0.C2849d;
import p133v0.C2852g;
import p133v0.C2862q;
import p133v0.C2867v;
import p133v0.C2868w;
import p133v0.C2869x;
import p133v0.C2870y;
import p133v0.HandlerC2864s;
import p133v0.InterfaceC2847b;
import p133v0.InterfaceC2850e;
import p133v0.ServiceConnectionC2866u;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC0744a implements InterfaceC2766c {

    /* renamed from: x */
    public static final C2733d[] f2698x = new C2733d[0];

    /* renamed from: a */
    public volatile String f2699a;

    /* renamed from: b */
    public C0201j f2700b;

    /* renamed from: c */
    public final Context f2701c;

    /* renamed from: d */
    public final C2842B f2702d;

    /* renamed from: e */
    public final HandlerC2864s f2703e;

    /* renamed from: f */
    public final Object f2704f;

    /* renamed from: g */
    public final Object f2705g;

    /* renamed from: h */
    public C2862q f2706h;

    /* renamed from: i */
    public InterfaceC2847b f2707i;

    /* renamed from: j */
    public IInterface f2708j;

    /* renamed from: k */
    public final ArrayList f2709k;

    /* renamed from: l */
    public ServiceConnectionC2866u f2710l;

    /* renamed from: m */
    public int f2711m;

    /* renamed from: n */
    public final C2852g f2712n;

    /* renamed from: o */
    public final C2852g f2713o;

    /* renamed from: p */
    public final int f2714p;

    /* renamed from: q */
    public final String f2715q;

    /* renamed from: r */
    public volatile String f2716r;

    /* renamed from: s */
    public C2731b f2717s;

    /* renamed from: t */
    public boolean f2718t;

    /* renamed from: u */
    public volatile C2869x f2719u;

    /* renamed from: v */
    public final AtomicInteger f2720v;

    /* renamed from: w */
    public final Set f2721w;

    public AbstractC0744a(Context context, Looper looper, int r7, C0091w c0091w, InterfaceC2770g interfaceC2770g, InterfaceC2771h interfaceC2771h) {
        synchronized (C2842B.f9383g) {
            try {
                if (C2842B.f9384h == null) {
                    C2842B.f9384h = new C2842B(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2842B c2842b = C2842B.f9384h;
        Object obj = C2734e.f8981c;
        AbstractC2863r.m5474c(interfaceC2770g);
        AbstractC2863r.m5474c(interfaceC2771h);
        C2852g c2852g = new C2852g(interfaceC2770g);
        C2852g c2852g2 = new C2852g(interfaceC2771h);
        String str = (String) c0091w.f297e;
        this.f2699a = null;
        this.f2704f = new Object();
        this.f2705g = new Object();
        this.f2709k = new ArrayList();
        this.f2711m = 1;
        this.f2717s = null;
        this.f2718t = false;
        this.f2719u = null;
        this.f2720v = new AtomicInteger(0);
        AbstractC2863r.m5475d(context, "Context must not be null");
        this.f2701c = context;
        AbstractC2863r.m5475d(looper, "Looper must not be null");
        AbstractC2863r.m5475d(c2842b, "Supervisor must not be null");
        this.f2702d = c2842b;
        this.f2703e = new HandlerC2864s(this, looper);
        this.f2714p = r7;
        this.f2712n = c2852g;
        this.f2713o = c2852g2;
        this.f2715q = str;
        Set set = (Set) c0091w.f296d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2721w = set;
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ void m2027u(AbstractC0744a abstractC0744a) {
        int r12;
        int r02;
        synchronized (abstractC0744a.f2704f) {
            r12 = abstractC0744a.f2711m;
        }
        if (r12 == 3) {
            abstractC0744a.f2718t = true;
            r02 = 5;
        } else {
            r02 = 4;
        }
        HandlerC2864s handlerC2864s = abstractC0744a.f2703e;
        handlerC2864s.sendMessage(handlerC2864s.obtainMessage(r02, abstractC0744a.f2720v.get(), 16));
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m2028v(AbstractC0744a abstractC0744a, int r3, int r4, IInterface iInterface) {
        synchronized (abstractC0744a.f2704f) {
            try {
                if (abstractC0744a.f2711m != r3) {
                    return false;
                }
                abstractC0744a.m2041w(r4, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: a */
    public final boolean mo2029a() {
        boolean z2;
        synchronized (this.f2704f) {
            int r12 = this.f2711m;
            z2 = true;
            if (r12 != 2 && r12 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: b */
    public final C2733d[] mo2030b() {
        C2869x c2869x = this.f2719u;
        if (c2869x == null) {
            return null;
        }
        return c2869x.f9469b;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: c */
    public final boolean mo2031c() {
        boolean z2;
        synchronized (this.f2704f) {
            z2 = this.f2711m == 4;
        }
        return z2;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: d */
    public final void mo2032d() {
        if (!mo2031c() || this.f2700b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: e */
    public final String mo2033e() {
        return this.f2699a;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: f */
    public final Set mo2034f() {
        return mo594k() ? this.f2721w : Collections.emptySet();
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: g */
    public final void mo2035g(C2579j c2579j) {
        ((C2787k) c2579j.f8381a).f9114n.f9099m.post(new RunnableC0107e(19, c2579j));
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: h */
    public final void mo2036h() {
        this.f2720v.incrementAndGet();
        synchronized (this.f2709k) {
            try {
                int size = this.f2709k.size();
                for (int r2 = 0; r2 < size; r2++) {
                    ((AbstractC2861p) this.f2709k.get(r2)).m5469c();
                }
                this.f2709k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2705g) {
            this.f2706h = null;
        }
        m2041w(1, null);
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: i */
    public final void mo2037i(String str) {
        this.f2699a = str;
        mo2036h();
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: j */
    public final void mo2038j(InterfaceC2847b interfaceC2847b) {
        this.f2707i = interfaceC2847b;
        m2041w(2, null);
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: k */
    public boolean mo594k() {
        return false;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: l */
    public final void mo2039l(InterfaceC2850e interfaceC2850e, Set set) {
        Bundle mo595p = mo595p();
        C2849d c2849d = new C2849d(this.f2714p, this.f2716r);
        c2849d.f9404d = this.f2701c.getPackageName();
        c2849d.f9407g = mo595p;
        if (set != null) {
            c2849d.f9406f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo594k()) {
            c2849d.f9408h = new Account("<<default account>>", "com.google");
            if (interfaceC2850e != null) {
                c2849d.f9405e = ((C2844D) interfaceC2850e).f9393a;
            }
        }
        c2849d.f9409i = f2698x;
        c2849d.f9410j = mo336o();
        if (this instanceof C0104b) {
            c2849d.f9413m = true;
        }
        try {
            synchronized (this.f2705g) {
                try {
                    C2862q c2862q = this.f2706h;
                    if (c2862q != null) {
                        c2862q.m5471a(new BinderC2865t(this, this.f2720v.get()), c2849d);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            HandlerC2864s handlerC2864s = this.f2703e;
            handlerC2864s.sendMessage(handlerC2864s.obtainMessage(6, this.f2720v.get(), 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int r5 = this.f2720v.get();
            C2867v c2867v = new C2867v(this, 8, null, null);
            HandlerC2864s handlerC2864s2 = this.f2703e;
            handlerC2864s2.sendMessage(handlerC2864s2.obtainMessage(1, r5, -1, c2867v));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int r52 = this.f2720v.get();
            C2867v c2867v2 = new C2867v(this, 8, null, null);
            HandlerC2864s handlerC2864s22 = this.f2703e;
            handlerC2864s22.sendMessage(handlerC2864s22.obtainMessage(1, r52, -1, c2867v2));
        }
    }

    /* renamed from: n */
    public abstract IInterface mo335n(IBinder iBinder);

    /* renamed from: o */
    public C2733d[] mo336o() {
        return f2698x;
    }

    /* renamed from: p */
    public Bundle mo595p() {
        return new Bundle();
    }

    /* renamed from: q */
    public final IInterface m2040q() {
        IInterface iInterface;
        synchronized (this.f2704f) {
            try {
                if (this.f2711m == 5) {
                    throw new DeadObjectException();
                }
                if (!mo2031c()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2708j;
                AbstractC2863r.m5475d(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* renamed from: r */
    public abstract String mo337r();

    /* renamed from: s */
    public abstract String mo338s();

    /* renamed from: t */
    public boolean mo339t() {
        return mo334m() >= 211700000;
    }

    /* renamed from: w */
    public final void m2041w(int r7, IInterface iInterface) {
        C0201j c0201j;
        if ((r7 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f2704f) {
            try {
                this.f2711m = r7;
                this.f2708j = iInterface;
                if (r7 == 1) {
                    ServiceConnectionC2866u serviceConnectionC2866u = this.f2710l;
                    if (serviceConnectionC2866u != null) {
                        C2842B c2842b = this.f2702d;
                        String str = (String) this.f2700b.f603b;
                        AbstractC2863r.m5474c(str);
                        this.f2700b.getClass();
                        if (this.f2715q == null) {
                            this.f2701c.getClass();
                        }
                        c2842b.m5456b(str, serviceConnectionC2866u, this.f2700b.f602a);
                        this.f2710l = null;
                    }
                } else if (r7 == 2 || r7 == 3) {
                    ServiceConnectionC2866u serviceConnectionC2866u2 = this.f2710l;
                    if (serviceConnectionC2866u2 != null && (c0201j = this.f2700b) != null) {
                        String str2 = (String) c0201j.f603b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        C2842B c2842b2 = this.f2702d;
                        String str3 = (String) this.f2700b.f603b;
                        AbstractC2863r.m5474c(str3);
                        this.f2700b.getClass();
                        if (this.f2715q == null) {
                            this.f2701c.getClass();
                        }
                        c2842b2.m5456b(str3, serviceConnectionC2866u2, this.f2700b.f602a);
                        this.f2720v.incrementAndGet();
                    }
                    ServiceConnectionC2866u serviceConnectionC2866u3 = new ServiceConnectionC2866u(this, this.f2720v.get());
                    this.f2710l = serviceConnectionC2866u3;
                    String mo338s = mo338s();
                    boolean mo339t = mo339t();
                    this.f2700b = new C0201j(mo338s, mo339t);
                    if (mo339t && mo334m() < 17895000) {
                        String valueOf = String.valueOf((String) this.f2700b.f603b);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                    C2842B c2842b3 = this.f2702d;
                    String str4 = (String) this.f2700b.f603b;
                    AbstractC2863r.m5474c(str4);
                    this.f2700b.getClass();
                    String str5 = this.f2715q;
                    if (str5 == null) {
                        str5 = this.f2701c.getClass().getName();
                    }
                    if (!c2842b3.m5457c(new C2870y(str4, this.f2700b.f602a), serviceConnectionC2866u3, str5)) {
                        String str6 = (String) this.f2700b.f603b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int r72 = this.f2720v.get();
                        C2868w c2868w = new C2868w(this, 16);
                        HandlerC2864s handlerC2864s = this.f2703e;
                        handlerC2864s.sendMessage(handlerC2864s.obtainMessage(7, r72, -1, c2868w));
                    }
                } else if (r7 == 4) {
                    AbstractC2863r.m5474c(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
