package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.carwizard.p075li.youtube.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p028K.C0290X;
import p032L0.AbstractC0367a;
import p103k0.AbstractC2480a;
import p138x.AbstractC2879a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC2879a {

    /* renamed from: b */
    public int f2735b;

    /* renamed from: c */
    public int f2736c;

    /* renamed from: d */
    public TimeInterpolator f2737d;

    /* renamed from: e */
    public TimeInterpolator f2738e;

    /* renamed from: h */
    public ViewPropertyAnimator f2741h;

    /* renamed from: a */
    public final LinkedHashSet f2734a = new LinkedHashSet();

    /* renamed from: f */
    public int f2739f = 0;

    /* renamed from: g */
    public int f2740g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r4) {
        this.f2739f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2735b = AbstractC2480a.m4876Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2736c = AbstractC2480a.m4876Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2737d = AbstractC2480a.m4877R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0367a.f1004d);
        this.f2738e = AbstractC2480a.m4877R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0367a.f1003c);
        return false;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: k */
    public final void mo2045k(CoordinatorLayout coordinatorLayout, View view, int r3, int r4, int r5, int[] r6) {
        LinkedHashSet linkedHashSet = this.f2734a;
        if (r3 > 0) {
            if (this.f2740g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2741h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2740g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC0002c.m10e(it);
            }
            this.f2741h = view.animate().translationY(this.f2739f).setInterpolator(this.f2738e).setDuration(this.f2736c).setListener(new C0290X(1, this));
            return;
        }
        if (r3 >= 0 || this.f2740g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2741h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2740g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC0002c.m10e(it2);
        }
        this.f2741h = view.animate().translationY(0).setInterpolator(this.f2737d).setDuration(this.f2735b).setListener(new C0290X(1, this));
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: o */
    public boolean mo2048o(View view, int r2, int r3) {
        return r2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
