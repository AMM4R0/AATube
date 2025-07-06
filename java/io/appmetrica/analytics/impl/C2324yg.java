package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.yg */
/* loaded from: classes.dex */
public final class C2324yg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C2233v0 f7499a;

    public C2324yg(C2233v0 c2233v0) {
        this.f7499a = c2233v0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        C2233v0 c2233v0 = this.f7499a;
        String str2 = c2233v0.f7248c;
        C2123qf m3315a = AbstractC1521Sb.m3315a(c2233v0.f7251f.f7323a);
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str2);
        C1987l4 c1987l4 = new C1987l4("", "", 5898, 0, m3315a);
        if (str != null) {
            c1987l4.m4091f(str);
        }
        c1987l4.f5633m = bundle;
        c1987l4.f5623c = this.f7499a.f7251f.f7328f;
        return c1987l4;
    }
}
