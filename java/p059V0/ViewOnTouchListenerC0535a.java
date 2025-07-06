package p059V0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: V0.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0535a implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f1456a;

    /* renamed from: b */
    public final int f1457b;

    /* renamed from: c */
    public final int f1458c;

    /* renamed from: d */
    public final int f1459d;

    public ViewOnTouchListenerC0535a(Dialog dialog, Rect rect) {
        this.f1456a = dialog;
        this.f1457b = rect.left;
        this.f1458c = rect.top;
        this.f1459d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f1457b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f1458c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int r7 = this.f1459d;
            obtain.setLocation((-r7) - 1, (-r7) - 1);
        }
        view.performClick();
        return this.f1456a.onTouchEvent(obtain);
    }
}
