package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Vc */
/* loaded from: classes.dex */
public final class C1597Vc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1622Wc f5575a;

    /* renamed from: b */
    public final /* synthetic */ String f5576b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f5577c;

    public C1597Vc(C1622Wc c1622Wc, String str, byte[] bArr) {
        this.f5575a = c1622Wc;
        this.f5576b = str;
        this.f5577c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1622Wc.m3497a(this.f5575a).setSessionExtra(this.f5576b, this.f5577c);
    }
}
