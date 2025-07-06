package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ag */
/* loaded from: classes.dex */
public final class C1724ag {

    /* renamed from: a */
    public final Context f5872a;

    /* renamed from: b */
    public final SafePackageManager f5873b;

    /* renamed from: c */
    public final InterfaceC1471Qa f5874c;

    /* renamed from: d */
    public final C2220uc f5875d;

    /* renamed from: e */
    public final long f5876e;

    /* renamed from: f */
    public final String f5877f;

    /* renamed from: g */
    public final String f5878g;

    public C1724ag(Context context, SafePackageManager safePackageManager, InterfaceC1471Qa interfaceC1471Qa) {
        this.f5872a = context;
        this.f5873b = safePackageManager;
        this.f5874c = interfaceC1471Qa;
        C2220uc c2220uc = new C2220uc(0);
        c2220uc.m4483a(EnumC1476Qf.f5258d, 1);
        c2220uc.m4483a(EnumC1476Qf.f5257c, 2);
        this.f5875d = c2220uc;
        this.f5876e = TimeUnit.DAYS.toSeconds(1L);
        this.f5877f = "com.android.vending";
        this.f5878g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (((java.lang.Number) r8).longValue() < r13.f5876e) goto L25;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C1500Rf m3611a(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1724ag.m3611a(java.util.List):io.appmetrica.analytics.impl.Rf");
    }

    public /* synthetic */ C1724ag(Context context) {
        this(context, new SafePackageManager(), AbstractC2059o1.m4252a());
    }
}
