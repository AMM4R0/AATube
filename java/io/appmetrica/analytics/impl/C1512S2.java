package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import p000A.AbstractC0002c;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.S2 */
/* loaded from: classes.dex */
public class C1512S2 implements ExternalAttribution {

    /* renamed from: a */
    public final C1070A9 f5400a;

    public C1512S2(C1070A9 c1070a9) {
        this.f5400a = c1070a9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f5400a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(AbstractC1320K9.m3011a(this.f5400a.f4461a));
        sb.append("`value=`");
        return AbstractC0002c.m17l(sb, new String(this.f5400a.f4462b, AbstractC0008a.f6a), "`)");
    }
}
