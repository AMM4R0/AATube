package p118q;

import java.util.Arrays;

/* renamed from: q.f */
/* loaded from: classes.dex */
public final class C2715f implements Comparable {

    /* renamed from: a */
    public boolean f8766a;

    /* renamed from: e */
    public float f8770e;

    /* renamed from: l */
    public int f8777l;

    /* renamed from: b */
    public int f8767b = -1;

    /* renamed from: c */
    public int f8768c = -1;

    /* renamed from: d */
    public int f8769d = 0;

    /* renamed from: f */
    public boolean f8771f = false;

    /* renamed from: g */
    public final float[] f8772g = new float[9];

    /* renamed from: h */
    public final float[] f8773h = new float[9];

    /* renamed from: i */
    public C2711b[] f8774i = new C2711b[16];

    /* renamed from: j */
    public int f8775j = 0;

    /* renamed from: k */
    public int f8776k = 0;

    public C2715f(int r4) {
        this.f8777l = r4;
    }

    /* renamed from: a */
    public final void m5235a(C2711b c2711b) {
        int r02 = 0;
        while (true) {
            int r12 = this.f8775j;
            if (r02 >= r12) {
                C2711b[] c2711bArr = this.f8774i;
                if (r12 >= c2711bArr.length) {
                    this.f8774i = (C2711b[]) Arrays.copyOf(c2711bArr, c2711bArr.length * 2);
                }
                C2711b[] c2711bArr2 = this.f8774i;
                int r13 = this.f8775j;
                c2711bArr2[r13] = c2711b;
                this.f8775j = r13 + 1;
                return;
            }
            if (this.f8774i[r02] == c2711b) {
                return;
            } else {
                r02++;
            }
        }
    }

    /* renamed from: b */
    public final void m5236b(C2711b c2711b) {
        int r02 = this.f8775j;
        int r12 = 0;
        while (r12 < r02) {
            if (this.f8774i[r12] == c2711b) {
                while (r12 < r02 - 1) {
                    C2711b[] c2711bArr = this.f8774i;
                    int r2 = r12 + 1;
                    c2711bArr[r12] = c2711bArr[r2];
                    r12 = r2;
                }
                this.f8775j--;
                return;
            }
            r12++;
        }
    }

    /* renamed from: c */
    public final void m5237c() {
        this.f8777l = 5;
        this.f8769d = 0;
        this.f8767b = -1;
        this.f8768c = -1;
        this.f8770e = 0.0f;
        this.f8771f = false;
        int r2 = this.f8775j;
        for (int r3 = 0; r3 < r2; r3++) {
            this.f8774i[r3] = null;
        }
        this.f8775j = 0;
        this.f8776k = 0;
        this.f8766a = false;
        Arrays.fill(this.f8773h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8767b - ((C2715f) obj).f8767b;
    }

    /* renamed from: d */
    public final void m5238d(C2712c c2712c, float f) {
        this.f8770e = f;
        this.f8771f = true;
        int r5 = this.f8775j;
        this.f8768c = -1;
        for (int r12 = 0; r12 < r5; r12++) {
            this.f8774i[r12].m5210h(c2712c, this, false);
        }
        this.f8775j = 0;
    }

    /* renamed from: e */
    public final void m5239e(C2712c c2712c, C2711b c2711b) {
        int r02 = this.f8775j;
        for (int r2 = 0; r2 < r02; r2++) {
            this.f8774i[r2].mo5211i(c2712c, c2711b, false);
        }
        this.f8775j = 0;
    }

    public final String toString() {
        return "" + this.f8767b;
    }
}
