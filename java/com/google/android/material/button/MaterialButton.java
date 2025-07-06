package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p006C.C0055g;
import p009D.AbstractC0095a;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0387m;
import p047Q0.C0447b;
import p047Q0.C0448c;
import p047Q0.InterfaceC0446a;
import p065Y0.AbstractC0556k;
import p074c1.AbstractC0739a;
import p081e1.C0875a;
import p081e1.C0884j;
import p081e1.C0885k;
import p081e1.InterfaceC0896v;
import p101j1.AbstractC2447a;
import p104l.C2600q;

/* loaded from: classes.dex */
public class MaterialButton extends C2600q implements Checkable, InterfaceC0896v {

    /* renamed from: r */
    public static final int[] f2805r = {R.attr.state_checkable};

    /* renamed from: s */
    public static final int[] f2806s = {R.attr.state_checked};

    /* renamed from: d */
    public final C0448c f2807d;

    /* renamed from: e */
    public final LinkedHashSet f2808e;

    /* renamed from: f */
    public InterfaceC0446a f2809f;

    /* renamed from: g */
    public PorterDuff.Mode f2810g;

    /* renamed from: h */
    public ColorStateList f2811h;

    /* renamed from: i */
    public Drawable f2812i;

    /* renamed from: j */
    public String f2813j;

    /* renamed from: k */
    public int f2814k;

    /* renamed from: l */
    public int f2815l;

    /* renamed from: m */
    public int f2816m;

    /* renamed from: n */
    public int f2817n;

    /* renamed from: o */
    public boolean f2818o;

    /* renamed from: p */
    public boolean f2819p;

