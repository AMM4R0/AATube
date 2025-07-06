package p080e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: e0.j */
/* loaded from: classes.dex */
public final class C0858j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3532a = false;

    /* renamed from: b */
    public final /* synthetic */ C0859k f3533b;

    public C0858j(C0859k c0859k) {
        this.f3533b = c0859k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3532a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3532a) {
            this.f3532a = false;
            return;
        }
        C0859k c0859k = this.f3533b;
        if (((Float) c0859k.f3563z.getAnimatedValue()).floatValue() == 0.0f) {
            c0859k.f3536A = 0;
            c0859k.m2361f(0);
        } else {
            c0859k.f3536A = 2;
            c0859k.f3556s.invalidate();
        }
    }
}
