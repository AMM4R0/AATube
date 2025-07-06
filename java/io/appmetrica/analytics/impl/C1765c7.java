package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.p094db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.c7 */
/* loaded from: classes.dex */
public final class C1765c7 {

    /* renamed from: t */
    public static volatile C1765c7 f6009t;

    /* renamed from: e */
    public final Context f6014e;

    /* renamed from: f */
    public C1740b7 f6015f;

    /* renamed from: g */
    public C1740b7 f6016g;

    /* renamed from: h */
    public C2186t3 f6017h;

    /* renamed from: i */
    public C2211u3 f6018i;

    /* renamed from: j */
    public C2186t3 f6019j;

    /* renamed from: k */
    public C2211u3 f6020k;

    /* renamed from: l */
    public C2044nb f6021l;

    /* renamed from: m */
    public C2069ob f6022m;

    /* renamed from: n */
    public C1283Im f6023n;

    /* renamed from: o */
    public C1308Jm f6024o;

    /* renamed from: p */
    public C2044nb f6025p;

    /* renamed from: q */
    public C2069ob f6026q;

    /* renamed from: r */
    public C1496Rb f6027r;

    /* renamed from: a */
    public final HashMap f6010a = new HashMap();

    /* renamed from: b */
    public final HashMap f6011b = new HashMap();

    /* renamed from: c */
    public final HashMap f6012c = new HashMap();

    /* renamed from: d */
    public final C1442P6 f6013d = AbstractC1191F5.m2868a();

    /* renamed from: s */
    public final C1815e7 f6028s = new C1815e7();

    public C1765c7(Context context) {
        this.f6014e = context;
    }

