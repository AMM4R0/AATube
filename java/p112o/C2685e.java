package p112o;

/* renamed from: o.e */
/* loaded from: classes.dex */
public final class C2685e implements Cloneable {

    /* renamed from: e */
    public static final Object f8655e = new Object();

    /* renamed from: a */
    public boolean f8656a = false;

    /* renamed from: b */
    public long[] f8657b;

    /* renamed from: c */
    public Object[] f8658c;

    /* renamed from: d */
    public int f8659d;

    public C2685e() {
        int r2;
        int r02 = 4;
        while (true) {
            r2 = 80;
            if (r02 >= 32) {
                break;
            }
            int r12 = (1 << r02) - 12;
            if (80 <= r12) {
                r2 = r12;
                break;
            }
            r02++;
        }
        int r22 = r2 / 8;
        this.f8657b = new long[r22];
        this.f8658c = new Object[r22];
    }

    /* renamed from: a */
    public final void m5161a(long j2, Long l2) {
        int r02 = this.f8659d;
        if (r02 != 0 && j2 <= this.f8657b[r02 - 1]) {
            m5166f(j2, l2);
            return;
        }
        if (this.f8656a && r02 >= this.f8657b.length) {
            m5164d();
        }
        int r03 = this.f8659d;
        if (r03 >= this.f8657b.length) {
            int r12 = (r03 + 1) * 8;
            int r3 = 4;
            while (true) {
                if (r3 >= 32) {
                    break;
                }
                int r4 = (1 << r3) - 12;
                if (r12 <= r4) {
                    r12 = r4;
                    break;
                }
                r3++;
            }
            int r13 = r12 / 8;
            long[] jArr = new long[r13];
            Object[] objArr = new Object[r13];
            long[] jArr2 = this.f8657b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f8658c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8657b = jArr;
            this.f8658c = objArr;
        }
        this.f8657b[r03] = j2;
        this.f8658c[r03] = l2;
        this.f8659d = r03 + 1;
    }

    /* renamed from: b */
    public final void m5162b() {
        int r02 = this.f8659d;
        Object[] objArr = this.f8658c;
        for (int r3 = 0; r3 < r02; r3++) {
            objArr[r3] = null;
        }
        this.f8659d = 0;
        this.f8656a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C2685e clone() {
        try {
            C2685e c2685e = (C2685e) super.clone();
            c2685e.f8657b = (long[]) this.f8657b.clone();
            c2685e.f8658c = (Object[]) this.f8658c.clone();
            return c2685e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public final void m5164d() {
        int r02 = this.f8659d;
        long[] jArr = this.f8657b;
        Object[] objArr = this.f8658c;
        int r5 = 0;
        for (int r4 = 0; r4 < r02; r4++) {
            Object obj = objArr[r4];
            if (obj != f8655e) {
                if (r4 != r5) {
                    jArr[r5] = jArr[r4];
                    objArr[r5] = obj;
                    objArr[r4] = null;
                }
                r5++;
            }
        }
        this.f8656a = false;
        this.f8659d = r5;
    }

    /* renamed from: e */
    public final Object m5165e(long j2, Long l2) {
        Object obj;
        int m5160b = AbstractC2684d.m5160b(this.f8657b, this.f8659d, j2);
        return (m5160b < 0 || (obj = this.f8658c[m5160b]) == f8655e) ? l2 : obj;
    }

    /* renamed from: f */
    public final void m5166f(long j2, Object obj) {
        int m5160b = AbstractC2684d.m5160b(this.f8657b, this.f8659d, j2);
        if (m5160b >= 0) {
            this.f8658c[m5160b] = obj;
            return;
        }
        int r02 = ~m5160b;
        int r12 = this.f8659d;
        if (r02 < r12) {
            Object[] objArr = this.f8658c;
            if (objArr[r02] == f8655e) {
                this.f8657b[r02] = j2;
                objArr[r02] = obj;
                return;
            }
        }
        if (this.f8656a && r12 >= this.f8657b.length) {
            m5164d();
            r02 = ~AbstractC2684d.m5160b(this.f8657b, this.f8659d, j2);
        }
        int r13 = this.f8659d;
        if (r13 >= this.f8657b.length) {
            int r14 = (r13 + 1) * 8;
            int r2 = 4;
            while (true) {
                if (r2 >= 32) {
                    break;
                }
                int r4 = (1 << r2) - 12;
                if (r14 <= r4) {
                    r14 = r4;
                    break;
                }
                r2++;
            }
            int r15 = r14 / 8;
            long[] jArr = new long[r15];
            Object[] objArr2 = new Object[r15];
            long[] jArr2 = this.f8657b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8658c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8657b = jArr;
            this.f8658c = objArr2;
        }
        int r16 = this.f8659d - r02;
        if (r16 != 0) {
            long[] jArr3 = this.f8657b;
            int r42 = r02 + 1;
            System.arraycopy(jArr3, r02, jArr3, r42, r16);
            Object[] objArr4 = this.f8658c;
            System.arraycopy(objArr4, r02, objArr4, r42, this.f8659d - r02);
        }
        this.f8657b[r02] = j2;
        this.f8658c[r02] = obj;
        this.f8659d++;
    }

    /* renamed from: g */
    public final int m5167g() {
        if (this.f8656a) {
            m5164d();
        }
        return this.f8659d;
    }

    /* renamed from: h */
    public final Object m5168h(int r2) {
        if (this.f8656a) {
            m5164d();
        }
        return this.f8658c[r2];
    }

    public final String toString() {
        if (m5167g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8659d * 28);
        sb.append('{');
        for (int r12 = 0; r12 < this.f8659d; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            if (this.f8656a) {
                m5164d();
            }
            sb.append(this.f8657b[r12]);
            sb.append('=');
            Object m5168h = m5168h(r12);
            if (m5168h != this) {
                sb.append(m5168h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
