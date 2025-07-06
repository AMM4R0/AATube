package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.al */
/* loaded from: classes.dex */
public final class C1729al {

    /* renamed from: a */
    public final C2068oa f5891a = new C2068oa();

    /* renamed from: b */
    public final HashMap f5892b = new HashMap();

    /* renamed from: c */
    public C2354zl f5893c = null;

    /* renamed from: d */
    public final C1680Yk f5894d = new C1680Yk(this);

    /* renamed from: a */
    public static final C1729al m3625a() {
        return AbstractC1704Zk.f5815a;
    }

    /* renamed from: a */
    public final C1606Vl m3626a(Context context, C1838f5 c1838f5, C2179sl c2179sl) {
        C1606Vl c1606Vl = (C1606Vl) this.f5892b.get(c1838f5.f6192a);
        boolean z2 = true;
        if (c1606Vl == null) {
            synchronized (this.f5892b) {
                try {
                    c1606Vl = (C1606Vl) this.f5892b.get(c1838f5.f6192a);
                    if (c1606Vl == null) {
                        c1606Vl = new C1606Vl(new C1631Wl(context, c1838f5.f6192a, c2179sl, this.f5894d));
                        c1606Vl.m3443f();
                        this.f5892b.put(c1838f5.f6192a, c1606Vl);
                        z2 = false;
                    }
                } finally {
                }
            }
        }
        if (z2) {
            c1606Vl.m3434a(c2179sl);
        }
        return c1606Vl;
    }

    /* renamed from: a */
    public final void m3627a(C1838f5 c1838f5, InterfaceC1954jl interfaceC1954jl) {
        synchronized (this.f5892b) {
            try {
                this.f5891a.m4264a(c1838f5.f6192a, interfaceC1954jl);
                C2354zl c2354zl = this.f5893c;
                if (c2354zl != null) {
                    interfaceC1954jl.mo3171a(c2354zl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
