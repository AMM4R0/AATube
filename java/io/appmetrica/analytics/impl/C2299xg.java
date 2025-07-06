package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.xg */
/* loaded from: classes.dex */
public final class C2299xg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C2233v0 f7458a;

    public C2299xg(C2233v0 c2233v0) {
        this.f7458a = c2233v0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        C2233v0 c2233v0 = this.f7458a;
        String str2 = c2233v0.f7248c;
        C2123qf m3315a = AbstractC1521Sb.m3315a(c2233v0.f7251f.f7323a);
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str2);
        C1987l4 c1987l4 = new C1987l4("", "", 5897, 0, m3315a);
        if (str != null) {
            c1987l4.m4091f(str);
        }
        c1987l4.f5633m = bundle;
        c1987l4.f5623c = this.f7458a.f7251f.f7328f;
        return c1987l4;
    }
}
