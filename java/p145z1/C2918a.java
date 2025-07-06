package p145z1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p108m1.C2666p;

/* renamed from: z1.a */
/* loaded from: classes.dex */
public final class C2918a implements InterfaceC2920c {

    /* renamed from: a */
    public final AtomicReference f9569a;

    public C2918a(C2666p c2666p) {
        this.f9569a = new AtomicReference(c2666p);
    }

    @Override // p145z1.InterfaceC2920c
    public final Iterator iterator() {
        InterfaceC2920c interfaceC2920c = (InterfaceC2920c) this.f9569a.getAndSet(null);
        if (interfaceC2920c != null) {
            return interfaceC2920c.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
