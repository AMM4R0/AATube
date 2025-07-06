package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.dd */
/* loaded from: classes.dex */
public final class C1796dd {

    /* renamed from: a */
    public final Context f6098a;

    /* renamed from: b */
    public final InterfaceC1296Ja f6099b;

    /* renamed from: c */
    public final C2267w9 f6100c;

    /* renamed from: d */
    public final C1722ae f6101d;

    /* renamed from: e */
    public final C1159Dn f6102e;

    /* renamed from: f */
    public volatile IdentifiersResult f6103f;

    public C1796dd(Context context, InterfaceC1296Ja interfaceC1296Ja) {
        this(context, interfaceC1296Ja, AbstractC1821ed.m3787a(context), new C1722ae(context), new C1159Dn());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult m3764a() {
        /*
            r5 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f6103f
            if (r0 == 0) goto L18
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = r0.status
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK
            if (r1 != r2) goto L18
            io.appmetrica.analytics.impl.Dn r1 = r5.f6102e
            java.lang.String r2 = r0.f7574id
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C1159Dn.m2846a(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            io.appmetrica.analytics.impl.w9 r2 = r5.f6100c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r3 = r2.f7343a     // Catch: java.lang.Throwable -> L79
            r3.lock()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Y9 r2 = r2.f7344b     // Catch: java.lang.Throwable -> L79
            r2.m3536a()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f6103f     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3d
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = r0.status     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            if (r2 != r3) goto L3d
            io.appmetrica.analytics.impl.Dn r2 = r5.f6102e     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.f7574id     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r2 = io.appmetrica.analytics.impl.C1159Dn.m2846a(r3)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3d
            goto L79
        L3d:
            io.appmetrica.analytics.impl.ae r2 = r5.f6101d     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = r2.f5869a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "uuid.dat"
            java.io.File r2 = io.appmetrica.analytics.coreutils.internal.p097io.FileUtils.getFileFromSdkStorage(r2, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = io.appmetrica.analytics.impl.AbstractC1271Ia.m2955a(r2)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Dn r3 = r5.f6102e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C1159Dn.m2846a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L64
            io.appmetrica.analytics.impl.Ja r2 = r5.f6099b     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r5.f6098a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.mo2738a(r3)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.ae r3 = r5.f6101d     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r3.m3609a(r2)     // Catch: java.lang.Throwable -> L79
        L64:
            io.appmetrica.analytics.impl.Dn r3 = r5.f6102e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C1159Dn.m2846a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L79
            io.appmetrica.analytics.internal.IdentifiersResult r3 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r4 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L79
            r5.f6103f = r3     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = r3
        L79:
            io.appmetrica.analytics.impl.w9 r2 = r5.f6100c
            io.appmetrica.analytics.impl.Y9 r3 = r2.f7344b
            r3.m3537b()
            java.util.concurrent.locks.ReentrantLock r2 = r2.f7343a
            r2.unlock()
            if (r0 == 0) goto L88
            goto L91
        L88:
            io.appmetrica.analytics.internal.IdentifiersResult r0 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r3 = "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)"
            r0.<init>(r1, r2, r3)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1796dd.m3764a():io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public C1796dd(Context context, InterfaceC1296Ja interfaceC1296Ja, C2267w9 c2267w9, C1722ae c1722ae, C1159Dn c1159Dn) {
        this.f6098a = context;
        this.f6099b = interfaceC1296Ja;
        this.f6100c = c2267w9;
        this.f6101d = c1722ae;
        this.f6102e = c1159Dn;
        try {
            c2267w9.m4534a();
            c1722ae.m3610a();
            c2267w9.m4535b();
        } catch (Throwable unused) {
            this.f6100c.m4535b();
        }
    }
}
