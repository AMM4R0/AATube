package p032L0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p112o.C2691k;

/* renamed from: L0.b */
/* loaded from: classes.dex */
public final class C0368b {

    /* renamed from: a */
    public final C2691k f1005a = new C2691k();

    /* renamed from: b */
    public final C2691k f1006b = new C2691k();

    /* renamed from: a */
    public static C0368b m1038a(Context context, int r4) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, r4);
            if (loadAnimator instanceof AnimatorSet) {
                return m1039b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m1039b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(r4), e2);
            return null;
        }
    }

    /* renamed from: b */
    public static C0368b m1039b(ArrayList arrayList) {
        C0368b c0368b = new C0368b();
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            Animator animator = (Animator) arrayList.get(r3);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0368b.f1006b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0367a.f1002b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0367a.f1003c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0367a.f1004d;
            }
            C0369c c0369c = new C0369c();
            c0369c.f1010d = 0;
            c0369c.f1011e = 1;
            c0369c.f1007a = startDelay;
            c0369c.f1008b = duration;
            c0369c.f1009c = interpolator;
            c0369c.f1010d = objectAnimator.getRepeatCount();
            c0369c.f1011e = objectAnimator.getRepeatMode();
            c0368b.f1005a.put(propertyName, c0369c);
        }
        return c0368b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0368b) {
            return this.f1005a.equals(((C0368b) obj).f1005a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1005a.hashCode();
    }

    public final String toString() {
        return "\n" + C0368b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1005a + "}\n";
    }
}
