package p018G1;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: G1.r */
/* loaded from: classes.dex */
public final class C0167r {

    /* renamed from: a */
    public final InterfaceC0168s f529a;

    /* renamed from: b */
    public final InterfaceC0168s f530b;

    /* renamed from: c */
    public final Throwable f531c;

    public C0167r(InterfaceC0168s interfaceC0168s, InterfaceC0168s interfaceC0168s2, Throwable th) {
        this.f529a = interfaceC0168s;
        this.f530b = interfaceC0168s2;
        this.f531c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0167r)) {
            return false;
        }
        C0167r c0167r = (C0167r) obj;
        return AbstractC2492i.m4911a(this.f529a, c0167r.f529a) && AbstractC2492i.m4911a(this.f530b, c0167r.f530b) && AbstractC2492i.m4911a(this.f531c, c0167r.f531c);
    }

    public final int hashCode() {
        int hashCode = this.f529a.hashCode() * 31;
        InterfaceC0168s interfaceC0168s = this.f530b;
        int hashCode2 = (hashCode + (interfaceC0168s == null ? 0 : interfaceC0168s.hashCode())) * 31;
        Throwable th = this.f531c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f529a + ", nextPlan=" + this.f530b + ", throwable=" + this.f531c + ')';
    }

    public /* synthetic */ C0167r(InterfaceC0168s interfaceC0168s, Throwable th, int r4) {
        this(interfaceC0168s, (InterfaceC0168s) null, (r4 & 4) != 0 ? null : th);
    }
}
