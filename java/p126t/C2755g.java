package p126t;

import java.util.Iterator;

/* renamed from: t.g */
/* loaded from: classes.dex */
public class C2755g extends C2754f {

    /* renamed from: m */
    public int f9037m;

    public C2755g(AbstractC2763o abstractC2763o) {
        super(abstractC2763o);
        if (abstractC2763o instanceof C2759k) {
            this.f9029e = 2;
        } else {
            this.f9029e = 3;
        }
    }

    @Override // p126t.C2754f
    /* renamed from: d */
    public final void mo5360d(int r2) {
        if (this.f9034j) {
            return;
        }
        this.f9034j = true;
        this.f9031g = r2;
        Iterator it = this.f9035k.iterator();
        while (it.hasNext()) {
            InterfaceC2752d interfaceC2752d = (InterfaceC2752d) it.next();
            interfaceC2752d.mo5343a(interfaceC2752d);
        }
    }
}
