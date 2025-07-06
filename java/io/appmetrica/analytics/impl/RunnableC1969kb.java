package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.kb */
/* loaded from: classes.dex */
public final class RunnableC1969kb implements Runnable {

    /* renamed from: a */
    public final WeakReference f6578a;

    /* renamed from: b */
    public final WeakReference f6579b;

    public RunnableC1969kb(Handler handler, AbstractC1711a3 abstractC1711a3) {
        this.f6578a = new WeakReference(handler);
        this.f6579b = new WeakReference(abstractC1711a3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f6578a.get();
        AbstractC1711a3 abstractC1711a3 = (AbstractC1711a3) this.f6579b.get();
        if (handler == null || abstractC1711a3 == null) {
            return;
        }
        boolean mo3562f = abstractC1711a3.f5836b.mo3562f();
        if (!mo3562f) {
            C2123qf c2123qf = abstractC1711a3.f5837c;
            Set set = AbstractC2242v9.f7279a;
            EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
            C1987l4 c1987l4 = new C1987l4("", "", 3, 0, c2123qf);
            C1726ai c1726ai = abstractC1711a3.f5842h;
            C2000lh c2000lh = abstractC1711a3.f5836b;
            c1726ai.getClass();
            c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        }
        if (mo3562f) {
            return;
        }
        C1944jb.m4037a(handler, abstractC1711a3, this);
    }
}
