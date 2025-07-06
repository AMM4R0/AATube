package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import p105l1.C2634e;

/* renamed from: io.appmetrica.analytics.impl.Pf */
/* loaded from: classes.dex */
public final class C1451Pf {

    /* renamed from: a */
    public final HashSet f5220a = new HashSet();

    /* renamed from: b */
    public C1500Rf f5221b;

    /* renamed from: c */
    public boolean f5222c;

    /* renamed from: d */
    public final C1359Ln f5223d;

    /* renamed from: e */
    public final Context f5224e;

    public C1451Pf(Context context, C1359Ln c1359Ln) {
        this.f5224e = context;
        this.f5223d = c1359Ln;
        this.f5221b = c1359Ln.m3070b();
        this.f5222c = c1359Ln.m3072c();
    }

    /* renamed from: a */
    public final void m3206a() {
        if (this.f5222c) {
            return;
        }
        Context context = this.f5224e;
        InterfaceC1396Na m3576a = C1699Zf.m3576a(context, C2018ma.f6725C.f6731d.m2962a());
        InterfaceC1625Wf interfaceC1625Wf = (InterfaceC1625Wf) ((C2634e) new C1226Gf(this, new C1699Zf(m3576a), new C2318ya(context), new C1724ag(context)).f4792f).m5093a();
        try {
            m3576a.mo3090a(interfaceC1625Wf);
        } catch (Throwable th) {
            interfaceC1625Wf.mo2861a(th);
        }
    }

    /* renamed from: a */
    public final synchronized void m3208a(C1550Tf c1550Tf) {
        this.f5220a.add(c1550Tf);
        if (this.f5222c) {
            c1550Tf.m3374a(this.f5221b);
        }
    }

    /* renamed from: a */
    public final synchronized void m3207a(C1500Rf c1500Rf) {
        Iterator it = this.f5220a.iterator();
        while (it.hasNext()) {
            ((C1550Tf) it.next()).m3374a(c1500Rf);
        }
    }
}
