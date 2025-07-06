package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.J3 */
/* loaded from: classes.dex */
public final class C1289J3 implements InterfaceC1766c8 {

    /* renamed from: a */
    public final C1314K3 f4895a;

    public C1289J3() {
        this(new C1314K3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1876gi> fromModel(C1264I3 r5) {
        C2241v8 c2241v8 = new C2241v8();
        c2241v8.f7277e = new C1816e8();
        C1876gi fromModel = this.f4895a.fromModel(r5.f4836b);
        c2241v8.f7277e.f6141a = (C1841f8) fromModel.f6330a;
        c2241v8.f7273a = r5.f4835a;
        return Collections.singletonList(new C1876gi(c2241v8, new C1089B3(C1089B3.m2745b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1289J3(C1314K3 c1314k3) {
        this.f4895a = c1314k3;
    }

    /* renamed from: a */
    public final C1264I3 m2978a(List<C1876gi> list) {
        throw new UnsupportedOperationException();
    }
}
