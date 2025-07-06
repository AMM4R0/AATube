package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0692b {

    /* renamed from: a */
    public final int f2398a;

    /* renamed from: b */
    public final Method f2399b;

    public C0692b(int r12, Method method) {
        this.f2398a = r12;
        this.f2399b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0692b)) {
            return false;
        }
        C0692b c0692b = (C0692b) obj;
        return this.f2398a == c0692b.f2398a && this.f2399b.getName().equals(c0692b.f2399b.getName());
    }

    public final int hashCode() {
        return this.f2399b.getName().hashCode() + (this.f2398a * 31);
    }
}
