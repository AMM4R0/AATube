package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.ih */
/* loaded from: classes.dex */
public final class C1925ih extends AbstractC2089p6 {

    /* renamed from: d */
    public final C1981kn f6497d;

    public C1925ih(Context context, C1981kn c1981kn, InterfaceC2064o6 interfaceC2064o6, ICrashTransformer iCrashTransformer) {
        this(c1981kn, interfaceC2064o6, iCrashTransformer, new C1370M9(context));
    }

    /* renamed from: c */
    public final C1981kn m4019c() {
        return this.f6497d;
    }

    public C1925ih(C1981kn c1981kn, InterfaceC2064o6 interfaceC2064o6, ICrashTransformer iCrashTransformer, C1370M9 c1370m9) {
        super(interfaceC2064o6, iCrashTransformer, c1370m9);
        this.f6497d = c1981kn;
    }
}
