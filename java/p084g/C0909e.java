package p084g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;
import p001A0.AbstractC0005b;
import p009D.AbstractC0095a;
import p009D.AbstractC0096b;
import p010D0.RunnableC0107e;

/* renamed from: g.e */
/* loaded from: classes.dex */
public final class C0909e extends Drawable implements Drawable.Callback {

    /* renamed from: t */
    public static final /* synthetic */ int f3799t = 0;

    /* renamed from: a */
    public C0906b f3800a;

    /* renamed from: b */
    public Rect f3801b;

    /* renamed from: c */
    public Drawable f3802c;

    /* renamed from: d */
    public Drawable f3803d;

    /* renamed from: f */
    public boolean f3805f;

    /* renamed from: h */
    public boolean f3807h;

    /* renamed from: i */
    public RunnableC0107e f3808i;

    /* renamed from: j */
    public long f3809j;

    /* renamed from: k */
    public long f3810k;

    /* renamed from: l */
    public C0910f f3811l;

    /* renamed from: m */
    public C0906b f3812m;

    /* renamed from: n */
    public boolean f3813n;

    /* renamed from: o */
    public C0906b f3814o;

    /* renamed from: p */
    public AbstractC0005b f3815p;

    /* renamed from: s */
    public boolean f3818s;

    /* renamed from: e */
    public int f3804e = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: g */
    public int f3806g = -1;

    /* renamed from: q */
    public int f3816q = -1;

    /* renamed from: r */
    public int f3817r = -1;

