package p090i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p001A0.AbstractC0005b;

/* renamed from: i0.E */
/* loaded from: classes.dex */
public final class C0952E extends AnimatorListenerAdapter implements InterfaceC0965k {

    /* renamed from: a */
    public final View f3974a;

    /* renamed from: b */
    public final int f3975b;

    /* renamed from: c */
    public final ViewGroup f3976c;

    /* renamed from: e */
    public boolean f3978e;

    /* renamed from: f */
    public boolean f3979f = false;

    /* renamed from: d */
    public final boolean f3977d = true;

    public C0952E(View view, int r3) {
        this.f3974a = view;
        this.f3975b = r3;
        this.f3976c = (ViewGroup) view.getParent();
        m2538h(true);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: b */
    public final void mo2532b(AbstractC0967m abstractC0967m) {
        throw null;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: c */
    public final void mo2533c(AbstractC0967m abstractC0967m) {
        abstractC0967m.mo2555x(this);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: d */
    public final void mo2534d() {
        m2538h(false);
        if (this.f3979f) {
            return;
        }
        AbstractC0977w.m2587b(this.f3974a, this.f3975b);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: e */
    public final void mo2535e(AbstractC0967m abstractC0967m) {
        abstractC0967m.mo2555x(this);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: f */
    public final void mo2536f() {
        m2538h(true);
        if (this.f3979f) {
            return;
        }
        AbstractC0977w.m2587b(this.f3974a, 0);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: g */
    public final void mo2537g(AbstractC0967m abstractC0967m) {
    }

    /* renamed from: h */
    public final void m2538h(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f3977d || this.f3978e == z2 || (viewGroup = this.f3976c) == null) {
            return;
        }
        this.f3978e = z2;
        AbstractC0005b.m52Q(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3979f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3979f) {
            AbstractC0977w.m2587b(this.f3974a, this.f3975b);
            ViewGroup viewGroup = this.f3976c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2538h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            AbstractC0977w.m2587b(this.f3974a, 0);
            ViewGroup viewGroup = this.f3976c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f3979f) {
            AbstractC0977w.m2587b(this.f3974a, this.f3975b);
            ViewGroup viewGroup = this.f3976c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2538h(false);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: a */
    public final void mo2531a(AbstractC0967m abstractC0967m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
