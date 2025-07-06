package p027J1;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: J1.G */
/* loaded from: classes.dex */
public final class C0239G {

    /* renamed from: a */
    public int f702a;

    /* renamed from: b */
    public final int[] f703b = new int[10];

    /* renamed from: a */
    public final int m651a() {
        if ((this.f702a & 128) != 0) {
            return this.f703b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void m652b(C0239G other) {
        AbstractC2492i.m4915e(other, "other");
        for (int r12 = 0; r12 < 10; r12++) {
            if (((1 << r12) & other.f702a) != 0) {
                m653c(r12, other.f703b[r12]);
            }
        }
    }

    /* renamed from: c */
    public final void m653c(int r4, int r5) {
        if (r4 >= 0) {
            int[] r02 = this.f703b;
            if (r4 >= r02.length) {
                return;
            }
            this.f702a = (1 << r4) | this.f702a;
            r02[r4] = r5;
        }
    }
}
