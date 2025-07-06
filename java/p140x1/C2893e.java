package p140x1;

/* renamed from: x1.e */
/* loaded from: classes.dex */
public final class C2893e extends C2892d {

    /* renamed from: d */
    public static final C2893e f9522d = new C2893e(1, 0, 1);

    /* renamed from: b */
    public final boolean m5483b(int r2) {
        return this.f9519a <= r2 && r2 <= this.f9520b;
    }

    @Override // p140x1.C2892d
    public final boolean equals(Object obj) {
        if (obj instanceof C2893e) {
            if (!isEmpty() || !((C2893e) obj).isEmpty()) {
                C2893e c2893e = (C2893e) obj;
                if (this.f9519a == c2893e.f9519a) {
                    if (this.f9520b == c2893e.f9520b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p140x1.C2892d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f9519a * 31) + this.f9520b;
    }

    @Override // p140x1.C2892d
    public final boolean isEmpty() {
        return this.f9519a > this.f9520b;
    }

    @Override // p140x1.C2892d
    public final String toString() {
        return this.f9519a + ".." + this.f9520b;
    }
}