    /* renamed from: q */
    public int f2820q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, com.carwizard.p075li.youtube.R.attr.materialButtonStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Button), attributeSet, com.carwizard.p075li.youtube.R.attr.materialButtonStyle);
        this.f2808e = new LinkedHashSet();
        this.f2818o = false;
        this.f2819p = false;
        Context context2 = getContext();
        TypedArray m1412f = AbstractC0556k.m1412f(context2, attributeSet, AbstractC0345a.f958j, com.carwizard.p075li.youtube.R.attr.materialButtonStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2817n = m1412f.getDimensionPixelSize(12, 0);
        int r12 = m1412f.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2810g = AbstractC0556k.m1413g(r12, mode);
        this.f2811h = AbstractC0387m.m1121s(getContext(), m1412f, 14);
        this.f2812i = AbstractC0387m.m1122t(getContext(), m1412f, 10);
        this.f2820q = m1412f.getInteger(11, 1);
        this.f2814k = m1412f.getDimensionPixelSize(13, 0);
        C0448c c0448c = new C0448c(this, C0885k.m2414b(context2, attributeSet, com.carwizard.p075li.youtube.R.attr.materialButtonStyle, com.carwizard.p075li.youtube.R.style.Widget_MaterialComponents_Button).m2412a());
        this.f2807d = c0448c;
        c0448c.f1138c = m1412f.getDimensionPixelOffset(1, 0);
        c0448c.f1139d = m1412f.getDimensionPixelOffset(2, 0);
        c0448c.f1140e = m1412f.getDimensionPixelOffset(3, 0);
        c0448c.f1141f = m1412f.getDimensionPixelOffset(4, 0);
        if (m1412f.hasValue(8)) {
            int dimensionPixelSize = m1412f.getDimensionPixelSize(8, -1);
            c0448c.f1142g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C0884j m2417e = c0448c.f1137b.m2417e();
            m2417e.f3686e = new C0875a(f);
            m2417e.f3687f = new C0875a(f);
            m2417e.f3688g = new C0875a(f);
            m2417e.f3689h = new C0875a(f);
            c0448c.m1201c(m2417e.m2412a());
            c0448c.f1151p = true;
        }
        c0448c.f1143h = m1412f.getDimensionPixelSize(20, 0);
        c0448c.f1144i = AbstractC0556k.m1413g(m1412f.getInt(7, -1), mode);
        c0448c.f1145j = AbstractC0387m.m1121s(getContext(), m1412f, 6);
        c0448c.f1146k = AbstractC0387m.m1121s(getContext(), m1412f, 19);
        c0448c.f1147l = AbstractC0387m.m1121s(getContext(), m1412f, 16);
        c0448c.f1152q = m1412f.getBoolean(5, false);
        c0448c.f1155t = m1412f.getDimensionPixelSize(9, 0);
        c0448c.f1153r = m1412f.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (m1412f.hasValue(0)) {
            c0448c.f1150o = true;
            setSupportBackgroundTintList(c0448c.f1145j);
            setSupportBackgroundTintMode(c0448c.f1144i);
        } else {
            c0448c.m1203e();
        }
        setPaddingRelative(paddingStart + c0448c.f1138c, paddingTop + c0448c.f1140e, paddingEnd + c0448c.f1139d, paddingBottom + c0448c.f1141f);
        m1412f.recycle();
        setCompoundDrawablePadding(this.f2817n);
        m2081d(this.f2812i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int r2 = 0; r2 < lineCount; r2++) {
            f = Math.max(f, getLayout().getLineWidth(r2));
        }
        return (int) Math.ceil(f);
    }

    /* renamed from: a */
    public final boolean m2078a() {
        C0448c c0448c = this.f2807d;
        return c0448c != null && c0448c.f1152q;
    }

    /* renamed from: b */
    public final boolean m2079b() {
        C0448c c0448c = this.f2807d;
        return (c0448c == null || c0448c.f1150o) ? false : true;
    }

    /* renamed from: c */
    public final void m2080c() {
        int r02 = this.f2820q;
        boolean z2 = true;
        if (r02 != 1 && r02 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f2812i, null, null, null);
            return;
        }
        if (r02 == 3 || r02 == 4) {
            setCompoundDrawablesRelative(null, null, this.f2812i, null);
        } else if (r02 == 16 || r02 == 32) {
            setCompoundDrawablesRelative(null, this.f2812i, null, null);
        }
    }

    /* renamed from: d */
    public final void m2081d(boolean z2) {
        Drawable drawable = this.f2812i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2812i = mutate;
            AbstractC0095a.m319h(mutate, this.f2811h);
            PorterDuff.Mode mode = this.f2810g;
            if (mode != null) {
                AbstractC0095a.m320i(this.f2812i, mode);
            }
            int r02 = this.f2814k;
            if (r02 == 0) {
                r02 = this.f2812i.getIntrinsicWidth();
            }
            int r2 = this.f2814k;
            if (r2 == 0) {
                r2 = this.f2812i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2812i;
            int r4 = this.f2815l;
            int r5 = this.f2816m;
            drawable2.setBounds(r4, r5, r02 + r4, r2 + r5);
            this.f2812i.setVisible(true, z2);
        }
        if (z2) {
            m2080c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int r42 = this.f2820q;
        if (((r42 == 1 || r42 == 2) && drawable3 != this.f2812i) || (((r42 == 3 || r42 == 4) && drawable5 != this.f2812i) || ((r42 == 16 || r42 == 32) && drawable4 != this.f2812i))) {
            m2080c();
        }
    }

    /* renamed from: e */
    public final void m2082e(int r8, int r9) {
        if (this.f2812i == null || getLayout() == null) {
            return;
        }
        int r12 = this.f2820q;
        if (!(r12 == 1 || r12 == 2) && r12 != 3 && r12 != 4) {
            if (r12 == 16 || r12 == 32) {
                this.f2815l = 0;
                if (r12 == 16) {
                    this.f2816m = 0;
                    m2081d(false);
                    return;
                }
                int r82 = this.f2814k;
                if (r82 == 0) {
                    r82 = this.f2812i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((r9 - getTextHeight()) - getPaddingTop()) - r82) - this.f2817n) - getPaddingBottom()) / 2);
                if (this.f2816m != max) {
                    this.f2816m = max;
                    m2081d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2816m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int r13 = this.f2820q;
        if (r13 == 1 || r13 == 3 || ((r13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (r13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2815l = 0;
            m2081d(false);
            return;
        }
        int r14 = this.f2814k;
        if (r14 == 0) {
            r14 = this.f2812i.getIntrinsicWidth();
        }
        int textLayoutWidth = r8 - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - r14) - this.f2817n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2820q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2815l != paddingEnd) {
            this.f2815l = paddingEnd;
            m2081d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f2813j)) {
            return (m2078a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f2813j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2079b()) {
            return this.f2807d.f1142g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2812i;
    }

    public int getIconGravity() {
        return this.f2820q;
    }

    public int getIconPadding() {
        return this.f2817n;
    }

    public int getIconSize() {
        return this.f2814k;
    }

    public ColorStateList getIconTint() {
        return this.f2811h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2810g;
    }

    public int getInsetBottom() {
        return this.f2807d.f1141f;
    }

    public int getInsetTop() {
        return this.f2807d.f1140e;
    }

    public ColorStateList getRippleColor() {
        if (m2079b()) {
            return this.f2807d.f1147l;
        }
        return null;
    }

    public C0885k getShapeAppearanceModel() {
        if (m2079b()) {
            return this.f2807d.f1137b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2079b()) {
            return this.f2807d.f1146k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2079b()) {
            return this.f2807d.f1143h;
        }
        return 0;
    }

    @Override // p104l.C2600q
    public ColorStateList getSupportBackgroundTintList() {
        return m2079b() ? this.f2807d.f1145j : super.getSupportBackgroundTintList();
    }

    @Override // p104l.C2600q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2079b() ? this.f2807d.f1144i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2818o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2079b()) {
            AbstractC0387m.m1105N(this, this.f2807d.m1200b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(r2 + 2);
        if (m2078a()) {
            View.mergeDrawableStates(onCreateDrawableState, f2805r);
        }
        if (this.f2818o) {
            View.mergeDrawableStates(onCreateDrawableState, f2806s);
        }
        return onCreateDrawableState;
    }

    @Override // p104l.C2600q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2818o);
    }

    @Override // p104l.C2600q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m2078a());
        accessibilityNodeInfo.setChecked(this.f2818o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p104l.C2600q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        m2082e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0447b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0447b c0447b = (C0447b) parcelable;
        super.onRestoreInstanceState(c0447b.f1263a);
        setChecked(c0447b.f1135c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0447b c0447b = new C0447b(super.onSaveInstanceState());
        c0447b.f1135c = this.f2818o;
        return c0447b;
    }

    @Override // p104l.C2600q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        super.onTextChanged(charSequence, r2, r3, r4);
        m2082e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2807d.f1153r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2812i != null) {
            if (this.f2812i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2813j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int r4) {
        if (!m2079b()) {
            super.setBackgroundColor(r4);
            return;
        }
        C0448c c0448c = this.f2807d;
        if (c0448c.m1200b(false) != null) {
            c0448c.m1200b(false).setTint(r4);
        }
    }

    @Override // p104l.C2600q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m2079b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C0448c c0448c = this.f2807d;
        c0448c.f1150o = true;
        ColorStateList colorStateList = c0448c.f1145j;
        MaterialButton materialButton = c0448c.f1136a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0448c.f1144i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p104l.C2600q, android.view.View
    public void setBackgroundResource(int r2) {
        setBackgroundDrawable(r2 != 0 ? AbstractC0580g.m1449n(getContext(), r2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m2079b()) {
            this.f2807d.f1152q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (m2078a() && isEnabled() && this.f2818o != z2) {
            this.f2818o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2818o;
                if (!materialButtonToggleGroup.f2827f) {
                    materialButtonToggleGroup.m2084b(getId(), z3);
                }
            }
            if (this.f2819p) {
                return;
            }
            this.f2819p = true;
            Iterator it = this.f2808e.iterator();
            if (it.hasNext()) {
                throw AbstractC0002c.m10e(it);
            }
            this.f2819p = false;
        }
    }

    public void setCornerRadius(int r4) {
        if (m2079b()) {
            C0448c c0448c = this.f2807d;
            if (c0448c.f1151p && c0448c.f1142g == r4) {
                return;
            }
            c0448c.f1142g = r4;
            c0448c.f1151p = true;
            float f = r4;
            C0884j m2417e = c0448c.f1137b.m2417e();
            m2417e.f3686e = new C0875a(f);
            m2417e.f3687f = new C0875a(f);
            m2417e.f3688g = new C0875a(f);
            m2417e.f3689h = new C0875a(f);
            c0448c.m1201c(m2417e.m2412a());
        }
    }

    public void setCornerRadiusResource(int r2) {
        if (m2079b()) {
            setCornerRadius(getResources().getDimensionPixelSize(r2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m2079b()) {
            this.f2807d.m1200b(false).m2406i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2812i != drawable) {
            this.f2812i = drawable;
            m2081d(true);
            m2082e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int r2) {
        if (this.f2820q != r2) {
            this.f2820q = r2;
            m2082e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int r2) {
        if (this.f2817n != r2) {
            this.f2817n = r2;
            setCompoundDrawablePadding(r2);
        }
    }

    public void setIconResource(int r2) {
        setIcon(r2 != 0 ? AbstractC0580g.m1449n(getContext(), r2) : null);
    }

    public void setIconSize(int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2814k != r2) {
            this.f2814k = r2;
            m2081d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2811h != colorStateList) {
            this.f2811h = colorStateList;
            m2081d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2810g != mode) {
            this.f2810g = mode;
            m2081d(false);
        }
    }

    public void setIconTintResource(int r2) {
        setIconTint(AbstractC0005b.m75u(getContext(), r2));
    }

    public void setInsetBottom(int r3) {
        C0448c c0448c = this.f2807d;
        c0448c.m1202d(c0448c.f1140e, r3);
    }

    public void setInsetTop(int r3) {
        C0448c c0448c = this.f2807d;
        c0448c.m1202d(r3, c0448c.f1141f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0446a interfaceC0446a) {
        this.f2809f = interfaceC0446a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0446a interfaceC0446a = this.f2809f;
        if (interfaceC0446a != null) {
            ((MaterialButtonToggleGroup) ((C0055g) interfaceC0446a).f107b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2079b()) {
            C0448c c0448c = this.f2807d;
            if (c0448c.f1147l != colorStateList) {
                c0448c.f1147l = colorStateList;
                MaterialButton materialButton = c0448c.f1136a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0739a.m2017a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int r2) {
        if (m2079b()) {
            setRippleColor(AbstractC0005b.m75u(getContext(), r2));
        }
    }

    @Override // p081e1.InterfaceC0896v
    public void setShapeAppearanceModel(C0885k c0885k) {
        if (!m2079b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2807d.m1201c(c0885k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m2079b()) {
            C0448c c0448c = this.f2807d;
            c0448c.f1149n = z2;
            c0448c.m1204f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2079b()) {
            C0448c c0448c = this.f2807d;
            if (c0448c.f1146k != colorStateList) {
                c0448c.f1146k = colorStateList;
                c0448c.m1204f();
            }
        }
    }

    public void setStrokeColorResource(int r2) {
        if (m2079b()) {
            setStrokeColor(AbstractC0005b.m75u(getContext(), r2));
        }
    }

    public void setStrokeWidth(int r3) {
        if (m2079b()) {
            C0448c c0448c = this.f2807d;
            if (c0448c.f1143h != r3) {
                c0448c.f1143h = r3;
                c0448c.m1204f();
            }
        }
    }

    public void setStrokeWidthResource(int r2) {
        if (m2079b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(r2));
        }
    }

    @Override // p104l.C2600q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2079b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0448c c0448c = this.f2807d;
        if (c0448c.f1145j != colorStateList) {
            c0448c.f1145j = colorStateList;
            if (c0448c.m1200b(false) != null) {
                AbstractC0095a.m319h(c0448c.m1200b(false), c0448c.f1145j);
            }
        }
    }

    @Override // p104l.C2600q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2079b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0448c c0448c = this.f2807d;
        if (c0448c.f1144i != mode) {
            c0448c.f1144i = mode;
            if (c0448c.m1200b(false) == null || c0448c.f1144i == null) {
                return;
            }
            AbstractC0095a.m320i(c0448c.m1200b(false), c0448c.f1144i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int r2) {
        super.setTextAlignment(r2);
        m2082e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2807d.f1153r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2818o);
    }
}
