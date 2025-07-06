package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import p105l1.C2632c;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.ld */
/* loaded from: classes.dex */
public final class C1996ld implements ProtobufConverter {

    /* renamed from: a */
    public static final C1971kd f6650a = new C1971kd();

    /* renamed from: b */
    public static final Map f6651b = AbstractC2671u.m5127d0(new C2632c(NativeCrashSource.UNKNOWN, 0), new C2632c(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1764c6 fromModel(C2071od c2071od) {
        C1764c6 c1764c6 = new C1764c6();
        c1764c6.f6004f = 1;
        C1739b6 c1739b6 = new C1739b6();
        c1739b6.f5908a = c2071od.f6858a;
        C1839f6 c1839f6 = new C1839f6();
        Integer num = (Integer) f6651b.get(c2071od.f6859b.f6813a);
        if (num != null) {
            c1839f6.f6195a = num.intValue();
        }
        String str = c2071od.f6859b.f6814b;
        if (str == null) {
            str = "";
        }
        c1839f6.f6196b = str;
        c1739b6.f5909b = c1839f6;
        c1764c6.f6005g = c1739b6;
        return c1764c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C2071od m4105a(C1764c6 c1764c6) {
        throw new UnsupportedOperationException();
    }
}
