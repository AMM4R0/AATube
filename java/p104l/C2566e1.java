package p104l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: l.e1 */
/* loaded from: classes.dex */
public final class C2566e1 extends TouchDelegate {

    /* renamed from: a */
    public final View f8340a;

    /* renamed from: b */
    public final Rect f8341b;

    /* renamed from: c */
    public final Rect f8342c;

    /* renamed from: d */
    public final Rect f8343d;

    /* renamed from: e */
    public final int f8344e;

    /* renamed from: f */
    public boolean f8345f;

    public C2566e1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f8344e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f8341b = rect3;
        Rect rect4 = new Rect();
        this.f8343d = rect4;
        Rect rect5 = new Rect();
        this.f8342c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int r5 = -scaledTouchSlop;
        rect4.inset(r5, r5);
        rect5.set(rect2);
        this.f8340a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f8345f;
                if (z3 && !this.f8343d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f8345f;
                    this.f8345f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else {
            if (this.f8341b.contains(x2, y2)) {
                this.f8345f = true;
                z2 = true;
            }
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f8342c;
        View view = this.f8340a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
