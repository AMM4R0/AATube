package p065Y0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p022I.AbstractC0202k;
import p028K.AbstractC0283P;
import p032L0.AbstractC0367a;
import p062X.C0539a;
import p072b1.C0721a;
import p103k0.AbstractC2480a;

/* renamed from: Y0.b */
/* loaded from: classes.dex */
public final class C0547b {

    /* renamed from: A */
    public CharSequence f1477A;

    /* renamed from: B */
    public CharSequence f1478B;

    /* renamed from: C */
    public boolean f1479C;

    /* renamed from: E */
    public Bitmap f1481E;

    /* renamed from: F */
    public float f1482F;

    /* renamed from: G */
    public float f1483G;

    /* renamed from: H */
    public float f1484H;

    /* renamed from: I */
    public float f1485I;

    /* renamed from: J */
    public float f1486J;

    /* renamed from: K */
    public int f1487K;

    /* renamed from: L */
    public int[] f1488L;

    /* renamed from: M */
    public boolean f1489M;

    /* renamed from: N */
    public final TextPaint f1490N;

    /* renamed from: O */
    public final TextPaint f1491O;

    /* renamed from: P */
    public LinearInterpolator f1492P;

    /* renamed from: Q */
    public LinearInterpolator f1493Q;

    /* renamed from: R */
    public float f1494R;

    /* renamed from: S */
    public float f1495S;

    /* renamed from: T */
    public float f1496T;

    /* renamed from: U */
    public ColorStateList f1497U;

    /* renamed from: V */
    public float f1498V;

    /* renamed from: W */
    public float f1499W;

    /* renamed from: X */
    public float f1500X;

    /* renamed from: Y */
    public StaticLayout f1501Y;

    /* renamed from: Z */
    public float f1502Z;

    /* renamed from: a */
    public final TextInputLayout f1503a;

    /* renamed from: a0 */
    public float f1504a0;

    /* renamed from: b */
    public float f1505b;

    /* renamed from: b0 */
    public float f1506b0;

    /* renamed from: c */
    public final Rect f1507c;

    /* renamed from: c0 */
    public CharSequence f1508c0;

    /* renamed from: d */
    public final Rect f1509d;

    /* renamed from: e */
    public final RectF f1511e;

    /* renamed from: j */
    public ColorStateList f1518j;

    /* renamed from: k */
    public ColorStateList f1519k;

    /* renamed from: l */
    public float f1520l;

    /* renamed from: m */
    public float f1521m;

    /* renamed from: n */
    public float f1522n;

    /* renamed from: o */
    public float f1523o;

    /* renamed from: p */
    public float f1524p;

    /* renamed from: q */
    public float f1525q;

    /* renamed from: r */
    public Typeface f1526r;

    /* renamed from: s */
    public Typeface f1527s;

    /* renamed from: t */
    public Typeface f1528t;

    /* renamed from: u */
    public Typeface f1529u;

    /* renamed from: v */
    public Typeface f1530v;

    /* renamed from: w */
    public Typeface f1531w;

    /* renamed from: x */
    public Typeface f1532x;

    /* renamed from: y */
    public C0721a f1533y;

    /* renamed from: f */
    public int f1513f = 16;

    /* renamed from: g */
    public int f1515g = 16;

    /* renamed from: h */
    public float f1516h = 15.0f;

    /* renamed from: i */
    public float f1517i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f1534z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f1480D = true;

    /* renamed from: d0 */
    public final int f1510d0 = 1;

    /* renamed from: e0 */
    public final float f1512e0 = 1.0f;

    /* renamed from: f0 */
    public final int f1514f0 = 1;

