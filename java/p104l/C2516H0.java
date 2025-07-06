package p104l;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: l.H0 */
/* loaded from: classes.dex */
public final class C2516H0 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C2520J0 f8224a;

    public C2516H0(C2520J0 c2520j0) {
        this.f8224a = c2520j0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int r3) {
        if (r3 == 1) {
            C2520J0 c2520j0 = this.f8224a;
            if (c2520j0.f8254z.getInputMethodMode() == 2 || c2520j0.f8254z.getContentView() == null) {
                return;
            }
            Handler handler = c2520j0.f8250v;
            RunnableC2514G0 runnableC2514G0 = c2520j0.f8246r;
            handler.removeCallbacks(runnableC2514G0);
            runnableC2514G0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int r2, int r3, int r4) {
    }
}
