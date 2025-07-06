package p080e0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import p010D0.RunnableC0107e;
import p028K.AbstractC0283P;
import p044P0.C0418b;

/* renamed from: e0.k */
/* loaded from: classes.dex */
public final class C0859k extends AbstractC0821D {

    /* renamed from: C */
    public static final int[] f3534C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f3535D = new int[0];

    /* renamed from: A */
    public int f3536A;

    /* renamed from: B */
    public final RunnableC0107e f3537B;

    /* renamed from: a */
    public final int f3538a;

    /* renamed from: b */
    public final int f3539b;

    /* renamed from: c */
    public final StateListDrawable f3540c;

    /* renamed from: d */
    public final Drawable f3541d;

    /* renamed from: e */
    public final int f3542e;

    /* renamed from: f */
    public final int f3543f;

    /* renamed from: g */
    public final StateListDrawable f3544g;

    /* renamed from: h */
    public final Drawable f3545h;

    /* renamed from: i */
    public final int f3546i;

    /* renamed from: j */
    public final int f3547j;

    /* renamed from: k */
    public int f3548k;

    /* renamed from: l */
    public int f3549l;

    /* renamed from: m */
    public float f3550m;

    /* renamed from: n */
    public int f3551n;

    /* renamed from: o */
    public int f3552o;

    /* renamed from: p */
    public float f3553p;

    /* renamed from: s */
    public final RecyclerView f3556s;

    /* renamed from: z */
    public final ValueAnimator f3563z;

    /* renamed from: q */
    public int f3554q = 0;

    /* renamed from: r */
    public int f3555r = 0;

    /* renamed from: t */
    public boolean f3557t = false;

    /* renamed from: u */
    public boolean f3558u = false;

    /* renamed from: v */
    public int f3559v = 0;

    /* renamed from: w */
    public int f3560w = 0;

    /* renamed from: x */
    public final int[] f3561x = new int[2];

    /* renamed from: y */
    public final int[] f3562y = new int[2];

