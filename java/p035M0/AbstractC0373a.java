package p035M0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p138x.AbstractC2879a;

/* renamed from: M0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0373a extends AbstractC2879a {

    /* renamed from: a */
    public C0374b f1014a;

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r4) {
        mo1048r(coordinatorLayout, view, r4);
        if (this.f1014a == null) {
            this.f1014a = new C0374b(view);
        }
        C0374b c0374b = this.f1014a;
        View view2 = c0374b.f1016b;
        c0374b.f1015a = view2.getTop();
        c0374b.f1017c = view2.getLeft();
        C0374b c0374b2 = this.f1014a;
        View view3 = c0374b2.f1016b;
        int top = 0 - (view3.getTop() - c0374b2.f1015a);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0374b2.f1017c));
        return true;
    }

    /* renamed from: r */
    public void mo1048r(CoordinatorLayout coordinatorLayout, View view, int r3) {
        coordinatorLayout.m1581q(view, r3);
    }
}
