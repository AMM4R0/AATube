package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Zj */
/* loaded from: classes.dex */
public final class C1703Zj {

    /* renamed from: a */
    public final C1803dk f5813a;

    /* renamed from: b */
    public final Map f5814b;

    public C1703Zj(Context context, C1838f5 c1838f5) {
        String m3805a = c1838f5.m3805a();
        if (m3805a != null) {
            AbstractC2356zn.m4696a(m3805a);
        }
        C1803dk c1803dk = new C1803dk(context, c1838f5);
        this.f5813a = c1803dk;
        Map m3766a = c1803dk.m3766a();
        AbstractC2492i.m4915e(m3766a, "<this>");
        this.f5814b = new LinkedHashMap(m3766a);
    }
}
