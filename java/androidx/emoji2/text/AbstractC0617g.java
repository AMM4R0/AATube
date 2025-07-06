package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import p080e0.AbstractC0824G;
import p080e0.C0870v;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public abstract class AbstractC0617g {

    /* renamed from: a */
    public int f2066a;

    /* renamed from: b */
    public final Object f2067b;

    /* renamed from: c */
    public final Object f2068c;

    public AbstractC0617g(AbstractC0824G abstractC0824G) {
        this.f2066a = Integer.MIN_VALUE;
        this.f2068c = new Rect();
        this.f2067b = abstractC0824G;
    }

    /* renamed from: a */
    public static AbstractC0617g m1613a(AbstractC0824G abstractC0824G, int r2) {
        if (r2 == 0) {
            return new C0870v(abstractC0824G, 0);
        }
        if (r2 == 1) {
            return new C0870v(abstractC0824G, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo1614b(View view);

    /* renamed from: c */
    public abstract int mo1615c(View view);

    /* renamed from: d */
    public abstract int mo1616d(View view);

    /* renamed from: e */
    public abstract int mo1617e(View view);

    /* renamed from: f */
    public abstract int mo1618f();

    /* renamed from: g */
    public abstract int mo1619g();

    /* renamed from: h */
    public abstract int mo1620h();

    /* renamed from: i */
    public abstract int mo1621i();

    /* renamed from: j */
    public abstract int mo1622j();

    /* renamed from: k */
    public abstract int mo1623k();

    /* renamed from: l */
    public abstract int mo1624l();

    /* renamed from: m */
    public int m1625m() {
        if (Integer.MIN_VALUE == this.f2066a) {
            return 0;
        }
        return mo1624l() - this.f2066a;
    }

    /* renamed from: n */
    public abstract int mo1626n(View view);

    /* renamed from: o */
    public abstract int mo1627o(View view);

    /* renamed from: p */
    public abstract void mo1628p(int r12);

    public AbstractC0617g(InterfaceC0619i interfaceC0619i) {
        this.f2066a = 0;
        this.f2068c = new C0614d();
        this.f2067b = interfaceC0619i;
    }
}
