package p104l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p102k.ViewTreeObserverOnGlobalLayoutListenerC2457d;

/* renamed from: l.N */
/* loaded from: classes.dex */
public final class C2527N implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2457d f8261a;

    /* renamed from: b */
    public final /* synthetic */ C2529O f8262b;

    public C2527N(C2529O c2529o, ViewTreeObserverOnGlobalLayoutListenerC2457d viewTreeObserverOnGlobalLayoutListenerC2457d) {
        this.f8262b = c2529o;
        this.f8261a = viewTreeObserverOnGlobalLayoutListenerC2457d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f8262b.f8267H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8261a);
        }
    }
}
