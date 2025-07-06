package p080e0;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public final class C0843a {

    /* renamed from: a */
    public int f3455a;

    /* renamed from: b */
    public int f3456b;

    /* renamed from: c */
    public int f3457c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0843a.class != obj.getClass()) {
            return false;
        }
        C0843a c0843a = (C0843a) obj;
        int r2 = this.f3455a;
        if (r2 != c0843a.f3455a) {
            return false;
        }
        if (r2 == 8 && Math.abs(this.f3457c - this.f3456b) == 1 && this.f3457c == c0843a.f3456b && this.f3456b == c0843a.f3457c) {
            return true;
        }
        return this.f3457c == c0843a.f3457c && this.f3456b == c0843a.f3456b;
    }

    public final int hashCode() {
        return (((this.f3455a * 31) + this.f3456b) * 31) + this.f3457c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int r12 = this.f3455a;
        sb.append(r12 != 1 ? r12 != 2 ? r12 != 4 ? r12 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3456b);
        sb.append("c:");
        sb.append(this.f3457c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
