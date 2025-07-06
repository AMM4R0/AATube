package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.Xf */
/* loaded from: classes.dex */
public final class ResultReceiverC1650Xf extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC1251Hf f5695a;

    public ResultReceiverC1650Xf(Handler handler, InterfaceC1251Hf interfaceC1251Hf) {
        super(handler);
        this.f5695a = interfaceC1251Hf;
    }

    /* renamed from: a */
    public static void m3514a(ResultReceiver resultReceiver, C1500Rf c1500Rf) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c1500Rf == null ? null : c1500Rf.m3263a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r2, Bundle bundle) {
        if (r2 == 1) {
            C1500Rf c1500Rf = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c1500Rf = new C1500Rf(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f5695a.mo2940a(c1500Rf);
        }
    }
}
