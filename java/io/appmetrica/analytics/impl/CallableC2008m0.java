package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.m0 */
/* loaded from: classes.dex */
public final class CallableC2008m0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C2108q0 f6672a;

    public CallableC2008m0(C2108q0 c2108q0) {
        this.f6672a = c2108q0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC1096Ba interfaceC1096Ba;
        C2108q0 c2108q0 = this.f6672a;
        C1933j0 c1933j0 = c2108q0.f6957b;
        Context context = c2108q0.f6956a;
        InterfaceC1071Aa interfaceC1071Aa = c2108q0.f6959d;
        synchronized (c1933j0) {
            try {
                if (c1933j0.f6509d == null) {
                    if (c1933j0.m4022a(context)) {
                        c1933j0.f6509d = new C2208u0();
                    } else {
                        c1933j0.f6509d = new C2158s0(context.getApplicationContext(), interfaceC1071Aa, new C2272we(C1765c7.m3695a(context.getApplicationContext()).m3697a()));
                    }
                }
                interfaceC1096Ba = c1933j0.f6509d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1096Ba;
    }
}
