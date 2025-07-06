package p080e0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.P */
/* loaded from: classes.dex */
public final class C0833P {

    /* renamed from: a */
    public int f3395a;

    /* renamed from: b */
    public int f3396b;

    /* renamed from: c */
    public int f3397c;

    /* renamed from: d */
    public int f3398d;

    /* renamed from: e */
    public BaseInterpolator f3399e;

    /* renamed from: f */
    public boolean f3400f;

    /* renamed from: g */
    public int f3401g;

    /* renamed from: a */
    public final void m2319a(RecyclerView recyclerView) {
        int r02 = this.f3398d;
        if (r02 >= 0) {
            this.f3398d = -1;
            recyclerView.m1908M(r02);
            this.f3400f = false;
            return;
        }
        if (!this.f3400f) {
            this.f3401g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f3399e;
        if (baseInterpolator != null && this.f3397c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int r3 = this.f3397c;
        if (r3 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2508W.m2323b(this.f3395a, this.f3396b, r3, baseInterpolator);
        int r7 = this.f3401g + 1;
        this.f3401g = r7;
        if (r7 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3400f = false;
    }
}
