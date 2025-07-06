package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.R4 */
/* loaded from: classes.dex */
public final class C1489R4 implements InterfaceC1146Da, InterfaceC1954jl, InterfaceC1196Fa {

    /* renamed from: a */
    public final Context f5296a;

    /* renamed from: b */
    public final C1838f5 f5297b;

    /* renamed from: c */
    public final C1606Vl f5298c;

    /* renamed from: d */
    public final C1875gh f5299d;

    /* renamed from: e */
    public final C1534T f5300e;

    /* renamed from: f */
    public final C1664Y4 f5301f;

    /* renamed from: g */
    public final C1158Dm f5302g;

    /* renamed from: h */
    public ArrayList f5303h;

    /* renamed from: i */
    public final C1863g5 f5304i;

    /* renamed from: j */
    public final C1451Pf f5305j;

    /* renamed from: k */
    public final C2162s4 f5306k;

    /* renamed from: l */
    public final C1575Uf f5307l;

    /* renamed from: m */
    public final Object f5308m;

    public C1489R4(Context context, C1729al c1729al, C1838f5 c1838f5, C1290J4 c1290j4, C1451Pf c1451Pf) {
        this(context, c1729al, c1838f5, c1290j4, new C1875gh(c1290j4.f4897b), c1451Pf, new C1863g5(), new C1539T4(), new C1534T(new C1509S(), new C1410O(), new C1360M(), C2018ma.m4192h().m4214u().m2962a(), "ServicePublic"), new C1575Uf());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: a */
    public final void mo2828a(C1265I4 r3) {
        C1875gh c1875gh = this.f5299d;
        c1875gh.f6329a = c1875gh.f6329a.mergeFrom(r3);
    }

    /* renamed from: b */
    public final synchronized void m3253b(C1415O4 c1415o4) {
        this.f5304i.f6294a.remove(c1415o4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: c */
    public final EnumC1565U5 mo2830c() {
        return EnumC1565U5.f5520e;
    }

    /* renamed from: d */
    public final C1265I4 m3254d() {
        return this.f5299d.f6329a;
    }

    /* renamed from: e */
    public final C1451Pf m3255e() {
        return this.f5305j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1146Da
    public final Context getContext() {
        return this.f5296a;
    }

    public C1489R4(Context context, C1729al c1729al, C1838f5 c1838f5, C1290J4 c1290j4, C1875gh c1875gh, C1451Pf c1451Pf, C1863g5 c1863g5, C1539T4 c1539t4, C1534T c1534t, C1575Uf c1575Uf) {
        this.f5303h = new ArrayList();
        this.f5308m = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f5296a = applicationContext;
        this.f5297b = c1838f5;
        this.f5299d = c1875gh;
        this.f5304i = c1863g5;
        this.f5301f = C1539T4.m3348a(this);
        C1606Vl m3626a = c1729al.m3626a(applicationContext, c1838f5, c1290j4.f4896a);
        this.f5298c = m3626a;
        this.f5300e = c1534t;
        c1534t.mo3335a(applicationContext, m3626a.m3442e());
        this.f5306k = AbstractC2187t4.m4442a(m3626a, c1534t, applicationContext);
        this.f5302g = c1539t4.m3349a(this, m3626a);
        this.f5305j = c1451Pf;
        this.f5307l = c1575Uf;
        c1729al.m3627a(c1838f5, this);
    }

    /* renamed from: a */
    public final synchronized void m3250a(C1415O4 c1415o4) {
        this.f5304i.f6294a.add(c1415o4);
        ResultReceiverC1192F6.m2870a(c1415o4.f5150c, this.f5306k.m4410a(AbstractC1730am.m3629a(this.f5298c.m3442e().f7550l)));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: b */
    public final C1838f5 mo2829b() {
        return this.f5297b;
    }

    /* renamed from: a */
    public final void m3251a(C1615W5 c1615w5, C1415O4 c1415o4) {
        C1664Y4 c1664y4 = this.f5301f;
        c1664y4.getClass();
        c1664y4.m3505a(c1615w5, new C1639X4(c1415o4));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public final void mo3171a(C2354zl c2354zl) {
        this.f5300e.f5440c = c2354zl;
        synchronized (this.f5308m) {
            try {
                Iterator it = this.f5304i.f6294a.iterator();
                while (it.hasNext()) {
                    C1415O4 c1415o4 = (C1415O4) it.next();
                    ResultReceiverC1192F6.m2870a(c1415o4.f5150c, this.f5306k.m4410a(AbstractC1730am.m3629a(c2354zl.f7550l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f5303h.iterator();
                while (it2.hasNext()) {
                    C1620Wa c1620Wa = (C1620Wa) it2.next();
                    if (AbstractC2254vl.m4525a(c2354zl, c1620Wa.f5639b, c1620Wa.f5640c, new C1570Ua())) {
                        ResultReceiverC1192F6.m2870a(c1620Wa.f5638a, this.f5306k.m4410a(c1620Wa.f5640c));
                    } else {
                        arrayList.add(c1620Wa);
                    }
                }
                this.f5303h = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f5302g.m2841b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1954jl
    /* renamed from: a */
    public final void mo3170a(EnumC1779cl enumC1779cl, C2354zl c2354zl) {
        synchronized (this.f5308m) {
            try {
                Iterator it = this.f5303h.iterator();
                while (it.hasNext()) {
                    C1620Wa c1620Wa = (C1620Wa) it.next();
                    ResultReceiverC1192F6.m2869a(c1620Wa.f5638a, enumC1779cl, this.f5306k.m4410a(c1620Wa.f5640c));
                }
                this.f5303h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m3252a(C1620Wa c1620Wa) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c1620Wa != null) {
            list = c1620Wa.f5639b;
            resultReceiver = c1620Wa.f5638a;
            hashMap = c1620Wa.f5640c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean m3437a = this.f5298c.m3437a(list, hashMap);
        if (!m3437a) {
            ResultReceiverC1192F6.m2870a(resultReceiver, this.f5306k.m4410a(hashMap));
        }
        if (!this.f5298c.m3444g()) {
            if (m3437a) {
                ResultReceiverC1192F6.m2870a(resultReceiver, this.f5306k.m4410a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f5308m) {
            if (m3437a && c1620Wa != null) {
                try {
                    this.f5303h.add(c1620Wa);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f5302g.m2841b();
    }

    /* renamed from: a */
    public final void m3249a(ResultReceiver resultReceiver) {
        this.f5307l.m3397a(new C1465Q4(resultReceiver));
    }

    /* renamed from: a */
    public final C2162s4 m3248a() {
        return this.f5306k;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1196Fa
    /* renamed from: a */
    public final void mo2873a(C1290J4 c1290j4) {
        this.f5298c.m3434a(c1290j4.f4896a);
        mo2828a(c1290j4.f4897b);
    }
}
