package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;

/* renamed from: io.appmetrica.analytics.impl.qd */
/* loaded from: classes.dex */
public final class C2121qd implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2146rd f6991a;

    /* renamed from: b */
    public final /* synthetic */ NativeCrash f6992b;

    public C2121qd(C2146rd c2146rd, NativeCrash nativeCrash) {
        this.f6991a = c2146rd;
        this.f6992b = nativeCrash;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f6991a.f7064b.invoke(this.f6992b.getUuid());
    }
}