    public C0859k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int r13, int r14, int r15) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3563z = ofFloat;
        this.f3536A = 0;
        RunnableC0107e runnableC0107e = new RunnableC0107e(10, this);
        this.f3537B = runnableC0107e;
        C0857i c0857i = new C0857i(this);
        this.f3540c = stateListDrawable;
        this.f3541d = drawable;
        this.f3544g = stateListDrawable2;
        this.f3545h = drawable2;
        this.f3542e = Math.max(r13, stateListDrawable.getIntrinsicWidth());
        this.f3543f = Math.max(r13, drawable.getIntrinsicWidth());
        this.f3546i = Math.max(r13, stateListDrawable2.getIntrinsicWidth());
        this.f3547j = Math.max(r13, drawable2.getIntrinsicWidth());
        this.f3538a = r14;
        this.f3539b = r15;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new C0858j(this));
        ofFloat.addUpdateListener(new C0418b(true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f3556s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0824G abstractC0824G = recyclerView2.f2531l;
            if (abstractC0824G != null) {
                abstractC0824G.mo1876c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2533m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1909N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3556s;
            recyclerView3.f2535n.remove(this);
            if (recyclerView3.f2537o == this) {
                recyclerView3.f2537o = null;
            }
            ArrayList arrayList2 = this.f3556s.f2518e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0857i);
            }
            this.f3556s.removeCallbacks(runnableC0107e);
        }
        this.f3556s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1926g(this);
            this.f3556s.f2535n.add(this);
            this.f3556s.m1927h(c0857i);
        }
    }

    /* renamed from: e */
    public static int m2358e(float f, float f2, int[] r4, int r5, int r6, int r7) {
        int r02 = r4[1] - r4[0];
        if (r02 == 0) {
            return 0;
        }
        int r52 = r5 - r7;
        int r2 = (int) (((f2 - f) / r02) * r52);
        int r62 = r6 + r2;
        if (r62 >= r52 || r62 < 0) {
            return 0;
        }
        return r2;
    }

    @Override // p080e0.AbstractC0821D
    /* renamed from: b */
    public final void mo1218b(Canvas canvas, RecyclerView recyclerView) {
        int r11 = this.f3554q;
        RecyclerView recyclerView2 = this.f3556s;
        if (r11 != recyclerView2.getWidth() || this.f3555r != recyclerView2.getHeight()) {
            this.f3554q = recyclerView2.getWidth();
            this.f3555r = recyclerView2.getHeight();
            m2361f(0);
            return;
        }
        if (this.f3536A != 0) {
            if (this.f3557t) {
                int r112 = this.f3554q;
                int r3 = this.f3542e;
                int r113 = r112 - r3;
                int r4 = this.f3549l;
                int r5 = this.f3548k;
                int r42 = r4 - (r5 / 2);
                StateListDrawable stateListDrawable = this.f3540c;
                stateListDrawable.setBounds(0, 0, r3, r5);
                int r52 = this.f3555r;
                int r7 = this.f3543f;
                Drawable drawable = this.f3541d;
                drawable.setBounds(0, 0, r7, r52);
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(r3, r42);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-r3, -r42);
                } else {
                    canvas.translate(r113, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, r42);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-r113, -r42);
                }
            }
            if (this.f3558u) {
                int r114 = this.f3555r;
                int r02 = this.f3546i;
                int r115 = r114 - r02;
                int r32 = this.f3552o;
                int r43 = this.f3551n;
                int r33 = r32 - (r43 / 2);
                StateListDrawable stateListDrawable2 = this.f3544g;
                stateListDrawable2.setBounds(0, 0, r43, r02);
                int r03 = this.f3554q;
                int r44 = this.f3547j;
                Drawable drawable2 = this.f3545h;
                drawable2.setBounds(0, 0, r03, r44);
                canvas.translate(0.0f, r115);
                drawable2.draw(canvas);
                canvas.translate(r33, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r33, -r115);
            }
        }
    }

    /* renamed from: c */
    public final boolean m2359c(float f, float f2) {
        if (f2 >= this.f3555r - this.f3546i) {
            int r4 = this.f3552o;
            int r02 = this.f3551n;
            if (f >= r4 - (r02 / 2) && f <= (r02 / 2) + r4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m2360d(float f, float f2) {
        RecyclerView recyclerView = this.f3556s;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int r3 = this.f3542e;
        if (z2) {
            if (f > r3 / 2) {
                return false;
            }
        } else if (f < this.f3554q - r3) {
            return false;
        }
        int r5 = this.f3549l;
        int r02 = this.f3548k / 2;
        return f2 >= ((float) (r5 - r02)) && f2 <= ((float) (r02 + r5));
    }

    /* renamed from: f */
    public final void m2361f(int r5) {
        RunnableC0107e runnableC0107e = this.f3537B;
        StateListDrawable stateListDrawable = this.f3540c;
        if (r5 == 2 && this.f3559v != 2) {
            stateListDrawable.setState(f3534C);
            this.f3556s.removeCallbacks(runnableC0107e);
        }
        if (r5 == 0) {
            this.f3556s.invalidate();
        } else {
            m2362g();
        }
        if (this.f3559v == 2 && r5 != 2) {
            stateListDrawable.setState(f3535D);
            this.f3556s.removeCallbacks(runnableC0107e);
            this.f3556s.postDelayed(runnableC0107e, 1200);
        } else if (r5 == 1) {
            this.f3556s.removeCallbacks(runnableC0107e);
            this.f3556s.postDelayed(runnableC0107e, 1500);
        }
        this.f3559v = r5;
    }

    /* renamed from: g */
    public final void m2362g() {
        int r12 = this.f3536A;
        ValueAnimator valueAnimator = this.f3563z;
        if (r12 != 0) {
            if (r12 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3536A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
