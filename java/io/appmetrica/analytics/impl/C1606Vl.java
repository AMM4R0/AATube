package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p108m1.C2668r;

/* renamed from: io.appmetrica.analytics.impl.Vl */
/* loaded from: classes.dex */
public final class C1606Vl {

    /* renamed from: a */
    public final C1631Wl f5609a;

    /* renamed from: b */
    public volatile NetworkTask f5610b;

    public C1606Vl(C1631Wl c1631Wl) {
        this.f5609a = c1631Wl;
    }

    /* renamed from: b */
    public final Context m3438b() {
        return this.f5609a.f5661a;
    }

    /* renamed from: c */
    public final synchronized NetworkTask m3440c() {
        NetworkTask networkTask;
        try {
            if (m3444g()) {
                if (this.f5610b == null) {
                    C2229ul m3441d = m3441d();
                    C2296xd c2296xd = C2296xd.f7433a;
                    C2129ql c2129ql = new C2129ql(new C1274Id(), C2018ma.f6725C.m4206m());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(m3441d);
                    this.f5610b = new NetworkTask(new SynchronizedBlockingExecutor(), new C2292x9(this.f5609a.f5661a), new AllHostsExponentialBackoffPolicy(C2296xd.f7433a.m4610a(EnumC2246vd.STARTUP)), new C1556Tl(this, new C1979kl(), new FullUrlFormer(c2129ql, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), C2668r.f8607a, C2296xd.f7435c);
                }
                networkTask = this.f5610b;
            } else {
                networkTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return networkTask;
    }

    /* renamed from: d */
    public final C2229ul m3441d() {
        return (C2229ul) this.f5609a.f5671k.m4598a();
    }

    /* renamed from: e */
    public final C2354zl m3442e() {
        C2354zl c2354zl;
        C1754bl c1754bl = this.f5609a.f5671k;
        synchronized (c1754bl) {
            c2354zl = c1754bl.f7418c.f5309a;
        }
        return c2354zl;
    }

    /* renamed from: f */
    public final void m3443f() {
        C2354zl c2354zl;
        C1754bl c1754bl = this.f5609a.f5671k;
        synchronized (c1754bl) {
            c2354zl = c1754bl.f7418c.f5309a;
        }
        C2304xl m4689a = c2354zl.m4689a();
        C1159Dn c1159Dn = this.f5609a.f5673m;
        String str = c2354zl.f7542d;
        c1159Dn.getClass();
        if (!C1159Dn.m2846a(str)) {
            m4689a.f7464a.f4588a = this.f5609a.f5672l.m3764a().f7574id;
        }
        String str2 = c2354zl.f7539a;
        if (str2 == null || str2.length() == 0) {
            m4689a.f7465b = this.f5609a.f5667g.m3110a();
            m4689a.f7466c = "";
        }
        String str3 = m4689a.f7465b;
        String str4 = m4689a.f7466c;
        C1132Cl c1132Cl = m4689a.f7464a;
        c1132Cl.getClass();
        C2354zl c2354zl2 = new C2354zl(str3, str4, new C1157Dl(c1132Cl));
        m3439b(c2354zl2);
        m3436a(c2354zl2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r1 == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0002, B:6:0x000d, B:11:0x0027, B:13:0x002f, B:15:0x0037, B:18:0x0040), top: B:3:0x0002 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m3444g() {
        /*
            r8 = this;
            r0 = 1
            monitor-enter(r8)
            io.appmetrica.analytics.impl.zl r1 = r8.m3442e()     // Catch: java.lang.Throwable -> L22
            java.util.Set r2 = io.appmetrica.analytics.impl.AbstractC2254vl.f7314a     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1.f7561w     // Catch: java.lang.Throwable -> L22
            r3 = 0
            if (r2 != 0) goto L24
            long r4 = r1.f7553o     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Xl r2 = r1.f7536A     // Catch: java.lang.Throwable -> L22
            int r2 = r2.f5697a     // Catch: java.lang.Throwable -> L22
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r4 = r4 + r6
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r2 = io.appmetrica.analytics.impl.AbstractC2254vl.f7315b     // Catch: java.lang.Throwable -> L22
            long r6 = r2.currentTimeSeconds()     // Catch: java.lang.Throwable -> L22
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L20
            goto L24
        L20:
            r2 = r3
            goto L25
        L22:
            r0 = move-exception
            goto L5f
        L24:
            r2 = r0
        L25:
            if (r2 != 0) goto L5c
            java.lang.String r2 = r1.f7542d     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC2254vl.m4526a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.f7539a     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC2254vl.m4526a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.f7540b     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC2254vl.m4526a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            r3 = r0
        L40:
            r2 = r3 ^ 1
            io.appmetrica.analytics.impl.Wl r4 = r8.f5609a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.d4 r4 = r4.f5670j     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.ul r5 = r8.m3441d()     // Catch: java.lang.Throwable -> L22
            java.util.Map r5 = r5.f7233h     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Wl r6 = r8.f5609a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.a4 r6 = r6.f5669i     // Catch: java.lang.Throwable -> L22
            r4.getClass()     // Catch: java.lang.Throwable -> L22
            boolean r1 = io.appmetrica.analytics.impl.C1787d4.m3723a(r5, r1, r6)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L5c
            if (r1 != 0) goto L5c
            goto L5d
        L5c:
            r0 = r2
        L5d:
            monitor-exit(r8)
            return r0
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1606Vl.m3444g():boolean");
    }

    /* renamed from: h */
    public final synchronized void m3445h() {
        this.f5610b = null;
    }

    /* renamed from: a */
    public final C1838f5 m3431a() {
        return this.f5609a.f5665e;
    }

    /* renamed from: b */
    public final synchronized void m3439b(C2354zl c2354zl) {
        this.f5609a.f5671k.m4600a(c2354zl);
        C2329yl c2329yl = this.f5609a.f5666f;
        c2329yl.f7507b.m3069a(c2354zl.f7539a);
        c2329yl.f7507b.m3071b(c2354zl.f7540b);
        c2329yl.f7506a.save(c2354zl.f7541c);
        this.f5609a.f5664d.mo2780a(c2354zl);
    }

    /* renamed from: a */
    public final synchronized boolean m3437a(List<String> list, Map<String, String> map) {
        return !AbstractC2254vl.m4525a(m3442e(), list, map, new C1581Ul(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C2354zl m3432a(io.appmetrica.analytics.impl.C2279wl r9, io.appmetrica.analytics.impl.C2229ul r10, long r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1606Vl.m3432a(io.appmetrica.analytics.impl.wl, io.appmetrica.analytics.impl.ul, long):io.appmetrica.analytics.impl.zl");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3435a(io.appmetrica.analytics.impl.C2279wl r4, io.appmetrica.analytics.impl.C2229ul r5, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.AbstractC2356zn.m4703a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            boolean r0 = io.appmetrica.analytics.impl.AbstractC2356zn.m4702a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            r0 = 0
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.util.Date r6 = r0.parse(r6)     // Catch: java.lang.Throwable -> L34
            long r0 = r6.getTime()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L34
            goto L35
        L32:
            r4 = move-exception
            goto L54
        L34:
            r6 = 0
        L35:
            if (r6 == 0) goto L3c
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L32
            goto L3e
        L3c:
            r0 = 0
        L3e:
            java.lang.Long r6 = r4.f7393l     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.yj r2 = io.appmetrica.analytics.impl.AbstractC2302xj.f7461a     // Catch: java.lang.Throwable -> L32
            r2.m4664a(r0, r6)     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.zl r4 = r3.m3432a(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            r3.m3445h()     // Catch: java.lang.Throwable -> L32
            r3.m3439b(r4)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            r3.m3436a(r4)
            return
        L54:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1606Vl.m3435a(io.appmetrica.analytics.impl.wl, io.appmetrica.analytics.impl.ul, java.util.Map):void");
    }

    /* renamed from: a */
    public final void m3436a(C2354zl c2354zl) {
        ArrayList arrayList;
        C1631Wl c1631Wl = this.f5609a;
        C1680Yk c1680Yk = c1631Wl.f5663c;
        String str = c1631Wl.f5662b;
        synchronized (c1680Yk.f5774a.f5892b) {
            try {
                C1729al c1729al = c1680Yk.f5774a;
                c1729al.f5893c = c2354zl;
                Collection collection = (Collection) c1729al.f5891a.f6854a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1954jl) it.next()).mo3171a(c2354zl);
        }
    }

    /* renamed from: a */
    public final void m3433a(EnumC1779cl enumC1779cl) {
        synchronized (this) {
            this.f5610b = null;
        }
        C1631Wl c1631Wl = this.f5609a;
        c1631Wl.f5663c.m3553a(c1631Wl.f5665e.f6192a, enumC1779cl, m3442e());
    }

    /* renamed from: a */
    public final synchronized void m3434a(C2179sl c2179sl) {
        try {
            this.f5609a.f5671k.mo3597a(c2179sl);
            C2229ul m3441d = m3441d();
            if (m3441d.f7236k) {
                List list = m3441d.f7235j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC2356zn.m4701a(list, m3441d.f7230e)) {
                        C2304xl m4689a = m3442e().m4689a();
                        C1132Cl c1132Cl = m4689a.f7464a;
                        c1132Cl.f4594g = list;
                        C2354zl c2354zl = new C2354zl(m4689a.f7465b, m4689a.f7466c, new C1157Dl(c1132Cl));
                        m3439b(c2354zl);
                        m3436a(c2354zl);
                    }
                }
                if (m3441d.f7230e != null && (!r5.isEmpty())) {
                    C2304xl m4689a2 = m3442e().m4689a();
                    C1132Cl c1132Cl2 = m4689a2.f7464a;
                    c1132Cl2.f4594g = null;
                    C2354zl c2354zl2 = new C2354zl(m4689a2.f7465b, m4689a2.f7466c, new C1157Dl(c1132Cl2));
                    m3439b(c2354zl2);
                    m3436a(c2354zl2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
