package p080e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C0849d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0838V f3481a;

    /* renamed from: b */
    public final /* synthetic */ int f3482b;

    /* renamed from: c */
    public final /* synthetic */ View f3483c;

    /* renamed from: d */
    public final /* synthetic */ int f3484d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3485e;

    /* renamed from: f */
    public final /* synthetic */ C0856h f3486f;

    public C0849d(C0856h c0856h, AbstractC0838V abstractC0838V, int r3, View view, int r5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3486f = c0856h;
        this.f3481a = abstractC0838V;
        this.f3482b = r3;
        this.f3483c = view;
        this.f3484d = r5;
        this.f3485e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int r3 = this.f3482b;
        View view = this.f3483c;
        if (r3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3484d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3485e.setListener(null);
        C0856h c0856h = this.f3486f;
        AbstractC0838V abstractC0838V = this.f3481a;
        c0856h.m2267c(abstractC0838V);
        c0856h.f3528p.remove(abstractC0838V);
        c0856h.m2354i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3486f.getClass();
    }
}
