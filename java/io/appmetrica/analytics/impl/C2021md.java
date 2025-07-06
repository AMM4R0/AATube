package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.md */
/* loaded from: classes.dex */
public final class C2021md implements Function {

    /* renamed from: a */
    public final C2046nd f6755a;

    /* renamed from: b */
    public final C1996ld f6756b;

    public C2021md(C2046nd c2046nd, C1996ld c1996ld) {
        this.f6755a = c2046nd;
        this.f6756b = c1996ld;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0015, B:13:0x0020, B:19:0x002c, B:29:0x001a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String apply(java.io.File r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L1d
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L41
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L41
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L19
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L19
            byte[] r1 = p103k0.AbstractC2480a.m4873N(r5)     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.AbstractC2356zn.m4699a(r5)     // Catch: java.lang.Throwable -> L41
            goto L1e
        L19:
            r5 = r0
        L1a:
            io.appmetrica.analytics.impl.AbstractC2356zn.m4699a(r5)     // Catch: java.lang.Throwable -> L41
        L1d:
            r1 = r0
        L1e:
            if (r1 == 0) goto L41
            int r5 = r1.length     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 != 0) goto L29
            goto L2a
        L29:
            r1 = r0
        L2a:
            if (r1 == 0) goto L41
            io.appmetrica.analytics.impl.ld r5 = r4.f6756b     // Catch: java.lang.Throwable -> L41
            io.appmetrica.analytics.impl.od r2 = new io.appmetrica.analytics.impl.od     // Catch: java.lang.Throwable -> L41
            io.appmetrica.analytics.impl.nd r3 = r4.f6755a     // Catch: java.lang.Throwable -> L41
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L41
            io.appmetrica.analytics.impl.c6 r5 = r5.fromModel(r2)     // Catch: java.lang.Throwable -> L41
            byte[] r5 = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils.compressBase64(r5)     // Catch: java.lang.Throwable -> L41
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2021md.apply(java.io.File):java.lang.String");
    }
}
