package p132v;

import android.view.ViewGroup;
import p123s.C2723d;
import p123s.C2727h;

/* renamed from: v.e */
/* loaded from: classes.dex */
public final class C2825e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public int f9168A;

    /* renamed from: B */
    public int f9169B;

    /* renamed from: C */
    public int f9170C;

    /* renamed from: D */
    public int f9171D;

    /* renamed from: E */
    public float f9172E;

    /* renamed from: F */
    public float f9173F;

    /* renamed from: G */
    public String f9174G;

    /* renamed from: H */
    public float f9175H;

    /* renamed from: I */
    public float f9176I;

    /* renamed from: J */
    public int f9177J;

    /* renamed from: K */
    public int f9178K;

    /* renamed from: L */
    public int f9179L;

    /* renamed from: M */
    public int f9180M;

    /* renamed from: N */
    public int f9181N;

    /* renamed from: O */
    public int f9182O;

    /* renamed from: P */
    public int f9183P;

    /* renamed from: Q */
    public int f9184Q;

    /* renamed from: R */
    public float f9185R;

    /* renamed from: S */
    public float f9186S;

    /* renamed from: T */
    public int f9187T;

    /* renamed from: U */
    public int f9188U;

    /* renamed from: V */
    public int f9189V;

    /* renamed from: W */
    public boolean f9190W;

    /* renamed from: X */
    public boolean f9191X;

    /* renamed from: Y */
    public String f9192Y;

    /* renamed from: Z */
    public int f9193Z;

    /* renamed from: a */
    public int f9194a;

    /* renamed from: a0 */
    public boolean f9195a0;

    /* renamed from: b */
    public int f9196b;

    /* renamed from: b0 */
    public boolean f9197b0;

    /* renamed from: c */
    public float f9198c;

    /* renamed from: c0 */
    public boolean f9199c0;

    /* renamed from: d */
    public boolean f9200d;

    /* renamed from: d0 */
    public boolean f9201d0;

    /* renamed from: e */
    public int f9202e;

    /* renamed from: e0 */
    public boolean f9203e0;

    /* renamed from: f */
    public int f9204f;

    /* renamed from: f0 */
    public int f9205f0;

    /* renamed from: g */
    public int f9206g;

    /* renamed from: g0 */
    public int f9207g0;

    /* renamed from: h */
    public int f9208h;

    /* renamed from: h0 */
    public int f9209h0;

    /* renamed from: i */
    public int f9210i;

    /* renamed from: i0 */
    public int f9211i0;

    /* renamed from: j */
    public int f9212j;

    /* renamed from: j0 */
    public int f9213j0;

    /* renamed from: k */
    public int f9214k;

    /* renamed from: k0 */
    public int f9215k0;

    /* renamed from: l */
    public int f9216l;

    /* renamed from: l0 */
    public float f9217l0;

    /* renamed from: m */
    public int f9218m;

    /* renamed from: m0 */
    public int f9219m0;

    /* renamed from: n */
    public int f9220n;

    /* renamed from: n0 */
    public int f9221n0;

    /* renamed from: o */
    public int f9222o;

    /* renamed from: o0 */
    public float f9223o0;

    /* renamed from: p */
    public int f9224p;

    /* renamed from: p0 */
    public C2723d f9225p0;

    /* renamed from: q */
    public int f9226q;

    /* renamed from: r */
    public float f9227r;

    /* renamed from: s */
    public int f9228s;

    /* renamed from: t */
    public int f9229t;

    /* renamed from: u */
    public int f9230u;

    /* renamed from: v */
    public int f9231v;

    /* renamed from: w */
    public int f9232w;

    /* renamed from: x */
    public int f9233x;

    /* renamed from: y */
    public int f9234y;

    /* renamed from: z */
    public int f9235z;

    /* renamed from: a */
    public final void m5435a() {
        this.f9201d0 = false;
        this.f9195a0 = true;
        this.f9197b0 = true;
        int r2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (r2 == -2 && this.f9190W) {
            this.f9195a0 = false;
            if (this.f9179L == 0) {
                this.f9179L = 1;
            }
        }
        int r4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (r4 == -2 && this.f9191X) {
            this.f9197b0 = false;
            if (this.f9180M == 0) {
                this.f9180M = 1;
            }
        }
        if (r2 == 0 || r2 == -1) {
            this.f9195a0 = false;
            if (r2 == 0 && this.f9179L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f9190W = true;
            }
        }
        if (r4 == 0 || r4 == -1) {
            this.f9197b0 = false;
            if (r4 == 0 && this.f9180M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f9191X = true;
            }
        }
        if (this.f9198c == -1.0f && this.f9194a == -1 && this.f9196b == -1) {
            return;
        }
        this.f9201d0 = true;
        this.f9195a0 = true;
        this.f9197b0 = true;
        if (!(this.f9225p0 instanceof C2727h)) {
            this.f9225p0 = new C2727h();
        }
        ((C2727h) this.f9225p0).m5315S(this.f9189V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132v.C2825e.resolveLayoutDirection(int):void");
    }
}
