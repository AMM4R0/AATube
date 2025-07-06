package p080e0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e0.E */
/* loaded from: classes.dex */
public final class C0822E {

    /* renamed from: a */
    public final /* synthetic */ int f3355a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0824G f3356b;

    public /* synthetic */ C0822E(AbstractC0824G abstractC0824G, int r2) {
        this.f3355a = r2;
        this.f3356b = abstractC0824G;
    }

    /* renamed from: a */
    public final int m2271a(View view) {
        switch (this.f3355a) {
            case 0:
                C0825H c0825h = (C0825H) view.getLayoutParams();
                this.f3356b.getClass();
                return view.getRight() + ((C0825H) view.getLayoutParams()).f3377b.right + ((ViewGroup.MarginLayoutParams) c0825h).rightMargin;
            default:
                C0825H c0825h2 = (C0825H) view.getLayoutParams();
                this.f3356b.getClass();
                return view.getBottom() + ((C0825H) view.getLayoutParams()).f3377b.bottom + ((ViewGroup.MarginLayoutParams) c0825h2).bottomMargin;
        }
    }

    /* renamed from: b */
    public final int m2272b(View view) {
        switch (this.f3355a) {
            case 0:
                C0825H c0825h = (C0825H) view.getLayoutParams();
                this.f3356b.getClass();
                return (view.getLeft() - ((C0825H) view.getLayoutParams()).f3377b.left) - ((ViewGroup.MarginLayoutParams) c0825h).leftMargin;
            default:
                C0825H c0825h2 = (C0825H) view.getLayoutParams();
                this.f3356b.getClass();
                return (view.getTop() - ((C0825H) view.getLayoutParams()).f3377b.top) - ((ViewGroup.MarginLayoutParams) c0825h2).topMargin;
        }
    }

    /* renamed from: c */
    public final int m2273c() {
        switch (this.f3355a) {
            case 0:
                AbstractC0824G abstractC0824G = this.f3356b;
                return abstractC0824G.f3374n - abstractC0824G.m2287F();
            default:
                AbstractC0824G abstractC0824G2 = this.f3356b;
                return abstractC0824G2.f3375o - abstractC0824G2.m2285D();
        }
    }

    /* renamed from: d */
    public final int m2274d() {
        switch (this.f3355a) {
            case 0:
                return this.f3356b.m2286E();
            default:
                return this.f3356b.m2288G();
        }
    }
}
