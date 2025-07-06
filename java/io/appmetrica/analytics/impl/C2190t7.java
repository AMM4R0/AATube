package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.AbstractC2489f;

/* renamed from: io.appmetrica.analytics.impl.t7 */
/* loaded from: classes.dex */
public final class C2190t7 implements ProtobufConverter {

    /* renamed from: a */
    public final C1399Nd f7151a;

    public C2190t7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2165s7 fromModel(C2240v7 c2240v7) {
        C2165s7 c2165s7 = new C2165s7();
        Long l2 = c2240v7.f7261a;
        if (l2 != null) {
            c2165s7.f7118a = l2.longValue();
        }
        Long l3 = c2240v7.f7262b;
        if (l3 != null) {
            c2165s7.f7119b = l3.longValue();
        }
        Boolean bool = c2240v7.f7263c;
        if (bool != null) {
            c2165s7.f7120c = this.f7151a.fromModel(bool).intValue();
        }
        return c2165s7;
    }

    public C2190t7(C1399Nd c1399Nd) {
        this.f7151a = c1399Nd;
    }

    public /* synthetic */ C2190t7(C1399Nd c1399Nd, int r2, AbstractC2489f abstractC2489f) {
        this((r2 & 1) != 0 ? new C1399Nd() : c1399Nd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2240v7 toModel(C2165s7 c2165s7) {
        C2165s7 c2165s72 = new C2165s7();
        long j2 = c2165s7.f7118a;
        Long valueOf = Long.valueOf(j2);
        if (j2 == c2165s72.f7118a) {
            valueOf = null;
        }
        long j3 = c2165s7.f7119b;
        return new C2240v7(valueOf, j3 != c2165s72.f7119b ? Long.valueOf(j3) : null, this.f7151a.m3112a(c2165s7.f7120c));
    }
}
