package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p010D0.RunnableC0107e;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0654d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2252a;

    /* renamed from: b */
    public final /* synthetic */ View f2253b;

    /* renamed from: c */
    public final /* synthetic */ C0655e f2254c;

    public AnimationAnimationListenerC0654d(ViewGroup viewGroup, View view, C0655e c0655e) {
        this.f2252a = viewGroup;
        this.f2253b = view;
        this.f2254c = c0655e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2252a.post(new RunnableC0107e(7, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
