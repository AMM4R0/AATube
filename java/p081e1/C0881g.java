package p081e1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import kotlin.KotlinVersion;
import p006C.AbstractC0049a;
import p006C.C0055g;
import p036M1.AbstractC0379e;
import p061W0.AbstractC0537a;
import p061W0.AbstractC0538b;
import p063X0.C0541a;
import p078d1.C0782a;

/* renamed from: e1.g */
/* loaded from: classes.dex */
public class C0881g extends Drawable implements InterfaceC0896v {

    /* renamed from: w */
    public static final Paint f3658w;

    /* renamed from: a */
    public C0880f f3659a;

    /* renamed from: b */
    public final AbstractC0894t[] f3660b;

    /* renamed from: c */
    public final AbstractC0894t[] f3661c;

    /* renamed from: d */
    public final BitSet f3662d;

    /* renamed from: e */
    public boolean f3663e;

    /* renamed from: f */
    public final Matrix f3664f;

    /* renamed from: g */
    public final Path f3665g;

    /* renamed from: h */
    public final Path f3666h;

    /* renamed from: i */
    public final RectF f3667i;

    /* renamed from: j */
    public final RectF f3668j;

    /* renamed from: k */
    public final Region f3669k;

    /* renamed from: l */
    public final Region f3670l;

    /* renamed from: m */
    public C0885k f3671m;

    /* renamed from: n */
    public final Paint f3672n;

    /* renamed from: o */
    public final Paint f3673o;

    /* renamed from: p */
    public final C0782a f3674p;

    /* renamed from: q */
    public final C0055g f3675q;

    /* renamed from: r */
    public final C0887m f3676r;

    /* renamed from: s */
    public PorterDuffColorFilter f3677s;

    /* renamed from: t */
    public PorterDuffColorFilter f3678t;

    /* renamed from: u */
    public final RectF f3679u;

    /* renamed from: v */
    public final boolean f3680v;

