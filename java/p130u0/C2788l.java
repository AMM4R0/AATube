package p130u0;

import java.util.Arrays;
import p010D0.C0109g;
import p124s0.C2733d;
import p133v0.AbstractC2863r;

/* renamed from: u0.l */
/* loaded from: classes.dex */
public final class C2788l {

    /* renamed from: a */
    public final C2777a f9115a;

    /* renamed from: b */
    public final C2733d f9116b;

    public /* synthetic */ C2788l(C2777a c2777a, C2733d c2733d) {
        this.f9115a = c2777a;
        this.f9116b = c2733d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2788l)) {
            C2788l c2788l = (C2788l) obj;
            if (AbstractC2863r.m5476e(this.f9115a, c2788l.f9115a) && AbstractC2863r.m5476e(this.f9116b, c2788l.f9116b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9115a, this.f9116b});
    }

    public final String toString() {
        C0109g c0109g = new C0109g(this);
        c0109g.m352b(this.f9115a, "key");
        c0109g.m352b(this.f9116b, "feature");
        return c0109g.toString();
    }
}
