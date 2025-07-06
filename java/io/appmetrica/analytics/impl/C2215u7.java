package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.AbstractC2489f;

/* renamed from: io.appmetrica.analytics.impl.u7 */
/* loaded from: classes.dex */
public final class C2215u7 implements Converter {

    /* renamed from: a */
    public final C2190t7 f7214a;

    public C2215u7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public final byte[] m4475a(C2240v7 c2240v7) {
        return MessageNano.toByteArray(this.f7214a.fromModel(c2240v7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f7214a.fromModel((C2240v7) obj));
    }

    public C2215u7(C2190t7 c2190t7) {
        this.f7214a = c2190t7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C2240v7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.s7 r0 = new io.appmetrica.analytics.impl.s7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.s7 r2 = (io.appmetrica.analytics.impl.C2165s7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.s7 r2 = new io.appmetrica.analytics.impl.s7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.s7 r2 = new io.appmetrica.analytics.impl.s7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.t7 r0 = r1.f7214a
            io.appmetrica.analytics.impl.v7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2215u7.toModel(byte[]):io.appmetrica.analytics.impl.v7");
    }

    public /* synthetic */ C2215u7(C2190t7 c2190t7, int r2, AbstractC2489f abstractC2489f) {
        this((r2 & 1) != 0 ? new C2190t7(null, 1, null) : c2190t7);
    }
}
