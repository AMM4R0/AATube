package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p035M0.AbstractC0373a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC0373a {

    /* renamed from: b */
    public boolean f2722b;

    /* renamed from: d */
    public int f2724d;

    /* renamed from: f */
    public VelocityTracker f2726f;

    /* renamed from: c */
    public int f2723c = -1;

    /* renamed from: e */
    public int f2725e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: f */
    public final boolean mo2042f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2725e < 0) {
            this.f2725e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2722b) {
            int r4 = this.f2723c;
            if (r4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(r4)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y2 - this.f2724d) > this.f2725e) {
                this.f2724d = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f2726f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2723c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p035M0.AbstractC0373a, p138x.AbstractC2879a
    /* renamed from: g */
    public final boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r3) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: h */
    public final boolean mo2043h(CoordinatorLayout coordinatorLayout, View view, int r3, int r4, int r5) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: j */
    public final /* synthetic */ void mo2044j(CoordinatorLayout coordinatorLayout, View view, View view2, int r4, int r5, int[] r6, int r7) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: k */
    public final void mo2045k(CoordinatorLayout coordinatorLayout, View view, int r3, int r4, int r5, int[] r6) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: m */
    public final void mo2046m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: n */
    public final Parcelable mo2047n(View view) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: o */
    public final boolean mo2048o(View view, int r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: p */
    public final void mo2049p(View view, View view2, int r3) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // p138x.AbstractC2879a
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2050q(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L45
            r4 = 2
            if (r0 == r4) goto L2c
            r6 = 3
            if (r0 == r6) goto L49
            r6 = 6
            if (r0 == r6) goto L13
            goto L57
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            int r6 = r7.getPointerId(r2)
            r5.f2723c = r6
            float r6 = r7.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f2724d = r6
            goto L57
        L2c:
            int r0 = r5.f2723c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L35
            return r3
        L35:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f2724d = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L45:
            android.view.VelocityTracker r0 = r5.f2726f
            if (r0 != 0) goto L61
        L49:
            r5.f2722b = r3
            r5.f2723c = r1
            android.view.VelocityTracker r6 = r5.f2726f
            if (r6 == 0) goto L57
            r6.recycle()
            r6 = 0
            r5.f2726f = r6
        L57:
            android.view.VelocityTracker r6 = r5.f2726f
            if (r6 == 0) goto L5e
            r6.addMovement(r7)
        L5e:
            boolean r6 = r5.f2722b
            return r6
        L61:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f2726f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f2726f
            int r0 = r5.f2723c
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.mo2050q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
