package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.H2 */
/* loaded from: classes.dex */
public final class RunnableC1238H2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f4810a;

    /* renamed from: b */
    public final /* synthetic */ Intent f4811b;

    /* renamed from: c */
    public final /* synthetic */ C1263I2 f4812c;

    public RunnableC1238H2(C1263I2 r12, Context context, Intent intent) {
        this.f4812c = r12;
        this.f4810a = context;
        this.f4811b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4812c.f4831a.consume(this.f4810a, this.f4811b);
    }
}
