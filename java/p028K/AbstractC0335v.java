package p028K;

import android.view.VelocityTracker;

/* renamed from: K.v */
/* loaded from: classes.dex */
public abstract class AbstractC0335v {
    /* renamed from: a */
    public static float m970a(VelocityTracker velocityTracker, int r12) {
        return velocityTracker.getAxisVelocity(r12);
    }

    /* renamed from: b */
    public static float m971b(VelocityTracker velocityTracker, int r12, int r2) {
        return velocityTracker.getAxisVelocity(r12, r2);
    }

    /* renamed from: c */
    public static boolean m972c(VelocityTracker velocityTracker, int r12) {
        return velocityTracker.isAxisSupported(r12);
    }
}
