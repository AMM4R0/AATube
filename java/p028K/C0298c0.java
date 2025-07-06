package p028K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p090i0.AbstractC0967m;
import p112o.C2682b;

/* renamed from: K.c0 */
/* loaded from: classes.dex */
public final class C0298c0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f863a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f864b;

    /* renamed from: c */
    public final /* synthetic */ Object f865c;

    public C0298c0(C0312j0 c0312j0, View view) {
        this.f864b = c0312j0;
        this.f865c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f863a) {
            case 0:
                ((C0312j0) this.f864b).f896a.mo870d(1.0f);
                C0302e0.m830e((View) this.f865c);
                break;
            default:
                ((C2682b) this.f864b).remove(animator);
                ((AbstractC0967m) this.f865c).f4044n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f863a) {
            case 1:
                ((AbstractC0967m) this.f865c).f4044n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0298c0(AbstractC0967m abstractC0967m, C2682b c2682b) {
        this.f865c = abstractC0967m;
        this.f864b = c2682b;
    }
}
