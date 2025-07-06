package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;

/* renamed from: io.appmetrica.analytics.impl.pd */
/* loaded from: classes.dex */
public final class C2096pd implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2146rd f6906a;

    /* renamed from: b */
    public final /* synthetic */ NativeCrash f6907b;

    public C2096pd(C2146rd c2146rd, NativeCrash nativeCrash) {
        this.f6906a = c2146rd;
        this.f6907b = nativeCrash;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f6906a.f7064b.invoke(this.f6907b.getUuid());
    }
}
