package p080e0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* renamed from: e0.u */
/* loaded from: classes.dex */
public class C0869u {

    /* renamed from: a */
    public int f3614a = -1;

    /* renamed from: b */
    public RecyclerView f3615b;

    /* renamed from: c */
    public AbstractC0824G f3616c;

    /* renamed from: d */
    public boolean f3617d;

    /* renamed from: e */
    public boolean f3618e;

    /* renamed from: f */
    public View f3619f;

    /* renamed from: g */
    public final C0833P f3620g;

    /* renamed from: h */
    public boolean f3621h;

    /* renamed from: i */
    public final LinearInterpolator f3622i;

    /* renamed from: j */
    public final DecelerateInterpolator f3623j;

    /* renamed from: k */
    public PointF f3624k;

    /* renamed from: l */
    public final DisplayMetrics f3625l;

    /* renamed from: m */
    public boolean f3626m;

    /* renamed from: n */
    public float f3627n;

    /* renamed from: o */
    public int f3628o;

    /* renamed from: p */
    public int f3629p;

    public C0869u(Context context) {
        C0833P c0833p = new C0833P();
        c0833p.f3398d = -1;
        c0833p.f3400f = false;
        c0833p.f3401g = 0;
        c0833p.f3395a = 0;
        c0833p.f3396b = 0;
        c0833p.f3397c = Integer.MIN_VALUE;
        c0833p.f3399e = null;
        this.f3620g = c0833p;
        this.f3622i = new LinearInterpolator();
        this.f3623j = new DecelerateInterpolator();
        this.f3626m = false;
        this.f3628o = 0;
        this.f3629p = 0;
        this.f3625l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m2374a(int r12, int r2, int r3, int r4, int r5) {
        if (r5 == -1) {
            return r3 - r12;
        }
        if (r5 != 0) {
            if (r5 == 1) {
                return r4 - r2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int r32 = r3 - r12;
        if (r32 > 0) {
            return r32;
        }
        int r42 = r4 - r2;
        if (r42 < 0) {
            return r42;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo1212b(View view, int r6) {
        AbstractC0824G abstractC0824G = this.f3616c;
        if (abstractC0824G == null || !abstractC0824G.mo1878d()) {
            return 0;
        }
        C0825H c0825h = (C0825H) view.getLayoutParams();
        return m2374a((view.getLeft() - ((C0825H) view.getLayoutParams()).f3377b.left) - ((ViewGroup.MarginLayoutParams) c0825h).leftMargin, view.getRight() + ((C0825H) view.getLayoutParams()).f3377b.right + ((ViewGroup.MarginLayoutParams) c0825h).rightMargin, abstractC0824G.m2286E(), abstractC0824G.f3374n - abstractC0824G.m2287F(), r6);
    }

    /* renamed from: c */
    public int mo1213c(View view, int r6) {
        AbstractC0824G abstractC0824G = this.f3616c;
        if (abstractC0824G == null || !abstractC0824G.mo1881e()) {
            return 0;
        }
        C0825H c0825h = (C0825H) view.getLayoutParams();
        return m2374a((view.getTop() - ((C0825H) view.getLayoutParams()).f3377b.top) - ((ViewGroup.MarginLayoutParams) c0825h).topMargin, view.getBottom() + ((C0825H) view.getLayoutParams()).f3377b.bottom + ((ViewGroup.MarginLayoutParams) c0825h).bottomMargin, abstractC0824G.m2288G(), abstractC0824G.f3375o - abstractC0824G.m2285D(), r6);
    }

    /* renamed from: d */
    public float mo1214d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo1215e(int r3) {
        float abs = Math.abs(r3);
        if (!this.f3626m) {
            this.f3627n = mo1214d(this.f3625l);
            this.f3626m = true;
        }
        return (int) Math.ceil(abs * this.f3627n);
    }

    /* renamed from: f */
    public PointF mo1216f(int r3) {
        Object obj = this.f3616c;
        if (obj instanceof InterfaceC0834Q) {
            return ((InterfaceC0834Q) obj).mo1874a(r3);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0834Q.class.getCanonicalName());
        return null;
    }

    /* renamed from: g */
    public final void m2375g(int r9, int r10) {
        PointF mo1216f;
        RecyclerView recyclerView = this.f3615b;
        if (this.f3614a == -1 || recyclerView == null) {
            m2376i();
        }
        if (this.f3617d && this.f3619f == null && this.f3616c != null && (mo1216f = mo1216f(this.f3614a)) != null) {
            float f = mo1216f.x;
            if (f != 0.0f || mo1216f.y != 0.0f) {
                recyclerView.m1919X((int) Math.signum(f), (int) Math.signum(mo1216f.y), null);
            }
        }
        this.f3617d = false;
        View view = this.f3619f;
        C0833P c0833p = this.f3620g;
        if (view != null) {
            this.f3615b.getClass();
            AbstractC0838V m1892I = RecyclerView.m1892I(view);
            if ((m1892I != null ? m1892I.m2325b() : -1) == this.f3614a) {
                View view2 = this.f3619f;
                C0835S c0835s = recyclerView.f2514c0;
                mo1217h(view2, c0833p);
                c0833p.m2319a(recyclerView);
                m2376i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3619f = null;
            }
        }
        if (this.f3618e) {
            C0835S c0835s2 = recyclerView.f2514c0;
            if (this.f3615b.f2531l.m2304v() == 0) {
                m2376i();
            } else {
                int r2 = this.f3628o;
                int r92 = r2 - r9;
                if (r2 * r92 <= 0) {
                    r92 = 0;
                }
                this.f3628o = r92;
                int r22 = this.f3629p;
                int r102 = r22 - r10;
                if (r22 * r102 <= 0) {
                    r102 = 0;
                }
                this.f3629p = r102;
                if (r92 == 0 && r102 == 0) {
                    PointF mo1216f2 = mo1216f(this.f3614a);
                    if (mo1216f2 != null) {
                        if (mo1216f2.x != 0.0f || mo1216f2.y != 0.0f) {
                            float f2 = mo1216f2.y;
                            float sqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = mo1216f2.x / sqrt;
                            mo1216f2.x = f3;
                            float f4 = mo1216f2.y / sqrt;
                            mo1216f2.y = f4;
                            this.f3624k = mo1216f2;
                            this.f3628o = (int) (f3 * 10000.0f);
                            this.f3629p = (int) (f4 * 10000.0f);
                            int mo1215e = mo1215e(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                            LinearInterpolator linearInterpolator = this.f3622i;
                            c0833p.f3395a = (int) (this.f3628o * 1.2f);
                            c0833p.f3396b = (int) (this.f3629p * 1.2f);
                            c0833p.f3397c = (int) (mo1215e * 1.2f);
                            c0833p.f3399e = linearInterpolator;
                            c0833p.f3400f = true;
                        }
                    }
                    c0833p.f3398d = this.f3614a;
                    m2376i();
                }
            }
            boolean z2 = c0833p.f3398d >= 0;
            c0833p.m2319a(recyclerView);
            if (z2 && this.f3618e) {
                this.f3617d = true;
                recyclerView.f2508W.m2322a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1217h(android.view.View r7, p080e0.C0833P r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f3624k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.mo1212b(r7, r0)
            android.graphics.PointF r5 = r6.f3624k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.mo1213c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.mo1215e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f3623j
            r8.f3395a = r0
            r8.f3396b = r7
            r8.f3397c = r2
            r8.f3399e = r3
            r8.f3400f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.C0869u.mo1217h(android.view.View, e0.P):void");
    }

    /* renamed from: i */
    public final void m2376i() {
        if (this.f3618e) {
            this.f3618e = false;
            this.f3629p = 0;
            this.f3628o = 0;
            this.f3624k = null;
            this.f3615b.f2514c0.f3402a = -1;
            this.f3619f = null;
            this.f3614a = -1;
            this.f3617d = false;
            AbstractC0824G abstractC0824G = this.f3616c;
            if (abstractC0824G.f3365e == this) {
                abstractC0824G.f3365e = null;
            }
            this.f3616c = null;
            this.f3615b = null;
        }
    }
}
