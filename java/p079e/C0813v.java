package p079e;

import android.support.v4.media.session.AbstractC0580g;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p099j.C2419d;

/* renamed from: e.v */
/* loaded from: classes.dex */
public final class C0813v extends ContentFrameLayout {

    /* renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0815x f3273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0813v(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x, C2419d c2419d) {
        super(c2419d, null);
        this.f3273i = layoutInflaterFactory2C0815x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3273i.m2260u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = this.f3273i;
                layoutInflaterFactory2C0815x.m2259s(layoutInflaterFactory2C0815x.m2245A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
        setBackgroundDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }
}
