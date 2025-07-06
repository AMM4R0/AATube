package p080e0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.AbstractC0617g;

/* renamed from: e0.v */
/* loaded from: classes.dex */
public final class C0870v extends AbstractC0617g {

    /* renamed from: d */
    public final /* synthetic */ int f3630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0870v(AbstractC0824G abstractC0824G, int r2) {
        super(abstractC0824G);
        this.f3630d = r2;
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: b */
    public final int mo1614b(View view) {
        switch (this.f3630d) {
            case 0:
                C0825H c0825h = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return view.getRight() + ((C0825H) view.getLayoutParams()).f3377b.right + ((ViewGroup.MarginLayoutParams) c0825h).rightMargin;
            default:
                C0825H c0825h2 = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return view.getBottom() + ((C0825H) view.getLayoutParams()).f3377b.bottom + ((ViewGroup.MarginLayoutParams) c0825h2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: c */
    public final int mo1615c(View view) {
        switch (this.f3630d) {
            case 0:
                C0825H c0825h = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return AbstractC0824G.m2275A(view) + ((ViewGroup.MarginLayoutParams) c0825h).leftMargin + ((ViewGroup.MarginLayoutParams) c0825h).rightMargin;
            default:
                C0825H c0825h2 = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return AbstractC0824G.m2282z(view) + ((ViewGroup.MarginLayoutParams) c0825h2).topMargin + ((ViewGroup.MarginLayoutParams) c0825h2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: d */
    public final int mo1616d(View view) {
        switch (this.f3630d) {
            case 0:
                C0825H c0825h = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return AbstractC0824G.m2282z(view) + ((ViewGroup.MarginLayoutParams) c0825h).topMargin + ((ViewGroup.MarginLayoutParams) c0825h).bottomMargin;
            default:
                C0825H c0825h2 = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return AbstractC0824G.m2275A(view) + ((ViewGroup.MarginLayoutParams) c0825h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0825h2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: e */
    public final int mo1617e(View view) {
        switch (this.f3630d) {
            case 0:
                C0825H c0825h = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return (view.getLeft() - ((C0825H) view.getLayoutParams()).f3377b.left) - ((ViewGroup.MarginLayoutParams) c0825h).leftMargin;
            default:
                C0825H c0825h2 = (C0825H) view.getLayoutParams();
                ((AbstractC0824G) this.f2067b).getClass();
                return (view.getTop() - ((C0825H) view.getLayoutParams()).f3377b.top) - ((ViewGroup.MarginLayoutParams) c0825h2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: f */
    public final int mo1618f() {
        switch (this.f3630d) {
            case 0:
                return ((AbstractC0824G) this.f2067b).f3374n;
            default:
                return ((AbstractC0824G) this.f2067b).f3375o;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: g */
    public final int mo1619g() {
        switch (this.f3630d) {
            case 0:
                AbstractC0824G abstractC0824G = (AbstractC0824G) this.f2067b;
                return abstractC0824G.f3374n - abstractC0824G.m2287F();
            default:
                AbstractC0824G abstractC0824G2 = (AbstractC0824G) this.f2067b;
                return abstractC0824G2.f3375o - abstractC0824G2.m2285D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: h */
    public final int mo1620h() {
        switch (this.f3630d) {
            case 0:
                return ((AbstractC0824G) this.f2067b).m2287F();
            default:
                return ((AbstractC0824G) this.f2067b).m2285D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: i */
    public final int mo1621i() {
        switch (this.f3630d) {
            case 0:
                return ((AbstractC0824G) this.f2067b).f3372l;
            default:
                return ((AbstractC0824G) this.f2067b).f3373m;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: j */
    public final int mo1622j() {
        switch (this.f3630d) {
            case 0:
                return ((AbstractC0824G) this.f2067b).f3373m;
            default:
                return ((AbstractC0824G) this.f2067b).f3372l;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: k */
    public final int mo1623k() {
        switch (this.f3630d) {
            case 0:
                return ((AbstractC0824G) this.f2067b).m2286E();
            default:
                return ((AbstractC0824G) this.f2067b).m2288G();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: l */
    public final int mo1624l() {
        switch (this.f3630d) {
            case 0:
                AbstractC0824G abstractC0824G = (AbstractC0824G) this.f2067b;
                return (abstractC0824G.f3374n - abstractC0824G.m2286E()) - abstractC0824G.m2287F();
            default:
                AbstractC0824G abstractC0824G2 = (AbstractC0824G) this.f2067b;
                return (abstractC0824G2.f3375o - abstractC0824G2.m2288G()) - abstractC0824G2.m2285D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: n */
    public final int mo1626n(View view) {
        switch (this.f3630d) {
            case 0:
                AbstractC0824G abstractC0824G = (AbstractC0824G) this.f2067b;
                Rect rect = (Rect) this.f2068c;
                abstractC0824G.m2289K(view, rect);
                return rect.right;
            default:
                AbstractC0824G abstractC0824G2 = (AbstractC0824G) this.f2067b;
                Rect rect2 = (Rect) this.f2068c;
                abstractC0824G2.m2289K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: o */
    public final int mo1627o(View view) {
        switch (this.f3630d) {
            case 0:
                AbstractC0824G abstractC0824G = (AbstractC0824G) this.f2067b;
                Rect rect = (Rect) this.f2068c;
                abstractC0824G.m2289K(view, rect);
                return rect.left;
            default:
                AbstractC0824G abstractC0824G2 = (AbstractC0824G) this.f2067b;
                Rect rect2 = (Rect) this.f2068c;
                abstractC0824G2.m2289K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0617g
    /* renamed from: p */
    public final void mo1628p(int r2) {
        switch (this.f3630d) {
            case 0:
                ((AbstractC0824G) this.f2067b).mo1960O(r2);
                break;
            default:
                ((AbstractC0824G) this.f2067b).mo1962P(r2);
                break;
        }
    }
}
