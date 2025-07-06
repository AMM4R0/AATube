package androidx.activity;

import androidx.fragment.app.C0674x;
import kotlin.jvm.internal.AbstractC2492i;
import p108m1.C2657g;

/* renamed from: androidx.activity.r */
/* loaded from: classes.dex */
public final class C0599r implements InterfaceC0584c {

    /* renamed from: a */
    public final C0674x f1701a;

    /* renamed from: b */
    public final /* synthetic */ C0604t f1702b;

    public C0599r(C0604t c0604t, C0674x onBackPressedCallback) {
        AbstractC2492i.m4915e(onBackPressedCallback, "onBackPressedCallback");
        this.f1702b = c0604t;
        this.f1701a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, u1.a] */
    @Override // androidx.activity.InterfaceC0584c
    public final void cancel() {
        C0604t c0604t = this.f1702b;
        C2657g c2657g = c0604t.f1709b;
        C0674x c0674x = this.f1701a;
        c2657g.remove(c0674x);
        if (AbstractC2492i.m4911a(c0604t.f1710c, c0674x)) {
            c0674x.getClass();
            c0604t.f1710c = null;
        }
        c0674x.f2358b.remove(this);
        ?? r02 = c0674x.f2359c;
        if (r02 != 0) {
            r02.invoke();
        }
        c0674x.f2359c = null;
    }
}
