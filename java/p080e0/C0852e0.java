package p080e0;

/* renamed from: e0.e0 */
/* loaded from: classes.dex */
public final class C0852e0 {

    /* renamed from: a */
    public int f3498a;

    /* renamed from: b */
    public int f3499b;

    /* renamed from: c */
    public int f3500c;

    /* renamed from: d */
    public int f3501d;

    /* renamed from: e */
    public int f3502e;

    /* renamed from: a */
    public final boolean m2350a() {
        int r02 = this.f3498a;
        int r2 = 2;
        if ((r02 & 7) != 0) {
            int r12 = this.f3501d;
            int r6 = this.f3499b;
            if (((r12 > r6 ? 1 : r12 == r6 ? 2 : 4) & r02) == 0) {
                return false;
            }
        }
        if ((r02 & 112) != 0) {
            int r13 = this.f3501d;
            int r62 = this.f3500c;
            if ((((r13 > r62 ? 1 : r13 == r62 ? 2 : 4) << 4) & r02) == 0) {
                return false;
            }
        }
        if ((r02 & 1792) != 0) {
            int r14 = this.f3502e;
            int r63 = this.f3499b;
            if ((((r14 > r63 ? 1 : r14 == r63 ? 2 : 4) << 8) & r02) == 0) {
                return false;
            }
        }
        if ((r02 & 28672) != 0) {
            int r15 = this.f3502e;
            int r64 = this.f3500c;
            if (r15 > r64) {
                r2 = 1;
            } else if (r15 != r64) {
                r2 = 4;
            }
            if ((r02 & (r2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
