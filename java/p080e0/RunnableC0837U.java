package p080e0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p055T.InterpolatorC0515d;

/* renamed from: e0.U */
/* loaded from: classes.dex */
public final class RunnableC0837U implements Runnable {

    /* renamed from: a */
    public int f3416a;

    /* renamed from: b */
    public int f3417b;

    /* renamed from: c */
    public OverScroller f3418c;

    /* renamed from: d */
    public Interpolator f3419d;

    /* renamed from: e */
    public boolean f3420e;

    /* renamed from: f */
    public boolean f3421f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f3422g;

    public RunnableC0837U(RecyclerView recyclerView) {
        this.f3422g = recyclerView;
        InterpolatorC0515d interpolatorC0515d = RecyclerView.f2485u0;
        this.f3419d = interpolatorC0515d;
        this.f3420e = false;
        this.f3421f = false;
        this.f3418c = new OverScroller(recyclerView.getContext(), interpolatorC0515d);
    }

    /* renamed from: a */
    public final void m2322a() {
        if (this.f3420e) {
            this.f3421f = true;
            return;
        }
        RecyclerView recyclerView = this.f3422g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: b */
    public final void m2323b(int r12, int r13, int r14, BaseInterpolator baseInterpolator) {
        int r142;
        RecyclerView recyclerView = this.f3422g;
        if (r14 == Integer.MIN_VALUE) {
            int abs = Math.abs(r12);
            int abs2 = Math.abs(r13);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((r13 * r13) + (r12 * r12));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int r7 = width / 2;
            float f = width;
            float f2 = r7;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (sqrt > 0) {
                r142 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                r142 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            r14 = Math.min(r142, 2000);
        }
        int r8 = r14;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f2485u0;
        }
        if (this.f3419d != interpolator) {
            this.f3419d = interpolator;
            this.f3418c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3417b = 0;
        this.f3416a = 0;
        recyclerView.setScrollState(2);
        this.f3418c.startScroll(0, 0, r12, r13, r8);
        m2322a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r16;
        int r17;
        int r8;
        int r15;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3422g;
        if (recyclerView.f2531l == null) {
            recyclerView.removeCallbacks(this);
            this.f3418c.abortAnimation();
            return;
        }
        this.f3421f = false;
        this.f3420e = true;
        recyclerView.m1931m();
        OverScroller overScroller = this.f3418c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int r7 = currX - this.f3416a;
            int r82 = currY - this.f3417b;
            this.f3416a = currX;
            this.f3417b = currY;
            int[] r4 = recyclerView.f2538o0;
            r4[0] = 0;
            r4[1] = 0;
            boolean m1936r = recyclerView.m1936r(r7, r82, r4, null, 1);
            int[] r13 = recyclerView.f2538o0;
            if (m1936r) {
                r7 -= r13[0];
                r82 -= r13[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1930l(r7, r82);
            }
            if (recyclerView.f2529k != null) {
                r13[0] = 0;
                r13[1] = 0;
                recyclerView.m1919X(r7, r82, r13);
                int r12 = r13[0];
                int r2 = r13[1];
                int r72 = r7 - r12;
                int r83 = r82 - r2;
                C0869u c0869u = recyclerView.f2531l.f3365e;
                if (c0869u != null && !c0869u.f3617d && c0869u.f3618e) {
                    int m2321b = recyclerView.f2514c0.m2321b();
                    if (m2321b == 0) {
                        c0869u.m2376i();
                    } else if (c0869u.f3614a >= m2321b) {
                        c0869u.f3614a = m2321b - 1;
                        c0869u.m2375g(r12, r2);
                    } else {
                        c0869u.m2375g(r12, r2);
                    }
                }
                r15 = r12;
                r16 = r72;
                r17 = r83;
                r8 = r2;
            } else {
                r16 = r7;
                r17 = r82;
                r8 = 0;
                r15 = 0;
            }
            if (!recyclerView.f2533m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] r73 = recyclerView.f2538o0;
            r73[0] = 0;
            r73[1] = 0;
            int r14 = r8;
            recyclerView.m1937s(r15, r8, r16, r17, null, 1, r73);
            int r162 = r16 - r13[0];
            int r172 = r17 - r13[1];
            if (r15 != 0 || r14 != 0) {
                recyclerView.m1938t(r15, r14);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || r162 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || r172 != 0));
            C0869u c0869u2 = recyclerView.f2531l.f3365e;
            if ((c0869u2 == null || !c0869u2.f3617d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int r22 = r162 < 0 ? -currVelocity : r162 > 0 ? currVelocity : 0;
                    if (r172 < 0) {
                        currVelocity = -currVelocity;
                    } else if (r172 <= 0) {
                        currVelocity = 0;
                    }
                    if (r22 < 0) {
                        recyclerView.m1940v();
                        if (recyclerView.f2489D.isFinished()) {
                            recyclerView.f2489D.onAbsorb(-r22);
                        }
                    } else if (r22 > 0) {
                        recyclerView.m1941w();
                        if (recyclerView.f2491F.isFinished()) {
                            recyclerView.f2491F.onAbsorb(r22);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1942x();
                        if (recyclerView.f2490E.isFinished()) {
                            recyclerView.f2490E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1939u();
                        if (recyclerView.f2492G.isFinished()) {
                            recyclerView.f2492G.onAbsorb(currVelocity);
                        }
                    }
                    if (r22 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0283P.f842a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0860l c0860l = recyclerView.f2512b0;
                int[] r23 = c0860l.f3566c;
                if (r23 != null) {
                    Arrays.fill(r23, -1);
                }
                c0860l.f3567d = 0;
            } else {
                m2322a();
                RunnableC0862n runnableC0862n = recyclerView.f2510a0;
                if (runnableC0862n != null) {
                    runnableC0862n.m2366a(recyclerView, r15, r14);
                }
            }
        }
        C0869u c0869u3 = recyclerView.f2531l.f3365e;
        if (c0869u3 != null && c0869u3.f3617d) {
            c0869u3.m2375g(0, 0);
        }
        this.f3420e = false;
        if (!this.f3421f) {
            recyclerView.setScrollState(0);
            recyclerView.m1924c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
            recyclerView.postOnAnimation(this);
        }
    }
}
