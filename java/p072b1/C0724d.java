package p072b1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p003B.AbstractC0043q;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0387m;
import p103k0.AbstractC2480a;

/* renamed from: b1.d */
/* loaded from: classes.dex */
public final class C0724d {

    /* renamed from: a */
    public final ColorStateList f2599a;

    /* renamed from: b */
    public final String f2600b;

    /* renamed from: c */
    public final int f2601c;

    /* renamed from: d */
    public final int f2602d;

    /* renamed from: e */
    public final float f2603e;

    /* renamed from: f */
    public final float f2604f;

    /* renamed from: g */
    public final float f2605g;

    /* renamed from: h */
    public final boolean f2606h;

    /* renamed from: i */
    public final float f2607i;

    /* renamed from: j */
    public final ColorStateList f2608j;

    /* renamed from: k */
    public float f2609k;

    /* renamed from: l */
    public final int f2610l;

    /* renamed from: m */
    public boolean f2611m = false;

    /* renamed from: n */
    public Typeface f2612n;

    public C0724d(Context context, int r7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r7, AbstractC0345a.f973y);
        this.f2609k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2608j = AbstractC0387m.m1121s(context, obtainStyledAttributes, 3);
        AbstractC0387m.m1121s(context, obtainStyledAttributes, 4);
        AbstractC0387m.m1121s(context, obtainStyledAttributes, 5);
        this.f2601c = obtainStyledAttributes.getInt(2, 0);
        this.f2602d = obtainStyledAttributes.getInt(1, 1);
        int r3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f2610l = obtainStyledAttributes.getResourceId(r3, 0);
        this.f2600b = obtainStyledAttributes.getString(r3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2599a = AbstractC0387m.m1121s(context, obtainStyledAttributes, 6);
        this.f2603e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2604f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f2605g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(r7, AbstractC0345a.f965q);
        this.f2606h = obtainStyledAttributes2.hasValue(0);
        this.f2607i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m1979a() {
        String str;
        Typeface typeface = this.f2612n;
        int r12 = this.f2601c;
        if (typeface == null && (str = this.f2600b) != null) {
            this.f2612n = Typeface.create(str, r12);
        }
        if (this.f2612n == null) {
            int r2 = this.f2602d;
            if (r2 == 1) {
                this.f2612n = Typeface.SANS_SERIF;
            } else if (r2 == 2) {
                this.f2612n = Typeface.SERIF;
            } else if (r2 != 3) {
                this.f2612n = Typeface.DEFAULT;
            } else {
                this.f2612n = Typeface.MONOSPACE;
            }
            this.f2612n = Typeface.create(this.f2612n, r12);
        }
    }

    /* renamed from: b */
    public final Typeface m1980b(Context context) {
        if (this.f2611m) {
            return this.f2612n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m189b = AbstractC0043q.m189b(context, this.f2610l);
                this.f2612n = m189b;
                if (m189b != null) {
                    this.f2612n = Typeface.create(m189b, this.f2601c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f2600b, e2);
            }
        }
        m1979a();
        this.f2611m = true;
        return this.f2612n;
    }

    /* renamed from: c */
    public final void m1981c(Context context, AbstractC0580g abstractC0580g) {
        if (m1982d(context)) {
            m1980b(context);
        } else {
            m1979a();
        }
        int r2 = this.f2610l;
        if (r2 == 0) {
            this.f2611m = true;
        }
        if (this.f2611m) {
            abstractC0580g.mo1351s(this.f2612n, true);
            return;
        }
        try {
            C0722b c0722b = new C0722b(this, abstractC0580g);
            ThreadLocal threadLocal = AbstractC0043q.f72a;
            if (context.isRestricted()) {
                c0722b.m173a(-4);
            } else {
                AbstractC0043q.m190c(context, r2, new TypedValue(), 0, c0722b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2611m = true;
            abstractC0580g.mo1350r(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f2600b, e2);
            this.f2611m = true;
            abstractC0580g.mo1350r(-3);
        }
    }

    /* renamed from: d */
    public final boolean m1982d(Context context) {
        Typeface typeface = null;
        int r2 = this.f2610l;
        if (r2 != 0) {
            ThreadLocal threadLocal = AbstractC0043q.f72a;
            if (!context.isRestricted()) {
                typeface = AbstractC0043q.m190c(context, r2, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    /* renamed from: e */
    public final void m1983e(Context context, TextPaint textPaint, AbstractC0580g abstractC0580g) {
        m1984f(context, textPaint, abstractC0580g);
        ColorStateList colorStateList = this.f2608j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2599a;
        textPaint.setShadowLayer(this.f2605g, this.f2603e, this.f2604f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m1984f(Context context, TextPaint textPaint, AbstractC0580g abstractC0580g) {
        if (m1982d(context)) {
            m1985g(context, textPaint, m1980b(context));
            return;
        }
        m1979a();
        m1985g(context, textPaint, this.f2612n);
        m1981c(context, new C0723c(this, context, textPaint, abstractC0580g));
    }

    /* renamed from: g */
    public final void m1985g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface m4867H = AbstractC2480a.m4867H(context.getResources().getConfiguration(), typeface);
        if (m4867H != null) {
            typeface = m4867H;
        }
        textPaint.setTypeface(typeface);
        int r12 = (~typeface.getStyle()) & this.f2601c;
        textPaint.setFakeBoldText((r12 & 1) != 0);
        textPaint.setTextSkewX((r12 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2609k);
        if (this.f2606h) {
            textPaint.setLetterSpacing(this.f2607i);
        }
    }
}
