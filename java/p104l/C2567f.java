package p104l;

import android.content.Context;
import android.view.View;
import com.carwizard.p075li.youtube.R;
import p102k.AbstractC2474u;
import p102k.C2477x;
import p102k.MenuC2466m;
import p102k.SubMenuC2453F;

/* renamed from: l.f */
/* loaded from: classes.dex */
public final class C2567f extends C2477x {

    /* renamed from: l */
    public final /* synthetic */ int f8346l = 0;

    /* renamed from: m */
    public final /* synthetic */ C2582k f8347m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567f(C2582k c2582k, Context context, MenuC2466m menuC2466m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC2466m, true);
        this.f8347m = c2582k;
        this.f8138f = 8388613;
        C2579j c2579j = c2582k.f8405w;
        this.f8140h = c2579j;
        AbstractC2474u abstractC2474u = this.f8141i;
        if (abstractC2474u != null) {
            abstractC2474u.mo4805k(c2579j);
        }
    }

    @Override // p102k.C2477x
    /* renamed from: c */
    public final void mo4860c() {
        switch (this.f8346l) {
            case 0:
                C2582k c2582k = this.f8347m;
                c2582k.f8402t = null;
                c2582k.getClass();
                super.mo4860c();
                break;
            default:
                C2582k c2582k2 = this.f8347m;
                MenuC2466m menuC2466m = c2582k2.f8385c;
                if (menuC2466m != null) {
                    menuC2466m.m4836c(true);
                }
                c2582k2.f8401s = null;
                super.mo4860c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567f(C2582k c2582k, Context context, SubMenuC2453F subMenuC2453F, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC2453F, false);
        this.f8347m = c2582k;
        if (!subMenuC2453F.f7996A.m4852f()) {
            View view2 = c2582k.f8391i;
            this.f8137e = view2 == null ? (View) c2582k.f8390h : view2;
        }
        C2579j c2579j = c2582k.f8405w;
        this.f8140h = c2579j;
        AbstractC2474u abstractC2474u = this.f8141i;
        if (abstractC2474u != null) {
            abstractC2474u.mo4805k(c2579j);
        }
    }
}
