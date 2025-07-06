package p079e;

import android.support.v4.media.session.AbstractC0580g;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p010D0.C0113k;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;

/* renamed from: e.G */
/* loaded from: classes.dex */
public final class C0789G extends AbstractC0580g {

    /* renamed from: e */
    public final /* synthetic */ int f3168e;

    /* renamed from: f */
    public final /* synthetic */ C0791I f3169f;

    public /* synthetic */ C0789G(C0791I r12, int r2) {
        this.f3168e = r2;
        this.f3169f = r12;
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: a */
    public final void mo800a() {
        View view;
        C0791I r12 = this.f3169f;
        switch (this.f3168e) {
            case 0:
                if (r12.f3194t && (view = r12.f3186l) != null) {
                    view.setTranslationY(0.0f);
                    r12.f3183i.setTranslationY(0.0f);
                }
                r12.f3183i.setVisibility(8);
                r12.f3183i.setTransitioning(false);
                r12.f3198x = null;
                C0113k c0113k = r12.f3190p;
                if (c0113k != null) {
                    c0113k.m382f(r12.f3189o);
                    r12.f3189o = null;
                    r12.f3190p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = r12.f3182h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    AbstractC0270C.m696c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                r12.f3198x = null;
                r12.f3183i.requestLayout();
                break;
        }
    }
}
