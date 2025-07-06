package p104l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c */
/* loaded from: classes.dex */
public final class RunnableC2558c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8329a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f8330b;

    public /* synthetic */ RunnableC2558c(ActionBarOverlayLayout actionBarOverlayLayout, int r2) {
        this.f8329a = r2;
        this.f8330b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8329a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8330b;
                actionBarOverlayLayout.m1503h();
                actionBarOverlayLayout.f1800w = actionBarOverlayLayout.f1781d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1801x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8330b;
                actionBarOverlayLayout2.m1503h();
                actionBarOverlayLayout2.f1800w = actionBarOverlayLayout2.f1781d.animate().translationY(-actionBarOverlayLayout2.f1781d.getHeight()).setListener(actionBarOverlayLayout2.f1801x);
                break;
        }
    }
}
