package p133v0;

import p023I0.C0203a;
import p124s0.C2731b;
import p127t0.InterfaceC2771h;

/* renamed from: v0.g */
/* loaded from: classes.dex */
public final class C2852g implements InterfaceC2847b {

    /* renamed from: b */
    public static C2852g f9424b;

    /* renamed from: c */
    public static final C2853h f9425c = new C2853h(0, false, false, 0, 0);

    /* renamed from: a */
    public Object f9426a;

    public /* synthetic */ C2852g(Object obj) {
        this.f9426a = obj;
    }

    /* renamed from: b */
    public static synchronized C2852g m5459b() {
        C2852g c2852g;
        synchronized (C2852g.class) {
            try {
                if (f9424b == null) {
                    f9424b = new C2852g();
                }
                c2852g = f9424b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2852g;
    }

    @Override // p133v0.InterfaceC2847b
    /* renamed from: a */
    public void mo5414a(C2731b c2731b) {
        boolean z2 = c2731b.f8972b == 0;
        C0203a c0203a = (C0203a) this.f9426a;
        if (z2) {
            c0203a.mo2039l(null, c0203a.f2721w);
            return;
        }
        C2852g c2852g = c0203a.f2713o;
        if (c2852g != null) {
            ((InterfaceC2771h) c2852g.f9426a).mo5390a(c2731b);
        }
    }
}
