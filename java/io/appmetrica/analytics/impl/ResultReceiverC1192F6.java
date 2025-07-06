package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.F6 */
/* loaded from: classes.dex */
public final class ResultReceiverC1192F6 extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC1167E6 f4731a;

    public ResultReceiverC1192F6(Handler handler, InterfaceC1167E6 interfaceC1167E6) {
        super(handler);
        this.f4731a = interfaceC1167E6;
    }

    /* renamed from: a */
    public static void m2870a(ResultReceiver resultReceiver, C2137r4 c2137r4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c2137r4.m4369b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f4731a.mo2750a(r2, bundle);
    }

    /* renamed from: a */
    public static void m2869a(ResultReceiver resultReceiver, EnumC1779cl enumC1779cl, C2137r4 c2137r4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC1779cl.f6060a);
            c2137r4.m4369b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
