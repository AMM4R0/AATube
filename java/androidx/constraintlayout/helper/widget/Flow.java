package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import p123s.C2723d;
import p123s.C2726g;
import p126t.C2750b;
import p132v.AbstractC2838r;
import p132v.AbstractC2840t;

/* loaded from: classes.dex */
public class Flow extends AbstractC2840t {

    /* renamed from: j */
    public final C2726g f1967j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9160a = new int[32];
        this.f9166g = new HashMap();
        this.f9162c = context;
        super.mo5433g(attributeSet);
        C2726g c2726g = new C2726g();
        c2726g.f8951s0 = 0;
        c2726g.f8952t0 = 0;
        c2726g.f8953u0 = 0;
        c2726g.f8954v0 = 0;
        c2726g.f8955w0 = 0;
        c2726g.f8956x0 = 0;
        c2726g.f8957y0 = false;
        c2726g.f8958z0 = 0;
        c2726g.f8923A0 = 0;
        c2726g.f8924B0 = new C2750b();
        c2726g.f8925C0 = null;
        c2726g.f8926D0 = -1;
        c2726g.f8927E0 = -1;
        c2726g.f8928F0 = -1;
        c2726g.f8929G0 = -1;
        c2726g.f8930H0 = -1;
        c2726g.f8931I0 = -1;
        c2726g.f8932J0 = 0.5f;
        c2726g.f8933K0 = 0.5f;
        c2726g.f8934L0 = 0.5f;
        c2726g.f8935M0 = 0.5f;
        c2726g.f8936N0 = 0.5f;
        c2726g.f8937O0 = 0.5f;
        c2726g.f8938P0 = 0;
        c2726g.f8939Q0 = 0;
        c2726g.f8940R0 = 2;
        c2726g.f8941S0 = 2;
        c2726g.f8942T0 = 0;
        c2726g.f8943U0 = -1;
        c2726g.f8944V0 = 0;
        c2726g.f8945W0 = new ArrayList();
        c2726g.f8946X0 = null;
        c2726g.f8947Y0 = null;
        c2726g.f8948Z0 = null;
        c2726g.f8950b1 = 0;
        this.f1967j = c2726g;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2838r.f9371b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int r12 = 0; r12 < indexCount; r12++) {
                int index = obtainStyledAttributes.getIndex(r12);
                if (index == 0) {
                    this.f1967j.f8944V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C2726g c2726g2 = this.f1967j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c2726g2.f8951s0 = dimensionPixelSize;
                    c2726g2.f8952t0 = dimensionPixelSize;
                    c2726g2.f8953u0 = dimensionPixelSize;
                    c2726g2.f8954v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C2726g c2726g3 = this.f1967j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c2726g3.f8953u0 = dimensionPixelSize2;
                    c2726g3.f8955w0 = dimensionPixelSize2;
                    c2726g3.f8956x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1967j.f8954v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1967j.f8955w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1967j.f8951s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1967j.f8956x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1967j.f8952t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1967j.f8942T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1967j.f8926D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1967j.f8927E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1967j.f8928F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1967j.f8930H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1967j.f8929G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1967j.f8931I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1967j.f8932J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1967j.f8934L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1967j.f8936N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1967j.f8935M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1967j.f8937O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1967j.f8933K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1967j.f8940R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1967j.f8941S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1967j.f8938P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1967j.f8939Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1967j.f8943U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f9163d = this.f1967j;
        m5434i();
    }

    @Override // p132v.AbstractC2823c
    /* renamed from: h */
    public final void mo1561h(C2723d c2723d, boolean z2) {
        C2726g c2726g = this.f1967j;
        int r02 = c2726g.f8953u0;
        if (r02 > 0 || c2726g.f8954v0 > 0) {
            if (z2) {
                c2726g.f8955w0 = c2726g.f8954v0;
                c2726g.f8956x0 = r02;
            } else {
                c2726g.f8955w0 = r02;
                c2726g.f8956x0 = c2726g.f8954v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07b2  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p132v.AbstractC2840t
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1562j(p123s.C2726g r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 2042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo1562j(s.g, int, int):void");
    }

    @Override // p132v.AbstractC2823c, android.view.View
    public final void onMeasure(int r2, int r3) {
        mo1562j(this.f1967j, r2, r3);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1967j.f8934L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int r2) {
        this.f1967j.f8928F0 = r2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1967j.f8935M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int r2) {
        this.f1967j.f8929G0 = r2;
        requestLayout();
    }

    public void setHorizontalAlign(int r2) {
        this.f1967j.f8940R0 = r2;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1967j.f8932J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int r2) {
        this.f1967j.f8938P0 = r2;
        requestLayout();
    }

    public void setHorizontalStyle(int r2) {
        this.f1967j.f8926D0 = r2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f1967j.f8936N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int r2) {
        this.f1967j.f8930H0 = r2;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f1967j.f8937O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int r2) {
        this.f1967j.f8931I0 = r2;
        requestLayout();
    }

    public void setMaxElementsWrap(int r2) {
        this.f1967j.f8943U0 = r2;
        requestLayout();
    }

    public void setOrientation(int r2) {
        this.f1967j.f8944V0 = r2;
        requestLayout();
    }

    public void setPadding(int r2) {
        C2726g c2726g = this.f1967j;
        c2726g.f8951s0 = r2;
        c2726g.f8952t0 = r2;
        c2726g.f8953u0 = r2;
        c2726g.f8954v0 = r2;
        requestLayout();
    }

    public void setPaddingBottom(int r2) {
        this.f1967j.f8952t0 = r2;
        requestLayout();
    }

    public void setPaddingLeft(int r2) {
        this.f1967j.f8955w0 = r2;
        requestLayout();
    }

    public void setPaddingRight(int r2) {
        this.f1967j.f8956x0 = r2;
        requestLayout();
    }

    public void setPaddingTop(int r2) {
        this.f1967j.f8951s0 = r2;
        requestLayout();
    }

    public void setVerticalAlign(int r2) {
        this.f1967j.f8941S0 = r2;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1967j.f8933K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int r2) {
        this.f1967j.f8939Q0 = r2;
        requestLayout();
    }

    public void setVerticalStyle(int r2) {
        this.f1967j.f8927E0 = r2;
        requestLayout();
    }

    public void setWrapMode(int r2) {
        this.f1967j.f8942T0 = r2;
        requestLayout();
    }
}
