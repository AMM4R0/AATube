package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.gg */
/* loaded from: classes.dex */
public final class C1874gg implements InterfaceC1418O7 {

    /* renamed from: a */
    public final InterfaceC2038n5 f6328a;

    public C1874gg(InterfaceC2038n5 interfaceC2038n5) {
        this.f6328a = interfaceC2038n5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1418O7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1849fg mo3166a(Context context, C1838f5 c1838f5, C1290J4 c1290j4) {
        return new C1849fg(context, c1838f5, c1290j4, this.f6328a, new C1863g5(), C1729al.m3625a());
    }

    /* renamed from: a */
    public final InterfaceC2038n5 m3894a() {
        return this.f6328a;
    }
}
