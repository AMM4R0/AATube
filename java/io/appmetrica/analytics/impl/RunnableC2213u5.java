package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u5 */
/* loaded from: classes.dex */
public final class RunnableC2213u5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1124Cd f7212a;

    /* renamed from: b */
    public final /* synthetic */ C2238v5 f7213b;

    public RunnableC2213u5(C2238v5 c2238v5, InterfaceC1124Cd interfaceC1124Cd) {
        this.f7213b = c2238v5;
        this.f7212a = interfaceC1124Cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7213b) {
            try {
                C2238v5 c2238v5 = this.f7213b;
                Object obj = c2238v5.f7257a;
                if (obj == null) {
                    c2238v5.f7259c.add(this.f7212a);
                } else {
                    this.f7212a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
