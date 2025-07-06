package p028K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: K.D */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0271D implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0340x0 f834a = null;

    /* renamed from: b */
    public final /* synthetic */ View f835b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0325q f836c;

    public ViewOnApplyWindowInsetsListenerC0271D(View view, InterfaceC0325q interfaceC0325q) {
        this.f835b = view;
        this.f836c = interfaceC0325q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0340x0 m975g = C0340x0.m975g(view, windowInsets);
        int r12 = Build.VERSION.SDK_INT;
        InterfaceC0325q interfaceC0325q = this.f836c;
        if (r12 < 30) {
            AbstractC0272E.m697a(windowInsets, this.f835b);
            if (m975g.equals(this.f834a)) {
                return interfaceC0325q.mo353c(view, m975g).m980f();
            }
        }
        this.f834a = m975g;
        C0340x0 mo353c = interfaceC0325q.mo353c(view, m975g);
        if (r12 >= 30) {
            return mo353c.m980f();
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(view);
        return mo353c.m980f();
    }
}