    static {
        Paint paint = new Paint(1);
        f3658w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0881g() {
        this(new C0885k());
    }

    /* renamed from: a */
    public final void m2398a(RectF rectF, Path path) {
        C0880f c0880f = this.f3659a;
        this.f3676r.m2418a(c0880f.f3642a, c0880f.f3650i, rectF, this.f3675q, path);
        if (this.f3659a.f3649h != 1.0f) {
            Matrix matrix = this.f3664f;
            matrix.reset();
            float f = this.f3659a.f3649h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f3679u, true);
    }

    /* renamed from: b */
    public final int m2399b(int r7) {
        int r02;
        C0880f c0880f = this.f3659a;
        float f = c0880f.f3654m + 0.0f + c0880f.f3653l;
        C0541a c0541a = c0880f.f3643b;
        if (c0541a == null || !c0541a.f1468a || AbstractC0049a.m194d(r7, KotlinVersion.MAX_COMPONENT_VALUE) != c0541a.f1471d) {
            return r7;
        }
        float min = (c0541a.f1472e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(r7);
        int m1085w = AbstractC0379e.m1085w(AbstractC0049a.m194d(r7, KotlinVersion.MAX_COMPONENT_VALUE), c0541a.f1469b, min);
        if (min > 0.0f && (r02 = c0541a.f1470c) != 0) {
            m1085w = AbstractC0049a.m192b(AbstractC0049a.m194d(r02, C0541a.f1467f), m1085w);
        }
        return AbstractC0049a.m194d(m1085w, alpha);
    }

    /* renamed from: c */
    public final void m2400c(Canvas canvas) {
        if (this.f3662d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int r02 = this.f3659a.f3656o;
        Path path = this.f3665g;
        C0782a c0782a = this.f3674p;
        if (r02 != 0) {
            canvas.drawPath(path, c0782a.f3145a);
        }
        for (int r3 = 0; r3 < 4; r3++) {
            AbstractC0894t abstractC0894t = this.f3660b[r3];
            int r5 = this.f3659a.f3655n;
            Matrix matrix = AbstractC0894t.f3735b;
            abstractC0894t.mo2420a(matrix, c0782a, r5, canvas);
            this.f3661c[r3].mo2420a(matrix, c0782a, this.f3659a.f3655n, canvas);
        }
        if (this.f3680v) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f3659a.f3656o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f3659a.f3656o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f3658w);
            canvas.translate(sin, cos);
        }
    }

    /* renamed from: d */
    public final void m2401d(Canvas canvas, Paint paint, Path path, C0885k c0885k, RectF rectF) {
        if (!c0885k.m2416d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo2392a = c0885k.f3699f.mo2392a(rectF) * this.f3659a.f3650i;
            canvas.drawRoundRect(rectF, mo2392a, mo2392a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f3672n;
        paint.setColorFilter(this.f3677s);
        int alpha = paint.getAlpha();
        int r02 = this.f3659a.f3652k;
        paint.setAlpha(((r02 + (r02 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f3673o;
        paint2.setColorFilter(this.f3678t);
        paint2.setStrokeWidth(this.f3659a.f3651j);
        int alpha2 = paint2.getAlpha();
        int r03 = this.f3659a.f3652k;
        paint2.setAlpha(((r03 + (r03 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f3663e;
        Path path = this.f3665g;
        if (z2) {
            float f = -(m2404g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0885k c0885k = this.f3659a.f3642a;
            C0884j m2417e = c0885k.m2417e();
            InterfaceC0877c interfaceC0877c = c0885k.f3698e;
            if (!(interfaceC0877c instanceof C0882h)) {
                interfaceC0877c = new C0876b(f, interfaceC0877c);
            }
            m2417e.f3686e = interfaceC0877c;
            InterfaceC0877c interfaceC0877c2 = c0885k.f3699f;
            if (!(interfaceC0877c2 instanceof C0882h)) {
                interfaceC0877c2 = new C0876b(f, interfaceC0877c2);
            }
            m2417e.f3687f = interfaceC0877c2;
            InterfaceC0877c interfaceC0877c3 = c0885k.f3701h;
            if (!(interfaceC0877c3 instanceof C0882h)) {
                interfaceC0877c3 = new C0876b(f, interfaceC0877c3);
            }
            m2417e.f3689h = interfaceC0877c3;
            InterfaceC0877c interfaceC0877c4 = c0885k.f3700g;
            if (!(interfaceC0877c4 instanceof C0882h)) {
                interfaceC0877c4 = new C0876b(f, interfaceC0877c4);
            }
            m2417e.f3688g = interfaceC0877c4;
            C0885k m2412a = m2417e.m2412a();
            this.f3671m = m2412a;
            float f2 = this.f3659a.f3650i;
            RectF rectF = this.f3668j;
            rectF.set(m2403f());
            float strokeWidth = m2404g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f3676r.m2418a(m2412a, f2, rectF, null, this.f3666h);
            m2398a(m2403f(), path);
            this.f3663e = false;
        }
        C0880f c0880f = this.f3659a;
        c0880f.getClass();
        if (c0880f.f3655n > 0) {
            int r04 = Build.VERSION.SDK_INT;
            if (!this.f3659a.f3642a.m2416d(m2403f()) && !path.isConvex() && r04 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f3659a.f3656o), (int) (Math.cos(Math.toRadians(d2)) * this.f3659a.f3656o));
                if (this.f3680v) {
                    RectF rectF2 = this.f3679u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f3659a.f3655n * 2) + ((int) rectF2.width()) + width, (this.f3659a.f3655n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.f3659a.f3655n) - width;
                    float f4 = (getBounds().top - this.f3659a.f3655n) - height;
                    canvas2.translate(-f3, -f4);
                    m2400c(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    m2400c(canvas);
                    canvas.restore();
                }
            }
        }
        C0880f c0880f2 = this.f3659a;
        Paint.Style style = c0880f2.f3657p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m2401d(canvas, paint, path, c0880f2.f3642a, m2403f());
        }
        if (m2404g()) {
            mo2402e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* renamed from: e */
    public void mo2402e(Canvas canvas) {
        Paint paint = this.f3673o;
        Path path = this.f3666h;
        C0885k c0885k = this.f3671m;
        RectF rectF = this.f3668j;
        rectF.set(m2403f());
        float strokeWidth = m2404g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m2401d(canvas, paint, path, c0885k, rectF);
    }

    /* renamed from: f */
    public final RectF m2403f() {
        RectF rectF = this.f3667i;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final boolean m2404g() {
        Paint.Style style = this.f3659a.f3657p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3673o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3659a.f3652k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3659a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f3659a.getClass();
        if (this.f3659a.f3642a.m2416d(m2403f())) {
            outline.setRoundRect(getBounds(), this.f3659a.f3642a.f3698e.mo2392a(m2403f()) * this.f3659a.f3650i);
            return;
        }
        RectF m2403f = m2403f();
        Path path = this.f3665g;
        m2398a(m2403f, path);
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            AbstractC0538b.m1390a(outline, path);
            return;
        }
        if (r02 >= 29) {
            try {
                AbstractC0537a.m1389a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0537a.m1389a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f3659a.f3648g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f3669k;
        region.set(bounds);
        RectF m2403f = m2403f();
        Path path = this.f3665g;
        m2398a(m2403f, path);
        Region region2 = this.f3670l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final void m2405h(Context context) {
        this.f3659a.f3643b = new C0541a(context);
        m2410m();
    }

    /* renamed from: i */
    public final void m2406i(float f) {
        C0880f c0880f = this.f3659a;
        if (c0880f.f3654m != f) {
            c0880f.f3654m = f;
            m2410m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3663e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f3659a.f3646e) == null || !colorStateList.isStateful())) {
            this.f3659a.getClass();
            ColorStateList colorStateList3 = this.f3659a.f3645d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f3659a.f3644c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void m2407j(ColorStateList colorStateList) {
        C0880f c0880f = this.f3659a;
        if (c0880f.f3644c != colorStateList) {
            c0880f.f3644c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public final boolean m2408k(int[] r6) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f3659a.f3644c == null || color2 == (colorForState2 = this.f3659a.f3644c.getColorForState(r6, (color2 = (paint2 = this.f3672n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f3659a.f3645d == null || color == (colorForState = this.f3659a.f3645d.getColorForState(r6, (color = (paint = this.f3673o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: l */
    public final boolean m2409l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3677s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f3678t;
        C0880f c0880f = this.f3659a;
        ColorStateList colorStateList = c0880f.f3646e;
        PorterDuff.Mode mode = c0880f.f3647f;
        Paint paint = this.f3672n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int m2399b = m2399b(color);
            porterDuffColorFilter = m2399b != color ? new PorterDuffColorFilter(m2399b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m2399b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f3677s = porterDuffColorFilter;
        this.f3659a.getClass();
        this.f3678t = null;
        this.f3659a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f3677s) && Objects.equals(porterDuffColorFilter3, this.f3678t)) ? false : true;
    }

    /* renamed from: m */
    public final void m2410m() {
        C0880f c0880f = this.f3659a;
        float f = c0880f.f3654m + 0.0f;
        c0880f.f3655n = (int) Math.ceil(0.75f * f);
        this.f3659a.f3656o = (int) Math.ceil(f * 0.25f);
        m2409l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3659a = new C0880f(this.f3659a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3663e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
        boolean z2 = m2408k(r2) || m2409l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
        C0880f c0880f = this.f3659a;
        if (c0880f.f3652k != r3) {
            c0880f.f3652k = r3;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3659a.getClass();
        super.invalidateSelf();
    }

    @Override // p081e1.InterfaceC0896v
    public final void setShapeAppearanceModel(C0885k c0885k) {
        this.f3659a.f3642a = c0885k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r12) {
        setTintList(ColorStateList.valueOf(r12));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3659a.f3646e = colorStateList;
        m2409l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0880f c0880f = this.f3659a;
        if (c0880f.f3647f != mode) {
            c0880f.f3647f = mode;
            m2409l();
            super.invalidateSelf();
        }
    }

    public C0881g(Context context, AttributeSet attributeSet, int r3, int r4) {
        this(C0885k.m2414b(context, attributeSet, r3, r4).m2412a());
    }

    public C0881g(C0885k c0885k) {
        this(new C0880f(c0885k));
    }

    public C0881g(C0880f c0880f) {
        C0887m c0887m;
        this.f3660b = new AbstractC0894t[4];
        this.f3661c = new AbstractC0894t[4];
        this.f3662d = new BitSet(8);
        this.f3664f = new Matrix();
        this.f3665g = new Path();
        this.f3666h = new Path();
        this.f3667i = new RectF();
        this.f3668j = new RectF();
        this.f3669k = new Region();
        this.f3670l = new Region();
        Paint paint = new Paint(1);
        this.f3672n = paint;
        Paint paint2 = new Paint(1);
        this.f3673o = paint2;
        this.f3674p = new C0782a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0887m = AbstractC0886l.f3706a;
        } else {
            c0887m = new C0887m();
        }
        this.f3676r = c0887m;
        this.f3679u = new RectF();
        this.f3680v = true;
        this.f3659a = c0880f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m2409l();
        m2408k(getState());
        this.f3675q = new C0055g(26, this);
    }
}
