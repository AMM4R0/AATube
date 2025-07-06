package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.identifiers.impl.j */
/* loaded from: classes.dex */
public final class C1048j implements InterfaceC1040b {

    /* renamed from: a */
    public final C1044f f4433a;

    public C1048j(C1044f c1044f) {
        this.f4433a = c1044f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC1040b
    /* renamed from: a */
    public final C1041c mo2673a(Context context) {
        C1041c c1041c;
        C1044f c1044f;
        try {
            try {
                try {
                    C1051m c1051m = (C1051m) ((InterfaceC1053o) this.f4433a.m2675a(context));
                    c1041c = new C1041c(IdentifierStatus.OK, new C1039a("huawei", c1051m.m2678a(), Boolean.valueOf(c1051m.m2679b())), null, 4);
                    c1044f = this.f4433a;
                } finally {
                    c1044f.m2676b(context);
                }
            } catch (C1045g e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                c1041c = new C1041c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                c1044f = this.f4433a;
            }
            c1044f.m2676b(context);
            return c1041c;
        } catch (Throwable th) {
            try {
                this.f4433a.m2676b(context);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1048j() {
        /*
            r4 = this;
            io.appmetrica.analytics.identifiers.impl.f r0 = new io.appmetrica.analytics.identifiers.impl.f
            android.content.Intent r1 = io.appmetrica.analytics.identifiers.impl.AbstractC1049k.m2677a()
            io.appmetrica.analytics.identifiers.impl.i r2 = io.appmetrica.analytics.identifiers.impl.C1047i.f4432a
            java.lang.String r3 = "huawei"
            r0.<init>(r1, r2, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.identifiers.impl.C1048j.<init>():void");
    }
}
