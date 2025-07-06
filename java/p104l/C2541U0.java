package p104l;

/* renamed from: l.U0 */
/* loaded from: classes.dex */
public final class C2541U0 {

    /* renamed from: a */
    public int f8299a;

    /* renamed from: b */
    public int f8300b;

    /* renamed from: c */
    public int f8301c;

    /* renamed from: d */
    public int f8302d;

    /* renamed from: e */
    public int f8303e;

    /* renamed from: f */
    public int f8304f;

    /* renamed from: g */
    public boolean f8305g;

    /* renamed from: h */
    public boolean f8306h;

    /* renamed from: a */
    public final void m4988a(int r3, int r4) {
        this.f8301c = r3;
        this.f8302d = r4;
        this.f8306h = true;
        if (this.f8305g) {
            if (r4 != Integer.MIN_VALUE) {
                this.f8299a = r4;
            }
            if (r3 != Integer.MIN_VALUE) {
                this.f8300b = r3;
                return;
            }
            return;
        }
        if (r3 != Integer.MIN_VALUE) {
            this.f8299a = r3;
        }
        if (r4 != Integer.MIN_VALUE) {
            this.f8300b = r4;
        }
    }
}
