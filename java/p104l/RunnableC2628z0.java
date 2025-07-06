package p104l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.z0 */
/* loaded from: classes.dex */
public final class RunnableC2628z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8548a;

    /* renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC2501A0 f8549b;

    public /* synthetic */ RunnableC2628z0(AbstractViewOnTouchListenerC2501A0 abstractViewOnTouchListenerC2501A0, int r2) {
        this.f8548a = r2;
        this.f8549b = abstractViewOnTouchListenerC2501A0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8548a) {
            case 0:
                ViewParent parent = this.f8549b.f8179d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC2501A0 abstractViewOnTouchListenerC2501A0 = this.f8549b;
                abstractViewOnTouchListenerC2501A0.m4921a();
                View view = abstractViewOnTouchListenerC2501A0.f8179d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2501A0.mo4824c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC2501A0.f8182g = true;
                    break;
                }
                break;
        }
    }
}
