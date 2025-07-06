package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yk */
/* loaded from: classes.dex */
public final class C2328yk implements InterfaceC1766c8 {

    /* renamed from: a */
    public final C1104Bi f7505a;

    public C2328yk() {
        this(new C1104Bi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1876gi> fromModel(C2303xk c2303xk) {
        C2241v8 c2241v8 = new C2241v8();
        c2241v8.f7273a = 1;
        c2241v8.f7274b = new C2216u8();
        C1876gi fromModel = this.f7505a.fromModel(c2303xk.f7462a);
        c2241v8.f7274b.f7216a = (C2141r8) fromModel.f6330a;
        return Collections.singletonList(new C1876gi(c2241v8, new C1089B3(C1089B3.m2745b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2328yk(C1104Bi c1104Bi) {
        this.f7505a = c1104Bi;
    }

    /* renamed from: a */
    public final C2303xk m4670a(List<C1876gi> list) {
        throw new UnsupportedOperationException();
    }
}
