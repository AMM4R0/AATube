package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0620j;
import java.util.WeakHashMap;
import p001A0.AbstractC0005b;
import p002A1.C0015h;
import p009D.AbstractC0095a;
import p028K.AbstractC0283P;
import p028K.C0343z;
import p036M1.AbstractC0387m;
import p058V.C0532h;
import p076d.AbstractC0780a;
import p089i.C0947a;
import p090i0.C0956b;
import p104l.AbstractC2502A1;
import p104l.AbstractC2575h1;
import p104l.AbstractC2578i1;
import p104l.AbstractC2604r0;
import p104l.C2553a0;
import p104l.C2618w;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: R */
    public static final C0956b f1872R = new C0956b(Float.class, "thumbPos", 7);

    /* renamed from: S */
    public static final int[] f1873S = {R.attr.state_checked};

    /* renamed from: A */
    public int f1874A;

    /* renamed from: B */
    public int f1875B;

    /* renamed from: C */
    public int f1876C;

    /* renamed from: D */
    public int f1877D;

    /* renamed from: E */
    public int f1878E;

    /* renamed from: F */
    public int f1879F;

    /* renamed from: G */
    public int f1880G;

    /* renamed from: H */
    public boolean f1881H;

    /* renamed from: I */
    public final TextPaint f1882I;

    /* renamed from: J */
    public final ColorStateList f1883J;

    /* renamed from: K */
    public StaticLayout f1884K;

    /* renamed from: L */
    public StaticLayout f1885L;

    /* renamed from: M */
    public final C0947a f1886M;

    /* renamed from: N */
    public ObjectAnimator f1887N;

    /* renamed from: O */
    public C2618w f1888O;

    /* renamed from: P */
    public C0532h f1889P;

    /* renamed from: Q */
    public final Rect f1890Q;

    /* renamed from: a */
    public Drawable f1891a;

    /* renamed from: b */
    public ColorStateList f1892b;

    /* renamed from: c */
    public PorterDuff.Mode f1893c;

    /* renamed from: d */
    public boolean f1894d;

    /* renamed from: e */
    public boolean f1895e;

    /* renamed from: f */
    public Drawable f1896f;

    /* renamed from: g */
    public ColorStateList f1897g;

    /* renamed from: h */
    public PorterDuff.Mode f1898h;

    /* renamed from: i */
    public boolean f1899i;

    /* renamed from: j */
    public boolean f1900j;

    /* renamed from: k */
    public int f1901k;

    /* renamed from: l */
    public int f1902l;

    /* renamed from: m */
    public int f1903m;

    /* renamed from: n */
    public boolean f1904n;

    /* renamed from: o */
    public CharSequence f1905o;

    /* renamed from: p */
    public CharSequence f1906p;

    /* renamed from: q */
    public CharSequence f1907q;

    /* renamed from: r */
    public CharSequence f1908r;

    /* renamed from: s */
    public boolean f1909s;

    /* renamed from: t */
    public int f1910t;

    /* renamed from: u */
    public final int f1911u;

    /* renamed from: v */
    public float f1912v;

    /* renamed from: w */
    public float f1913w;

    /* renamed from: x */
    public final VelocityTracker f1914x;

    /* renamed from: y */
    public final int f1915y;

    /* renamed from: z */
    public float f1916z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.carwizard.p075li.youtube.R.attr.switchStyle);
        int resourceId;
        this.f1892b = null;
        this.f1893c = null;
        this.f1894d = false;
        this.f1895e = false;
        this.f1897g = null;
        this.f1898h = null;
        this.f1899i = false;
        this.f1900j = false;
        this.f1914x = VelocityTracker.obtain();
        this.f1881H = true;
        this.f1890Q = new Rect();
        AbstractC2578i1.m5030a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1882I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] r2 = AbstractC0780a.f3136w;
        C0015h m100A = C0015h.m100A(context, attributeSet, r2, com.carwizard.p075li.youtube.R.attr.switchStyle);
        AbstractC0283P.m778k(this, context, r2, attributeSet, (TypedArray) m100A.f26c, com.carwizard.p075li.youtube.R.attr.switchStyle);
        Drawable m121p = m100A.m121p(2);
        this.f1891a = m121p;
        if (m121p != null) {
            m121p.setCallback(this);
        }
        Drawable m121p2 = m100A.m121p(11);
        this.f1896f = m121p2;
        if (m121p2 != null) {
            m121p2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) m100A.f26c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f1909s = typedArray.getBoolean(3, true);
        this.f1901k = typedArray.getDimensionPixelSize(8, 0);
        this.f1902l = typedArray.getDimensionPixelSize(5, 0);
        this.f1903m = typedArray.getDimensionPixelSize(6, 0);
        this.f1904n = typedArray.getBoolean(4, false);
        ColorStateList m120o = m100A.m120o(9);
        if (m120o != null) {
            this.f1892b = m120o;
            this.f1894d = true;
        }
        PorterDuff.Mode m5067c = AbstractC2604r0.m5067c(typedArray.getInt(10, -1), null);
        if (this.f1893c != m5067c) {
            this.f1893c = m5067c;
            this.f1895e = true;
        }
        if (this.f1894d || this.f1895e) {
            m1532a();
        }
        ColorStateList m120o2 = m100A.m120o(12);
        if (m120o2 != null) {
            this.f1897g = m120o2;
            this.f1899i = true;
        }
        PorterDuff.Mode m5067c2 = AbstractC2604r0.m5067c(typedArray.getInt(13, -1), null);
        if (this.f1898h != m5067c2) {
            this.f1898h = m5067c2;
            this.f1900j = true;
        }
        if (this.f1899i || this.f1900j) {
            m1533b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0780a.f3137x);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0005b.m75u(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1883J = colorStateList;
            } else {
                this.f1883J = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int r3 = obtainStyledAttributes.getInt(1, -1);
            int r4 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = r3 != 1 ? r3 != 2 ? r3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (r4 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(r4) : Typeface.create(typeface, r4);
                setSwitchTypeface(defaultFromStyle);
                int r22 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & r4;
                textPaint.setFakeBoldText((r22 & 1) != 0);
                textPaint.setTextSkewX((2 & r22) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0947a c0947a = new C0947a();
                c0947a.f3969a = context2.getResources().getConfiguration().locale;
                this.f1886M = c0947a;
            } else {
                this.f1886M = null;
            }
            setTextOnInternal(this.f1905o);
            setTextOffInternal(this.f1907q);
            obtainStyledAttributes.recycle();
        }
        new C2553a0(this).m5006f(attributeSet, com.carwizard.p075li.youtube.R.attr.switchStyle);
        m100A.m102C();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1911u = viewConfiguration.getScaledTouchSlop();
        this.f1915y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m5085b(attributeSet, com.carwizard.p075li.youtube.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C2618w getEmojiTextViewHelper() {
        if (this.f1888O == null) {
            this.f1888O = new C2618w(this);
        }
        return this.f1888O;
    }

    private boolean getTargetCheckedState() {
        return this.f1916z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((AbstractC2502A1.m4922a(this) ? 1.0f - this.f1916z : this.f1916z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1896f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1890Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1891a;
        Rect m5066b = drawable2 != null ? AbstractC2604r0.m5066b(drawable2) : AbstractC2604r0.f8461c;
        return ((((this.f1874A - this.f1876C) - rect.left) - rect.right) - m5066b.left) - m5066b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1907q = charSequence;
        C2618w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod mo1135Q = ((AbstractC0387m) emojiTextViewHelper.f8504b.f107b).mo1135Q(this.f1886M);
        if (mo1135Q != null) {
            charSequence = mo1135Q.getTransformation(charSequence, this);
        }
        this.f1908r = charSequence;
        this.f1885L = null;
        if (this.f1909s) {
            m1535d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1905o = charSequence;
        C2618w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod mo1135Q = ((AbstractC0387m) emojiTextViewHelper.f8504b.f107b).mo1135Q(this.f1886M);
        if (mo1135Q != null) {
            charSequence = mo1135Q.getTransformation(charSequence, this);
        }
        this.f1906p = charSequence;
        this.f1884K = null;
        if (this.f1909s) {
            m1535d();
        }
    }

    /* renamed from: a */
    public final void m1532a() {
        Drawable drawable = this.f1891a;
        if (drawable != null) {
            if (this.f1894d || this.f1895e) {
                Drawable mutate = drawable.mutate();
                this.f1891a = mutate;
                if (this.f1894d) {
                    AbstractC0095a.m319h(mutate, this.f1892b);
                }
                if (this.f1895e) {
                    AbstractC0095a.m320i(this.f1891a, this.f1893c);
                }
                if (this.f1891a.isStateful()) {
                    this.f1891a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1533b() {
        Drawable drawable = this.f1896f;
        if (drawable != null) {
            if (this.f1899i || this.f1900j) {
                Drawable mutate = drawable.mutate();
                this.f1896f = mutate;
                if (this.f1899i) {
                    AbstractC0095a.m319h(mutate, this.f1897g);
                }
                if (this.f1900j) {
                    AbstractC0095a.m320i(this.f1896f, this.f1898h);
                }
                if (this.f1896f.isStateful()) {
                    this.f1896f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1534c() {
        setTextOnInternal(this.f1905o);
        setTextOffInternal(this.f1907q);
        requestLayout();
    }

    /* renamed from: d */
    public final void m1535d() {
        if (this.f1889P == null && ((AbstractC0387m) this.f1888O.f8504b.f107b).mo1128C() && C0620j.f2070j != null) {
            C0620j m1629a = C0620j.m1629a();
            int m1630b = m1629a.m1630b();
            if (m1630b == 3 || m1630b == 0) {
                C0532h c0532h = new C0532h(this);
                this.f1889P = c0532h;
                m1629a.m1634f(c0532h);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int r6;
        int r5;
        int r02 = this.f1877D;
        int r12 = this.f1878E;
        int r2 = this.f1879F;
        int r3 = this.f1880G;
        int thumbOffset = getThumbOffset() + r02;
        Drawable drawable = this.f1891a;
        Rect m5066b = drawable != null ? AbstractC2604r0.m5066b(drawable) : AbstractC2604r0.f8461c;
        Drawable drawable2 = this.f1896f;
        Rect rect = this.f1890Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int r62 = rect.left;
            thumbOffset += r62;
            if (m5066b != null) {
                int r8 = m5066b.left;
                if (r8 > r62) {
                    r02 += r8 - r62;
                }
                int r63 = m5066b.top;
                int r82 = rect.top;
                r6 = r63 > r82 ? (r63 - r82) + r12 : r12;
                int r83 = m5066b.right;
                int r9 = rect.right;
                if (r83 > r9) {
                    r2 -= r83 - r9;
                }
                int r52 = m5066b.bottom;
                int r84 = rect.bottom;
                if (r52 > r84) {
                    r5 = r3 - (r52 - r84);
                    this.f1896f.setBounds(r02, r6, r2, r5);
                }
            } else {
                r6 = r12;
            }
            r5 = r3;
            this.f1896f.setBounds(r02, r6, r2, r5);
        }
        Drawable drawable3 = this.f1891a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int r03 = thumbOffset - rect.left;
            int r4 = thumbOffset + this.f1876C + rect.right;
            this.f1891a.setBounds(r03, r12, r4, r3);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0095a.m317f(background, r03, r12, r4, r3);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1891a;
        if (drawable != null) {
            AbstractC0095a.m316e(drawable, f, f2);
        }
        Drawable drawable2 = this.f1896f;
        if (drawable2 != null) {
            AbstractC0095a.m316e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1891a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1896f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!AbstractC2502A1.m4922a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1874A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1903m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC2502A1.m4922a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1874A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1903m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0005b.m53S(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1909s;
    }

    public boolean getSplitTrack() {
        return this.f1904n;
    }

    public int getSwitchMinWidth() {
        return this.f1902l;
    }

    public int getSwitchPadding() {
        return this.f1903m;
    }

    public CharSequence getTextOff() {
        return this.f1907q;
    }

    public CharSequence getTextOn() {
        return this.f1905o;
    }

    public Drawable getThumbDrawable() {
        return this.f1891a;
    }

    public final float getThumbPosition() {
        return this.f1916z;
    }

    public int getThumbTextPadding() {
        return this.f1901k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1892b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1893c;
    }

    public Drawable getTrackDrawable() {
        return this.f1896f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1897g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1898h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1891a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1896f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1887N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1887N.end();
        this.f1887N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(r2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1873S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1896f;
        Rect rect = this.f1890Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int r2 = this.f1878E;
        int r3 = this.f1880G;
        int r22 = r2 + rect.top;
        int r32 = r3 - rect.bottom;
        Drawable drawable2 = this.f1891a;
        if (drawable != null) {
            if (!this.f1904n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m5066b = AbstractC2604r0.m5066b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m5066b.left;
                rect.right -= m5066b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1884K : this.f1885L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1883J;
            TextPaint textPaint = this.f1882I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((r22 + r32) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1905o : this.f1907q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int r3, int r4, int r5, int r6) {
        int r52;
        int width;
        int r2;
        int r53;
        int r32;
        super.onLayout(z2, r3, r4, r5, r6);
        int r33 = 0;
        if (this.f1891a != null) {
            Drawable drawable = this.f1896f;
            Rect rect = this.f1890Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m5066b = AbstractC2604r0.m5066b(this.f1891a);
            r52 = Math.max(0, m5066b.left - rect.left);
            r33 = Math.max(0, m5066b.right - rect.right);
        } else {
            r52 = 0;
        }
        if (AbstractC2502A1.m4922a(this)) {
            r2 = getPaddingLeft() + r52;
            width = ((this.f1874A + r2) - r52) - r33;
        } else {
            width = (getWidth() - getPaddingRight()) - r33;
            r2 = (width - this.f1874A) + r52 + r33;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int r34 = this.f1875B;
            int r54 = height - (r34 / 2);
            r53 = r34 + r54;
            r32 = r54;
        } else if (gravity != 80) {
            r32 = getPaddingTop();
            r53 = this.f1875B + r32;
        } else {
            r53 = getHeight() - getPaddingBottom();
            r32 = r53 - this.f1875B;
        }
        this.f1877D = r2;
        this.f1878E = r32;
        this.f1880G = r53;
        this.f1879F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r12, int r13) {
        int r02;
        int r3;
        int r14 = 0;
        if (this.f1909s) {
            StaticLayout staticLayout = this.f1884K;
            TextPaint textPaint = this.f1882I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1906p;
                this.f1884K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f1885L == null) {
                CharSequence charSequence2 = this.f1908r;
                this.f1885L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1891a;
        Rect rect = this.f1890Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            r02 = (this.f1891a.getIntrinsicWidth() - rect.left) - rect.right;
            r3 = this.f1891a.getIntrinsicHeight();
        } else {
            r02 = 0;
            r3 = 0;
        }
        this.f1876C = Math.max(this.f1909s ? (this.f1901k * 2) + Math.max(this.f1884K.getWidth(), this.f1885L.getWidth()) : 0, r02);
        Drawable drawable2 = this.f1896f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            r14 = this.f1896f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int r03 = rect.left;
        int r2 = rect.right;
        Drawable drawable3 = this.f1891a;
        if (drawable3 != null) {
            Rect m5066b = AbstractC2604r0.m5066b(drawable3);
            r03 = Math.max(r03, m5066b.left);
            r2 = Math.max(r2, m5066b.right);
        }
        int max = this.f1881H ? Math.max(this.f1902l, (this.f1876C * 2) + r03 + r2) : this.f1902l;
        int max2 = Math.max(r14, r3);
        this.f1874A = max;
        this.f1875B = max2;
        super.onMeasure(r12, r13);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1905o : this.f1907q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m5086c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1905o;
                if (obj == null) {
                    obj = getResources().getString(com.carwizard.p075li.youtube.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                new C0343z(com.carwizard.p075li.youtube.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m692d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f1907q;
            if (obj3 == null) {
                obj3 = getResources().getString(com.carwizard.p075li.youtube.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
            new C0343z(com.carwizard.p075li.youtube.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m692d(this, obj4);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = AbstractC0283P.f842a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1872R, isChecked ? 1.0f : 0.0f);
                this.f1887N = ofFloat;
                ofFloat.setDuration(250L);
                AbstractC2575h1.m5028a(this.f1887N, true);
                this.f1887N.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1887N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0005b.m54T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m5087d(z2);
        setTextOnInternal(this.f1905o);
        setTextOffInternal(this.f1907q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f1881H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m5084a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f1909s != z2) {
            this.f1909s = z2;
            requestLayout();
            if (z2) {
                m1535d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1904n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int r12) {
        this.f1902l = r12;
        requestLayout();
    }

    public void setSwitchPadding(int r12) {
        this.f1903m = r12;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1882I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f1907q;
        if (obj == null) {
            obj = getResources().getString(com.carwizard.p075li.youtube.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        new C0343z(com.carwizard.p075li.youtube.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m692d(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f1905o;
        if (obj == null) {
            obj = getResources().getString(com.carwizard.p075li.youtube.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        new C0343z(com.carwizard.p075li.youtube.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m692d(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1891a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1891a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f1916z = f;
        invalidate();
    }

    public void setThumbResource(int r2) {
        setThumbDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setThumbTextPadding(int r12) {
        this.f1901k = r12;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1892b = colorStateList;
        this.f1894d = true;
        m1532a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1893c = mode;
        this.f1895e = true;
        m1532a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1896f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1896f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int r2) {
        setTrackDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1897g = colorStateList;
        this.f1899i = true;
        m1533b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1898h = mode;
        this.f1900j = true;
        m1533b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1891a || drawable == this.f1896f;
    }
}
