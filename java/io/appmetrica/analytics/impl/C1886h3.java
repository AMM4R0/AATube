package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.h3 */
/* loaded from: classes.dex */
public final class C1886h3 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ BatteryInfo f6356a;

    /* renamed from: b */
    public final /* synthetic */ C1911i3 f6357b;

    public C1886h3(C1911i3 c1911i3, BatteryInfo batteryInfo) {
        this.f6357b = c1911i3;
        this.f6356a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1936j3 c1936j3 = this.f6357b.f6456a;
        ChargeType chargeType = this.f6356a.chargeType;
        ChargeType chargeType2 = C1936j3.f6518d;
        synchronized (c1936j3) {
            Iterator it = c1936j3.f6521c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
