package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p000A.AbstractC0002c;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public final class C0653c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2247a;

    /* renamed from: b */
    public final /* synthetic */ View f2248b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2249c;

    /* renamed from: d */
    public final /* synthetic */ C0649P f2250d;

    /* renamed from: e */
    public final /* synthetic */ C0655e f2251e;

    public C0653c(ViewGroup viewGroup, View view, boolean z2, C0649P c0649p, C0655e c0655e) {
        this.f2247a = viewGroup;
        this.f2248b = view;
        this.f2249c = z2;
        this.f2250d = c0649p;
        this.f2251e = c0655e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f2247a;
        View view = this.f2248b;
        viewGroup.endViewTransition(view);
        if (this.f2249c) {
            AbstractC0002c.m6a(view, this.f2250d.f2207a);
        }
        this.f2251e.m1738d();
    }
}
