package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.tl */
/* loaded from: classes.dex */
public final class C2204tl extends AbstractC1515S5 {

    /* renamed from: b */
    public final C1712a4 f7178b;

    public C2204tl(Context context, String str) {
        this(context, str, new SafePackageManager(), C2018ma.m4192h().m4198d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC1515S5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2229ul load(C1490R5 c1490r5) {
        C2229ul c2229ul = (C2229ul) super.load(c1490r5);
        C2354zl c2354zl = c1490r5.f5309a;
        c2229ul.f7229d = c2354zl.f7544f;
        c2229ul.f7230e = c2354zl.f7545g;
        C2179sl c2179sl = (C2179sl) c1490r5.componentArguments;
        String str = c2179sl.f7134a;
        if (str != null) {
            c2229ul.f7231f = str;
            c2229ul.f7232g = c2179sl.f7135b;
        }
        Map<String, String> map = c2179sl.f7136c;
        c2229ul.f7233h = map;
        c2229ul.f7234i = (C1513S3) this.f7178b.m3196a(new C1513S3(map, EnumC1517S7.f5405c));
        C2179sl c2179sl2 = (C2179sl) c1490r5.componentArguments;
        c2229ul.f7236k = c2179sl2.f7137d;
        c2229ul.f7235j = c2179sl2.f7138e;
        C2354zl c2354zl2 = c1490r5.f5309a;
        c2229ul.f7237l = c2354zl2.f7554p;
        c2229ul.f7238m = c2354zl2.f7556r;
        long j2 = c2354zl2.f7560v;
        if (c2229ul.f7239n == 0) {
            c2229ul.f7239n = j2;
        }
        return c2229ul;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C2229ul();
    }

    public C2204tl(Context context, String str, SafePackageManager safePackageManager, C1712a4 c1712a4) {
        super(context, str, safePackageManager);
        this.f7178b = c1712a4;
    }

    /* renamed from: a */
    public final C2229ul m4460a() {
        return new C2229ul();
    }
}
