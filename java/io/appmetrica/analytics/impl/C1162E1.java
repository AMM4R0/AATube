package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.E1 */
/* loaded from: classes.dex */
public final class C1162E1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C1212G1 f4685a;

    public C1162E1(C1212G1 c1212g1) {
        this.f4685a = c1212g1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f4685a.m2886a((File) obj);
    }
}
