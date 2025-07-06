package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.impl.Vn */
/* loaded from: classes.dex */
public final class C1608Vn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f5611a;

    /* renamed from: b */
    public final /* synthetic */ String f5612b = "WebView interface setup failed because of an exception.";

    public C1608Vn(Throwable th) {
        this.f5611a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C2123qf c2123qf = (C2123qf) obj;
        if (c2123qf.f5471b) {
            c2123qf.m3362a(this.f5611a, this.f5612b);
        }
    }
}
