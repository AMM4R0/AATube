package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.r5 */
/* loaded from: classes.dex */
public class C2138r5 {

    /* renamed from: a */
    public final C2088p5 f7030a;

    /* renamed from: b */
    public final C2113q5 f7031b;

    /* renamed from: c */
    protected final Context f7032c;

    /* renamed from: d */
    public final C1838f5 f7033d;

    /* renamed from: e */
    public final C1265I4 f7034e;

    /* renamed from: f */
    public final AbstractC1963k5 f7035f;

    /* renamed from: g */
    protected final C2354zl f7036g;

    /* renamed from: h */
    public final InterfaceC1427Og f7037h;

    /* renamed from: i */
    public final C1219G8 f7038i;

    /* renamed from: j */
    public final ICommonExecutor f7039j;

    /* renamed from: k */
    public final C2294xb f7040k;

    /* renamed from: l */
    public final int f7041l;

    public C2138r5(Context context, C1838f5 c1838f5, C1265I4 r16, AbstractC1963k5 abstractC1963k5, C2354zl c2354zl, InterfaceC1427Og interfaceC1427Og, ICommonExecutor iCommonExecutor, int r21, C2294xb c2294xb) {
        this(context, c1838f5, r16, abstractC1963k5, c2354zl, interfaceC1427Og, iCommonExecutor, new C1219G8(), r21, new C2088p5(r16.f4838a), new C2113q5(context, c1838f5), c2294xb);
    }

    /* renamed from: c */
    public static C1668Y8 m4376c(C2013m5 c2013m5) {
        return new C1668Y8(c2013m5);
    }

    /* renamed from: a */
    public final C1344L8 m4377a() {
        Context context = this.f7032c;
        C1838f5 c1838f5 = this.f7033d;
        return new C1344L8(new C1469Q8(context, c1838f5), this.f7041l);
    }

    /* renamed from: b */
    public final C1417O6 m4381b(C2013m5 c2013m5) {
        return new C1417O6(c2013m5, C1765c7.m3695a(this.f7032c).m3701c(this.f7033d), new C1342L6(c2013m5.mo2830c()), new C1940j7());
    }

    /* renamed from: d */
    public final C2088p5 m4384d() {
        return this.f7030a;
    }

    /* renamed from: e */
    public final C2113q5 m4385e() {
        return this.f7031b;
    }

    /* renamed from: f */
    public final C1409Nn m4386f() {
        C1409Nn c1409Nn;
        C1484Qn m4193A = C2018ma.f6725C.m4193A();
        C1838f5 c1838f5 = this.f7033d;
        synchronized (m4193A) {
            try {
                String valueOf = String.valueOf(c1838f5.f6193b);
                LinkedHashMap linkedHashMap = m4193A.f5265b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new C1409Nn(new C2297xe(C1765c7.m3695a(m4193A.f5264a).m3699b(c1838f5)), new C1743ba(m4193A.f5264a, "appmetrica_vital_" + c1838f5.f6193b + ".dat"), valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                c1409Nn = (C1409Nn) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1409Nn;
    }

    public C2138r5(Context context, C1838f5 c1838f5, C1265I4 r3, AbstractC1963k5 abstractC1963k5, C2354zl c2354zl, InterfaceC1427Og interfaceC1427Og, ICommonExecutor iCommonExecutor, C1219G8 c1219g8, int r9, C2088p5 c2088p5, C2113q5 c2113q5, C2294xb c2294xb) {
        this.f7032c = context;
        this.f7033d = c1838f5;
        this.f7034e = r3;
        this.f7035f = abstractC1963k5;
        this.f7036g = c2354zl;
        this.f7037h = interfaceC1427Og;
        this.f7039j = iCommonExecutor;
        this.f7038i = c1219g8;
        this.f7041l = r9;
        this.f7030a = c2088p5;
        this.f7031b = c2113q5;
        this.f7040k = c2294xb;
    }

    /* renamed from: c */
    public final C1703Zj m4382c() {
        return new C1703Zj(this.f7032c, this.f7033d);
    }

    /* renamed from: d */
    public final C1701Zh m4383d(C2013m5 c2013m5) {
        C1701Zh c1701Zh = new C1701Zh(c2013m5, this.f7035f.mo4039a(), this.f7039j);
        C2294xb c2294xb = this.f7040k;
        synchronized (c2294xb) {
            c2294xb.f7429c.add(c1701Zh);
        }
        return c1701Zh;
    }

    /* renamed from: a */
    public final C2224ug m4380a(C2013m5 c2013m5) {
        return new C2224ug(new C1452Pg(c2013m5, this.f7037h, new C1787d4()), this.f7036g, new C1377Mg(this.f7034e));
    }

    /* renamed from: a */
    public static C1903hk m4372a(C2013m5 c2013m5, C1409Nn c1409Nn, C1988l5 c1988l5) {
        C1878gk c1878gk = new C1878gk(c1409Nn);
        return new C1903hk(c2013m5, c1878gk, c1988l5, new C1868ga(c2013m5, c1878gk, new C1978kk(c2013m5.m4166g(), C1868ga.f6312g), AbstractC2059o1.m4252a(), new SystemTimeProvider()), new C1463Q2(c2013m5, c1878gk, new C1978kk(c2013m5.m4166g(), C1463Q2.f5240g), AbstractC2059o1.m4252a(), new SystemTimeProvider()), new C1370M9(c2013m5.f6686a));
    }

    /* renamed from: b */
    public static C1888h5 m4375b() {
        return new C1888h5();
    }

    /* renamed from: a */
    public final C1992l9 m4379a(C2297xe c2297xe, C1409Nn c1409Nn, C1903hk c1903hk, C1417O6 c1417o6, C1758c0 c1758c0, C1703Zj c1703Zj, C1701Zh c1701Zh) {
        return new C1992l9(c2297xe, c1409Nn, c1903hk, c1417o6, c1758c0, this.f7038i, c1703Zj, this.f7041l, new C2063o5(c1701Zh), new C1518S8(c1409Nn, new C1543T8(c1409Nn)), new SystemTimeProvider());
    }

    /* renamed from: a */
    public static C1652Xh m4371a(C2013m5 c2013m5, C1668Y8 c1668y8) {
        return new C1652Xh(c1668y8, c2013m5);
    }

    /* renamed from: a */
    public static C1216G5 m4370a(C1417O6 c1417o6) {
        return new C1216G5(c1417o6);
    }

    /* renamed from: a */
    public static C2245vc m4374a(C1417O6 c1417o6, C2224ug c2224ug) {
        return new C2245vc(c1417o6, c2224ug);
    }

    /* renamed from: a */
    public static C2142r9 m4373a(ArrayList arrayList, InterfaceC2217u9 interfaceC2217u9) {
        return new C2142r9(arrayList, interfaceC2217u9);
    }

    /* renamed from: a */
    public final C1389N3 m4378a(C2297xe c2297xe) {
        Context context = this.f7032c;
        return new C1389N3(context, c2297xe, context.getPackageName(), new SafePackageManager());
    }
}
