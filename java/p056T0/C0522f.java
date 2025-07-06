package p056T0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import p009D.AbstractC0095a;
import p009D.AbstractC0096b;
import p009D.InterfaceC0101g;
import p032L0.C0368b;
import p065Y0.C0554i;
import p065Y0.InterfaceC0553h;
import p072b1.C0724d;
import p074c1.AbstractC0739a;
import p081e1.C0875a;
import p081e1.C0880f;
import p081e1.C0881g;
import p081e1.C0884j;

/* renamed from: T0.f */
/* loaded from: classes.dex */
public final class C0522f extends C0881g implements Drawable.Callback, InterfaceC0553h {

    /* renamed from: F0 */
    public static final int[] f1373F0 = {R.attr.state_enabled};

    /* renamed from: G0 */
    public static final ShapeDrawable f1374G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public float f1375A;

    /* renamed from: A0 */
    public WeakReference f1376A0;

    /* renamed from: B */
    public ColorStateList f1377B;

    /* renamed from: B0 */
    public TextUtils.TruncateAt f1378B0;

    /* renamed from: C */
    public float f1379C;

    /* renamed from: C0 */
    public boolean f1380C0;

    /* renamed from: D */
    public ColorStateList f1381D;

    /* renamed from: D0 */
    public int f1382D0;

    /* renamed from: E */
    public CharSequence f1383E;

    /* renamed from: E0 */
    public boolean f1384E0;

    /* renamed from: F */
    public boolean f1385F;

    /* renamed from: G */
    public Drawable f1386G;

    /* renamed from: H */
    public ColorStateList f1387H;

    /* renamed from: I */
    public float f1388I;

    /* renamed from: J */
    public boolean f1389J;

    /* renamed from: K */
    public boolean f1390K;

    /* renamed from: L */
    public Drawable f1391L;

    /* renamed from: M */
    public RippleDrawable f1392M;

    /* renamed from: N */
    public ColorStateList f1393N;

    /* renamed from: O */
    public float f1394O;

    /* renamed from: P */
    public SpannableStringBuilder f1395P;

    /* renamed from: Q */
    public boolean f1396Q;

    /* renamed from: R */
    public boolean f1397R;

    /* renamed from: S */
    public Drawable f1398S;

    /* renamed from: T */
    public ColorStateList f1399T;

    /* renamed from: U */
    public C0368b f1400U;

    /* renamed from: V */
    public C0368b f1401V;

    /* renamed from: W */
    public float f1402W;

    /* renamed from: X */
    public float f1403X;

    /* renamed from: Y */
    public float f1404Y;

    /* renamed from: Z */
    public float f1405Z;

    /* renamed from: a0 */
    public float f1406a0;

    /* renamed from: b0 */
    public float f1407b0;

    /* renamed from: c0 */
    public float f1408c0;

    /* renamed from: d0 */
    public float f1409d0;

    /* renamed from: e0 */
    public final Context f1410e0;

    /* renamed from: f0 */
    public final Paint f1411f0;

    /* renamed from: g0 */
    public final Paint.FontMetrics f1412g0;

    /* renamed from: h0 */
    public final RectF f1413h0;

    /* renamed from: i0 */
    public final PointF f1414i0;

    /* renamed from: j0 */
    public final Path f1415j0;

    /* renamed from: k0 */
    public final C0554i f1416k0;

    /* renamed from: l0 */
    public int f1417l0;

    /* renamed from: m0 */
    public int f1418m0;

    /* renamed from: n0 */
    public int f1419n0;

    /* renamed from: o0 */
    public int f1420o0;

    /* renamed from: p0 */
    public int f1421p0;

    /* renamed from: q0 */
    public int f1422q0;

    /* renamed from: r0 */
    public boolean f1423r0;

    /* renamed from: s0 */
    public int f1424s0;

    /* renamed from: t0 */
    public int f1425t0;

    /* renamed from: u0 */
    public ColorFilter f1426u0;

    /* renamed from: v0 */
    public PorterDuffColorFilter f1427v0;

    /* renamed from: w0 */
    public ColorStateList f1428w0;

    /* renamed from: x */
    public ColorStateList f1429x;

    /* renamed from: x0 */
    public PorterDuff.Mode f1430x0;

    /* renamed from: y */
    public ColorStateList f1431y;

    /* renamed from: y0 */
    public int[] f1432y0;

    /* renamed from: z */
    public float f1433z;

    /* renamed from: z0 */
    public ColorStateList f1434z0;

