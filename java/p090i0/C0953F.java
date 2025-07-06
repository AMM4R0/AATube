package p090i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.carwizard.p075li.youtube.R;

/* renamed from: i0.F */
/* loaded from: classes.dex */
public final class C0953F extends AnimatorListenerAdapter implements InterfaceC0965k {

    /* renamed from: a */
    public final ViewGroup f3980a;

    /* renamed from: b */
    public final View f3981b;

    /* renamed from: c */
    public final View f3982c;

    /* renamed from: d */
    public boolean f3983d = true;

    /* renamed from: e */
    public final /* synthetic */ C0962h f3984e;

    public C0953F(C0962h c0962h, ViewGroup viewGroup, View view, View view2) {
        this.f3984e = c0962h;
        this.f3980a = viewGroup;
        this.f3981b = view;
        this.f3982c = view2;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: a */
    public final void mo2531a(AbstractC0967m abstractC0967m) {
        if (this.f3983d) {
            m2539h();
        }
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
    /* renamed from: e */
    public final void mo2535e(AbstractC0967m abstractC0967m) {
        abstractC0967m.mo2555x(this);
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: g */
    public final void mo2537g(AbstractC0967m abstractC0967m) {
    }

    /* renamed from: h */
    public final void m2539h() {
        this.f3982c.setTag(R.id.save_overlay_view, null);
        this.f3980a.getOverlay().remove(this.f3981b);
        this.f3983d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2539h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3980a.getOverlay().remove(this.f3981b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3981b;
        if (view.getParent() == null) {
            this.f3980a.getOverlay().add(view);
        } else {
            this.f3984e.mo2548c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3982c;
            View view2 = this.f3981b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3980a.getOverlay().add(view2);
            this.f3983d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m2539h();
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: d */
    public final void mo2534d() {
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: f */
    public final void mo2536f() {
    }
}
