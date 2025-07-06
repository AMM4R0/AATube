package p104l;

import java.util.WeakHashMap;
import p028K.AbstractC0283P;

/* renamed from: l.G0 */
/* loaded from: classes.dex */
public final class RunnableC2514G0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8220a;

    /* renamed from: b */
    public final /* synthetic */ C2520J0 f8221b;

    public /* synthetic */ RunnableC2514G0(C2520J0 c2520j0, int r2) {
        this.f8220a = r2;
        this.f8221b = c2520j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2520J0 c2520j0 = this.f8221b;
        switch (this.f8220a) {
            case 0:
                C2622x0 c2622x0 = c2520j0.f8231c;
                if (c2622x0 != null) {
                    c2622x0.setListSelectionHidden(true);
                    c2622x0.requestLayout();
                    break;
                }
                break;
            default:
                C2622x0 c2622x02 = c2520j0.f8231c;
                if (c2622x02 != null) {
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    if (c2622x02.isAttachedToWindow() && c2520j0.f8231c.getCount() > c2520j0.f8231c.getChildCount() && c2520j0.f8231c.getChildCount() <= c2520j0.f8241m) {
                        c2520j0.f8254z.setInputMethodMode(2);
                        c2520j0.mo4799f();
                        break;
                    }
                }
                break;
        }
    }
}