    public C0522f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1375A = -1.0f;
        this.f1411f0 = new Paint(1);
        this.f1412g0 = new Paint.FontMetrics();
        this.f1413h0 = new RectF();
        this.f1414i0 = new PointF();
        this.f1415j0 = new Path();
        this.f1425t0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f1430x0 = PorterDuff.Mode.SRC_IN;
        this.f1376A0 = new WeakReference(null);
        m2405h(context);
        this.f1410e0 = context;
        C0554i c0554i = new C0554i(this);
        this.f1416k0 = c0554i;
        this.f1383E = "";
        c0554i.f1554a.density = context.getResources().getDisplayMetrics().density;
        int[] r3 = f1373F0;
        setState(r3);
        if (!Arrays.equals(this.f1432y0, r3)) {
            this.f1432y0 = r3;
            if (m1374T()) {
                m1381v(getState(), r3);
            }
        }
        this.f1380C0 = true;
        int[] r32 = AbstractC0739a.f2656a;
        f1374G0.setTint(-1);
    }

    /* renamed from: U */
    public static void m1352U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: s */
    public static boolean m1353s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t */
    public static boolean m1354t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m1355A(float f) {
        if (this.f1375A != f) {
            this.f1375A = f;
            C0884j m2417e = this.f3659a.f3642a.m2417e();
            m2417e.f3686e = new C0875a(f);
            m2417e.f3687f = new C0875a(f);
            m2417e.f3688g = new C0875a(f);
            m2417e.f3689h = new C0875a(f);
            setShapeAppearanceModel(m2417e.m2412a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m1356B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1386G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0101g;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m1377p = m1377p();
            this.f1386G = drawable != null ? drawable.mutate() : null;
            float m1377p2 = m1377p();
            m1352U(drawable2);
            if (m1373S()) {
                m1375n(this.f1386G);
            }
            invalidateSelf();
            if (m1377p != m1377p2) {
                m1380u();
            }
        }
    }

    /* renamed from: C */
    public final void m1357C(float f) {
        if (this.f1388I != f) {
            float m1377p = m1377p();
            this.f1388I = f;
            float m1377p2 = m1377p();
            invalidateSelf();
            if (m1377p != m1377p2) {
                m1380u();
            }
        }
    }

    /* renamed from: D */
    public final void m1358D(ColorStateList colorStateList) {
        this.f1389J = true;
        if (this.f1387H != colorStateList) {
            this.f1387H = colorStateList;
            if (m1373S()) {
                AbstractC0095a.m319h(this.f1386G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: E */
    public final void m1359E(boolean z2) {
        if (this.f1385F != z2) {
            boolean m1373S = m1373S();
            this.f1385F = z2;
            boolean m1373S2 = m1373S();
            if (m1373S != m1373S2) {
                if (m1373S2) {
                    m1375n(this.f1386G);
                } else {
                    m1352U(this.f1386G);
                }
                invalidateSelf();
                m1380u();
            }
        }
    }

    /* renamed from: F */
    public final void m1360F(ColorStateList colorStateList) {
        if (this.f1377B != colorStateList) {
            this.f1377B = colorStateList;
            if (this.f1384E0) {
                C0880f c0880f = this.f3659a;
                if (c0880f.f3645d != colorStateList) {
                    c0880f.f3645d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public final void m1361G(float f) {
        if (this.f1379C != f) {
            this.f1379C = f;
            this.f1411f0.setStrokeWidth(f);
            if (this.f1384E0) {
                this.f3659a.f3651j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1362H(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f1391L
            if (r1 == 0) goto Lb
            boolean r2 = r1 instanceof p009D.InterfaceC0101g
            if (r2 == 0) goto Lc
            D.g r1 = (p009D.InterfaceC0101g) r1
        Lb:
            r1 = r0
        Lc:
            if (r1 == r6) goto L49
            float r2 = r5.m1378q()
            if (r6 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L18:
            r5.f1391L = r0
            int[] r6 = p074c1.AbstractC0739a.f2656a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f1381D
            android.content.res.ColorStateList r0 = p074c1.AbstractC0739a.m2017a(r0)
            android.graphics.drawable.Drawable r3 = r5.f1391L
            android.graphics.drawable.ShapeDrawable r4 = p056T0.C0522f.f1374G0
            r6.<init>(r0, r3, r4)
            r5.f1392M = r6
            float r6 = r5.m1378q()
            m1352U(r1)
            boolean r0 = r5.m1374T()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r5.f1391L
            r5.m1375n(r0)
        L3f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L49
            r5.m1380u()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p056T0.C0522f.m1362H(android.graphics.drawable.Drawable):void");
    }

    /* renamed from: I */
    public final void m1363I(float f) {
        if (this.f1408c0 != f) {
            this.f1408c0 = f;
            invalidateSelf();
            if (m1374T()) {
                m1380u();
            }
        }
    }

    /* renamed from: J */
    public final void m1364J(float f) {
        if (this.f1394O != f) {
            this.f1394O = f;
            invalidateSelf();
            if (m1374T()) {
                m1380u();
            }
        }
    }

    /* renamed from: K */
    public final void m1365K(float f) {
        if (this.f1407b0 != f) {
            this.f1407b0 = f;
            invalidateSelf();
            if (m1374T()) {
                m1380u();
            }
        }
    }

    /* renamed from: L */
    public final void m1366L(ColorStateList colorStateList) {
        if (this.f1393N != colorStateList) {
            this.f1393N = colorStateList;
            if (m1374T()) {
                AbstractC0095a.m319h(this.f1391L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public final void m1367M(boolean z2) {
        if (this.f1390K != z2) {
            boolean m1374T = m1374T();
            this.f1390K = z2;
            boolean m1374T2 = m1374T();
            if (m1374T != m1374T2) {
                if (m1374T2) {
                    m1375n(this.f1391L);
                } else {
                    m1352U(this.f1391L);
                }
                invalidateSelf();
                m1380u();
            }
        }
    }

    /* renamed from: N */
    public final void m1368N(float f) {
        if (this.f1404Y != f) {
            float m1377p = m1377p();
            this.f1404Y = f;
            float m1377p2 = m1377p();
            invalidateSelf();
            if (m1377p != m1377p2) {
                m1380u();
            }
        }
    }

    /* renamed from: O */
    public final void m1369O(float f) {
        if (this.f1403X != f) {
            float m1377p = m1377p();
            this.f1403X = f;
            float m1377p2 = m1377p();
            invalidateSelf();
            if (m1377p != m1377p2) {
                m1380u();
            }
        }
    }

    /* renamed from: P */
    public final void m1370P(ColorStateList colorStateList) {
        if (this.f1381D != colorStateList) {
            this.f1381D = colorStateList;
            this.f1434z0 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: Q */
    public final void m1371Q(C0724d c0724d) {
        C0554i c0554i = this.f1416k0;
        if (c0554i.f1559f != c0724d) {
            c0554i.f1559f = c0724d;
            if (c0724d != null) {
                TextPaint textPaint = c0554i.f1554a;
                Context context = this.f1410e0;
                C0518b c0518b = c0554i.f1555b;
                c0724d.m1984f(context, textPaint, c0518b);
                InterfaceC0553h interfaceC0553h = (InterfaceC0553h) c0554i.f1558e.get();
                if (interfaceC0553h != null) {
                    textPaint.drawableState = interfaceC0553h.getState();
                }
                c0724d.m1983e(context, textPaint, c0518b);
                c0554i.f1557d = true;
            }
            InterfaceC0553h interfaceC0553h2 = (InterfaceC0553h) c0554i.f1558e.get();
            if (interfaceC0553h2 != null) {
                C0522f c0522f = (C0522f) interfaceC0553h2;
                c0522f.m1380u();
                c0522f.invalidateSelf();
                c0522f.onStateChange(interfaceC0553h2.getState());
            }
        }
    }

    /* renamed from: R */
    public final boolean m1372R() {
        return this.f1397R && this.f1398S != null && this.f1423r0;
    }

    /* renamed from: S */
    public final boolean m1373S() {
        return this.f1385F && this.f1386G != null;
    }

    /* renamed from: T */
    public final boolean m1374T() {
        return this.f1390K && this.f1391L != null;
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int r5;
        RectF rectF;
        int r3;
        int r52;
        int r02;
        RectF rectF2;
        int r2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (r5 = this.f1425t0) == 0) {
            return;
        }
        int saveLayerAlpha = r5 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, r5) : 0;
        boolean z2 = this.f1384E0;
        Paint paint = this.f1411f0;
        RectF rectF3 = this.f1413h0;
        if (!z2) {
            paint.setColor(this.f1417l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m1379r(), m1379r(), paint);
        }
        if (!this.f1384E0) {
            paint.setColor(this.f1418m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f1426u0;
            if (colorFilter == null) {
                colorFilter = this.f1427v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m1379r(), m1379r(), paint);
        }
        if (this.f1384E0) {
            super.draw(canvas);
        }
        if (this.f1379C > 0.0f && !this.f1384E0) {
            paint.setColor(this.f1420o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f1384E0) {
                ColorFilter colorFilter2 = this.f1426u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f1427v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f1379C / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f1375A - (this.f1379C / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.f1421p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f1384E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f1415j0;
            C0880f c0880f = this.f3659a;
            this.f3676r.m2418a(c0880f.f3642a, c0880f.f3650i, rectF4, this.f3675q, path);
            m2401d(canvas, paint, path, this.f3659a.f3642a, m2403f());
        } else {
            canvas.drawRoundRect(rectF3, m1379r(), m1379r(), paint);
        }
        if (m1373S()) {
            m1376o(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.f1386G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f1386G.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (m1372R()) {
            m1376o(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f1398S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f1398S.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.f1380C0 || this.f1383E == null) {
            rectF = rectF3;
            r3 = saveLayerAlpha;
            r52 = 0;
            r02 = 255;
        } else {
            PointF pointF = this.f1414i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f1383E;
            C0554i c0554i = this.f1416k0;
            if (charSequence != null) {
                float m1377p = m1377p() + this.f1402W + this.f1405Z;
                if (AbstractC0096b.m321a(this) == 0) {
                    pointF.x = bounds.left + m1377p;
                } else {
                    pointF.x = bounds.right - m1377p;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = c0554i.f1554a;
                Paint.FontMetrics fontMetrics = this.f1412g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f1383E != null) {
                float m1377p2 = m1377p() + this.f1402W + this.f1405Z;
                float m1378q = m1378q() + this.f1409d0 + this.f1406a0;
                if (AbstractC0096b.m321a(this) == 0) {
                    rectF3.left = bounds.left + m1377p2;
                    rectF3.right = bounds.right - m1378q;
                } else {
                    rectF3.left = bounds.left + m1378q;
                    rectF3.right = bounds.right - m1377p2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C0724d c0724d = c0554i.f1559f;
            TextPaint textPaint2 = c0554i.f1554a;
            if (c0724d != null) {
                textPaint2.drawableState = getState();
                c0554i.f1559f.m1983e(this.f1410e0, textPaint2, c0554i.f1555b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(c0554i.m1406a(this.f1383E.toString())) > Math.round(rectF3.width());
            if (z3) {
                r2 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                r2 = 0;
            }
            CharSequence charSequence2 = this.f1383E;
            if (z3 && this.f1378B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f1378B0);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f8 = pointF.x;
            float f9 = pointF.y;
            rectF = rectF3;
            r3 = saveLayerAlpha;
            r52 = 0;
            r02 = 255;
            canvas.drawText(charSequence3, 0, length, f8, f9, textPaint2);
            if (z3) {
                canvas.restoreToCount(r2);
            }
        }
        if (m1374T()) {
            rectF.setEmpty();
            if (m1374T()) {
                float f10 = this.f1409d0 + this.f1408c0;
                if (AbstractC0096b.m321a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.f1394O;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.f1394O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.f1394O;
                float f14 = exactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.f1391L.setBounds(r52, r52, (int) rectF2.width(), (int) rectF2.height());
            int[] r4 = AbstractC0739a.f2656a;
            this.f1392M.setBounds(this.f1391L.getBounds());
            this.f1392M.jumpToCurrentState();
            this.f1392M.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.f1425t0 < r02) {
            canvas.restoreToCount(r3);
        }
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1425t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f1426u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f1433z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m1378q() + this.f1416k0.m1406a(this.f1383E.toString()) + m1377p() + this.f1402W + this.f1405Z + this.f1406a0 + this.f1409d0), this.f1382D0);
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f1384E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f1433z, this.f1375A);
        } else {
            outline.setRoundRect(bounds, this.f1375A);
        }
        outline.setAlpha(this.f1425t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C0724d c0724d;
        ColorStateList colorStateList;
        return m1353s(this.f1429x) || m1353s(this.f1431y) || m1353s(this.f1377B) || !((c0724d = this.f1416k0.f1559f) == null || (colorStateList = c0724d.f2608j) == null || !colorStateList.isStateful()) || ((this.f1397R && this.f1398S != null && this.f1396Q) || m1354t(this.f1386G) || m1354t(this.f1398S) || m1353s(this.f1428w0));
    }

    /* renamed from: n */
    public final void m1375n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0096b.m322b(drawable, AbstractC0096b.m321a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f1391L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f1432y0);
            }
            AbstractC0095a.m319h(drawable, this.f1393N);
            return;
        }
        Drawable drawable2 = this.f1386G;
        if (drawable == drawable2 && this.f1389J) {
            AbstractC0095a.m319h(drawable2, this.f1387H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: o */
    public final void m1376o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m1373S() || m1372R()) {
            float f = this.f1402W + this.f1403X;
            Drawable drawable = this.f1423r0 ? this.f1398S : this.f1386G;
            float f2 = this.f1388I;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (AbstractC0096b.m321a(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.f1423r0 ? this.f1398S : this.f1386G;
            float f5 = this.f1388I;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f1410e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(r3);
        if (m1373S()) {
            onLayoutDirectionChanged |= AbstractC0096b.m322b(this.f1386G, r3);
        }
        if (m1372R()) {
            onLayoutDirectionChanged |= AbstractC0096b.m322b(this.f1398S, r3);
        }
        if (m1374T()) {
            onLayoutDirectionChanged |= AbstractC0096b.m322b(this.f1391L, r3);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
        boolean onLevelChange = super.onLevelChange(r3);
        if (m1373S()) {
            onLevelChange |= this.f1386G.setLevel(r3);
        }
        if (m1372R()) {
            onLevelChange |= this.f1398S.setLevel(r3);
        }
        if (m1374T()) {
            onLevelChange |= this.f1391L.setLevel(r3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        if (this.f1384E0) {
            super.onStateChange(r2);
        }
        return m1381v(r2, this.f1432y0);
    }

    /* renamed from: p */
    public final float m1377p() {
        if (!m1373S() && !m1372R()) {
            return 0.0f;
        }
        float f = this.f1403X;
        Drawable drawable = this.f1423r0 ? this.f1398S : this.f1386G;
        float f2 = this.f1388I;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f1404Y;
    }

    /* renamed from: q */
    public final float m1378q() {
        if (m1374T()) {
            return this.f1407b0 + this.f1394O + this.f1408c0;
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final float m1379r() {
        return this.f1384E0 ? this.f3659a.f3642a.f3698e.mo2392a(m2403f()) : this.f1375A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        if (this.f1425t0 != r2) {
            this.f1425t0 = r2;
            invalidateSelf();
        }
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f1426u0 != colorFilter) {
            this.f1426u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f1428w0 != colorStateList) {
            this.f1428w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f1430x0 != mode) {
            this.f1430x0 = mode;
            ColorStateList colorStateList = this.f1428w0;
            this.f1427v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m1373S()) {
            visible |= this.f1386G.setVisible(z2, z3);
        }
        if (m1372R()) {
            visible |= this.f1398S.setVisible(z2, z3);
        }
        if (m1374T()) {
            visible |= this.f1391L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: u */
    public final void m1380u() {
        InterfaceC0521e interfaceC0521e = (InterfaceC0521e) this.f1376A0.get();
        if (interfaceC0521e != null) {
            Chip chip = (Chip) interfaceC0521e;
            chip.m2095b(chip.f2849p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1381v(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p056T0.C0522f.m1381v(int[], int[]):boolean");
    }

    /* renamed from: w */
    public final void m1382w(boolean z2) {
        if (this.f1396Q != z2) {
            this.f1396Q = z2;
            float m1377p = m1377p();
            if (!z2 && this.f1423r0) {
                this.f1423r0 = false;
            }
            float m1377p2 = m1377p();
            invalidateSelf();
            if (m1377p != m1377p2) {
                m1380u();
            }
        }
    }

    /* renamed from: x */
    public final void m1383x(Drawable drawable) {
        if (this.f1398S != drawable) {
            float m1377p = m1377p();
            this.f1398S = drawable;
            float m1377p2 = m1377p();
            m1352U(this.f1398S);
            m1375n(this.f1398S);
            invalidateSelf();
            if (m1377p != m1377p2) {
                m1380u();
            }
        }
    }

    /* renamed from: y */
    public final void m1384y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1399T != colorStateList) {
            this.f1399T = colorStateList;
            if (this.f1397R && (drawable = this.f1398S) != null && this.f1396Q) {
                AbstractC0095a.m319h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public final void m1385z(boolean z2) {
        if (this.f1397R != z2) {
            boolean m1372R = m1372R();
            this.f1397R = z2;
            boolean m1372R2 = m1372R();
            if (m1372R != m1372R2) {
                if (m1372R2) {
                    m1375n(this.f1398S);
                } else {
                    m1352U(this.f1398S);
                }
                invalidateSelf();
                m1380u();
            }
        }
    }
}
