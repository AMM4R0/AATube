package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.p6 */
/* loaded from: classes.dex */
public abstract class AbstractC2089p6 implements InterfaceC1171Ea {

    /* renamed from: a */
    public final InterfaceC2064o6 f6884a;

    /* renamed from: b */
    public final ICrashTransformer f6885b;

    /* renamed from: c */
    public final C1370M9 f6886c;

    public AbstractC2089p6(InterfaceC2064o6 interfaceC2064o6, ICrashTransformer iCrashTransformer, C1370M9 c1370m9) {
        this.f6884a = interfaceC2064o6;
        this.f6885b = iCrashTransformer;
        this.f6886c = c1370m9;
    }

    /* renamed from: a */
    public final void m4278a(Throwable th, C1559U c1559u) {
        if (this.f6884a.mo2916a(th)) {
            ICrashTransformer iCrashTransformer = this.f6885b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                ((C1925ih) this).f6497d.mo3496a().mo3056a(AbstractC1906hn.m3974a(th, c1559u, null, (String) this.f6886c.f5051a.m3832a(), (Boolean) this.f6886c.f5052b.m3832a()));
            }
        }
    }

    /* renamed from: b */
    public final InterfaceC2064o6 m4279b() {
        return this.f6884a;
    }

    /* renamed from: a */
    public final ICrashTransformer m4277a() {
        return this.f6885b;
    }
}
