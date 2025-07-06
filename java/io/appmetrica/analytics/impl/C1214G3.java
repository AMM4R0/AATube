package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.G3 */
/* loaded from: classes.dex */
public final class C1214G3 implements ProtobufConverter {
    /* renamed from: a */
    public final C1307Jl m2889a(C1164E3 c1164e3) {
        C1307Jl c1307Jl = new C1307Jl();
        c1307Jl.f4932a = c1164e3.f4688a;
        return c1307Jl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C1307Jl c1307Jl = new C1307Jl();
        c1307Jl.f4932a = ((C1164E3) obj).f4688a;
        return c1307Jl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1164E3(((C1307Jl) obj).f4932a);
    }

    /* renamed from: a */
    public final C1164E3 m2888a(C1307Jl c1307Jl) {
        return new C1164E3(c1307Jl.f4932a);
    }
}
