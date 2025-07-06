package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.identifiers.impl.f */
/* loaded from: classes.dex */
public final class C1044f {

    /* renamed from: a */
    public final ServiceConnectionC1043e f4428a;

    /* renamed from: b */
    public final InterfaceC2810l f4429b;

    /* renamed from: c */
    public final String f4430c;

    /* renamed from: d */
    public final SafePackageManager f4431d;

    public C1044f(ServiceConnectionC1043e serviceConnectionC1043e, InterfaceC2810l interfaceC2810l, String str, SafePackageManager safePackageManager) {
        this.f4428a = serviceConnectionC1043e;
        this.f4429b = interfaceC2810l;
        this.f4430c = str;
        this.f4431d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2675a(android.content.Context r5) {
        /*
            r4 = this;
            io.appmetrica.analytics.identifiers.impl.e r0 = r4.f4428a
            android.content.Intent r0 = r0.f4425a
            io.appmetrica.analytics.coreutils.internal.services.SafePackageManager r1 = r4.f4431d
            r2 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r5, r0, r2)
            if (r0 == 0) goto L55
            io.appmetrica.analytics.identifiers.impl.e r0 = r4.f4428a     // Catch: java.lang.Throwable -> L36
            android.content.Intent r1 = r0.f4425a     // Catch: java.lang.Throwable -> L36
            r2 = 1
            boolean r5 = r5.bindService(r1, r0, r2)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            io.appmetrica.analytics.identifiers.impl.e r5 = r4.f4428a     // Catch: java.lang.Throwable -> L36
            android.os.IBinder r0 = r5.f4426b     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L33
            java.lang.Object r0 = r5.f4427c     // Catch: java.lang.Throwable -> L36
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
            android.os.IBinder r1 = r5.f4426b     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            java.lang.Object r1 = r5.f4427c     // Catch: java.lang.Throwable -> L2d java.lang.InterruptedException -> L2f
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L2d java.lang.InterruptedException -> L2f
            goto L2f
        L2d:
            r5 = move-exception
            goto L31
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            goto L33
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r5     // Catch: java.lang.Throwable -> L36
        L33:
            android.os.IBinder r5 = r5.f4426b     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r5 = 0
        L37:
            if (r5 == 0) goto L40
            u1.l r0 = r4.f4429b
            java.lang.Object r5 = r0.invoke(r5)
            return r5
        L40:
            io.appmetrica.analytics.identifiers.impl.g r5 = new io.appmetrica.analytics.identifiers.impl.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "could not bind to "
            r0.<init>(r1)
            java.lang.String r1 = r4.f4430c
            java.lang.String r2 = " services"
            java.lang.String r0 = p000A.AbstractC0002c.m17l(r0, r1, r2)
            r5.<init>(r0)
            throw r5
        L55:
            io.appmetrica.analytics.identifiers.impl.l r5 = new io.appmetrica.analytics.identifiers.impl.l
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "could not resolve "
            r0.<init>(r1)
            java.lang.String r1 = r4.f4430c
            java.lang.String r2 = " services"
            java.lang.String r0 = p000A.AbstractC0002c.m17l(r0, r1, r2)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.identifiers.impl.C1044f.m2675a(android.content.Context):java.lang.Object");
    }

    /* renamed from: b */
    public final void m2676b(Context context) {
        try {
            this.f4428a.m2674a(context);
        } catch (Throwable unused) {
        }
    }

    public C1044f(Intent intent, InterfaceC2810l interfaceC2810l, String str) {
        this(new ServiceConnectionC1043e(intent, str), interfaceC2810l, str, new SafePackageManager());
    }
}
