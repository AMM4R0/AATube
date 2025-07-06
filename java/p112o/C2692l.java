package p112o;

/* renamed from: o.l */
/* loaded from: classes.dex */
public final class C2692l implements Cloneable {

    /* renamed from: d */
    public static final Object f8684d = new Object();

    /* renamed from: a */
    public int[] f8685a;

    /* renamed from: b */
    public Object[] f8686b;

    /* renamed from: c */
    public int f8687c;

    public C2692l() {
        int r3;
        int r12 = 4;
        while (true) {
            r3 = 40;
            if (r12 >= 32) {
                break;
            }
            int r2 = (1 << r12) - 12;
            if (40 <= r2) {
                r3 = r2;
                break;
            }
            r12++;
        }
        int r32 = r3 / 4;
        this.f8685a = new int[r32];
        this.f8686b = new Object[r32];
    }

    /* renamed from: a */
    public final void m5182a(int r8, Object obj) {
        int r02 = this.f8687c;
        if (r02 != 0 && r8 <= this.f8685a[r02 - 1]) {
            m5185d(r8, obj);
            return;
        }
        if (r02 >= this.f8685a.length) {
            int r12 = (r02 + 1) * 4;
            int r4 = 4;
            while (true) {
                if (r4 >= 32) {
                    break;
                }
                int r5 = (1 << r4) - 12;
                if (r12 <= r5) {
                    r12 = r5;
                    break;
                }
                r4++;
            }
            int r13 = r12 / 4;
            int[] r3 = new int[r13];
            Object[] objArr = new Object[r13];
            int[] r42 = this.f8685a;
            System.arraycopy(r42, 0, r3, 0, r42.length);
            Object[] objArr2 = this.f8686b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8685a = r3;
            this.f8686b = objArr;
        }
        this.f8685a[r02] = r8;
        this.f8686b[r02] = obj;
        this.f8687c = r02 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2692l clone() {
        try {
            C2692l c2692l = (C2692l) super.clone();
            c2692l.f8685a = (int[]) this.f8685a.clone();
            c2692l.f8686b = (Object[]) this.f8686b.clone();
            return c2692l;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: c */
    public final Object m5184c(int r3, Integer num) {
        Object obj;
        int m5159a = AbstractC2684d.m5159a(this.f8687c, r3, this.f8685a);
        return (m5159a < 0 || (obj = this.f8686b[m5159a]) == f8684d) ? num : obj;
    }

    /* renamed from: d */
    public final void m5185d(int r8, Object obj) {
        int m5159a = AbstractC2684d.m5159a(this.f8687c, r8, this.f8685a);
        if (m5159a >= 0) {
            this.f8686b[m5159a] = obj;
            return;
        }
        int r02 = ~m5159a;
        int r12 = this.f8687c;
        if (r02 < r12) {
            Object[] objArr = this.f8686b;
            if (objArr[r02] == f8684d) {
                this.f8685a[r02] = r8;
                objArr[r02] = obj;
                return;
            }
        }
        if (r12 >= this.f8685a.length) {
            int r13 = (r12 + 1) * 4;
            int r4 = 4;
            while (true) {
                if (r4 >= 32) {
                    break;
                }
                int r5 = (1 << r4) - 12;
                if (r13 <= r5) {
                    r13 = r5;
                    break;
                }
                r4++;
            }
            int r14 = r13 / 4;
            int[] r2 = new int[r14];
            Object[] objArr2 = new Object[r14];
            int[] r42 = this.f8685a;
            System.arraycopy(r42, 0, r2, 0, r42.length);
            Object[] objArr3 = this.f8686b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8685a = r2;
            this.f8686b = objArr2;
        }
        int r15 = this.f8687c - r02;
        if (r15 != 0) {
            int[] r22 = this.f8685a;
            int r43 = r02 + 1;
            System.arraycopy(r22, r02, r22, r43, r15);
            Object[] objArr4 = this.f8686b;
            System.arraycopy(objArr4, r02, objArr4, r43, this.f8687c - r02);
        }
        this.f8685a[r02] = r8;
        this.f8686b[r02] = obj;
        this.f8687c++;
    }

    public final String toString() {
        int r02 = this.f8687c;
        if (r02 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(r02 * 28);
        sb.append('{');
        for (int r03 = 0; r03 < this.f8687c; r03++) {
            if (r03 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8685a[r03]);
            sb.append('=');
            Object obj = this.f8686b[r03];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
