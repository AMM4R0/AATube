package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.D */
/* loaded from: classes.dex */
public final class C0637D implements InterfaceC0636C {

    /* renamed from: a */
    public final int f2117a;

    /* renamed from: b */
    public final /* synthetic */ C0638E f2118b;

    public C0637D(C0638E c0638e, int r2) {
        this.f2118b = c0638e;
        this.f2117a = r2;
    }

    @Override // androidx.fragment.app.InterfaceC0636C
    /* renamed from: a */
    public final boolean mo1652a(ArrayList arrayList, ArrayList arrayList2) {
        C0638E c0638e = this.f2118b;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0638e.f2142q;
        int r2 = this.f2117a;
        if (abstractComponentCallbacksC0666p == null || r2 >= 0 || !abstractComponentCallbacksC0666p.m1764g().m1662I()) {
            return c0638e.m1663J(arrayList, arrayList2, r2, 1);
        }
        return false;
    }
}
