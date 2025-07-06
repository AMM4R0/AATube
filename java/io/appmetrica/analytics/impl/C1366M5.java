package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;

/* renamed from: io.appmetrica.analytics.impl.M5 */
/* loaded from: classes.dex */
public final class C1366M5 {

    /* renamed from: a */
    public final C2107q f5023a;

    /* renamed from: b */
    public final IReporter f5024b;

    /* renamed from: c */
    public Context f5025c;

    /* renamed from: d */
    public final C1341L5 f5026d;

    public C1366M5(C2107q c2107q) {
        this(c2107q, 0);
    }

    /* renamed from: a */
    public final synchronized void m3080a(Context context) {
        if (this.f5025c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f5023a.m4309a(applicationContext);
            this.f5023a.m4310a(this.f5026d, EnumC2032n.RESUMED, EnumC2032n.PAUSED);
            this.f5025c = applicationContext;
        }
    }

    public C1366M5(C2107q c2107q, IReporter iReporter) {
        this.f5023a = c2107q;
        this.f5024b = iReporter;
        this.f5026d = new C1341L5(this);
    }

    public /* synthetic */ C1366M5(C2107q c2107q, int r2) {
        this(c2107q, AbstractC2059o1.m4252a());
    }
}
