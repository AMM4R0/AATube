package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.impl.Tn */
/* loaded from: classes.dex */
public final class C1558Tn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f5507a = "WebView interface setup is successful.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C2123qf c2123qf = (C2123qf) obj;
        if (c2123qf.f5471b) {
            c2123qf.m3358a(4, this.f5507a);
        }
    }
}
