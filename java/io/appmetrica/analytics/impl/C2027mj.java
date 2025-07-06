package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mj */
/* loaded from: classes.dex */
public final class C2027mj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f6777a;

    /* renamed from: b */
    public final /* synthetic */ String f6778b;

    public C2027mj(String str, String str2) {
        this.f6777a = str;
        this.f6778b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.putAppEnvironmentValue(this.f6777a, this.f6778b);
    }
}
