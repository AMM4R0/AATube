package p088h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: h1.c */
/* loaded from: classes.dex */
public final class C0923c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3844a;

    /* renamed from: b */
    public final /* synthetic */ C0924d f3845b;

    public /* synthetic */ C0923c(C0924d c0924d, int r2) {
        this.f3844a = r2;
        this.f3845b = c0924d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f3844a) {
            case 1:
                this.f3845b.f3900b.m2498h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3844a) {
            case 0:
                this.f3845b.f3900b.m2498h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
