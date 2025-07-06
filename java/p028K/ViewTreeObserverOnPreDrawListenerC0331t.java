package p028K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.t */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0331t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f928a;

    /* renamed from: b */
    public ViewTreeObserver f929b;

    /* renamed from: c */
    public final Runnable f930c;

    public ViewTreeObserverOnPreDrawListenerC0331t(View view, Runnable runnable) {
        this.f928a = view;
        this.f929b = view.getViewTreeObserver();
        this.f930c = runnable;
    }

    /* renamed from: a */
    public static void m966a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0331t viewTreeObserverOnPreDrawListenerC0331t = new ViewTreeObserverOnPreDrawListenerC0331t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0331t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0331t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f929b.isAlive();
        View view = this.f928a;
        if (isAlive) {
            this.f929b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f930c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f929b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f929b.isAlive();
        View view2 = this.f928a;
        if (isAlive) {
            this.f929b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
