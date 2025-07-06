package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;
import p031L.AccessibilityManagerTouchExplorationStateChangeListenerC0348b;
import p043P.C0412d;
import p088h1.C0933m;
import p102k.ViewOnKeyListenerC2452E;
import p102k.ViewOnKeyListenerC2460g;

/* renamed from: androidx.fragment.app.J */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0643J implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f2184a;

    /* renamed from: b */
    public final /* synthetic */ Object f2185b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0643J(int r12, Object obj) {
        this.f2184a = r12;
        this.f2185b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f2185b;
        switch (this.f2184a) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                AbstractC0270C.m696c(view2);
                break;
            case 1:
                C0933m c0933m = (C0933m) obj;
                if (c0933m.f3897u != null && (accessibilityManager = c0933m.f3896t) != null) {
                    WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                    if (c0933m.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0348b(c0933m.f3897u));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2184a) {
            case 0:
                break;
            case 1:
                C0933m c0933m = (C0933m) this.f2185b;
                C0412d c0412d = c0933m.f3897u;
                if (c0412d != null && (accessibilityManager = c0933m.f3896t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0348b(c0412d));
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC2460g viewOnKeyListenerC2460g = (ViewOnKeyListenerC2460g) this.f2185b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2460g.f8047x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC2460g.f8047x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2460g.f8047x.removeGlobalOnLayoutListener(viewOnKeyListenerC2460g.f8032i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC2452E viewOnKeyListenerC2452E = (ViewOnKeyListenerC2452E) this.f2185b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2452E.f7990o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2452E.f7990o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2452E.f7990o.removeGlobalOnLayoutListener(viewOnKeyListenerC2452E.f7984i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* renamed from: a */
    private final void m1704a(View view) {
    }

    /* renamed from: b */
    private final void m1705b(View view) {
    }

    /* renamed from: c */
    private final void m1706c(View view) {
    }
}
