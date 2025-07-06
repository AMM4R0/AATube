package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.Sg */
/* loaded from: classes.dex */
public final class RunnableC1526Sg implements Runnable {

    /* renamed from: a */
    public final Context f5426a;

    /* renamed from: b */
    public final C1615W5 f5427b;

    /* renamed from: c */
    public final Bundle f5428c;

    /* renamed from: d */
    public final C2287x4 f5429d;

    public RunnableC1526Sg(Context context, C1615W5 c1615w5, Bundle bundle, C2287x4 c2287x4) {
        this.f5426a = context;
        this.f5427b = c1615w5;
        this.f5428c = bundle;
        this.f5429d = c2287x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1912i4 m3976a = C1912i4.m3976a(this.f5426a, this.f5428c);
        if (m3976a == null) {
            return;
        }
        C2062o4 m4253a = C2062o4.m4253a(m3976a);
        C1304Ji m4212s = C2018ma.f6725C.m4212s();
        m4212s.m2992a(m3976a.f6458b.getAppVersion(), m3976a.f6458b.getAppBuildNumber());
        m4212s.m2991a(m3976a.f6458b.getDeviceType());
        C1290J4 c1290j4 = new C1290J4(m3976a);
        this.f5429d.m4596a(m4253a, c1290j4).mo2692a(this.f5427b, c1290j4);
    }
}
