package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.Y8 */
/* loaded from: classes.dex */
public final class C1668Y8 extends AbstractC1798df {

    /* renamed from: a */
    public final C1602Vh f5722a;

    /* renamed from: b */
    public final HashMap f5723b;

    /* renamed from: c */
    public final C1315K4 f5724c;

    public C1668Y8(C2013m5 c2013m5) {
        C1602Vh c1602Vh = new C1602Vh(c2013m5);
        this.f5722a = c1602Vh;
        this.f5724c = new C1315K4(c1602Vh);
        this.f5723b = m3532a();
    }

    /* renamed from: a */
    public final HashMap m3532a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC1670Ya.EVENT_TYPE_ACTIVATION, new C1907i(this.f5722a));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_START, new C1655Xk(this.f5722a));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_REGULAR, new C1974kg(this.f5722a));
        C1844fb c1844fb = new C1844fb(this.f5722a);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_SEND_REFERRER, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_CUSTOM_EVENT, c1844fb);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_SET_SESSION_EXTRA;
        C1602Vh c1602Vh = this.f5722a;
        hashMap.put(enumC1670Ya, new C1530Sk(c1602Vh, c1602Vh.f5598t));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_APP_OPEN, new C2149rg(this.f5722a));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_PURGE_BUFFER, new C2148rf(this.f5722a));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C2264w6(this.f5722a));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C1624We(this.f5722a));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C1956jn(this.f5722a));
        C1931in c1931in = new C1931in(this.f5722a);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c1931in);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c1931in);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_ANR, c1844fb);
        EnumC1670Ya enumC1670Ya2 = EnumC1670Ya.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C1602Vh c1602Vh2 = this.f5722a;
        hashMap.put(enumC1670Ya2, new C1530Sk(c1602Vh2, c1602Vh2.f5583e));
        EnumC1670Ya enumC1670Ya3 = EnumC1670Ya.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C1602Vh c1602Vh3 = this.f5722a;
        hashMap.put(enumC1670Ya3, new C1530Sk(c1602Vh3, c1602Vh3.f5584f));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_SEND_USER_PROFILE, c1844fb);
        EnumC1670Ya enumC1670Ya4 = EnumC1670Ya.EVENT_TYPE_SET_USER_PROFILE_ID;
        C1602Vh c1602Vh4 = this.f5722a;
        hashMap.put(enumC1670Ya4, new C1530Sk(c1602Vh4, c1602Vh4.f5589k));
        hashMap.put(EnumC1670Ya.EVENT_TYPE_SEND_REVENUE_EVENT, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_CLEANUP, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_TYPE_WEBVIEW_SYNC, c1844fb);
        hashMap.put(EnumC1670Ya.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new C1170E9(this.f5722a));
        return hashMap;
    }

    /* renamed from: b */
    public final C1602Vh m3534b() {
        return this.f5722a;
    }

    /* renamed from: a */
    public final void m3533a(EnumC1670Ya enumC1670Ya, AbstractC2043na abstractC2043na) {
        this.f5723b.put(enumC1670Ya, abstractC2043na);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1798df
    /* renamed from: a */
    public final AbstractC1643X8 mo3455a(int r3) {
        LinkedList linkedList = new LinkedList();
        EnumC1670Ya m3538a = EnumC1670Ya.m3538a(r3);
        C1315K4 c1315k4 = this.f5724c;
        if (c1315k4 != null) {
            c1315k4.m3004a(m3538a, linkedList);
        }
        AbstractC2043na abstractC2043na = (AbstractC2043na) this.f5723b.get(m3538a);
        if (abstractC2043na != null) {
            abstractC2043na.mo2853a(linkedList);
        }
        return new C1618W8(linkedList);
    }

    /* renamed from: a */
    public final AbstractC2043na m3531a(EnumC1670Ya enumC1670Ya) {
        return (AbstractC2043na) this.f5723b.get(enumC1670Ya);
    }
}
