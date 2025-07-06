package p104l;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: l.I0 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2518I0 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C2520J0 f8225a;

    public ViewOnTouchListenerC2518I0(C2520J0 c2520j0) {
        this.f8225a = c2520j0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2500A c2500a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C2520J0 c2520j0 = this.f8225a;
        if (action == 0 && (c2500a = c2520j0.f8254z) != null && c2500a.isShowing() && x2 >= 0 && x2 < c2520j0.f8254z.getWidth() && y2 >= 0 && y2 < c2520j0.f8254z.getHeight()) {
            c2520j0.f8250v.postDelayed(c2520j0.f8246r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c2520j0.f8250v.removeCallbacks(c2520j0.f8246r);
        return false;
    }
}
