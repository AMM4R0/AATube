package p100j0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0005b;
import p003B.AbstractC0028b;
import p003B.AbstractC0029c;
import p009D.AbstractC0095a;
import p009D.AbstractC0096b;
import p112o.C2682b;

/* renamed from: j0.q */
/* loaded from: classes.dex */
public final class C2446q extends AbstractC2437h {

    /* renamed from: j */
    public static final PorterDuff.Mode f7965j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C2444o f7966b;

    /* renamed from: c */
    public PorterDuffColorFilter f7967c;

    /* renamed from: d */
    public ColorFilter f7968d;

    /* renamed from: e */
    public boolean f7969e;

    /* renamed from: f */
    public boolean f7970f;

    /* renamed from: g */
    public final float[] f7971g;

    /* renamed from: h */
    public final Matrix f7972h;

    /* renamed from: i */
    public final Rect f7973i;

    public C2446q() {
        this.f7970f = true;
        this.f7971g = new float[9];
        this.f7972h = new Matrix();
        this.f7973i = new Rect();
        C2444o c2444o = new C2444o();
        c2444o.f7954c = null;
        c2444o.f7955d = f7965j;
        c2444o.f7953b = new C2443n();
        this.f7966b = c2444o;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m4796a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7910a;
        if (drawable == null) {
            return false;
        }
        AbstractC0095a.m313b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f7973i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f7968d;
        if (colorFilter == null) {
            colorFilter = this.f7967c;
        }
        Matrix matrix = this.f7972h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f7971g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0096b.m321a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C2444o c2444o = this.f7966b;
        Bitmap bitmap = c2444o.f7957f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c2444o.f7957f.getHeight()) {
            c2444o.f7957f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c2444o.f7962k = true;
        }
        if (this.f7970f) {
            C2444o c2444o2 = this.f7966b;
            if (c2444o2.f7962k || c2444o2.f7958g != c2444o2.f7954c || c2444o2.f7959h != c2444o2.f7955d || c2444o2.f7961j != c2444o2.f7956e || c2444o2.f7960i != c2444o2.f7953b.getRootAlpha()) {
                C2444o c2444o3 = this.f7966b;
                c2444o3.f7957f.eraseColor(0);
                Canvas canvas2 = new Canvas(c2444o3.f7957f);
                C2443n c2443n = c2444o3.f7953b;
                c2443n.m4795a(c2443n.f7943g, C2443n.f7936p, canvas2, min, min2);
                C2444o c2444o4 = this.f7966b;
                c2444o4.f7958g = c2444o4.f7954c;
                c2444o4.f7959h = c2444o4.f7955d;
                c2444o4.f7960i = c2444o4.f7953b.getRootAlpha();
                c2444o4.f7961j = c2444o4.f7956e;
                c2444o4.f7962k = false;
            }
        } else {
            C2444o c2444o5 = this.f7966b;
            c2444o5.f7957f.eraseColor(0);
            Canvas canvas3 = new Canvas(c2444o5.f7957f);
            C2443n c2443n2 = c2444o5.f7953b;
            c2443n2.m4795a(c2443n2.f7943g, C2443n.f7936p, canvas3, min, min2);
        }
        C2444o c2444o6 = this.f7966b;
        if (c2444o6.f7953b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c2444o6.f7963l == null) {
                Paint paint2 = new Paint();
                c2444o6.f7963l = paint2;
                paint2.setFilterBitmap(true);
            }
            c2444o6.f7963l.setAlpha(c2444o6.f7953b.getRootAlpha());
            c2444o6.f7963l.setColorFilter(colorFilter);
            paint = c2444o6.f7963l;
        }
        canvas.drawBitmap(c2444o6.f7957f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getAlpha() : this.f7966b.f7953b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f7966b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7910a;
        return drawable != null ? AbstractC0095a.m314c(drawable) : this.f7968d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7910a != null && Build.VERSION.SDK_INT >= 24) {
            return new C2445p(this.f7910a.getConstantState());
        }
        this.f7966b.f7952a = getChangingConfigurations();
        return this.f7966b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f7966b.f7953b.f7945i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f7966b.f7953b.f7944h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.isAutoMirrored() : this.f7966b.f7956e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C2444o c2444o = this.f7966b;
            if (c2444o != null) {
                C2443n c2443n = c2444o.f7953b;
                if (c2443n.f7950n == null) {
                    c2443n.f7950n = Boolean.valueOf(c2443n.f7943g.mo4792a());
                }
                if (c2443n.f7950n.booleanValue() || ((colorStateList = this.f7966b.f7954c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7969e && super.mutate() == this) {
            C2444o c2444o = this.f7966b;
            C2444o c2444o2 = new C2444o();
            c2444o2.f7954c = null;
            c2444o2.f7955d = f7965j;
            if (c2444o != null) {
                c2444o2.f7952a = c2444o.f7952a;
                C2443n c2443n = new C2443n(c2444o.f7953b);
                c2444o2.f7953b = c2443n;
                if (c2444o.f7953b.f7941e != null) {
                    c2443n.f7941e = new Paint(c2444o.f7953b.f7941e);
                }
                if (c2444o.f7953b.f7940d != null) {
                    c2444o2.f7953b.f7940d = new Paint(c2444o.f7953b.f7940d);
                }
                c2444o2.f7954c = c2444o.f7954c;
                c2444o2.f7955d = c2444o.f7955d;
                c2444o2.f7956e = c2444o.f7956e;
            }
            this.f7966b = c2444o2;
            this.f7969e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            return drawable.setState(r6);
        }
        C2444o c2444o = this.f7966b;
        ColorStateList colorStateList = c2444o.f7954c;
        if (colorStateList == null || (mode = c2444o.f7955d) == null) {
            z2 = false;
        } else {
            this.f7967c = m4796a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C2443n c2443n = c2444o.f7953b;
        if (c2443n.f7950n == null) {
            c2443n.f7950n = Boolean.valueOf(c2443n.f7943g.mo4792a());
        }
        if (c2443n.f7950n.booleanValue()) {
            boolean mo4793b = c2444o.f7953b.f7943g.mo4793b(r6);
            c2444o.f7962k |= mo4793b;
            if (mo4793b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setAlpha(r2);
        } else if (this.f7966b.f7953b.getRootAlpha() != r2) {
            this.f7966b.f7953b.setRootAlpha(r2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f7966b.f7956e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7968d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0580g.m1458y(drawable, r2);
        } else {
            setTintList(ColorStateList.valueOf(r2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m319h(drawable, colorStateList);
            return;
        }
        C2444o c2444o = this.f7966b;
        if (c2444o.f7954c != colorStateList) {
            c2444o.f7954c = colorStateList;
            this.f7967c = m4796a(colorStateList, c2444o.f7955d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m320i(drawable, mode);
            return;
        }
        C2444o c2444o = this.f7966b;
        if (c2444o.f7955d != mode) {
            c2444o.f7955d = mode;
            this.f7967c = m4796a(c2444o.f7954c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2443n c2443n;
        int r19;
        int r15;
        boolean z2;
        int r7;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m315d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C2444o c2444o = this.f7966b;
        c2444o.f7953b = new C2443n();
        TypedArray m167i = AbstractC0028b.m167i(resources, theme, attributeSet, AbstractC2430a.f7885a);
        C2444o c2444o2 = this.f7966b;
        C2443n c2443n2 = c2444o2.f7953b;
        int r02 = !AbstractC0028b.m164f(xmlPullParser, "tintMode") ? -1 : m167i.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int r13 = 3;
        if (r02 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (r02 != 5) {
            if (r02 != 9) {
                switch (r02) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c2444o2.f7955d = mode;
        int r12 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (AbstractC0028b.m164f(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            m167i.getValue(1, typedValue);
            int r11 = typedValue.type;
            if (r11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (r11 >= 28 && r11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = m167i.getResources();
                int resourceId = m167i.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0029c.f45a;
                try {
                    colorStateList = AbstractC0029c.m176a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c2444o2.f7954c = colorStateList2;
        }
        boolean z5 = c2444o2.f7956e;
        if (AbstractC0028b.m164f(xmlPullParser, "autoMirrored")) {
            z5 = m167i.getBoolean(5, z5);
        }
        c2444o2.f7956e = z5;
        float f = c2443n2.f7946j;
        if (AbstractC0028b.m164f(xmlPullParser, "viewportWidth")) {
            f = m167i.getFloat(7, f);
        }
        c2443n2.f7946j = f;
        float f2 = c2443n2.f7947k;
        if (AbstractC0028b.m164f(xmlPullParser, "viewportHeight")) {
            f2 = m167i.getFloat(8, f2);
        }
        c2443n2.f7947k = f2;
        if (c2443n2.f7946j <= 0.0f) {
            throw new XmlPullParserException(m167i.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c2443n2.f7944h = m167i.getDimension(3, c2443n2.f7944h);
            float dimension = m167i.getDimension(2, c2443n2.f7945i);
            c2443n2.f7945i = dimension;
            if (c2443n2.f7944h <= 0.0f) {
                throw new XmlPullParserException(m167i.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c2443n2.getAlpha();
                if (AbstractC0028b.m164f(xmlPullParser, "alpha")) {
                    alpha = m167i.getFloat(4, alpha);
                }
                c2443n2.setAlpha(alpha);
                String string = m167i.getString(0);
                if (string != null) {
                    c2443n2.f7949m = string;
                    c2443n2.f7951o.put(string, c2443n2);
                }
                m167i.recycle();
                c2444o.f7952a = getChangingConfigurations();
                c2444o.f7962k = true;
                C2444o c2444o3 = this.f7966b;
                C2443n c2443n3 = c2444o3.f7953b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c2443n3.f7943g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != r12 && (xmlPullParser.getDepth() >= depth || eventType != r13)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C2440k c2440k = (C2440k) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        r19 = depth;
                        C2682b c2682b = c2443n3.f7951o;
                        if (equals) {
                            C2439j c2439j = new C2439j();
                            c2439j.f7912e = 0.0f;
                            c2439j.f7914g = 1.0f;
                            c2439j.f7915h = 1.0f;
                            c2439j.f7916i = 0.0f;
                            c2439j.f7917j = 1.0f;
                            c2439j.f7918k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c2439j.f7919l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c2439j.f7920m = join3;
                            c2443n = c2443n3;
                            c2439j.f7921n = 4.0f;
                            TypedArray m167i2 = AbstractC0028b.m167i(resources, theme, attributeSet, AbstractC2430a.f7887c);
                            if (AbstractC0028b.m164f(xmlPullParser, "pathData")) {
                                String string2 = m167i2.getString(0);
                                if (string2 != null) {
                                    c2439j.f7934b = string2;
                                }
                                String string3 = m167i2.getString(2);
                                if (string3 != null) {
                                    c2439j.f7933a = AbstractC0005b.m71q(string3);
                                }
                                c2439j.f7913f = AbstractC0028b.m161c(m167i2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c2439j.f7915h;
                                if (AbstractC0028b.m164f(xmlPullParser, "fillAlpha")) {
                                    f3 = m167i2.getFloat(12, f3);
                                }
                                c2439j.f7915h = f3;
                                int r112 = !AbstractC0028b.m164f(xmlPullParser, "strokeLineCap") ? -1 : m167i2.getInt(8, -1);
                                Paint.Cap cap3 = c2439j.f7919l;
                                if (r112 != 0) {
                                    join = join3;
                                    if (r112 != 1) {
                                        cap = r112 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                c2439j.f7919l = cap;
                                int r152 = !AbstractC0028b.m164f(xmlPullParser, "strokeLineJoin") ? -1 : m167i2.getInt(9, -1);
                                Paint.Join join4 = c2439j.f7920m;
                                if (r152 == 0) {
                                    join2 = join;
                                } else if (r152 != 1) {
                                    join2 = r152 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c2439j.f7920m = join2;
                                float f4 = c2439j.f7921n;
                                if (AbstractC0028b.m164f(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = m167i2.getFloat(10, f4);
                                }
                                c2439j.f7921n = f4;
                                c2439j.f7911d = AbstractC0028b.m161c(m167i2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c2439j.f7914g;
                                if (AbstractC0028b.m164f(xmlPullParser, "strokeAlpha")) {
                                    f5 = m167i2.getFloat(11, f5);
                                }
                                c2439j.f7914g = f5;
                                float f6 = c2439j.f7912e;
                                if (AbstractC0028b.m164f(xmlPullParser, "strokeWidth")) {
                                    f6 = m167i2.getFloat(4, f6);
                                }
                                c2439j.f7912e = f6;
                                float f7 = c2439j.f7917j;
                                if (AbstractC0028b.m164f(xmlPullParser, "trimPathEnd")) {
                                    f7 = m167i2.getFloat(6, f7);
                                }
                                c2439j.f7917j = f7;
                                float f8 = c2439j.f7918k;
                                if (AbstractC0028b.m164f(xmlPullParser, "trimPathOffset")) {
                                    f8 = m167i2.getFloat(7, f8);
                                }
                                c2439j.f7918k = f8;
                                float f9 = c2439j.f7916i;
                                if (AbstractC0028b.m164f(xmlPullParser, "trimPathStart")) {
                                    f9 = m167i2.getFloat(5, f9);
                                }
                                c2439j.f7916i = f9;
                                int r113 = c2439j.f7935c;
                                if (AbstractC0028b.m164f(xmlPullParser, "fillType")) {
                                    r113 = m167i2.getInt(13, r113);
                                }
                                c2439j.f7935c = r113;
                            }
                            m167i2.recycle();
                            c2440k.f7923b.add(c2439j);
                            if (c2439j.getPathName() != null) {
                                c2682b.put(c2439j.getPathName(), c2439j);
                            }
                            c2444o3.f7952a = c2444o3.f7952a;
                            z3 = false;
                            r15 = 1;
                            z6 = false;
                        } else {
                            c2443n = c2443n3;
                            if ("clip-path".equals(name)) {
                                C2438i c2438i = new C2438i();
                                if (AbstractC0028b.m164f(xmlPullParser, "pathData")) {
                                    TypedArray m167i3 = AbstractC0028b.m167i(resources, theme, attributeSet, AbstractC2430a.f7888d);
                                    String string4 = m167i3.getString(0);
                                    if (string4 != null) {
                                        c2438i.f7934b = string4;
                                    }
                                    String string5 = m167i3.getString(1);
                                    if (string5 != null) {
                                        c2438i.f7933a = AbstractC0005b.m71q(string5);
                                    }
                                    c2438i.f7935c = !AbstractC0028b.m164f(xmlPullParser, "fillType") ? 0 : m167i3.getInt(2, 0);
                                    m167i3.recycle();
                                }
                                c2440k.f7923b.add(c2438i);
                                if (c2438i.getPathName() != null) {
                                    c2682b.put(c2438i.getPathName(), c2438i);
                                }
                                c2444o3.f7952a = c2444o3.f7952a;
                            } else if ("group".equals(name)) {
                                C2440k c2440k2 = new C2440k();
                                TypedArray m167i4 = AbstractC0028b.m167i(resources, theme, attributeSet, AbstractC2430a.f7886b);
                                float f10 = c2440k2.f7924c;
                                if (AbstractC0028b.m164f(xmlPullParser, "rotation")) {
                                    f10 = m167i4.getFloat(5, f10);
                                }
                                c2440k2.f7924c = f10;
                                r15 = 1;
                                c2440k2.f7925d = m167i4.getFloat(1, c2440k2.f7925d);
                                c2440k2.f7926e = m167i4.getFloat(2, c2440k2.f7926e);
                                float f11 = c2440k2.f7927f;
                                if (AbstractC0028b.m164f(xmlPullParser, "scaleX")) {
                                    f11 = m167i4.getFloat(3, f11);
                                }
                                c2440k2.f7927f = f11;
                                float f12 = c2440k2.f7928g;
                                if (AbstractC0028b.m164f(xmlPullParser, "scaleY")) {
                                    f12 = m167i4.getFloat(4, f12);
                                }
                                c2440k2.f7928g = f12;
                                float f13 = c2440k2.f7929h;
                                if (AbstractC0028b.m164f(xmlPullParser, "translateX")) {
                                    f13 = m167i4.getFloat(6, f13);
                                }
                                c2440k2.f7929h = f13;
                                float f14 = c2440k2.f7930i;
                                if (AbstractC0028b.m164f(xmlPullParser, "translateY")) {
                                    f14 = m167i4.getFloat(7, f14);
                                }
                                c2440k2.f7930i = f14;
                                z3 = false;
                                String string6 = m167i4.getString(0);
                                if (string6 != null) {
                                    c2440k2.f7932k = string6;
                                }
                                c2440k2.m4794c();
                                m167i4.recycle();
                                c2440k.f7923b.add(c2440k2);
                                arrayDeque.push(c2440k2);
                                if (c2440k2.getGroupName() != null) {
                                    c2682b.put(c2440k2.getGroupName(), c2440k2);
                                }
                                c2444o3.f7952a = c2444o3.f7952a;
                            }
                            z3 = false;
                            r15 = 1;
                        }
                        z2 = z3;
                        r7 = 3;
                    } else {
                        c2443n = c2443n3;
                        r19 = depth;
                        r15 = r12;
                        z2 = z4;
                        r7 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    r13 = r7;
                    z4 = z2;
                    r12 = r15;
                    depth = r19;
                    c2443n3 = c2443n;
                }
                if (!z6) {
                    this.f7967c = m4796a(c2444o.f7954c, c2444o.f7955d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(m167i.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(m167i.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C2446q(C2444o c2444o) {
        this.f7970f = true;
        this.f7971g = new float[9];
        this.f7972h = new Matrix();
        this.f7973i = new Rect();
        this.f7966b = c2444o;
        this.f7967c = m4796a(c2444o.f7954c, c2444o.f7955d);
    }
}
