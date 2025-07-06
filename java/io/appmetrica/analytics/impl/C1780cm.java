package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.cm */
/* loaded from: classes.dex */
public final class C1780cm implements ProtobufConverter {
    /* renamed from: a */
    public final C1482Ql m3717a(C1755bm c1755bm) {
        C1482Ql c1482Ql = new C1482Ql();
        c1482Ql.f5263a = c1755bm.f5953a;
        return c1482Ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C1482Ql c1482Ql = new C1482Ql();
        c1482Ql.f5263a = ((C1755bm) obj).f5953a;
        return c1482Ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1755bm(((C1482Ql) obj).f5263a);
    }

    /* renamed from: a */
    public final C1755bm m3718a(C1482Ql c1482Ql) {
        return new C1755bm(c1482Ql.f5263a);
    }
}
