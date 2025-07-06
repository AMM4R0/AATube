package p088h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p104l.C2562d0;

/* renamed from: h1.o */
/* loaded from: classes.dex */
public final class C0935o extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3903a;

    /* renamed from: b */
    public final /* synthetic */ TextView f3904b;

    /* renamed from: c */
    public final /* synthetic */ int f3905c;

    /* renamed from: d */
    public final /* synthetic */ TextView f3906d;

    /* renamed from: e */
    public final /* synthetic */ C0937q f3907e;

    public C0935o(C0937q c0937q, int r2, TextView textView, int r4, TextView textView2) {
        this.f3907e = c0937q;
        this.f3903a = r2;
        this.f3904b = textView;
        this.f3905c = r4;
        this.f3906d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2562d0 c2562d0;
        int r4 = this.f3903a;
        C0937q c0937q = this.f3907e;
        c0937q.f3924n = r4;
        c0937q.f3922l = null;
        TextView textView = this.f3904b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3905c == 1 && (c2562d0 = c0937q.f3928r) != null) {
                c2562d0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f3906d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f3906d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
