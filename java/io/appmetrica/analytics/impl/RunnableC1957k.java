package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k */
/* loaded from: classes.dex */
public final class RunnableC1957k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f6551a;

    /* renamed from: b */
    public final /* synthetic */ C2007m f6552b;

    public RunnableC1957k(C2007m c2007m, Activity activity) {
        this.f6552b = c2007m;
        this.f6551a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6552b.m4117a(this.f6551a);
    }
}
