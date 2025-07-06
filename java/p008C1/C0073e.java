package p008C1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p108m1.AbstractC2659i;
import p131u1.InterfaceC2799a;

/* renamed from: C1.e */
/* loaded from: classes.dex */
public final class C0073e {

    /* renamed from: c */
    public static final C0073e f172c = new C0073e(AbstractC2659i.m5119i0(new ArrayList()), null);

    /* renamed from: a */
    public final Set f173a;

    /* renamed from: b */
    public final AbstractC0580g f174b;

    public C0073e(Set set, AbstractC0580g abstractC0580g) {
        this.f173a = set;
        this.f174b = abstractC0580g;
    }

    /* renamed from: a */
    public final void m256a(String hostname, InterfaceC2799a interfaceC2799a) {
        AbstractC2492i.m4915e(hostname, "hostname");
        Iterator it = this.f173a.iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0073e) {
            C0073e c0073e = (C0073e) obj;
            if (AbstractC2492i.m4911a(c0073e.f173a, this.f173a) && AbstractC2492i.m4911a(c0073e.f174b, this.f174b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f173a.hashCode() + 1517) * 41;
        AbstractC0580g abstractC0580g = this.f174b;
        return hashCode + (abstractC0580g != null ? abstractC0580g.hashCode() : 0);
    }
}
