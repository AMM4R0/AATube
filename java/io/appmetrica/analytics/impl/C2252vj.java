package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.vj */
/* loaded from: classes.dex */
public final class C2252vj extends C2013m5 {
    public C2252vj(Context context, C2354zl c2354zl, C1838f5 c1838f5, C1265I4 r20, InterfaceC1427Og interfaceC1427Og, AbstractC1963k5 abstractC1963k5) {
        this(context, c1838f5, new C1783d0(), new TimePassedChecker(), new C2138r5(context, c1838f5, r20, abstractC1963k5, c2354zl, interfaceC1427Og, C2018ma.m4192h().m4214u().m2965d(), PackageManagerUtils.getAppVersionCodeInt(context), C2018ma.m4192h().m4202i()));
    }

    @Override // io.appmetrica.analytics.impl.C2013m5, io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: c */
    public final EnumC1565U5 mo2830c() {
        return EnumC1565U5.f5519d;
    }

    public C2252vj(Context context, C1838f5 c1838f5, C1783d0 c1783d0, TimePassedChecker timePassedChecker, C2138r5 c2138r5) {
        super(context, c1838f5, c1783d0, timePassedChecker, c2138r5);
    }
}
