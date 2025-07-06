package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.I0 */
/* loaded from: classes.dex */
public final class RunnableC1261I0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f4829a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f4830b;

    public RunnableC1261I0(C2009m1 c2009m1, Intent intent) {
        this.f4830b = c2009m1;
        this.f4829a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118C7 c1118c7 = this.f4830b.m4151c().f6147b;
        Intent intent = this.f4829a;
        c1118c7.getClass();
        if (intent != null) {
            c1118c7.m2792a(intent.getDataString(), false);
        }
    }
}
