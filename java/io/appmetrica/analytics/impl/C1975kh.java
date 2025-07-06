package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.kh */
/* loaded from: classes.dex */
public final class C1975kh extends C2013m5 {

    /* renamed from: x */
    public final String f6586x;

    /* renamed from: y */
    public final C1267I6 f6587y;

    public C1975kh(Context context, C1838f5 c1838f5, C1265I4 r19, C1267I6 r20, C2354zl c2354zl, AbstractC1963k5 abstractC1963k5) {
        this(context, c1838f5, new C1783d0(), new TimePassedChecker(), new C2138r5(context, c1838f5, r19, abstractC1963k5, c2354zl, new C1850fh(r20), C2018ma.m4192h().m4214u().m2965d(), PackageManagerUtils.getAppVersionCodeInt(context), C2018ma.m4192h().m4202i()), r20);
    }

    @Override // io.appmetrica.analytics.impl.C2013m5, io.appmetrica.analytics.impl.InterfaceC1421Oa, io.appmetrica.analytics.impl.InterfaceC1146Da
    /* renamed from: a */
    public final synchronized void mo2828a(C1265I4 r3) {
        super.mo2828a(r3);
        this.f6587y.m2952a(this.f6586x, r3.f4846i);
    }

    public C1975kh(Context context, C1838f5 c1838f5, C1783d0 c1783d0, TimePassedChecker timePassedChecker, C2138r5 c2138r5, C1267I6 r6) {
        super(context, c1838f5, c1783d0, timePassedChecker, c2138r5);
        this.f6586x = c1838f5.m3805a();
        this.f6587y = r6;
    }
}
