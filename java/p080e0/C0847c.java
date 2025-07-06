package p080e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public final class C0847c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3466a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0838V f3467b;

    /* renamed from: c */
    public final /* synthetic */ View f3468c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3469d;

    /* renamed from: e */
    public final /* synthetic */ C0856h f3470e;

    public C0847c(C0856h c0856h, AbstractC0838V abstractC0838V, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3470e = c0856h;
        this.f3467b = abstractC0838V;
        this.f3469d = viewPropertyAnimator;
        this.f3468c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3466a) {
            case 1:
                this.f3468c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3466a) {
            case 0:
                this.f3469d.setListener(null);
                this.f3468c.setAlpha(1.0f);
                C0856h c0856h = this.f3470e;
                AbstractC0838V abstractC0838V = this.f3467b;
                c0856h.m2267c(abstractC0838V);
                c0856h.f3529q.remove(abstractC0838V);
                c0856h.m2354i();
                break;
            default:
                this.f3469d.setListener(null);
                C0856h c0856h2 = this.f3470e;
                AbstractC0838V abstractC0838V2 = this.f3467b;
                c0856h2.m2267c(abstractC0838V2);
                c0856h2.f3527o.remove(abstractC0838V2);
                c0856h2.m2354i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3466a) {
            case 0:
                this.f3470e.getClass();
                break;
            default:
                this.f3470e.getClass();
                break;
        }
    }

    public C0847c(C0856h c0856h, AbstractC0838V abstractC0838V, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3470e = c0856h;
        this.f3467b = abstractC0838V;
        this.f3468c = view;
        this.f3469d = viewPropertyAnimator;
    }
}