    public C0547b(TextInputLayout textInputLayout) {
        this.f1503a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f1490N = textPaint;
        this.f1491O = new TextPaint(textPaint);
        this.f1509d = new Rect();
        this.f1507c = new Rect();
        this.f1511e = new RectF();
        m1397g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m1391a(int r5, int r6, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(r6) * f) + (Color.alpha(r5) * f2)), Math.round((Color.red(r6) * f) + (Color.red(r5) * f2)), Math.round((Color.green(r6) * f) + (Color.green(r5) * f2)), Math.round((Color.blue(r6) * f) + (Color.blue(r5) * f2)));
    }

    /* renamed from: f */
    public static float m1392f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0367a.m1035a(f, f2, f3);
    }

    /* renamed from: b */
    public final boolean m1393b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean z2 = this.f1503a.getLayoutDirection() == 1;
        if (this.f1480D) {
            return (z2 ? AbstractC0202k.f607d : AbstractC0202k.f606c).m593b(charSequence, charSequence.length());
        }
        return z2;
    }

    /* renamed from: c */
    public final void m1394c(float f, boolean z2) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f1477A == null) {
            return;
        }
        float width = this.f1509d.width();
        float width2 = this.f1507c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f1517i;
            f3 = this.f1498V;
            this.f1482F = 1.0f;
            typeface = this.f1526r;
        } else {
            float f4 = this.f1516h;
            float f5 = this.f1499W;
            Typeface typeface2 = this.f1529u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f1482F = 1.0f;
            } else {
                this.f1482F = m1392f(this.f1516h, this.f1517i, f, this.f1493Q) / this.f1516h;
            }
            float f6 = this.f1517i / this.f1516h;
            width = (z2 || width2 * f6 <= width) ? width2 : Math.min(width / f6, width2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f1490N;
        if (width > 0.0f) {
            boolean z4 = this.f1483G != f2;
            boolean z5 = this.f1500X != f3;
            boolean z6 = this.f1532x != typeface;
            StaticLayout staticLayout = this.f1501Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f1489M;
            this.f1483G = f2;
            this.f1500X = f3;
            this.f1532x = typeface;
            this.f1489M = false;
            textPaint.setLinearText(this.f1482F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f1478B == null || z3) {
            textPaint.setTextSize(this.f1483G);
            textPaint.setTypeface(this.f1532x);
            textPaint.setLetterSpacing(this.f1500X);
            boolean m1393b = m1393b(this.f1477A);
            this.f1479C = m1393b;
            int r14 = this.f1510d0;
            if (r14 <= 1 || m1393b) {
                r14 = 1;
            }
            if (r14 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f1513f, m1393b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f1479C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f1479C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C0552g c0552g = new C0552g(this.f1477A, textPaint, (int) width);
            c0552g.f1553k = this.f1534z;
            c0552g.f1552j = m1393b;
            c0552g.f1547e = alignment;
            c0552g.f1551i = false;
            c0552g.f1548f = r14;
            c0552g.f1549g = this.f1512e0;
            c0552g.f1550h = this.f1514f0;
            StaticLayout m1405a = c0552g.m1405a();
            m1405a.getClass();
            this.f1501Y = m1405a;
            this.f1478B = m1405a.getText();
        }
    }

    /* renamed from: d */
    public final float m1395d() {
        TextPaint textPaint = this.f1491O;
        textPaint.setTextSize(this.f1517i);
        textPaint.setTypeface(this.f1526r);
        textPaint.setLetterSpacing(this.f1498V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m1396e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] r12 = this.f1488L;
        return r12 != null ? colorStateList.getColorForState(r12, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m1397g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f1528t;
            if (typeface != null) {
                this.f1527s = AbstractC2480a.m4867H(configuration, typeface);
            }
            Typeface typeface2 = this.f1531w;
            if (typeface2 != null) {
                this.f1530v = AbstractC2480a.m4867H(configuration, typeface2);
            }
            Typeface typeface3 = this.f1527s;
            if (typeface3 == null) {
                typeface3 = this.f1528t;
            }
            this.f1526r = typeface3;
            Typeface typeface4 = this.f1530v;
            if (typeface4 == null) {
                typeface4 = this.f1531w;
            }
            this.f1529u = typeface4;
            m1398h(true);
        }
    }

    /* renamed from: h */
    public final void m1398h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f1503a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        m1394c(1.0f, z2);
        CharSequence charSequence = this.f1478B;
        TextPaint textPaint = this.f1490N;
        if (charSequence != null && (staticLayout = this.f1501Y) != null) {
            this.f1508c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f1534z);
        }
        CharSequence charSequence2 = this.f1508c0;
        if (charSequence2 != null) {
            this.f1502Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f1502Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f1515g, this.f1479C ? 1 : 0);
        int r8 = absoluteGravity & 112;
        Rect rect = this.f1509d;
        if (r8 == 48) {
            this.f1521m = rect.top;
        } else if (r8 != 80) {
            this.f1521m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f1521m = textPaint.ascent() + rect.bottom;
        }
        int r4 = absoluteGravity & 8388615;
        if (r4 == 1) {
            this.f1523o = rect.centerX() - (this.f1502Z / 2.0f);
        } else if (r4 != 5) {
            this.f1523o = rect.left;
        } else {
            this.f1523o = rect.right - this.f1502Z;
        }
        m1394c(0.0f, z2);
        float height = this.f1501Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f1501Y;
        if (staticLayout2 == null || this.f1510d0 <= 1) {
            CharSequence charSequence3 = this.f1478B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f1501Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1513f, this.f1479C ? 1 : 0);
        int r15 = absoluteGravity2 & 112;
        Rect rect2 = this.f1507c;
        if (r15 == 48) {
            this.f1520l = rect2.top;
        } else if (r15 != 80) {
            this.f1520l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f1520l = textPaint.descent() + (rect2.bottom - height);
        }
        int r12 = absoluteGravity2 & 8388615;
        if (r12 == 1) {
            this.f1522n = rect2.centerX() - (measureText / 2.0f);
        } else if (r12 != 5) {
            this.f1522n = rect2.left;
        } else {
            this.f1522n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f1481E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f1481E = null;
        }
        m1402l(this.f1505b);
        float f = this.f1505b;
        float m1392f = m1392f(rect2.left, rect.left, f, this.f1492P);
        RectF rectF = this.f1511e;
        rectF.left = m1392f;
        rectF.top = m1392f(this.f1520l, this.f1521m, f, this.f1492P);
        rectF.right = m1392f(rect2.right, rect.right, f, this.f1492P);
        rectF.bottom = m1392f(rect2.bottom, rect.bottom, f, this.f1492P);
        this.f1524p = m1392f(this.f1522n, this.f1523o, f, this.f1492P);
        this.f1525q = m1392f(this.f1520l, this.f1521m, f, this.f1492P);
        m1402l(f);
        C0539a c0539a = AbstractC0367a.f1002b;
        this.f1504a0 = 1.0f - m1392f(0.0f, 1.0f, 1.0f - f, c0539a);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        textInputLayout.postInvalidateOnAnimation();
        this.f1506b0 = m1392f(1.0f, 0.0f, f, c0539a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f1519k;
        ColorStateList colorStateList2 = this.f1518j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m1391a(m1396e(colorStateList2), m1396e(this.f1519k), f));
        } else {
            textPaint.setColor(m1396e(colorStateList));
        }
        float f2 = this.f1498V;
        float f3 = this.f1499W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m1392f(f3, f2, f, c0539a));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f1484H = AbstractC0367a.m1035a(0.0f, this.f1494R, f);
        this.f1485I = AbstractC0367a.m1035a(0.0f, this.f1495S, f);
        this.f1486J = AbstractC0367a.m1035a(0.0f, this.f1496T, f);
        int m1391a = m1391a(0, m1396e(this.f1497U), f);
        this.f1487K = m1391a;
        textPaint.setShadowLayer(this.f1484H, this.f1485I, this.f1486J, m1391a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    public final void m1399i(ColorStateList colorStateList) {
        if (this.f1519k == colorStateList && this.f1518j == colorStateList) {
            return;
        }
        this.f1519k = colorStateList;
        this.f1518j = colorStateList;
        m1398h(false);
    }

    /* renamed from: j */
    public final boolean m1400j(Typeface typeface) {
        C0721a c0721a = this.f1533y;
        if (c0721a != null) {
            c0721a.f2592g = true;
        }
        if (this.f1528t == typeface) {
            return false;
        }
        this.f1528t = typeface;
        Typeface m4867H = AbstractC2480a.m4867H(this.f1503a.getContext().getResources().getConfiguration(), typeface);
        this.f1527s = m4867H;
        if (m4867H == null) {
            m4867H = this.f1528t;
        }
        this.f1526r = m4867H;
        return true;
    }

    /* renamed from: k */
    public final void m1401k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f1505b) {
            this.f1505b = f;
            float f2 = this.f1507c.left;
            Rect rect = this.f1509d;
            float m1392f = m1392f(f2, rect.left, f, this.f1492P);
            RectF rectF = this.f1511e;
            rectF.left = m1392f;
            rectF.top = m1392f(this.f1520l, this.f1521m, f, this.f1492P);
            rectF.right = m1392f(r1.right, rect.right, f, this.f1492P);
            rectF.bottom = m1392f(r1.bottom, rect.bottom, f, this.f1492P);
            this.f1524p = m1392f(this.f1522n, this.f1523o, f, this.f1492P);
            this.f1525q = m1392f(this.f1520l, this.f1521m, f, this.f1492P);
            m1402l(f);
            C0539a c0539a = AbstractC0367a.f1002b;
            this.f1504a0 = 1.0f - m1392f(0.0f, 1.0f, 1.0f - f, c0539a);
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            TextInputLayout textInputLayout = this.f1503a;
            textInputLayout.postInvalidateOnAnimation();
            this.f1506b0 = m1392f(1.0f, 0.0f, f, c0539a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f1519k;
            ColorStateList colorStateList2 = this.f1518j;
            TextPaint textPaint = this.f1490N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m1391a(m1396e(colorStateList2), m1396e(this.f1519k), f));
            } else {
                textPaint.setColor(m1396e(colorStateList));
            }
            float f3 = this.f1498V;
            float f4 = this.f1499W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m1392f(f4, f3, f, c0539a));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f1484H = AbstractC0367a.m1035a(0.0f, this.f1494R, f);
            this.f1485I = AbstractC0367a.m1035a(0.0f, this.f1495S, f);
            this.f1486J = AbstractC0367a.m1035a(0.0f, this.f1496T, f);
            int m1391a = m1391a(0, m1396e(this.f1497U), f);
            this.f1487K = m1391a;
            textPaint.setShadowLayer(this.f1484H, this.f1485I, this.f1486J, m1391a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m1402l(float f) {
        m1394c(f, false);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        this.f1503a.postInvalidateOnAnimation();
    }

    /* renamed from: m */
    public final void m1403m(Typeface typeface) {
        boolean z2;
        boolean m1400j = m1400j(typeface);
        if (this.f1531w != typeface) {
            this.f1531w = typeface;
            Typeface m4867H = AbstractC2480a.m4867H(this.f1503a.getContext().getResources().getConfiguration(), typeface);
            this.f1530v = m4867H;
            if (m4867H == null) {
                m4867H = this.f1531w;
            }
            this.f1529u = m4867H;
            z2 = true;
        } else {
            z2 = false;
        }
        if (m1400j || z2) {
            m1398h(false);
        }
    }
}
