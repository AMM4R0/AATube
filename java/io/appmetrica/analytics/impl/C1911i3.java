package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.i3 */
/* loaded from: classes.dex */
public final class C1911i3 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C1936j3 f6456a;

    public C1911i3(C1936j3 c1936j3) {
        this.f6456a = c1936j3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f6456a.f6520b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f6456a.getClass();
        BatteryInfo m4023a = C1936j3.m4023a(intent);
        this.f6456a.f6520b = m4023a;
        if (chargeType != m4023a.chargeType) {
            this.f6456a.f6519a.execute(new C1886h3(this, m4023a));
        }
    }
}
