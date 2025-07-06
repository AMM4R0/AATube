package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import io.appmetrica.analytics.impl.C1463Q2;
import io.appmetrica.analytics.impl.C1842f9;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p001A0.AbstractC0005b;
import p009D.AbstractC0096b;
import p009D.InterfaceC0101g;
import p022I.AbstractC0202k;
import p022I.C0193b;
import p022I.C0201j;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p032L0.C0368b;
import p036M1.AbstractC0387m;
import p056T0.C0518b;
import p056T0.C0519c;
import p056T0.C0520d;
import p056T0.C0522f;
import p056T0.InterfaceC0521e;
import p065Y0.AbstractC0556k;
import p065Y0.C0554i;
import p065Y0.InterfaceC0550e;
import p072b1.C0724d;
import p074c1.AbstractC0739a;
import p081e1.C0885k;
import p081e1.InterfaceC0896v;
import p101j1.AbstractC2447a;
import p104l.C2603r;

/* loaded from: classes.dex */
public class Chip extends C2603r implements InterfaceC0521e, InterfaceC0896v, Checkable {

    /* renamed from: w */
    public static final Rect f2835w = new Rect();

    /* renamed from: x */
    public static final int[] f2836x = {R.attr.state_selected};

    /* renamed from: y */
    public static final int[] f2837y = {R.attr.state_checkable};

    /* renamed from: e */
    public C0522f f2838e;

    /* renamed from: f */
    public InsetDrawable f2839f;

    /* renamed from: g */
    public RippleDrawable f2840g;

    /* renamed from: h */
    public View.OnClickListener f2841h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f2842i;

    /* renamed from: j */
    public boolean f2843j;

    /* renamed from: k */
    public boolean f2844k;

    /* renamed from: l */
    public boolean f2845l;

    /* renamed from: m */
    public boolean f2846m;

    /* renamed from: n */
    public boolean f2847n;

    /* renamed from: o */
    public int f2848o;

    /* renamed from: p */
    public int f2849p;

    /* renamed from: q */
    public CharSequence f2850q;

    /* renamed from: r */
    public final C0520d f2851r;

    /* renamed from: s */
    public boolean f2852s;

    /* renamed from: t */
    public final Rect f2853t;

    /* renamed from: u */
    public final RectF f2854u;

