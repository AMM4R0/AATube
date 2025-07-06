package p035M0;

import android.view.View;
import p028K.C0340x0;
import p028K.InterfaceC0325q;

/* renamed from: M0.b */
/* loaded from: classes.dex */
public final class C0374b implements InterfaceC0325q {

    /* renamed from: a */
    public int f1015a;

    /* renamed from: b */
    public final View f1016b;

    /* renamed from: c */
    public int f1017c;

    public C0374b(View view) {
        this.f1016b = view;
    }

    @Override // p028K.InterfaceC0325q
    /* renamed from: c */
    public C0340x0 mo353c(View view, C0340x0 c0340x0) {
        int r5 = c0340x0.f944a.mo950f(7).f99b;
        View view2 = this.f1016b;
        int r12 = this.f1015a;
        if (r12 >= 0) {
            view2.getLayoutParams().height = r12 + r5;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1017c + r5, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0340x0;
    }

    public C0374b(View view, int r2, int r3) {
        this.f1015a = r2;
        this.f1016b = view;
        this.f1017c = r3;
    }
}
