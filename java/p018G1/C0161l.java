package p018G1;

import java.util.Iterator;
import p051R1.C0475e;

/* renamed from: G1.l */
/* loaded from: classes.dex */
public final class C0161l extends C0475e {

    /* renamed from: m */
    public final /* synthetic */ C0162m f469m;

    public C0161l(C0162m c0162m) {
        this.f469m = c0162m;
    }

    @Override // p051R1.C0475e
    /* renamed from: j */
    public final void mo508j() {
        C0162m c0162m = this.f469m;
        if (c0162m.f482m) {
            return;
        }
        c0162m.f482m = true;
        C0155f c0155f = c0162m.f483n;
        if (c0155f != null) {
            c0155f.f457c.cancel();
        }
        Iterator it = c0162m.f484o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0168s) it.next()).cancel();
        }
    }
}
