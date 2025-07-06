package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;
import p105l1.C2632c;

/* renamed from: io.appmetrica.analytics.impl.l4 */
/* loaded from: classes.dex */
public final class C1987l4 extends C1615W5 {

    /* renamed from: q */
    public HashMap f6615q;

    /* renamed from: r */
    public C2155rm f6616r;

    /* renamed from: s */
    public C2105pm f6617s;

    /* renamed from: t */
    public C2105pm f6618t;

    /* renamed from: u */
    public C1064A3 f6619u;

    /* renamed from: v */
    public C2155rm f6620v;

    public C1987l4(C2123qf c2123qf) {
        this.f6615q = new HashMap();
        m4086a(c2123qf);
    }

    /* renamed from: b */
    public static C1615W5 m4082b(String str, String str2) {
        C1615W5 c1615w5 = new C1615W5("", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 5376;
        c1615w5.m3475a(str, str2);
        return c1615w5;
    }

    /* renamed from: n */
    public static C1615W5 m4083n() {
        C1615W5 c1615w5 = new C1615W5("", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 5632;
        return c1615w5;
    }

    /* renamed from: o */
    public static C1615W5 m4084o() {
        C1615W5 c1615w5 = new C1615W5("", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 40961;
        return c1615w5;
    }

    /* renamed from: a */
    public final void m4087a(String str, String str2, EnumC1962k4 enumC1962k4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f6615q.remove(enumC1962k4);
        } else {
            this.f6615q.put(enumC1962k4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f6615q.values().iterator();
        int r3 = 0;
        while (it.hasNext()) {
            r3 += ((Integer) it.next()).intValue();
        }
        this.f5627g = r3;
    }

    @Override // io.appmetrica.analytics.impl.C1615W5
    /* renamed from: c */
    public final void mo3481c(String str) {
        C2155rm c2155rm = this.f6620v;
        c2155rm.getClass();
        this.f5628h = c2155rm.mo2687a(str);
    }

    /* renamed from: d */
    public final String m4089d(String str) {
        C2155rm c2155rm = this.f6616r;
        c2155rm.getClass();
        String mo2687a = c2155rm.mo2687a(str);
        m4087a(str, mo2687a, EnumC1962k4.NAME);
        return mo2687a;
    }

    /* renamed from: e */
    public final String m4090e(String str) {
        C2105pm c2105pm = this.f6617s;
        c2105pm.getClass();
        String mo2687a = c2105pm.mo2687a(str);
        m4087a(str, mo2687a, EnumC1962k4.VALUE);
        return mo2687a;
    }

    /* renamed from: f */
    public final C1987l4 m4091f(String str) {
        C2105pm c2105pm = this.f6618t;
        c2105pm.getClass();
        String mo2687a = c2105pm.mo2687a(str);
        m4087a(str, mo2687a, EnumC1962k4.VALUE);
        this.f5622b = mo2687a;
        return this;
    }

    /* renamed from: p */
    public final HashMap<EnumC1962k4, Integer> m4092p() {
        return this.f6615q;
    }

    @Override // io.appmetrica.analytics.impl.C1615W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f5621a = m4089d(str);
    }

    @Override // io.appmetrica.analytics.impl.C1615W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f5622b = m4090e(str);
    }

    @Override // io.appmetrica.analytics.impl.C1615W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        m4088a(bArr);
    }

    public C1987l4(String str, int r3, C2123qf c2123qf) {
        this("", str, r3, c2123qf);
    }

    public C1987l4(String str, String str2, int r9, C2123qf c2123qf) {
        this(str, str2, r9, 0, c2123qf);
    }

    public C1987l4(String str, String str2, int r4, int r5, C2123qf c2123qf) {
        this.f6615q = new HashMap();
        m4086a(c2123qf);
        this.f5622b = m4090e(str);
        this.f5621a = m4089d(str2);
        setType(r4);
        setCustomType(r5);
    }

    /* renamed from: a */
    public final C1987l4 m4085a(HashMap<EnumC1962k4, Integer> hashMap) {
        this.f6615q = hashMap;
        return this;
    }

    /* renamed from: a */
    public final void m4086a(C2123qf c2123qf) {
        this.f6616r = new C2155rm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", c2123qf);
        this.f6617s = new C2105pm(245760, "event value", c2123qf);
        this.f6618t = new C2105pm(1024000, "event extended value", c2123qf);
        this.f6619u = new C1064A3(245760, "event value bytes", c2123qf);
        this.f6620v = new C2155rm(200, "user profile id", c2123qf);
    }

    public C1987l4(byte[] bArr, String str, int r4, C2123qf c2123qf) {
        this.f6615q = new HashMap();
        m4086a(c2123qf);
        m4088a(bArr);
        this.f5621a = m4089d(str);
        setType(r4);
    }

    /* renamed from: a */
    public final void m4088a(byte[] bArr) {
        C1064A3 c1064a3 = this.f6619u;
        c1064a3.getClass();
        byte[] mo2687a = c1064a3.mo2687a(bArr);
        EnumC1962k4 enumC1962k4 = EnumC1962k4.VALUE;
        if (bArr.length != mo2687a.length) {
            this.f6615q.put(enumC1962k4, Integer.valueOf(bArr.length - mo2687a.length));
        } else {
            this.f6615q.remove(enumC1962k4);
        }
        Iterator it = this.f6615q.values().iterator();
        int r12 = 0;
        while (it.hasNext()) {
            r12 += ((Integer) it.next()).intValue();
        }
        this.f5627g = r12;
        super.setValueBytes(mo2687a);
    }

    /* renamed from: a */
    public static C1615W5 m4079a(C2281wn c2281wn) {
        C1615W5 m4084o = m4084o();
        m4084o.setValue(new String(Base64.encode(MessageNano.toByteArray(c2281wn), 0)));
        return m4084o;
    }

    /* renamed from: a */
    public static C1987l4 m4081a(C2123qf c2123qf, C2151ri c2151ri) {
        int r4;
        C1987l4 c1987l4 = new C1987l4(c2123qf);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1987l4.f5624d = 40976;
        C2101pi c2101pi = new C2101pi();
        c2101pi.f6924b = c2151ri.f7067a.currency.getCurrencyCode().getBytes();
        c2101pi.f6928f = c2151ri.f7067a.priceMicros;
        c2101pi.f6925c = StringUtils.stringToBytesForProtobuf(new C2155rm(200, "revenue productID", c2151ri.f7071e).mo2687a(c2151ri.f7067a.productID));
        c2101pi.f6923a = ((Integer) WrapUtils.getOrDefault(c2151ri.f7067a.quantity, 1)).intValue();
        C2105pm c2105pm = c2151ri.f7068b;
        String str = c2151ri.f7067a.payload;
        c2105pm.getClass();
        c2101pi.f6926d = StringUtils.stringToBytesForProtobuf(c2105pm.mo2687a(str));
        if (AbstractC2356zn.m4700a(c2151ri.f7067a.receipt)) {
            C1976ki c1976ki = new C1976ki();
            String str2 = (String) c2151ri.f7069c.mo2687a(c2151ri.f7067a.receipt.data);
            r4 = !StringUtils.equalsNullSafety(c2151ri.f7067a.receipt.data, str2) ? c2151ri.f7067a.receipt.data.length() : 0;
            String str3 = (String) c2151ri.f7070d.mo2687a(c2151ri.f7067a.receipt.signature);
            c1976ki.f6589a = StringUtils.stringToBytesForProtobuf(str2);
            c1976ki.f6590b = StringUtils.stringToBytesForProtobuf(str3);
            c2101pi.f6927e = c1976ki;
        } else {
            r4 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(c2101pi), Integer.valueOf(r4));
        c1987l4.f5622b = c1987l4.m4090e(new String(Base64.encode((byte[]) pair.first, 0)));
        c1987l4.f5627g = ((Integer) pair.second).intValue();
        return c1987l4;
    }

    /* renamed from: a */
    public static C1987l4 m4080a(C2123qf c2123qf, C1110C c1110c) {
        C1987l4 c1987l4 = new C1987l4(c2123qf);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1987l4.f5624d = 40977;
        C2632c m2783a = c1110c.m2783a();
        c1987l4.f5622b = c1987l4.m4090e(new String(Base64.encode((byte[]) m2783a.f8550a, 0)));
        c1987l4.f5627g = ((Integer) m2783a.f8551b).intValue();
        return c1987l4;
    }
}
