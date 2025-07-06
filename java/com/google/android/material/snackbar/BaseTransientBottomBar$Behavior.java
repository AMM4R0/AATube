package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p006C.C0055g;
import p081e1.C0879e;
import p086g1.AbstractC0915c;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C0879e f2986h;

    public BaseTransientBottomBar$Behavior() {
        C0879e c0879e = new C0879e();
        this.f2746e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2747f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2745d = 0;
        this.f2986h = c0879e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p138x.AbstractC2879a
    /* renamed from: f */
    public final boolean mo2042f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2986h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0055g.f105c == null) {
                    C0055g.f105c = new C0055g(27);
                }
                synchronized (C0055g.f105c.f107b) {
                }
            }
        } else if (coordinatorLayout.m1579o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0055g.f105c == null) {
                C0055g.f105c = new C0055g(27);
            }
            C0055g.f105c.m222u();
        }
        return super.mo2042f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: r */
    public final boolean mo2056r(View view) {
        this.f2986h.getClass();
        return view instanceof AbstractC0915c;
    }
}
