package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.jb */
/* loaded from: classes.dex */
public final class C1944jb {

    /* renamed from: a */
    public final Handler f6536a;

    /* renamed from: b */
    public final AbstractC1711a3 f6537b;

    /* renamed from: c */
    public final RunnableC1969kb f6538c;

    public C1944jb(Handler handler, AbstractC1711a3 abstractC1711a3) {
        this.f6536a = handler;
        this.f6537b = abstractC1711a3;
        this.f6538c = new RunnableC1969kb(handler, abstractC1711a3);
    }

    /* renamed from: a */
    public static void m4037a(Handler handler, AbstractC1711a3 abstractC1711a3, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC1711a3.f5836b.f6458b.getApiKey());
        handler.postAtTime(runnable, abstractC1711a3.f5836b.f6458b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(abstractC1711a3.f5836b.f6458b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