    public C0909e(C0906b c0906b, Resources resources) {
        m2459i(new C0906b(c0906b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0276, code lost:
    
        return r5;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p084g.C0909e m2451c(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p084g.C0909e.m2451c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):g.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2452a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f3805f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f3802c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f3809j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f3804e
            r3.setAlpha(r9)
            r13.f3809j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            g.b r10 = r13.f3800a
            int r10 = r10.f3792y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f3804e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f3809j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f3803d
            if (r9 == 0) goto L61
            long r10 = r13.f3810k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f3803d = r0
            r13.f3810k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b r4 = r13.f3800a
            int r4 = r4.f3793z
            int r3 = r3 / r4
            int r4 = r13.f3804e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f3810k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            D0.e r14 = r13.f3808i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p084g.C0909e.m2452a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        m2453b(theme);
        onStateChange(getState());
    }

    /* renamed from: b */
    public final void m2453b(Resources.Theme theme) {
        C0906b c0906b = this.f3800a;
        if (theme == null) {
            c0906b.getClass();
            return;
        }
        c0906b.m2448c();
        int r12 = c0906b.f3775h;
        Drawable[] drawableArr = c0906b.f3774g;
        for (int r4 = 0; r4 < r12; r4++) {
            Drawable drawable = drawableArr[r4];
            if (drawable != null && AbstractC0095a.m313b(drawable)) {
                AbstractC0095a.m312a(drawableArr[r4], theme);
                c0906b.f3772e |= drawableArr[r4].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c0906b.f3769b = resources;
            int r8 = resources.getDisplayMetrics().densityDpi;
            if (r8 == 0) {
                r8 = 160;
            }
            int r13 = c0906b.f3770c;
            c0906b.f3770c = r8;
            if (r13 != r8) {
                c0906b.f3780m = false;
                c0906b.f3777j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f3800a.canApplyTheme();
    }

    /* renamed from: d */
    public final void m2454d(Drawable drawable) {
        if (this.f3811l == null) {
            this.f3811l = new C0910f();
        }
        C0910f c0910f = this.f3811l;
        c0910f.f3820b = drawable.getCallback();
        drawable.setCallback(c0910f);
        try {
            if (this.f3800a.f3792y <= 0 && this.f3805f) {
                drawable.setAlpha(this.f3804e);
            }
            C0906b c0906b = this.f3800a;
            if (c0906b.f3760C) {
                drawable.setColorFilter(c0906b.f3759B);
            } else {
                if (c0906b.f3763F) {
                    AbstractC0095a.m319h(drawable, c0906b.f3761D);
                }
                C0906b c0906b2 = this.f3800a;
                if (c0906b2.f3764G) {
                    AbstractC0095a.m320i(drawable, c0906b2.f3762E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3800a.f3790w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            AbstractC0096b.m322b(drawable, AbstractC0096b.m321a(this));
            drawable.setAutoMirrored(this.f3800a.f3758A);
            Rect rect = this.f3801b;
            if (rect != null) {
                AbstractC0095a.m317f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C0910f c0910f2 = this.f3811l;
            Drawable.Callback callback = (Drawable.Callback) c0910f2.f3820b;
            c0910f2.f3820b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C0910f c0910f3 = this.f3811l;
            Drawable.Callback callback2 = (Drawable.Callback) c0910f3.f3820b;
            c0910f3.f3820b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3803d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void m2455e() {
        boolean z2;
        Drawable drawable = this.f3803d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3803d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f3802c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3805f) {
                this.f3802c.setAlpha(this.f3804e);
            }
        }
        if (this.f3810k != 0) {
            this.f3810k = 0L;
            z2 = true;
        }
        if (this.f3809j != 0) {
            this.f3809j = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public final Drawable m2456f() {
        if (!this.f3807h && super.mutate() == this) {
            C0906b c0906b = new C0906b(this.f3814o, this, null);
            c0906b.f3766I = c0906b.f3766I.clone();
            c0906b.f3767J = c0906b.f3767J.clone();
            m2459i(c0906b);
            this.f3807h = true;
        }
        return this;
    }

    /* renamed from: g */
    public final Drawable m2457g() {
        if (!this.f3813n) {
            m2456f();
            C0906b c0906b = this.f3812m;
            c0906b.f3766I = c0906b.f3766I.clone();
            c0906b.f3767J = c0906b.f3767J.clone();
            this.f3813n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3804e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3800a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        C0906b c0906b = this.f3800a;
        if (!c0906b.f3788u) {
            c0906b.m2448c();
            c0906b.f3788u = true;
            int r2 = c0906b.f3775h;
            Drawable[] drawableArr = c0906b.f3774g;
            int r5 = 0;
            while (true) {
                if (r5 >= r2) {
                    c0906b.f3789v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[r5].getConstantState() == null) {
                    c0906b.f3789v = false;
                    z2 = false;
                    break;
                }
                r5++;
            }
        } else {
            z2 = c0906b.f3789v;
        }
        if (!z2) {
            return null;
        }
        this.f3800a.f3771d = getChangingConfigurations();
        return this.f3800a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3802c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3801b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0906b c0906b = this.f3800a;
        if (c0906b.f3779l) {
            if (!c0906b.f3780m) {
                c0906b.m2447b();
            }
            return c0906b.f3782o;
        }
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0906b c0906b = this.f3800a;
        if (c0906b.f3779l) {
            if (!c0906b.f3780m) {
                c0906b.m2447b();
            }
            return c0906b.f3781n;
        }
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C0906b c0906b = this.f3800a;
        if (c0906b.f3779l) {
            if (!c0906b.f3780m) {
                c0906b.m2447b();
            }
            return c0906b.f3784q;
        }
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C0906b c0906b = this.f3800a;
        if (c0906b.f3779l) {
            if (!c0906b.f3780m) {
                c0906b.m2447b();
            }
            return c0906b.f3783p;
        }
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3802c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0906b c0906b = this.f3800a;
        if (c0906b.f3785r) {
            return c0906b.f3786s;
        }
        c0906b.m2448c();
        int r2 = c0906b.f3775h;
        Drawable[] drawableArr = c0906b.f3774g;
        int opacity = r2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int r5 = 1; r5 < r2; r5++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[r5].getOpacity());
        }
        c0906b.f3786s = opacity;
        c0906b.f3785r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C0906b c0906b = this.f3800a;
        boolean z2 = false;
        Rect rect2 = null;
        if (!c0906b.f3776i) {
            Rect rect3 = c0906b.f3778k;
            if (rect3 != null || c0906b.f3777j) {
                rect2 = rect3;
            } else {
                c0906b.m2448c();
                Rect rect4 = new Rect();
                int r5 = c0906b.f3775h;
                Drawable[] drawableArr = c0906b.f3774g;
                for (int r7 = 0; r7 < r5; r7++) {
                    if (drawableArr[r7].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int r8 = rect4.left;
                        if (r8 > rect2.left) {
                            rect2.left = r8;
                        }
                        int r82 = rect4.top;
                        if (r82 > rect2.top) {
                            rect2.top = r82;
                        }
                        int r83 = rect4.right;
                        if (r83 > rect2.right) {
                            rect2.right = r83;
                        }
                        int r84 = rect4.bottom;
                        if (r84 > rect2.bottom) {
                            rect2.bottom = r84;
                        }
                    }
                }
                c0906b.f3777j = true;
                c0906b.f3778k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z2 = true;
            }
        } else {
            Drawable drawable = this.f3802c;
            z2 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f3800a.f3758A && AbstractC0096b.m321a(this) == 1) {
            int r02 = rect.left;
            rect.left = rect.right;
            rect.right = r02;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2458h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f3806g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b r0 = r9.f3800a
            int r0 = r0.f3793z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f3803d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f3802c
            if (r0 == 0) goto L29
            r9.f3803d = r0
            g.b r0 = r9.f3800a
            int r0 = r0.f3793z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f3810k = r0
            goto L35
        L29:
            r9.f3803d = r4
            r9.f3810k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f3802c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b r0 = r9.f3800a
            int r1 = r0.f3775h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m2449d(r10)
            r9.f3802c = r0
            r9.f3806g = r10
            if (r0 == 0) goto L5a
            g.b r10 = r9.f3800a
            int r10 = r10.f3792y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f3809j = r2
        L51:
            r9.m2454d(r0)
            goto L5a
        L55:
            r9.f3802c = r4
            r10 = -1
            r9.f3806g = r10
        L5a:
            long r0 = r9.f3809j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f3810k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            D0.e r10 = r9.f3808i
            if (r10 != 0) goto L75
            D0.e r10 = new D0.e
            r1 = 13
            r10.<init>(r1, r9)
            r9.f3808i = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.m2452a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p084g.C0909e.m2458h(int):boolean");
    }

    /* renamed from: i */
    public final void m2459i(C0906b c0906b) {
        this.f3800a = c0906b;
        int r02 = this.f3806g;
        if (r02 >= 0) {
            Drawable m2449d = c0906b.m2449d(r02);
            this.f3802c = m2449d;
            if (m2449d != null) {
                m2454d(m2449d);
            }
        }
        this.f3803d = null;
        this.f3812m = c0906b;
        this.f3814o = c0906b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0906b c0906b = this.f3800a;
        if (c0906b != null) {
            c0906b.f3785r = false;
            c0906b.f3787t = false;
        }
        if (drawable != this.f3802c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3800a.f3758A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* renamed from: j */
    public final boolean m2460j(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f3803d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f3802c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        m2455e();
        AbstractC0005b abstractC0005b = this.f3815p;
        if (abstractC0005b != null) {
            abstractC0005b.mo86O();
            this.f3815p = null;
            m2458h(this.f3816q);
            this.f3816q = -1;
            this.f3817r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f3818s) {
            m2457g();
            C0906b c0906b = this.f3814o;
            c0906b.f3766I = c0906b.f3766I.clone();
            c0906b.f3767J = c0906b.f3767J.clone();
            this.f3818s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3803d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3802c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r8) {
        C0906b c0906b = this.f3800a;
        int r12 = this.f3806g;
        int r2 = c0906b.f3775h;
        Drawable[] drawableArr = c0906b.f3774g;
        boolean z2 = false;
        for (int r4 = 0; r4 < r2; r4++) {
            Drawable drawable = drawableArr[r4];
            if (drawable != null) {
                boolean m322b = AbstractC0096b.m322b(drawable, r8);
                if (r4 == r12) {
                    z2 = m322b;
                }
            }
        }
        c0906b.f3791x = r8;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        Drawable drawable = this.f3803d;
        if (drawable != null) {
            return drawable.setLevel(r2);
        }
        Drawable drawable2 = this.f3802c;
        if (drawable2 != null) {
            return drawable2.setLevel(r2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0103, code lost:
    
        if (m2458h(r1) != false) goto L51;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p084g.C0909e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f3802c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r6) {
        if (this.f3805f && this.f3804e == r6) {
            return;
        }
        this.f3805f = true;
        this.f3804e = r6;
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            if (this.f3809j == 0) {
                drawable.setAlpha(r6);
            } else {
                m2452a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        C0906b c0906b = this.f3800a;
        if (c0906b.f3758A != z2) {
            c0906b.f3758A = z2;
            Drawable drawable = this.f3802c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C0906b c0906b = this.f3800a;
        c0906b.f3760C = true;
        if (c0906b.f3759B != colorFilter) {
            c0906b.f3759B = colorFilter;
            Drawable drawable = this.f3802c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        C0906b c0906b = this.f3800a;
        if (c0906b.f3790w != z2) {
            c0906b.f3790w = z2;
            Drawable drawable = this.f3802c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            AbstractC0095a.m316e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        Rect rect = this.f3801b;
        if (rect == null) {
            this.f3801b = new Rect(r2, r3, r4, r5);
        } else {
            rect.set(r2, r3, r4, r5);
        }
        Drawable drawable = this.f3802c;
        if (drawable != null) {
            AbstractC0095a.m317f(drawable, r2, r3, r4, r5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r12) {
        setTintList(ColorStateList.valueOf(r12));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C0906b c0906b = this.f3800a;
        c0906b.f3763F = true;
        if (c0906b.f3761D != colorStateList) {
            c0906b.f3761D = colorStateList;
            AbstractC0095a.m319h(this.f3802c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C0906b c0906b = this.f3800a;
        c0906b.f3764G = true;
        if (c0906b.f3762E != mode) {
            c0906b.f3762E = mode;
            AbstractC0095a.m320i(this.f3802c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean m2460j = m2460j(z2, z3);
        AbstractC0005b abstractC0005b = this.f3815p;
        if (abstractC0005b != null && (m2460j || z3)) {
            if (z2) {
                abstractC0005b.mo85N();
            } else {
                jumpToCurrentState();
            }
        }
        return m2460j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f3802c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
