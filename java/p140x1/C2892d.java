package p140x1;

import android.support.v4.media.session.AbstractC0580g;

/* renamed from: x1.d */
/* loaded from: classes.dex */
public class C2892d implements Iterable {

    /* renamed from: a */
    public final int f9519a;

    /* renamed from: b */
    public final int f9520b;

    /* renamed from: c */
    public final int f9521c;

    public C2892d(int r2, int r3, int r4) {
        if (r4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (r4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f9519a = r2;
        this.f9520b = AbstractC0580g.m1451p(r2, r3, r4);
        this.f9521c = r4;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2890b iterator() {
        return new C2890b(this.f9519a, this.f9520b, this.f9521c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2892d) {
            if (!isEmpty() || !((C2892d) obj).isEmpty()) {
                C2892d c2892d = (C2892d) obj;
                if (this.f9519a != c2892d.f9519a || this.f9520b != c2892d.f9520b || this.f9521c != c2892d.f9521c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f9519a * 31) + this.f9520b) * 31) + this.f9521c;
    }

    public boolean isEmpty() {
        int r02 = this.f9521c;
        int r3 = this.f9520b;
        int r4 = this.f9519a;
        if (r02 > 0) {
            if (r4 <= r3) {
                return false;
            }
        } else if (r4 >= r3) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int r12 = this.f9520b;
        int r2 = this.f9519a;
        int r3 = this.f9521c;
        if (r3 > 0) {
            sb = new StringBuilder();
            sb.append(r2);
            sb.append("..");
            sb.append(r12);
            sb.append(" step ");
            sb.append(r3);
        } else {
            sb = new StringBuilder();
            sb.append(r2);
            sb.append(" downTo ");
            sb.append(r12);
            sb.append(" step ");
            sb.append(-r3);
        }
        return sb.toString();
    }
}