    /* renamed from: a */
    public static C1765c7 m3695a(Context context) {
        if (f6009t == null) {
            synchronized (C1765c7.class) {
                try {
                    if (f6009t == null) {
                        f6009t = new C1765c7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f6009t;
    }

    /* renamed from: b */
    public final synchronized InterfaceC1221Ga m3699b(C1838f5 c1838f5) {
        InterfaceC1221Ga interfaceC1221Ga;
        String str = new C1738b5(c1838f5).f5905a;
        interfaceC1221Ga = (InterfaceC1221Ga) this.f6011b.get(str);
        if (interfaceC1221Ga == null) {
            interfaceC1221Ga = new C2044nb(new C1306Jk(m3701c(c1838f5)));
            this.f6011b.put(str, interfaceC1221Ga);
        }
        return interfaceC1221Ga;
    }

    /* renamed from: c */
    public final synchronized C1740b7 m3701c(C1838f5 c1838f5) {
        C1740b7 c1740b7;
        C1738b5 c1738b5 = new C1738b5(c1838f5);
        c1740b7 = (C1740b7) this.f6010a.get(c1738b5.f5905a);
        if (c1740b7 == null) {
            Context context = this.f6014e;
            C1815e7 c1815e7 = this.f6028s;
            String m3730a = new C1790d7(c1815e7.f6138a, c1815e7.f6139b, false).m3730a(context, c1738b5);
            C1442P6 c1442p6 = this.f6013d;
            C1083Am c1083Am = c1442p6.f5202c;
            String str = c1838f5.f6193b;
            C1690Z6 c1690z6 = c1442p6.f5200a;
            C1491R6 c1491r6 = c1690z6.f5787a;
            C1516S6 c1516s6 = c1690z6.f5788b;
            C2068oa c2068oa = new C2068oa(false);
            c2068oa.m4264a(112, new C1813e5());
            C1133Cm c1133Cm = new C1133Cm("component-%s", c1442p6.f5201b.f7490a);
            c1083Am.getClass();
            C1108Bm c1108Bm = new C1108Bm(c1491r6, c1516s6, c2068oa, c1133Cm);
            HashMap hashMap = AbstractC1521Sb.f5412a;
            c1740b7 = new C1740b7(context, m3730a, c1108Bm, C2123qf.f6997e);
            this.f6010a.put(c1738b5.f5905a, c1740b7);
        }
        return c1740b7;
    }

    /* renamed from: d */
    public final synchronized InterfaceC1221Ga m3702d() {
        try {
            if (this.f6021l == null) {
                this.f6021l = new C2044nb(new C1306Jk(m3706h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6021l;
    }

    /* renamed from: e */
    public final IBinaryDataHelper m3703e() {
        if (this.f6019j == null) {
            if (this.f6016g == null) {
                Context context = this.f6014e;
                C1815e7 c1815e7 = this.f6028s;
                String m3730a = new C1790d7(c1815e7.f6138a, c1815e7.f6139b, false).m3730a(context, new C1163E2());
                C1442P6 c1442p6 = this.f6013d;
                c1442p6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("binary_data", AbstractC1066A5.f4450a);
                C1083Am c1083Am = c1442p6.f5202c;
                C1690Z6 c1690z6 = c1442p6.f5200a;
                C1541T6 c1541t6 = c1690z6.f5793g;
                C1566U6 c1566u6 = c1690z6.f5794h;
                C2068oa c2068oa = new C2068oa(false);
                C1133Cm c1133Cm = new C1133Cm("auto_inapp", hashMap);
                c1083Am.getClass();
                C1108Bm c1108Bm = new C1108Bm(c1541t6, c1566u6, c2068oa, c1133Cm);
                HashMap hashMap2 = AbstractC1521Sb.f5412a;
                this.f6016g = new C1740b7(context, m3730a, c1108Bm, C2123qf.f6997e);
            }
            this.f6019j = new C2186t3(new C1306Jk(this.f6016g));
        }
        return this.f6019j;
    }

    /* renamed from: f */
    public final InterfaceC1221Ga m3704f() {
        C1496Rb c1496Rb;
        if (this.f6025p == null) {
            synchronized (this) {
                try {
                    if (this.f6027r == null) {
                        C1815e7 c1815e7 = this.f6028s;
                        String m3730a = new C1790d7(c1815e7.f6138a, c1815e7.f6139b, true).m3730a(this.f6014e, new C2012m4());
                        Context context = this.f6014e;
                        C1442P6 c1442p6 = this.f6013d;
                        c1442p6.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("preferences", InterfaceC1116C5.f4567a);
                        C1083Am c1083Am = c1442p6.f5202c;
                        C1690Z6 c1690z6 = c1442p6.f5200a;
                        C1591V6 c1591v6 = c1690z6.f5789c;
                        C1616W6 c1616w6 = c1690z6.f5790d;
                        C2068oa c2068oa = new C2068oa(false);
                        c2068oa.m4264a(112, new C2037n4());
                        C1133Cm c1133Cm = new C1133Cm("service database", hashMap);
                        c1083Am.getClass();
                        this.f6027r = new C1496Rb(context, m3730a, new C1669Y9(m3730a), new C1108Bm(c1591v6, c1616w6, c2068oa, c1133Cm));
                    }
                    c1496Rb = this.f6027r;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6025p = new C2044nb(c1496Rb);
        }
        return this.f6025p;
    }

    /* renamed from: g */
    public final IBinaryDataHelper m3705g() {
        if (this.f6017h == null) {
            this.f6017h = new C2186t3(new C1306Jk(m3706h()));
        }
        return this.f6017h;
    }

    /* renamed from: h */
    public final synchronized C1740b7 m3706h() {
        try {
            if (this.f6015f == null) {
                Context context = this.f6014e;
                C1815e7 c1815e7 = this.f6028s;
                String m3730a = new C1790d7(c1815e7.f6138a, c1815e7.f6139b, true).m3730a(context, new C1180Ej());
                C1442P6 c1442p6 = this.f6013d;
                c1442p6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC1116C5.f4567a);
                hashMap.put("binary_data", AbstractC1066A5.f4450a);
                hashMap.put("temp_cache", AbstractC1358Lm.f5017a);
                Iterator<ModuleServicesDatabase> it = C2018ma.f6725C.m4206m().mo2831a().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C1083Am c1083Am = c1442p6.f5202c;
                C1690Z6 c1690z6 = c1442p6.f5200a;
                C1641X6 c1641x6 = c1690z6.f5791e;
                C1666Y6 c1666y6 = c1690z6.f5792f;
                C2068oa c2068oa = new C2068oa(false);
                c2068oa.m4264a(Integer.valueOf(BuildConfig.API_LEVEL), new C1205Fj());
                Iterator<ModuleServicesDatabase> it2 = C2018ma.f6725C.m4206m().mo2831a().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c2068oa.m4264a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C1133Cm c1133Cm = new C1133Cm("service database", hashMap);
                c1083Am.getClass();
                C1108Bm c1108Bm = new C1108Bm(c1641x6, c1666y6, c2068oa, c1133Cm);
                HashMap hashMap2 = AbstractC1521Sb.f5412a;
                this.f6015f = new C1740b7(context, m3730a, c1108Bm, C2123qf.f6997e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6015f;
    }

    /* renamed from: a */
    public final synchronized IBinaryDataHelper m3696a(C1838f5 c1838f5) {
        IBinaryDataHelper iBinaryDataHelper;
        String str = new C1738b5(c1838f5).f5905a;
        iBinaryDataHelper = (IBinaryDataHelper) this.f6012c.get(str);
        if (iBinaryDataHelper == null) {
            iBinaryDataHelper = new C2186t3(new C1306Jk(m3701c(c1838f5)));
            this.f6012c.put(str, iBinaryDataHelper);
        }
        return iBinaryDataHelper;
    }

    /* renamed from: b */
    public final synchronized InterfaceC1221Ga m3698b() {
        return m3704f();
    }

    /* renamed from: a */
    public final synchronized InterfaceC1221Ga m3697a() {
        try {
            if (this.f6026q == null) {
                this.f6026q = new C2069ob(m3704f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6026q;
    }

    /* renamed from: c */
    public final synchronized InterfaceC1221Ga m3700c() {
        try {
            if (this.f6022m == null) {
                if (this.f6021l == null) {
                    this.f6021l = new C2044nb(new C1306Jk(m3706h()));
                }
                this.f6022m = new C2069ob(this.f6021l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6022m;
    }
}
