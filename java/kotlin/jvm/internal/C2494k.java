package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.k */
/* loaded from: classes.dex */
public final class C2494k implements InterfaceC2487d {

    /* renamed from: a */
    public final Class f8171a;

    public C2494k(Class jClass) {
        AbstractC2492i.m4915e(jClass, "jClass");
        this.f8171a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC2487d
    /* renamed from: a */
    public final Class mo4909a() {
        return this.f8171a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2494k) {
            if (AbstractC2492i.m4911a(this.f8171a, ((C2494k) obj).f8171a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8171a.hashCode();
    }

    public final String toString() {
        return this.f8171a.toString() + " (Kotlin reflection is not available)";
    }
}
