package p028K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p006C.C0051c;

/* renamed from: K.x0 */
/* loaded from: classes.dex */
public final class C0340x0 {

    /* renamed from: b */
    public static final C0340x0 f943b;

    /* renamed from: a */
    public final C0336v0 f944a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f943b = C0334u0.f934q;
        } else {
            f943b = C0336v0.f935b;
        }
    }

    public C0340x0(WindowInsets windowInsets) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            this.f944a = new C0334u0(this, windowInsets);
            return;
        }
        if (r02 >= 29) {
            this.f944a = new C0332t0(this, windowInsets);
        } else if (r02 >= 28) {
            this.f944a = new C0330s0(this, windowInsets);
        } else {
            this.f944a = new C0328r0(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static C0051c m974e(C0051c c0051c, int r6, int r7, int r8, int r9) {
        int max = Math.max(0, c0051c.f98a - r6);
        int max2 = Math.max(0, c0051c.f99b - r7);
        int max3 = Math.max(0, c0051c.f100c - r8);
        int max4 = Math.max(0, c0051c.f101d - r9);
        return (max == r6 && max2 == r7 && max3 == r8 && max4 == r9) ? c0051c : C0051c.m197b(max, max2, max3, max4);
    }

    /* renamed from: g */
    public static C0340x0 m975g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0340x0 c0340x0 = new C0340x0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            C0340x0 m723a = AbstractC0273F.m723a(view);
            C0336v0 c0336v0 = c0340x0.f944a;
            c0336v0.mo955p(m723a);
            c0336v0.mo949d(view.getRootView());
        }
        return c0340x0;
    }

    /* renamed from: a */
    public final int m976a() {
        return this.f944a.mo951j().f101d;
    }

    /* renamed from: b */
    public final int m977b() {
        return this.f944a.mo951j().f98a;
    }

    /* renamed from: c */
    public final int m978c() {
        return this.f944a.mo951j().f100c;
    }

    /* renamed from: d */
    public final int m979d() {
        return this.f944a.mo951j().f99b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0340x0)) {
            return false;
        }
        return Objects.equals(this.f944a, ((C0340x0) obj).f944a);
    }

    /* renamed from: f */
    public final WindowInsets m980f() {
        C0336v0 c0336v0 = this.f944a;
        if (c0336v0 instanceof AbstractC0326q0) {
            return ((AbstractC0326q0) c0336v0).f922c;
        }
        return null;
    }

    public final int hashCode() {
        C0336v0 c0336v0 = this.f944a;
        if (c0336v0 == null) {
            return 0;
        }
        return c0336v0.hashCode();
    }

    public C0340x0() {
        this.f944a = new C0336v0(this);
    }
}
