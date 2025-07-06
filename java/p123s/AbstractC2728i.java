package p123s;

import java.util.ArrayList;
import p126t.AbstractC2756h;
import p126t.C2762n;

/* renamed from: s.i */
/* loaded from: classes.dex */
public abstract class AbstractC2728i extends C2723d {

    /* renamed from: q0 */
    public C2723d[] f8965q0 = new C2723d[4];

    /* renamed from: r0 */
    public int f8966r0 = 0;

    /* renamed from: R */
    public final void m5316R(int r6, ArrayList arrayList, C2762n c2762n) {
        for (int r12 = 0; r12 < this.f8966r0; r12++) {
            C2723d c2723d = this.f8965q0[r12];
            ArrayList arrayList2 = c2762n.f9045a;
            if (!arrayList2.contains(c2723d)) {
                arrayList2.add(c2723d);
            }
        }
        for (int r02 = 0; r02 < this.f8966r0; r02++) {
            AbstractC2756h.m5362b(this.f8965q0[r02], r6, arrayList, c2762n);
        }
    }

    /* renamed from: S */
    public void mo5310S() {
    }
}