    /* renamed from: v */
    public final C0518b f2855v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.carwizard.p075li.youtube.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f2853t = new Rect();
        this.f2854u = new RectF();
        this.f2855v = new C0518b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", C1463Q2.f5240g) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C0522f c0522f = new C0522f(context2, attributeSet);
        int[] r13 = AbstractC0345a.f951c;
        TypedArray m1412f = AbstractC0556k.m1412f(c0522f.f1410e0, attributeSet, r13, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0522f.f1384E0 = m1412f.hasValue(37);
        Context context3 = c0522f.f1410e0;
        ColorStateList m1121s = AbstractC0387m.m1121s(context3, m1412f, 24);
        if (c0522f.f1429x != m1121s) {
            c0522f.f1429x = m1121s;
            c0522f.onStateChange(c0522f.getState());
        }
        ColorStateList m1121s2 = AbstractC0387m.m1121s(context3, m1412f, 11);
        if (c0522f.f1431y != m1121s2) {
            c0522f.f1431y = m1121s2;
            c0522f.onStateChange(c0522f.getState());
        }
        float dimension = m1412f.getDimension(19, 0.0f);
        if (c0522f.f1433z != dimension) {
            c0522f.f1433z = dimension;
            c0522f.invalidateSelf();
            c0522f.m1380u();
        }
        if (m1412f.hasValue(12)) {
            c0522f.m1355A(m1412f.getDimension(12, 0.0f));
        }
        c0522f.m1360F(AbstractC0387m.m1121s(context3, m1412f, 22));
        c0522f.m1361G(m1412f.getDimension(23, 0.0f));
        c0522f.m1370P(AbstractC0387m.m1121s(context3, m1412f, 36));
        String text = m1412f.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0522f.f1383E, text)) {
            c0522f.f1383E = text;
            c0522f.f1416k0.f1557d = true;
            c0522f.invalidateSelf();
            c0522f.m1380u();
        }
        C0724d c0724d = (!m1412f.hasValue(0) || (resourceId3 = m1412f.getResourceId(0, 0)) == 0) ? null : new C0724d(context3, resourceId3);
        c0724d.f2609k = m1412f.getDimension(1, c0724d.f2609k);
        c0522f.m1371Q(c0724d);
        int r6 = m1412f.getInt(3, 0);
        if (r6 == 1) {
            c0522f.f1378B0 = TextUtils.TruncateAt.START;
        } else if (r6 == 2) {
            c0522f.f1378B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (r6 == 3) {
            c0522f.f1378B0 = TextUtils.TruncateAt.END;
        }
        c0522f.m1359E(m1412f.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0522f.m1359E(m1412f.getBoolean(15, false));
        }
        c0522f.m1356B(AbstractC0387m.m1122t(context3, m1412f, 14));
        if (m1412f.hasValue(17)) {
            c0522f.m1358D(AbstractC0387m.m1121s(context3, m1412f, 17));
        }
        c0522f.m1357C(m1412f.getDimension(16, -1.0f));
        c0522f.m1367M(m1412f.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0522f.m1367M(m1412f.getBoolean(26, false));
        }
        c0522f.m1362H(AbstractC0387m.m1122t(context3, m1412f, 25));
        c0522f.m1366L(AbstractC0387m.m1121s(context3, m1412f, 30));
        c0522f.m1364J(m1412f.getDimension(28, 0.0f));
        c0522f.m1382w(m1412f.getBoolean(6, false));
        c0522f.m1385z(m1412f.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0522f.m1385z(m1412f.getBoolean(8, false));
        }
        c0522f.m1383x(AbstractC0387m.m1122t(context3, m1412f, 7));
        if (m1412f.hasValue(9)) {
            c0522f.m1384y(AbstractC0387m.m1121s(context3, m1412f, 9));
        }
        c0522f.f1400U = (!m1412f.hasValue(39) || (resourceId2 = m1412f.getResourceId(39, 0)) == 0) ? null : C0368b.m1038a(context3, resourceId2);
        c0522f.f1401V = (!m1412f.hasValue(33) || (resourceId = m1412f.getResourceId(33, 0)) == 0) ? null : C0368b.m1038a(context3, resourceId);
        float dimension2 = m1412f.getDimension(21, 0.0f);
        if (c0522f.f1402W != dimension2) {
            c0522f.f1402W = dimension2;
            c0522f.invalidateSelf();
            c0522f.m1380u();
        }
        c0522f.m1369O(m1412f.getDimension(35, 0.0f));
        c0522f.m1368N(m1412f.getDimension(34, 0.0f));
        float dimension3 = m1412f.getDimension(41, 0.0f);
        if (c0522f.f1405Z != dimension3) {
            c0522f.f1405Z = dimension3;
            c0522f.invalidateSelf();
            c0522f.m1380u();
        }
        float dimension4 = m1412f.getDimension(40, 0.0f);
        if (c0522f.f1406a0 != dimension4) {
            c0522f.f1406a0 = dimension4;
            c0522f.invalidateSelf();
            c0522f.m1380u();
        }
        c0522f.m1365K(m1412f.getDimension(29, 0.0f));
        c0522f.m1363I(m1412f.getDimension(27, 0.0f));
        float dimension5 = m1412f.getDimension(13, 0.0f);
        if (c0522f.f1409d0 != dimension5) {
            c0522f.f1409d0 = dimension5;
            c0522f.invalidateSelf();
            c0522f.m1380u();
        }
        c0522f.f1382D0 = m1412f.getDimensionPixelSize(4, Integer.MAX_VALUE);
        m1412f.recycle();
        AbstractC0556k.m1407a(context2, attributeSet, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0556k.m1408b(context2, attributeSet, r13, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r13, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2847n = obtainStyledAttributes.getBoolean(32, false);
        this.f2849p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c0522f);
        c0522f.m2406i(AbstractC0272E.m705i(this));
        AbstractC0556k.m1407a(context2, attributeSet, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0556k.m1408b(context2, attributeSet, r13, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, r13, com.carwizard.p075li.youtube.R.attr.chipStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f2851r = new C0520d(this, this);
        m2098e();
        if (!hasValue) {
            setOutlineProvider(new C0519c(this));
        }
        setChecked(this.f2843j);
        setText(c0522f.f1383E);
        setEllipsize(c0522f.f1378B0);
        m2101h();
        if (!this.f2838e.f1380C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m2100g();
        if (this.f2847n) {
            setMinHeight(this.f2849p);
        }
        this.f2848o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: T0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f2842i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2854u;
        rectF.setEmpty();
        if (m2096c() && this.f2841h != null) {
            C0522f c0522f = this.f2838e;
            Rect bounds = c0522f.getBounds();
            rectF.setEmpty();
            if (c0522f.m1374T()) {
                float f = c0522f.f1409d0 + c0522f.f1408c0 + c0522f.f1394O + c0522f.f1407b0 + c0522f.f1406a0;
                if (AbstractC0096b.m321a(c0522f) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int r12 = (int) closeIconTouchBounds.left;
        int r2 = (int) closeIconTouchBounds.top;
        int r3 = (int) closeIconTouchBounds.right;
        int r02 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2853t;
        rect.set(r12, r2, r3, r02);
        return rect;
    }

    private C0724d getTextAppearance() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1416k0.f1559f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2845l != z2) {
            this.f2845l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2844k != z2) {
            this.f2844k = z2;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    public final void m2095b(int r11) {
        this.f2849p = r11;
        if (!this.f2847n) {
            InsetDrawable insetDrawable = this.f2839f;
            if (insetDrawable == null) {
                int[] r112 = AbstractC0739a.f2656a;
                m2099f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2839f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] r113 = AbstractC0739a.f2656a;
                    m2099f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, r11 - ((int) this.f2838e.f1433z));
        int max2 = Math.max(0, r11 - this.f2838e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f2839f;
            if (insetDrawable2 == null) {
                int[] r114 = AbstractC0739a.f2656a;
                m2099f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2839f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] r115 = AbstractC0739a.f2656a;
                    m2099f();
                    return;
                }
                return;
            }
        }
        int r8 = max2 > 0 ? max2 / 2 : 0;
        int r9 = max > 0 ? max / 2 : 0;
        if (this.f2839f != null) {
            Rect rect = new Rect();
            this.f2839f.getPadding(rect);
            if (rect.top == r9 && rect.bottom == r9 && rect.left == r8 && rect.right == r8) {
                int[] r116 = AbstractC0739a.f2656a;
                m2099f();
                return;
            }
        }
        if (getMinHeight() != r11) {
            setMinHeight(r11);
        }
        if (getMinWidth() != r11) {
            setMinWidth(r11);
        }
        this.f2839f = new InsetDrawable((Drawable) this.f2838e, r8, r9, r8, r9);
        int[] r117 = AbstractC0739a.f2656a;
        m2099f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2096c() {
        /*
            r2 = this;
            T0.f r0 = r2.f2838e
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.f1391L
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof p009D.InterfaceC0101g
            if (r1 == 0) goto Lf
            D.g r0 = (p009D.InterfaceC0101g) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m2096c():boolean");
    }

    /* renamed from: d */
    public final boolean m2097d() {
        C0522f c0522f = this.f2838e;
        return c0522f != null && c0522f.f1396Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int r12;
        if (!this.f2852s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C0520d c0520d = this.f2851r;
        AccessibilityManager accessibilityManager = c0520d.f1335h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = c0520d.f1372q;
                int r13 = (chip.m2096c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int r5 = c0520d.f1340m;
                if (r5 != r13) {
                    c0520d.f1340m = r13;
                    c0520d.m1331q(r13, 128);
                    c0520d.m1331q(r5, 256);
                }
                if (r13 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (r12 = c0520d.f1340m) != Integer.MIN_VALUE) {
                if (r12 == Integer.MIN_VALUE) {
                    return true;
                }
                c0520d.f1340m = Integer.MIN_VALUE;
                c0520d.m1331q(r12, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2852s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0520d c0520d = this.f2851r;
        c0520d.getClass();
        boolean z2 = false;
        int r2 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int r5 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case C1842f9.f6208E /* 19 */:
                        case C1842f9.f6209F /* 20 */:
                        case C1842f9.f6210G /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    r5 = 33;
                                } else if (keyCode == 21) {
                                    r5 = 17;
                                } else if (keyCode != 22) {
                                    r5 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (r2 < repeatCount && c0520d.m1327m(r5, null)) {
                                    r2++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int r12 = c0520d.f1339l;
                    if (r12 != Integer.MIN_VALUE) {
                        Chip chip = c0520d.f1372q;
                        if (r12 == 0) {
                            chip.performClick();
                        } else if (r12 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f2841h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f2852s) {
                                chip.f2851r.m1331q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c0520d.m1327m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c0520d.m1327m(1, null);
            }
        }
        if (!z2 || c0520d.f1339l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p104l.C2603r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int r3;
        super.drawableStateChanged();
        C0522f c0522f = this.f2838e;
        boolean z2 = false;
        if (c0522f != null && C0522f.m1354t(c0522f.f1391L)) {
            C0522f c0522f2 = this.f2838e;
            ?? isEnabled = isEnabled();
            int r2 = isEnabled;
            if (this.f2846m) {
                r2 = isEnabled + 1;
            }
            int r22 = r2;
            if (this.f2845l) {
                r22 = r2 + 1;
            }
            int r23 = r22;
            if (this.f2844k) {
                r23 = r22 + 1;
            }
            int r24 = r23;
            if (isChecked()) {
                r24 = r23 + 1;
            }
            int[] r25 = new int[r24];
            if (isEnabled()) {
                r25[0] = 16842910;
                r3 = 1;
            } else {
                r3 = 0;
            }
            if (this.f2846m) {
                r25[r3] = 16842908;
                r3++;
            }
            if (this.f2845l) {
                r25[r3] = 16843623;
                r3++;
            }
            if (this.f2844k) {
                r25[r3] = 16842919;
                r3++;
            }
            if (isChecked()) {
                r25[r3] = 16842913;
            }
            if (!Arrays.equals(c0522f2.f1432y0, r25)) {
                c0522f2.f1432y0 = r25;
                if (c0522f2.m1374T()) {
                    z2 = c0522f2.m1381v(c0522f2.getState(), r25);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m2098e() {
        C0522f c0522f;
        if (!m2096c() || (c0522f = this.f2838e) == null || !c0522f.f1390K || this.f2841h == null) {
            AbstractC0283P.m779l(this, null);
            this.f2852s = false;
        } else {
            AbstractC0283P.m779l(this, this.f2851r);
            this.f2852s = true;
        }
    }

    /* renamed from: f */
    public final void m2099f() {
        this.f2840g = new RippleDrawable(AbstractC0739a.m2017a(this.f2838e.f1381D), getBackgroundDrawable(), null);
        this.f2838e.getClass();
        RippleDrawable rippleDrawable = this.f2840g;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setBackground(rippleDrawable);
        m2100g();
    }

    /* renamed from: g */
    public final void m2100g() {
        C0522f c0522f;
        if (TextUtils.isEmpty(getText()) || (c0522f = this.f2838e) == null) {
            return;
        }
        int m1378q = (int) (c0522f.m1378q() + c0522f.f1409d0 + c0522f.f1406a0);
        C0522f c0522f2 = this.f2838e;
        int m1377p = (int) (c0522f2.m1377p() + c0522f2.f1402W + c0522f2.f1405Z);
        if (this.f2839f != null) {
            Rect rect = new Rect();
            this.f2839f.getPadding(rect);
            m1377p += rect.left;
            m1378q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setPaddingRelative(m1377p, paddingTop, m1378q, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2850q)) {
            return this.f2850q;
        }
        if (!m2097d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2839f;
        return insetDrawable == null ? this.f2838e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1398S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1399T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1431y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return Math.max(0.0f, c0522f.m1379r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2838e;
    }

    public float getChipEndPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1409d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0522f c0522f = this.f2838e;
        if (c0522f == null || (drawable = c0522f.f1386G) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof InterfaceC0101g;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1388I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1387H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1433z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1402W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1377B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1379C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0522f c0522f = this.f2838e;
        if (c0522f == null || (drawable = c0522f.f1391L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof InterfaceC0101g;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1395P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1408c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1394O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1407b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1393N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1378B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2852s) {
            C0520d c0520d = this.f2851r;
            if (c0520d.f1339l == 1 || c0520d.f1338k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0368b getHideMotionSpec() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1401V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1404Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1403X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1381D;
        }
        return null;
    }

    public C0885k getShapeAppearanceModel() {
        return this.f2838e.f3659a.f3642a;
    }

    public C0368b getShowMotionSpec() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1400U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1406a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            return c0522f.f1405Z;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m2101h() {
        TextPaint paint = getPaint();
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            paint.drawableState = c0522f.getState();
        }
        C0724d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m1983e(getContext(), paint, this.f2855v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0387m.m1105N(this, this.f2838e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(r2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2836x);
        }
        if (m2097d()) {
            View.mergeDrawableStates(onCreateDrawableState, f2837y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int r5, Rect rect) {
        super.onFocusChanged(z2, r5, rect);
        if (this.f2852s) {
            C0520d c0520d = this.f2851r;
            int r12 = c0520d.f1339l;
            if (r12 != Integer.MIN_VALUE) {
                c0520d.m1324j(r12);
            }
            if (z2) {
                c0520d.m1327m(r5, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m2097d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int r5) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, r5);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int r2) {
        super.onRtlPropertiesChanged(r2);
        if (this.f2848o != r2) {
            this.f2848o = r2;
            m2100g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f2844k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f2844k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f2841h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f2852s
            if (r0 == 0) goto L43
            T0.d r0 = r5.f2851r
            r0.m1331q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2850q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2840g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p104l.C2603r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2840g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p104l.C2603r, android.view.View
    public void setBackgroundResource(int r2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1382w(z2);
        }
    }

    public void setCheckableResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1382w(c0522f.f1410e0.getResources().getBoolean(r3));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null) {
            this.f2843j = z2;
        } else if (c0522f.f1396Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1383x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int r12) {
        setCheckedIconVisible(r12);
    }

    public void setCheckedIconResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1383x(AbstractC0580g.m1449n(c0522f.f1410e0, r3));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1384y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1384y(AbstractC0005b.m75u(c0522f.f1410e0, r3));
        }
    }

    public void setCheckedIconVisible(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1385z(c0522f.f1410e0.getResources().getBoolean(r3));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1431y == colorStateList) {
            return;
        }
        c0522f.f1431y = colorStateList;
        c0522f.onStateChange(c0522f.getState());
    }

    public void setChipBackgroundColorResource(int r3) {
        ColorStateList m75u;
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1431y == (m75u = AbstractC0005b.m75u(c0522f.f1410e0, r3))) {
            return;
        }
        c0522f.f1431y = m75u;
        c0522f.onStateChange(c0522f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1355A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1355A(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    public void setChipDrawable(C0522f c0522f) {
        C0522f c0522f2 = this.f2838e;
        if (c0522f2 != c0522f) {
            if (c0522f2 != null) {
                c0522f2.f1376A0 = new WeakReference(null);
            }
            this.f2838e = c0522f;
            c0522f.f1380C0 = false;
            c0522f.f1376A0 = new WeakReference(this);
            m2095b(this.f2849p);
        }
    }

    public void setChipEndPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1409d0 == f) {
            return;
        }
        c0522f.f1409d0 = f;
        c0522f.invalidateSelf();
        c0522f.m1380u();
    }

    public void setChipEndPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            float dimension = c0522f.f1410e0.getResources().getDimension(r3);
            if (c0522f.f1409d0 != dimension) {
                c0522f.f1409d0 = dimension;
                c0522f.invalidateSelf();
                c0522f.m1380u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1356B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int r12) {
        setChipIconVisible(r12);
    }

    public void setChipIconResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1356B(AbstractC0580g.m1449n(c0522f.f1410e0, r3));
        }
    }

    public void setChipIconSize(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1357C(f);
        }
    }

    public void setChipIconSizeResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1357C(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1358D(colorStateList);
        }
    }

    public void setChipIconTintResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1358D(AbstractC0005b.m75u(c0522f.f1410e0, r3));
        }
    }

    public void setChipIconVisible(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1359E(c0522f.f1410e0.getResources().getBoolean(r3));
        }
    }

    public void setChipMinHeight(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1433z == f) {
            return;
        }
        c0522f.f1433z = f;
        c0522f.invalidateSelf();
        c0522f.m1380u();
    }

    public void setChipMinHeightResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            float dimension = c0522f.f1410e0.getResources().getDimension(r3);
            if (c0522f.f1433z != dimension) {
                c0522f.f1433z = dimension;
                c0522f.invalidateSelf();
                c0522f.m1380u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1402W == f) {
            return;
        }
        c0522f.f1402W = f;
        c0522f.invalidateSelf();
        c0522f.m1380u();
    }

    public void setChipStartPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            float dimension = c0522f.f1410e0.getResources().getDimension(r3);
            if (c0522f.f1402W != dimension) {
                c0522f.f1402W = dimension;
                c0522f.invalidateSelf();
                c0522f.m1380u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1360F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1360F(AbstractC0005b.m75u(c0522f.f1410e0, r3));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1361G(f);
        }
    }

    public void setChipStrokeWidthResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1361G(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int r2) {
        setText(getResources().getString(r2));
    }

    public void setCloseIcon(Drawable drawable) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1362H(drawable);
        }
        m2098e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1395P == charSequence) {
            return;
        }
        String str = C0193b.f591b;
        C0193b c0193b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0193b.f594e : C0193b.f593d;
        c0193b.getClass();
        C0201j c0201j = AbstractC0202k.f604a;
        c0522f.f1395P = c0193b.m558c(charSequence);
        c0522f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int r12) {
        setCloseIconVisible(r12);
    }

    public void setCloseIconEndPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1363I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1363I(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    public void setCloseIconResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1362H(AbstractC0580g.m1449n(c0522f.f1410e0, r3));
        }
        m2098e();
    }

    public void setCloseIconSize(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1364J(f);
        }
    }

    public void setCloseIconSizeResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1364J(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1365K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1365K(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1366L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1366L(AbstractC0005b.m75u(c0522f.f1410e0, r3));
        }
    }

    public void setCloseIconVisible(int r2) {
        setCloseIconVisible(getResources().getBoolean(r2));
    }

    @Override // p104l.C2603r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p104l.C2603r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r12, int r2, int r3, int r4) {
        if (r12 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (r3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r12, r2, r3, r4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r12, int r2, int r3, int r4) {
        if (r12 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (r3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(r12, r2, r3, r4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m2406i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2838e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.f1378B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2847n = z2;
        m2095b(this.f2849p);
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
        if (r2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(r2);
        }
    }

    public void setHideMotionSpec(C0368b c0368b) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.f1401V = c0368b;
        }
    }

    public void setHideMotionSpecResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.f1401V = C0368b.m1038a(c0522f.f1410e0, r3);
        }
    }

    public void setIconEndPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1368N(f);
        }
    }

    public void setIconEndPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1368N(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    public void setIconStartPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1369O(f);
        }
    }

    public void setIconStartPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1369O(c0522f.f1410e0.getResources().getDimension(r3));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
        if (this.f2838e == null) {
            return;
        }
        super.setLayoutDirection(r2);
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
        if (r2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(r2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
        if (r2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(r2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int r2) {
        super.setMaxWidth(r2);
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.f1382D0 = r2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
        if (r2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(r2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2842i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2841h = onClickListener;
        m2098e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1370P(colorStateList);
        }
        this.f2838e.getClass();
        m2099f();
    }

    public void setRippleColorResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1370P(AbstractC0005b.m75u(c0522f.f1410e0, r3));
            this.f2838e.getClass();
            m2099f();
        }
    }

    @Override // p081e1.InterfaceC0896v
    public void setShapeAppearanceModel(C0885k c0885k) {
        this.f2838e.setShapeAppearanceModel(c0885k);
    }

    public void setShowMotionSpec(C0368b c0368b) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.f1400U = c0368b;
        }
    }

    public void setShowMotionSpecResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.f1400U = C0368b.m1038a(c0522f.f1410e0, r3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0522f.f1380C0 ? null : charSequence, bufferType);
        C0522f c0522f2 = this.f2838e;
        if (c0522f2 == null || TextUtils.equals(c0522f2.f1383E, charSequence)) {
            return;
        }
        c0522f2.f1383E = charSequence;
        c0522f2.f1416k0.f1557d = true;
        c0522f2.invalidateSelf();
        c0522f2.m1380u();
    }

    public void setTextAppearance(C0724d c0724d) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1371Q(c0724d);
        }
        m2101h();
    }

    public void setTextAppearanceResource(int r2) {
        setTextAppearance(getContext(), r2);
    }

    public void setTextEndPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1406a0 == f) {
            return;
        }
        c0522f.f1406a0 = f;
        c0522f.invalidateSelf();
        c0522f.m1380u();
    }

    public void setTextEndPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            float dimension = c0522f.f1410e0.getResources().getDimension(r3);
            if (c0522f.f1406a0 != dimension) {
                c0522f.f1406a0 = dimension;
                c0522f.invalidateSelf();
                c0522f.m1380u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float f) {
        super.setTextSize(r3, f);
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            float applyDimension = TypedValue.applyDimension(r3, f, getResources().getDisplayMetrics());
            C0554i c0554i = c0522f.f1416k0;
            C0724d c0724d = c0554i.f1559f;
            if (c0724d != null) {
                c0724d.f2609k = applyDimension;
                c0554i.f1554a.setTextSize(applyDimension);
                c0522f.m1380u();
                c0522f.invalidateSelf();
            }
        }
        m2101h();
    }

    public void setTextStartPadding(float f) {
        C0522f c0522f = this.f2838e;
        if (c0522f == null || c0522f.f1405Z == f) {
            return;
        }
        c0522f.f1405Z = f;
        c0522f.invalidateSelf();
        c0522f.m1380u();
    }

    public void setTextStartPaddingResource(int r3) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            float dimension = c0522f.f1410e0.getResources().getDimension(r3);
            if (c0522f.f1405Z != dimension) {
                c0522f.f1405Z = dimension;
                c0522f.invalidateSelf();
                c0522f.m1380u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1367M(z2);
        }
        m2098e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1385z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1359E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r4) {
        super.setTextAppearance(context, r4);
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1371Q(new C0724d(c0522f.f1410e0, r4));
        }
        m2101h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
        super.setTextAppearance(r4);
        C0522f c0522f = this.f2838e;
        if (c0522f != null) {
            c0522f.m1371Q(new C0724d(c0522f.f1410e0, r4));
        }
        m2101h();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0550e interfaceC0550e) {
    }
}
