package p080e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.e */
/* loaded from: classes.dex */
public final class C0851e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3493a;

    /* renamed from: b */
    public final /* synthetic */ C0853f f3494b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3495c;

    /* renamed from: d */
    public final /* synthetic */ View f3496d;

    /* renamed from: e */
    public final /* synthetic */ C0856h f3497e;

    public /* synthetic */ C0851e(C0856h c0856h, C0853f c0853f, ViewPropertyAnimator viewPropertyAnimator, View view, int r5) {
        this.f3493a = r5;
        this.f3497e = c0856h;
        this.f3494b = c0853f;
        this.f3495c = viewPropertyAnimator;
        this.f3496d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3493a) {
            case 0:
                this.f3495c.setListener(null);
                View view = this.f3496d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0853f c0853f = this.f3494b;
                AbstractC0838V abstractC0838V = c0853f.f3503a;
                C0856h c0856h = this.f3497e;
                c0856h.m2267c(abstractC0838V);
                c0856h.f3530r.remove(c0853f.f3503a);
                c0856h.m2354i();
                break;
            default:
                this.f3495c.setListener(null);
                View view2 = this.f3496d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0853f c0853f2 = this.f3494b;
                AbstractC0838V abstractC0838V2 = c0853f2.f3504b;
                C0856h c0856h2 = this.f3497e;
                c0856h2.m2267c(abstractC0838V2);
                c0856h2.f3530r.remove(c0853f2.f3504b);
                c0856h2.m2354i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3493a) {
            case 0:
                AbstractC0838V abstractC0838V = this.f3494b.f3503a;
                this.f3497e.getClass();
                break;
            default:
                AbstractC0838V abstractC0838V2 = this.f3494b.f3504b;
                this.f3497e.getClass();
                break;
        }
    }
}
