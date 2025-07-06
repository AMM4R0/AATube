package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.AbstractC2489f;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.n7 */
/* loaded from: classes.dex */
public final class C2040n7 implements Converter {

    /* renamed from: a */
    public final C1399Nd f6797a;

    public C2040n7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2140r7 fromModel(C2015m7 c2015m7) {
        C2140r7 c2140r7 = new C2140r7();
        Boolean bool = c2015m7.f6709a;
        if (bool != null) {
            c2140r7.f7044a = this.f6797a.fromModel(bool).intValue();
        }
        Double d2 = c2015m7.f6711c;
        if (d2 != null) {
            c2140r7.f7046c = d2.doubleValue();
        }
        Double d3 = c2015m7.f6710b;
        if (d3 != null) {
            c2140r7.f7045b = d3.doubleValue();
        }
        Long l2 = c2015m7.f6716h;
        if (l2 != null) {
            c2140r7.f7051h = l2.longValue();
        }
        Integer num = c2015m7.f6714f;
        if (num != null) {
            c2140r7.f7049f = num.intValue();
        }
        Integer num2 = c2015m7.f6713e;
        if (num2 != null) {
            c2140r7.f7048e = num2.intValue();
        }
        Integer num3 = c2015m7.f6715g;
        if (num3 != null) {
            c2140r7.f7050g = num3.intValue();
        }
        Integer num4 = c2015m7.f6712d;
        if (num4 != null) {
            c2140r7.f7047d = num4.intValue();
        }
        String str = c2015m7.f6717i;
        if (str != null) {
            c2140r7.f7052i = str;
        }
        String str2 = c2015m7.f6718j;
        if (str2 != null) {
            c2140r7.f7053j = str2;
        }
        return c2140r7;
    }

    public C2040n7(C1399Nd c1399Nd) {
        this.f6797a = c1399Nd;
    }

    public /* synthetic */ C2040n7(C1399Nd c1399Nd, int r2, AbstractC2489f abstractC2489f) {
        this((r2 & 1) != 0 ? new C1399Nd() : c1399Nd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2015m7 toModel(C2140r7 c2140r7) {
        if (c2140r7 == null) {
            return new C2015m7(null, null, null, null, null, null, null, null, null, null);
        }
        C2140r7 c2140r72 = new C2140r7();
        Boolean m3112a = this.f6797a.m3112a(c2140r7.f7044a);
        double d2 = c2140r7.f7046c;
        Double valueOf = !((d2 > c2140r72.f7046c ? 1 : (d2 == c2140r72.f7046c ? 0 : -1)) == 0) ? Double.valueOf(d2) : null;
        double d3 = c2140r7.f7045b;
        Double valueOf2 = !(d3 == c2140r72.f7045b) ? Double.valueOf(d3) : null;
        long j2 = c2140r7.f7051h;
        Long valueOf3 = j2 != c2140r72.f7051h ? Long.valueOf(j2) : null;
        int r2 = c2140r7.f7049f;
        Integer valueOf4 = r2 != c2140r72.f7049f ? Integer.valueOf(r2) : null;
        int r22 = c2140r7.f7048e;
        Integer valueOf5 = r22 != c2140r72.f7048e ? Integer.valueOf(r22) : null;
        int r23 = c2140r7.f7050g;
        Integer valueOf6 = r23 != c2140r72.f7050g ? Integer.valueOf(r23) : null;
        int r24 = c2140r7.f7047d;
        Integer valueOf7 = r24 != c2140r72.f7047d ? Integer.valueOf(r24) : null;
        String str = c2140r7.f7052i;
        String str2 = !AbstractC2492i.m4911a(str, c2140r72.f7052i) ? str : null;
        String str3 = c2140r7.f7053j;
        return new C2015m7(m3112a, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !AbstractC2492i.m4911a(str3, c2140r72.f7053j) ? str3 : null);
    }
}
