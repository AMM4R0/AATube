package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.L5 */
/* loaded from: classes.dex */
public final class C1341L5 implements InterfaceC2057o {

    /* renamed from: a */
    public final /* synthetic */ C1366M5 f4993a;

    public C1341L5(C1366M5 c1366m5) {
        this.f4993a = c1366m5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2057o
    /* renamed from: a */
    public final void mo3040a(Activity activity, EnumC2032n enumC2032n) {
        int ordinal = enumC2032n.ordinal();
        if (ordinal == 1) {
            this.f4993a.f5024b.resumeSession();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f4993a.f5024b.pauseSession();
        }
    }
}
