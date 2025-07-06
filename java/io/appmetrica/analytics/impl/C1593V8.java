package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.V8 */
/* loaded from: classes.dex */
public final class C1593V8 {

    /* renamed from: h */
    public static final Map f5563h;

    /* renamed from: i */
    public static final C1593V8 f5564i;

    /* renamed from: a */
    public final InterfaceC1846fd f5565a;

    /* renamed from: b */
    public final InterfaceC1259Hn f5566b;

    /* renamed from: c */
    public final InterfaceC2316y8 f5567c;

    /* renamed from: d */
    public final InterfaceC2167s9 f5568d;

    /* renamed from: e */
    public final InterfaceC1397Nb f5569e;

    /* renamed from: f */
    public final InterfaceC2271wd f5570f;

    /* renamed from: g */
    public final InterfaceC1395N9 f5571g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC1768ca.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC1768ca.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC1768ca.UNKNOWN, -1);
        f5563h = Collections.unmodifiableMap(hashMap);
        f5564i = new C1593V8(new C2226ui(), new C2205tm(), new C1174Ed(), new C2201ti(), new C1918ia(), new C1943ja(), new C1893ha());
    }

    public C1593V8(C1568U8 c1568u8) {
        this(c1568u8.f5526a, c1568u8.f5527b, c1568u8.f5528c, c1568u8.f5529d, c1568u8.f5530e, c1568u8.f5531f, c1568u8.f5532g);
    }

    /* renamed from: a */
    public final C1842f9 m3416a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        C1842f9 c1842f9 = new C1842f9();
        C1817e9 mo3530a = this.f5570f.mo3530a(c1369m8.f5042l, c1369m8.f5043m);
        C1717a9 mo3111a = this.f5569e.mo3111a(c1369m8.f5037g);
        if (mo3530a != null) {
            c1842f9.f6238g = mo3530a;
        }
        if (mo3111a != null) {
            c1842f9.f6237f = mo3111a;
        }
        String mo3826a = this.f5565a.mo3826a(c1369m8.f5031a);
        if (mo3826a != null) {
            c1842f9.f6235d = mo3826a;
        }
        c1842f9.f6236e = this.f5566b.mo2793a(c1369m8, c1501Rg);
        String str = c1369m8.f5040j;
        if (str != null) {
            c1842f9.f6239h = str;
        }
        Integer mo4265a = this.f5568d.mo4265a(c1369m8);
        if (mo4265a != null) {
            c1842f9.f6234c = mo4265a.intValue();
        }
        Long l2 = c1369m8.f5033c;
        if (l2 != null) {
            c1842f9.f6232a = l2.longValue();
        }
        Long l3 = c1369m8.f5034d;
        if (l3 != null) {
            c1842f9.f6245n = l3.longValue();
        }
        Long l4 = c1369m8.f5035e;
        if (l4 != null) {
            c1842f9.f6246o = l4.longValue();
        }
        Long l5 = c1369m8.f5036f;
        if (l5 != null) {
            c1842f9.f6233b = l5.longValue();
        }
        Integer num = c1369m8.f5041k;
        if (num != null) {
            c1842f9.f6240i = num.intValue();
        }
        c1842f9.f6241j = this.f5567c.mo2856a(c1369m8.f5045o);
        C2015m7 c2015m7 = c1369m8.f5037g;
        c1842f9.f6242k = c2015m7 != null ? new C2039n6().m3172a(c2015m7.f6709a) : -1;
        String str2 = c1369m8.f5044n;
        if (str2 != null) {
            c1842f9.f6243l = str2.getBytes();
        }
        EnumC1768ca enumC1768ca = c1369m8.f5046p;
        Integer num2 = enumC1768ca != null ? (Integer) f5563h.get(enumC1768ca) : null;
        if (num2 != null) {
            c1842f9.f6244m = num2.intValue();
        }
        EnumC2042n9 enumC2042n9 = c1369m8.f5047q;
        if (enumC2042n9 != null) {
            c1842f9.f6247p = enumC2042n9.f6804a;
        }
        Boolean bool = c1369m8.f5048r;
        if (bool != null) {
            c1842f9.f6248q = bool.booleanValue();
        }
        if (c1369m8.f5049s != null) {
            c1842f9.f6249r = r6.intValue();
        }
        c1842f9.f6250s = ((C1893ha) this.f5571g).m3940a(c1369m8.f5050t);
        return c1842f9;
    }

    public C1593V8(InterfaceC1846fd interfaceC1846fd, InterfaceC1259Hn interfaceC1259Hn, InterfaceC2316y8 interfaceC2316y8, InterfaceC2167s9 interfaceC2167s9, InterfaceC1397Nb interfaceC1397Nb, InterfaceC2271wd interfaceC2271wd, InterfaceC1395N9 interfaceC1395N9) {
        this.f5565a = interfaceC1846fd;
        this.f5566b = interfaceC1259Hn;
        this.f5567c = interfaceC2316y8;
        this.f5568d = interfaceC2167s9;
        this.f5569e = interfaceC1397Nb;
        this.f5570f = interfaceC2271wd;
        this.f5571g = interfaceC1395N9;
    }

    /* renamed from: a */
    public static C1568U8 m3408a() {
        return new C1568U8(f5564i);
    }
}
