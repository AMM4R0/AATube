package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.c1 */
/* loaded from: classes.dex */
public final class RunnableC1759c1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5961a;

    /* renamed from: b */
    public final /* synthetic */ StartupParamsCallback f5962b;

    /* renamed from: c */
    public final /* synthetic */ List f5963c;

    /* renamed from: d */
    public final /* synthetic */ C2009m1 f5964d;

    public RunnableC1759c1(C2009m1 c2009m1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f5964d = c2009m1;
        this.f5961a = context;
        this.f5962b = startupParamsCallback;
        this.f5963c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2133r0 c2133r0 = this.f5964d.f6673a;
        Context applicationContext = this.f5961a.getApplicationContext();
        c2133r0.getClass();
        C2108q0 m4314a = C2108q0.m4314a(applicationContext);
        m4314a.m4334e().mo2756a(this.f5962b, this.f5963c);
    }
}
