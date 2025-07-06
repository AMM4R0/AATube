package p132v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p118q.AbstractC2714e;
import p123s.AbstractC2729j;
import p123s.C2722c;
import p123s.C2723d;
import p123s.C2724e;
import p123s.C2726g;
import p126t.C2750b;

/* renamed from: v.f */
/* loaded from: classes.dex */
public final class C2826f {

    /* renamed from: a */
    public final ConstraintLayout f9236a;

    /* renamed from: b */
    public int f9237b;

    /* renamed from: c */
    public int f9238c;

    /* renamed from: d */
    public int f9239d;

    /* renamed from: e */
    public int f9240e;

    /* renamed from: f */
    public int f9241f;

    /* renamed from: g */
    public int f9242g;

    /* renamed from: h */
    public final /* synthetic */ ConstraintLayout f9243h;

    public C2826f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f9243h = constraintLayout;
        this.f9236a = constraintLayout2;
    }

    /* renamed from: a */
    public static boolean m5436a(int r3, int r4, int r5) {
        if (r3 == r4) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(r3);
        View.MeasureSpec.getSize(r3);
        int mode2 = View.MeasureSpec.getMode(r4);
        int size = View.MeasureSpec.getSize(r4);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && r5 == size;
        }
        return false;
    }

    /* renamed from: b */
    public final void m5437b(C2723d c2723d, C2750b c2750b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int r02;
        int r6;
        boolean z2;
        int measuredWidth;
        int baseline;
        int r4;
        if (c2723d == null) {
            return;
        }
        if (c2723d.f8854g0 == 8) {
            c2750b.f9009e = 0;
            c2750b.f9010f = 0;
            c2750b.f9011g = 0;
            return;
        }
        if (c2723d.f8834T == null) {
            return;
        }
        int r3 = c2750b.f9005a;
        int r42 = c2750b.f9006b;
        int r62 = c2750b.f9007c;
        int r7 = c2750b.f9008d;
        int r8 = this.f9237b + this.f9238c;
        int r9 = this.f9239d;
        View view = c2723d.f8852f0;
        int m5234a = AbstractC2714e.m5234a(r3);
        C2722c c2722c = c2723d.f8825K;
        C2722c c2722c2 = c2723d.f8823I;
        if (m5234a == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r62, 1073741824);
        } else if (m5234a == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9241f, r9, -2);
        } else if (m5234a == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9241f, r9, -2);
            boolean z3 = c2723d.f8874r == 1;
            int r11 = c2750b.f9014j;
            if (r11 == 1 || r11 == 2) {
                boolean z4 = view.getMeasuredHeight() == c2723d.m5284k();
                if (c2750b.f9014j == 2 || !z3 || ((z3 && z4) || c2723d.mo5241A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c2723d.m5288q(), 1073741824);
                }
            }
        } else if (m5234a != 3) {
            makeMeasureSpec = 0;
        } else {
            int r63 = this.f9241f;
            int r112 = c2722c2 != null ? c2722c2.f8812g : 0;
            if (c2722c != null) {
                r112 += c2722c.f8812g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(r63, r9 + r112, -1);
        }
        int m5234a2 = AbstractC2714e.m5234a(r42);
        if (m5234a2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(r7, 1073741824);
        } else if (m5234a2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9242g, r8, -2);
        } else if (m5234a2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9242g, r8, -2);
            boolean z5 = c2723d.f8875s == 1;
            int r92 = c2750b.f9014j;
            if (r92 == 1 || r92 == 2) {
                boolean z6 = view.getMeasuredWidth() == c2723d.m5288q();
                if (c2750b.f9014j == 2 || !z5 || ((z5 && z6) || c2723d.mo5242B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c2723d.m5284k(), 1073741824);
                }
            }
        } else if (m5234a2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int r72 = this.f9242g;
            int r93 = c2722c2 != null ? c2723d.f8824J.f8812g : 0;
            if (c2722c != null) {
                r93 += c2723d.f8826L.f8812g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(r72, r8 + r93, -1);
        }
        C2724e c2724e = (C2724e) c2723d.f8834T;
        ConstraintLayout constraintLayout = this.f9243h;
        if (c2724e != null && AbstractC2729j.m5319c(constraintLayout.f1977i, 256) && view.getMeasuredWidth() == c2723d.m5288q() && view.getMeasuredWidth() < c2724e.m5288q() && view.getMeasuredHeight() == c2723d.m5284k() && view.getMeasuredHeight() < c2724e.m5284k() && view.getBaseline() == c2723d.f8842a0 && !c2723d.m5297z() && m5436a(c2723d.f8821G, makeMeasureSpec, c2723d.m5288q()) && m5436a(c2723d.f8822H, makeMeasureSpec2, c2723d.m5284k())) {
            c2750b.f9009e = c2723d.m5288q();
            c2750b.f9010f = c2723d.m5284k();
            c2750b.f9011g = c2723d.f8842a0;
            return;
        }
        boolean z7 = r3 == 3;
        boolean z8 = r42 == 3;
        boolean z9 = r42 == 4 || r42 == 1;
        boolean z10 = r3 == 4 || r3 == 1;
        boolean z11 = z7 && c2723d.f8837W > 0.0f;
        boolean z12 = z8 && c2723d.f8837W > 0.0f;
        if (view == null) {
            return;
        }
        C2825e c2825e = (C2825e) view.getLayoutParams();
        int r03 = c2750b.f9014j;
        if (r03 != 1 && r03 != 2 && z7 && c2723d.f8874r == 0 && z8 && c2723d.f8875s == 0) {
            z2 = false;
            measuredWidth = 0;
            r4 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof AbstractC2840t) && (c2723d instanceof C2726g)) {
                ((AbstractC2840t) view).mo1562j((C2726g) c2723d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c2723d.f8821G = makeMeasureSpec;
            c2723d.f8822H = makeMeasureSpec2;
            c2723d.f8853g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int r113 = c2723d.f8877u;
            int max2 = r113 > 0 ? Math.max(r113, measuredWidth2) : measuredWidth2;
            int r14 = c2723d.f8878v;
            if (r14 > 0) {
                max2 = Math.min(r14, max2);
            }
            int r142 = c2723d.f8880x;
            max = r142 > 0 ? Math.max(r142, measuredHeight) : measuredHeight;
            int r16 = makeMeasureSpec;
            int r64 = c2723d.f8881y;
            if (r64 > 0) {
                max = Math.min(r64, max);
            }
            if (!AbstractC2729j.m5319c(constraintLayout.f1977i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c2723d.f8837W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c2723d.f8837W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z2 = false;
            } else {
                if (measuredWidth2 != max2) {
                    r02 = 1073741824;
                    r6 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else {
                    r02 = 1073741824;
                    r6 = r16;
                }
                if (measuredHeight != max) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, r02);
                }
                view.measure(r6, makeMeasureSpec2);
                c2723d.f8821G = r6;
                c2723d.f8822H = makeMeasureSpec2;
                z2 = false;
                c2723d.f8853g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            r4 = -1;
        }
        boolean z13 = baseline != r4 ? true : z2;
        if (measuredWidth != c2750b.f9007c || max != c2750b.f9008d) {
            z2 = true;
        }
        c2750b.f9013i = z2;
        boolean z14 = c2825e.f9199c0 ? true : z13;
        if (z14 && baseline != -1 && c2723d.f8842a0 != baseline) {
            c2750b.f9013i = true;
        }
        c2750b.f9009e = measuredWidth;
        c2750b.f9010f = max;
        c2750b.f9012h = z14;
        c2750b.f9011g = baseline;
    }
}
