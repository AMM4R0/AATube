package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.g7 */
/* loaded from: classes.dex */
public final class C1865g7 implements Converter {

    /* renamed from: a */
    public final C1840f7 f6302a;

    public C1865g7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public final byte[] m3858a(C1890h7 c1890h7) {
        return MessageNano.toByteArray(this.f6302a.fromModel(c1890h7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f6302a.fromModel((C1890h7) obj));
    }

    public C1865g7(C1840f7 c1840f7) {
        this.f6302a = c1840f7;
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
    public final io.appmetrica.analytics.impl.C1890h7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.q7 r0 = new io.appmetrica.analytics.impl.q7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.q7 r2 = (io.appmetrica.analytics.impl.C2115q7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.q7 r2 = new io.appmetrica.analytics.impl.q7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.q7 r2 = new io.appmetrica.analytics.impl.q7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.f7 r0 = r1.f6302a
            io.appmetrica.analytics.impl.h7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1865g7.toModel(byte[]):io.appmetrica.analytics.impl.h7");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C1865g7(io.appmetrica.analytics.impl.C1840f7 r1, int r2, kotlin.jvm.internal.AbstractC2489f r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Lb
            io.appmetrica.analytics.impl.f7 r1 = new io.appmetrica.analytics.impl.f7
            r2 = 3
            r3 = 0
            r1.<init>(r3, r3, r2, r3)
        Lb:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1865g7.<init>(io.appmetrica.analytics.impl.f7, int, kotlin.jvm.internal.f):void");
    }
}
