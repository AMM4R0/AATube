package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p028K.ViewTreeObserverOnPreDrawListenerC0331t;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final class RunnableC0670t extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f2347a;

    /* renamed from: b */
    public final View f2348b;

    /* renamed from: c */
    public boolean f2349c;

    /* renamed from: d */
    public boolean f2350d;

    /* renamed from: e */
    public boolean f2351e;

    public RunnableC0670t(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2351e = true;
        this.f2347a = viewGroup;
        this.f2348b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f2351e = true;
        if (this.f2349c) {
            return !this.f2350d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f2349c = true;
            ViewTreeObserverOnPreDrawListenerC0331t.m966a(this.f2347a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f2349c;
        ViewGroup viewGroup = this.f2347a;
        if (z2 || !this.f2351e) {
            viewGroup.endViewTransition(this.f2348b);
            this.f2350d = true;
        } else {
            this.f2351e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f) {
        this.f2351e = true;
        if (this.f2349c) {
            return !this.f2350d;
        }
        if (!super.getTransformation(j2, transformation, f)) {
            this.f2349c = true;
            ViewTreeObserverOnPreDrawListenerC0331t.m966a(this.f2347a, this);
        }
        return true;
    }
}
