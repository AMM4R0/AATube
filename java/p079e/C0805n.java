package p079e;

import android.support.v4.media.session.AbstractC0580g;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p010D0.C0113k;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;

/* renamed from: e.n */
/* loaded from: classes.dex */
public final class C0805n extends AbstractC0580g {

    /* renamed from: e */
    public final /* synthetic */ int f3262e;

    /* renamed from: f */
    public final /* synthetic */ Object f3263f;

    public /* synthetic */ C0805n(int r12, Object obj) {
        this.f3262e = r12;
        this.f3263f = obj;
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: a */
    public final void mo800a() {
        Object obj = this.f3263f;
        switch (this.f3262e) {
            case 0:
                RunnableC0803l runnableC0803l = (RunnableC0803l) obj;
                runnableC0803l.f3259b.f3339v.setAlpha(1.0f);
                LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = runnableC0803l.f3259b;
                layoutInflaterFactory2C0815x.f3342y.m798d(null);
                layoutInflaterFactory2C0815x.f3342y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x2 = (LayoutInflaterFactory2C0815x) obj;
                layoutInflaterFactory2C0815x2.f3339v.setAlpha(1.0f);
                layoutInflaterFactory2C0815x2.f3342y.m798d(null);
                layoutInflaterFactory2C0815x2.f3342y = null;
                break;
            default:
                C0113k c0113k = (C0113k) obj;
                ((LayoutInflaterFactory2C0815x) c0113k.f348c).f3339v.setVisibility(8);
                LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x3 = (LayoutInflaterFactory2C0815x) c0113k.f348c;
                PopupWindow popupWindow = layoutInflaterFactory2C0815x3.f3340w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0815x3.f3339v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0815x3.f3339v.getParent();
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    AbstractC0270C.m696c(view);
                }
                layoutInflaterFactory2C0815x3.f3339v.m1499e();
                layoutInflaterFactory2C0815x3.f3342y.m798d(null);
                layoutInflaterFactory2C0815x3.f3342y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0815x3.f3294A;
                WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                AbstractC0270C.m696c(viewGroup);
                break;
        }
    }

    @Override // android.support.v4.media.session.AbstractC0580g, p028K.InterfaceC0292Z
    /* renamed from: c */
    public void mo802c() {
        Object obj = this.f3263f;
        switch (this.f3262e) {
            case 0:
                ((RunnableC0803l) obj).f3259b.f3339v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) obj;
                layoutInflaterFactory2C0815x.f3339v.setVisibility(0);
                if (layoutInflaterFactory2C0815x.f3339v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0815x.f3339v.getParent();
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    AbstractC0270C.m696c(view);
                    break;
                }
                break;
        }
    }
}
