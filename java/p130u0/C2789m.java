package p130u0;

import java.util.Set;
import p010D0.RunnableC0106d;
import p124s0.C2731b;
import p127t0.InterfaceC2766c;
import p133v0.AbstractC2863r;
import p133v0.InterfaceC2847b;
import p133v0.InterfaceC2850e;

/* renamed from: u0.m */
/* loaded from: classes.dex */
public final class C2789m implements InterfaceC2847b {

    /* renamed from: a */
    public final InterfaceC2766c f9117a;

    /* renamed from: b */
    public final C2777a f9118b;

    /* renamed from: c */
    public InterfaceC2850e f9119c = null;

    /* renamed from: d */
    public Set f9120d = null;

    /* renamed from: e */
    public boolean f9121e = false;

    /* renamed from: f */
    public final /* synthetic */ C2779c f9122f;

    public C2789m(C2779c c2779c, InterfaceC2766c interfaceC2766c, C2777a c2777a) {
        this.f9122f = c2779c;
        this.f9117a = interfaceC2766c;
        this.f9118b = c2777a;
    }

    @Override // p133v0.InterfaceC2847b
    /* renamed from: a */
    public final void mo5414a(C2731b c2731b) {
        this.f9122f.f9099m.post(new RunnableC0106d(this, c2731b, 8, false));
    }

    /* renamed from: b */
    public final void m5415b(C2731b c2731b) {
        C2787k c2787k = (C2787k) this.f9122f.f9096j.get(this.f9118b);
        if (c2787k != null) {
            AbstractC2863r.m5472a(c2787k.f9114n.f9099m);
            InterfaceC2766c interfaceC2766c = c2787k.f9103c;
            String name = interfaceC2766c.getClass().getName();
            String valueOf = String.valueOf(c2731b);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            interfaceC2766c.mo2037i(sb.toString());
            c2787k.m5412o(c2731b, null);
        }
    }
}
