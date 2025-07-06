package p090i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.carwizard.p075li.youtube.R;

/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class C0961g extends AnimatorListenerAdapter implements InterfaceC0965k {

    /* renamed from: a */
    public final View f4012a;

    /* renamed from: b */
    public boolean f4013b = false;

    public C0961g(View view) {
        this.f4012a = view;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: b */
    public final void mo2532b(AbstractC0967m abstractC0967m) {
        throw null;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: c */
    public final void mo2533c(AbstractC0967m abstractC0967m) {
        throw null;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: d */
    public final void mo2534d() {
        View view = this.f4012a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0977w.f4066a.mo1092r(view) : 0.0f));
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: e */
    public final void mo2535e(AbstractC0967m abstractC0967m) {
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: f */
    public final void mo2536f() {
        this.f4012a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0977w.f4066a.mo1089A(this.f4012a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4012a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4013b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f4013b;
        View view = this.f4012a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0950C c0950c = AbstractC0977w.f4066a;
        c0950c.mo1089A(view, 1.0f);
        c0950c.getClass();
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: a */
    public final void mo2531a(AbstractC0967m abstractC0967m) {
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: g */
    public final void mo2537g(AbstractC0967m abstractC0967m) {
    }
}
