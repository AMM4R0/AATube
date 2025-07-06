package p084g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p001A0.AbstractC0005b;
import p087h.AbstractC0918a;

/* renamed from: g.c */
/* loaded from: classes.dex */
public final class C0907c extends AbstractC0005b {

    /* renamed from: d */
    public final ObjectAnimator f3794d;

    /* renamed from: e */
    public final boolean f3795e;

    public C0907c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int r2 = z2 ? numberOfFrames - 1 : 0;
        int r02 = z2 ? 0 : numberOfFrames - 1;
        C0908d c0908d = new C0908d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c0908d.f3797b = numberOfFrames2;
        int[] r6 = c0908d.f3796a;
        if (r6 == null || r6.length < numberOfFrames2) {
            c0908d.f3796a = new int[numberOfFrames2];
        }
        int[] r62 = c0908d.f3796a;
        int r7 = 0;
        for (int r12 = 0; r12 < numberOfFrames2; r12++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - r12) - 1 : r12);
            r62[r12] = duration;
            r7 += duration;
        }
        c0908d.f3798c = r7;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", r2, r02);
        AbstractC0918a.m2465a(ofInt, true);
        ofInt.setDuration(c0908d.f3798c);
        ofInt.setInterpolator(c0908d);
        this.f3795e = z3;
        this.f3794d = ofInt;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: H */
    public final void mo82H() {
        this.f3794d.reverse();
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: N */
    public final void mo85N() {
        this.f3794d.start();
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: O */
    public final void mo86O() {
        this.f3794d.cancel();
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: h */
    public final boolean mo88h() {
        return this.f3795e;
    }
}
