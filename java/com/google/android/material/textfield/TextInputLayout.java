package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import p000A.AbstractC0001b;
import p001A0.AbstractC0005b;
import p002A1.C0015h;
import p006C.AbstractC0049a;
import p006C.C0055g;
import p009D.AbstractC0095a;
import p010D0.RunnableC0107e;
import p011D1.C0120g;
import p022I.AbstractC0202k;
import p022I.C0193b;
import p022I.C0201j;
import p028K.AbstractC0274G;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p032L0.AbstractC0367a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p044P0.C0418b;
import p050R0.RunnableC0458b;
import p065Y0.AbstractC0548c;
import p065Y0.AbstractC0556k;
import p065Y0.C0547b;
import p072b1.C0721a;
import p072b1.C0724d;
import p081e1.C0875a;
import p081e1.C0879e;
import p081e1.C0880f;
import p081e1.C0881g;
import p081e1.C0883i;
import p081e1.C0884j;
import p081e1.C0885k;
import p081e1.InterfaceC0877c;
import p088h1.C0926f;
import p088h1.C0927g;
import p088h1.C0930j;
import p088h1.C0932l;
import p088h1.C0933m;
import p088h1.C0936p;
import p088h1.C0937q;
import p088h1.C0940t;
import p088h1.C0942v;
import p088h1.C0943w;
import p088h1.C0944x;
import p088h1.C0946z;
import p088h1.InterfaceC0945y;
import p090i0.AbstractC0971q;
import p090i0.C0962h;
import p101j1.AbstractC2447a;
import p103k0.AbstractC2480a;
import p104l.AbstractC2604r0;
import p104l.C2562d0;
import p104l.C2609t;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0 */
    public static final int[][] f2992C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public ColorStateList f2993A;

    /* renamed from: A0 */
    public boolean f2994A0;

    /* renamed from: B */
    public ColorStateList f2995B;

    /* renamed from: B0 */
    public boolean f2996B0;

    /* renamed from: C */
    public boolean f2997C;

    /* renamed from: D */
    public CharSequence f2998D;

    /* renamed from: E */
    public boolean f2999E;

    /* renamed from: F */
    public C0881g f3000F;

    /* renamed from: G */
    public C0881g f3001G;

    /* renamed from: H */
    public StateListDrawable f3002H;

    /* renamed from: I */
    public boolean f3003I;

    /* renamed from: J */
    public C0881g f3004J;

    /* renamed from: K */
    public C0881g f3005K;

    /* renamed from: L */
    public C0885k f3006L;

    /* renamed from: M */
    public boolean f3007M;

    /* renamed from: N */
    public final int f3008N;

    /* renamed from: O */
    public int f3009O;

    /* renamed from: P */
    public int f3010P;

    /* renamed from: Q */
    public int f3011Q;

    /* renamed from: R */
    public int f3012R;

    /* renamed from: S */
    public int f3013S;

    /* renamed from: T */
    public int f3014T;

    /* renamed from: U */
    public int f3015U;

    /* renamed from: V */
    public final Rect f3016V;

    /* renamed from: W */
    public final Rect f3017W;

    /* renamed from: a */
    public final FrameLayout f3018a;

    /* renamed from: a0 */
    public final RectF f3019a0;

    /* renamed from: b */
    public final C0942v f3020b;

    /* renamed from: b0 */
    public Typeface f3021b0;

    /* renamed from: c */
    public final C0933m f3022c;

    /* renamed from: c0 */
    public ColorDrawable f3023c0;

    /* renamed from: d */
    public EditText f3024d;

    /* renamed from: d0 */
    public int f3025d0;

    /* renamed from: e */
    public CharSequence f3026e;

    /* renamed from: e0 */
    public final LinkedHashSet f3027e0;

    /* renamed from: f */
    public int f3028f;

    /* renamed from: f0 */
    public ColorDrawable f3029f0;

    /* renamed from: g */
    public int f3030g;

    /* renamed from: g0 */
    public int f3031g0;

    /* renamed from: h */
    public int f3032h;

    /* renamed from: h0 */
    public Drawable f3033h0;

    /* renamed from: i */
    public int f3034i;

    /* renamed from: i0 */
    public ColorStateList f3035i0;

    /* renamed from: j */
    public final C0937q f3036j;

    /* renamed from: j0 */
    public ColorStateList f3037j0;

    /* renamed from: k */
    public boolean f3038k;

    /* renamed from: k0 */
    public int f3039k0;

    /* renamed from: l */
    public int f3040l;

    /* renamed from: l0 */
    public int f3041l0;

    /* renamed from: m */
    public boolean f3042m;

    /* renamed from: m0 */
    public int f3043m0;

    /* renamed from: n */
    public InterfaceC0945y f3044n;

    /* renamed from: n0 */
    public ColorStateList f3045n0;

    /* renamed from: o */
    public C2562d0 f3046o;

    /* renamed from: o0 */
    public int f3047o0;

    /* renamed from: p */
    public int f3048p;

    /* renamed from: p0 */
    public int f3049p0;

    /* renamed from: q */
    public int f3050q;

    /* renamed from: q0 */
    public int f3051q0;

    /* renamed from: r */
    public CharSequence f3052r;

    /* renamed from: r0 */
    public int f3053r0;

    /* renamed from: s */
    public boolean f3054s;

    /* renamed from: s0 */
    public int f3055s0;

    /* renamed from: t */
    public C2562d0 f3056t;

    /* renamed from: t0 */
    public int f3057t0;

    /* renamed from: u */
    public ColorStateList f3058u;

    /* renamed from: u0 */
    public boolean f3059u0;

    /* renamed from: v */
    public int f3060v;

    /* renamed from: v0 */
    public final C0547b f3061v0;

    /* renamed from: w */
    public C0962h f3062w;

    /* renamed from: w0 */
    public boolean f3063w0;

    /* renamed from: x */
    public C0962h f3064x;

    /* renamed from: x0 */
    public boolean f3065x0;

    /* renamed from: y */
    public ColorStateList f3066y;

    /* renamed from: y0 */
    public ValueAnimator f3067y0;

    /* renamed from: z */
    public ColorStateList f3068z;

    /* renamed from: z0 */
    public boolean f3069z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, com.carwizard.p075li.youtube.R.attr.textInputStyle, com.carwizard.p075li.youtube.R.style.Widget_Design_TextInputLayout), attributeSet, com.carwizard.p075li.youtube.R.attr.textInputStyle);
        this.f3028f = -1;
        this.f3030g = -1;
        this.f3032h = -1;
        this.f3034i = -1;
        this.f3036j = new C0937q(this);
        this.f3044n = new C0120g(3);
        this.f3016V = new Rect();
        this.f3017W = new Rect();
        this.f3019a0 = new RectF();
        this.f3027e0 = new LinkedHashSet();
        C0547b c0547b = new C0547b(this);
        this.f3061v0 = c0547b;
        this.f2996B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3018a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0367a.f1001a;
        c0547b.f1493Q = linearInterpolator;
        c0547b.m1398h(false);
        c0547b.f1492P = linearInterpolator;
        c0547b.m1398h(false);
        if (c0547b.f1515g != 8388659) {
            c0547b.f1515g = 8388659;
            c0547b.m1398h(false);
        }
        int[] r15 = AbstractC0345a.f947A;
        AbstractC0556k.m1407a(context2, attributeSet, com.carwizard.p075li.youtube.R.attr.textInputStyle, com.carwizard.p075li.youtube.R.style.Widget_Design_TextInputLayout);
        AbstractC0556k.m1408b(context2, attributeSet, r15, com.carwizard.p075li.youtube.R.attr.textInputStyle, com.carwizard.p075li.youtube.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r15, com.carwizard.p075li.youtube.R.attr.textInputStyle, com.carwizard.p075li.youtube.R.style.Widget_Design_TextInputLayout);
        C0015h c0015h = new C0015h(context2, obtainStyledAttributes);
        C0942v c0942v = new C0942v(this, c0015h);
        this.f3020b = c0942v;
        this.f2997C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f3065x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f3063w0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f3006L = C0885k.m2414b(context2, attributeSet, com.carwizard.p075li.youtube.R.attr.textInputStyle, com.carwizard.p075li.youtube.R.style.Widget_Design_TextInputLayout).m2412a();
        this.f3008N = context2.getResources().getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3010P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f3012R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3013S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3011Q = this.f3012R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        C0884j m2417e = this.f3006L.m2417e();
        if (dimension >= 0.0f) {
            m2417e.f3686e = new C0875a(dimension);
        }
        if (dimension2 >= 0.0f) {
            m2417e.f3687f = new C0875a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            m2417e.f3688g = new C0875a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            m2417e.f3689h = new C0875a(dimension4);
        }
        this.f3006L = m2417e.m2412a();
        ColorStateList m1120r = AbstractC0387m.m1120r(context2, c0015h, 7);
        if (m1120r != null) {
            int defaultColor = m1120r.getDefaultColor();
            this.f3047o0 = defaultColor;
            this.f3015U = defaultColor;
            if (m1120r.isStateful()) {
                this.f3049p0 = m1120r.getColorForState(new int[]{-16842910}, -1);
                this.f3051q0 = m1120r.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f3053r0 = m1120r.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f3051q0 = this.f3047o0;
                ColorStateList m75u = AbstractC0005b.m75u(context2, com.carwizard.p075li.youtube.R.color.mtrl_filled_background_color);
                this.f3049p0 = m75u.getColorForState(new int[]{-16842910}, -1);
                this.f3053r0 = m75u.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3015U = 0;
            this.f3047o0 = 0;
            this.f3049p0 = 0;
            this.f3051q0 = 0;
            this.f3053r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList m120o = c0015h.m120o(1);
            this.f3037j0 = m120o;
            this.f3035i0 = m120o;
        }
        ColorStateList m1120r2 = AbstractC0387m.m1120r(context2, c0015h, 14);
        this.f3043m0 = obtainStyledAttributes.getColor(14, 0);
        this.f3039k0 = AbstractC0001b.m3a(context2, com.carwizard.p075li.youtube.R.color.mtrl_textinput_default_box_stroke_color);
        this.f3055s0 = AbstractC0001b.m3a(context2, com.carwizard.p075li.youtube.R.color.mtrl_textinput_disabled_color);
        this.f3041l0 = AbstractC0001b.m3a(context2, com.carwizard.p075li.youtube.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m1120r2 != null) {
            setBoxStrokeColorStateList(m1120r2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0387m.m1120r(context2, c0015h, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2993A = c0015h.m120o(24);
        this.f2995B = c0015h.m120o(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int r6 = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f3050q = obtainStyledAttributes.getResourceId(22, 0);
        this.f3048p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(r6);
        setCounterOverflowTextAppearance(this.f3048p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3050q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0015h.m120o(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0015h.m120o(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0015h.m120o(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0015h.m120o(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0015h.m120o(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0015h.m120o(58));
        }
        C0933m c0933m = new C0933m(this, c0015h);
        this.f3022c = c0933m;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0015h.m102C();
        setImportantForAccessibility(2);
        int r12 = Build.VERSION.SDK_INT;
        if (r12 >= 26 && r12 >= 26) {
            AbstractC0274G.m739m(this, 1);
        }
        frameLayout.addView(c0942v);
        frameLayout.addView(c0933m);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3024d;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC0387m.m1100B(editText)) {
            return this.f3000F;
        }
        int m1080p = AbstractC0379e.m1080p(this.f3024d, com.carwizard.p075li.youtube.R.attr.colorControlHighlight);
        int r4 = this.f3009O;
        int[][] r5 = f2992C0;
        if (r4 != 2) {
            if (r4 != 1) {
                return null;
            }
            C0881g c0881g = this.f3000F;
            int r12 = this.f3015U;
            return new RippleDrawable(new ColorStateList(r5, new int[]{AbstractC0379e.m1085w(m1080p, r12, 0.1f), r12}), c0881g, c0881g);
        }
        Context context = getContext();
        C0881g c0881g2 = this.f3000F;
        TypedValue m1088z = AbstractC0379e.m1088z(context, "TextInputLayout", com.carwizard.p075li.youtube.R.attr.colorSurface);
        int r9 = m1088z.resourceId;
        int m3a = r9 != 0 ? AbstractC0001b.m3a(context, r9) : m1088z.data;
        C0881g c0881g3 = new C0881g(c0881g2.f3659a.f3642a);
        int m1085w = AbstractC0379e.m1085w(m1080p, m3a, 0.1f);
        c0881g3.m2407j(new ColorStateList(r5, new int[]{m1085w, 0}));
        c0881g3.setTint(m3a);
        ColorStateList colorStateList = new ColorStateList(r5, new int[]{m1085w, m3a});
        C0881g c0881g4 = new C0881g(c0881g2.f3659a.f3642a);
        c0881g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0881g3, c0881g4), c0881g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3002H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3002H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3002H.addState(new int[0], m2137f(false));
        }
        return this.f3002H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3001G == null) {
            this.f3001G = m2137f(true);
        }
        return this.f3001G;
    }

    /* renamed from: k */
    public static void m2131k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int r12 = 0; r12 < childCount; r12++) {
            View childAt = viewGroup.getChildAt(r12);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m2131k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3024d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f3024d = editText;
        int r02 = this.f3028f;
        if (r02 != -1) {
            setMinEms(r02);
        } else {
            setMinWidth(this.f3032h);
        }
        int r03 = this.f3030g;
        if (r03 != -1) {
            setMaxEms(r03);
        } else {
            setMaxWidth(this.f3034i);
        }
        this.f3003I = false;
        m2140i();
        setTextInputAccessibilityDelegate(new C0944x(this));
        Typeface typeface = this.f3024d.getTypeface();
        C0547b c0547b = this.f3061v0;
        c0547b.m1403m(typeface);
        float textSize = this.f3024d.getTextSize();
        if (c0547b.f1516h != textSize) {
            c0547b.f1516h = textSize;
            c0547b.m1398h(false);
        }
        int r12 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f3024d.getLetterSpacing();
        if (c0547b.f1499W != letterSpacing) {
            c0547b.f1499W = letterSpacing;
            c0547b.m1398h(false);
        }
        int gravity = this.f3024d.getGravity();
        int r4 = (gravity & (-113)) | 48;
        if (c0547b.f1515g != r4) {
            c0547b.f1515g = r4;
            c0547b.m1398h(false);
        }
        if (c0547b.f1513f != gravity) {
            c0547b.f1513f = gravity;
            c0547b.m1398h(false);
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        this.f3057t0 = editText.getMinimumHeight();
        this.f3024d.addTextChangedListener(new C0943w(this, editText));
        if (this.f3035i0 == null) {
            this.f3035i0 = this.f3024d.getHintTextColors();
        }
        if (this.f2997C) {
            if (TextUtils.isEmpty(this.f2998D)) {
                CharSequence hint = this.f3024d.getHint();
                this.f3026e = hint;
                setHint(hint);
                this.f3024d.setHint((CharSequence) null);
            }
            this.f2999E = true;
        }
        if (r12 >= 29) {
            m2146p();
        }
        if (this.f3046o != null) {
            m2144n(this.f3024d.getText());
        }
        m2148r();
        this.f3036j.m2509b();
        this.f3020b.bringToFront();
        C0933m c0933m = this.f3022c;
        c0933m.bringToFront();
        Iterator it = this.f3027e0.iterator();
        while (it.hasNext()) {
            ((C0932l) it.next()).m2490a(this);
        }
        c0933m.m2503m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2151u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2998D)) {
            return;
        }
        this.f2998D = charSequence;
        C0547b c0547b = this.f3061v0;
        if (charSequence == null || !TextUtils.equals(c0547b.f1477A, charSequence)) {
            c0547b.f1477A = charSequence;
            c0547b.f1478B = null;
            Bitmap bitmap = c0547b.f1481E;
            if (bitmap != null) {
                bitmap.recycle();
                c0547b.f1481E = null;
            }
            c0547b.m1398h(false);
        }
        if (this.f3059u0) {
            return;
        }
        m2141j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f3054s == z2) {
            return;
        }
        if (z2) {
            C2562d0 c2562d0 = this.f3056t;
            if (c2562d0 != null) {
                this.f3018a.addView(c2562d0);
                this.f3056t.setVisibility(0);
            }
        } else {
            C2562d0 c2562d02 = this.f3056t;
            if (c2562d02 != null) {
                c2562d02.setVisibility(8);
            }
            this.f3056t = null;
        }
        this.f3054s = z2;
    }

    /* renamed from: a */
    public final void m2132a(float f) {
        int r02 = 2;
        C0547b c0547b = this.f3061v0;
        if (c0547b.f1505b == f) {
            return;
        }
        if (this.f3067y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3067y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC2480a.m4877R(getContext(), com.carwizard.p075li.youtube.R.attr.motionEasingEmphasizedInterpolator, AbstractC0367a.f1002b));
            this.f3067y0.setDuration(AbstractC2480a.m4876Q(getContext(), com.carwizard.p075li.youtube.R.attr.motionDurationMedium4, 167));
            this.f3067y0.addUpdateListener(new C0418b(r02, this));
        }
        this.f3067y0.setFloatValues(c0547b.f1505b, f);
        this.f3067y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, r3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3018a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m2150t();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m2133b() {
        int r02;
        int r12;
        C0881g c0881g = this.f3000F;
        if (c0881g == null) {
            return;
        }
        C0885k c0885k = c0881g.f3659a.f3642a;
        C0885k c0885k2 = this.f3006L;
        if (c0885k != c0885k2) {
            c0881g.setShapeAppearanceModel(c0885k2);
        }
        if (this.f3009O == 2 && (r02 = this.f3011Q) > -1 && (r12 = this.f3014T) != 0) {
            C0881g c0881g2 = this.f3000F;
            c0881g2.f3659a.f3651j = r02;
            c0881g2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(r12);
            C0880f c0880f = c0881g2.f3659a;
            if (c0880f.f3645d != valueOf) {
                c0880f.f3645d = valueOf;
                c0881g2.onStateChange(c0881g2.getState());
            }
        }
        int r03 = this.f3015U;
        if (this.f3009O == 1) {
            r03 = AbstractC0049a.m192b(this.f3015U, AbstractC0379e.m1079o(getContext(), com.carwizard.p075li.youtube.R.attr.colorSurface, 0));
        }
        this.f3015U = r03;
        this.f3000F.m2407j(ColorStateList.valueOf(r03));
        C0881g c0881g3 = this.f3004J;
        if (c0881g3 != null && this.f3005K != null) {
            if (this.f3011Q > -1 && this.f3014T != 0) {
                c0881g3.m2407j(this.f3024d.isFocused() ? ColorStateList.valueOf(this.f3039k0) : ColorStateList.valueOf(this.f3014T));
                this.f3005K.m2407j(ColorStateList.valueOf(this.f3014T));
            }
            invalidate();
        }
        m2149s();
    }

    /* renamed from: c */
    public final int m2134c() {
        float m1395d;
        if (!this.f2997C) {
            return 0;
        }
        int r02 = this.f3009O;
        C0547b c0547b = this.f3061v0;
        if (r02 == 0) {
            m1395d = c0547b.m1395d();
        } else {
            if (r02 != 2) {
                return 0;
            }
            m1395d = c0547b.m1395d() / 2.0f;
        }
        return (int) m1395d;
    }

    /* renamed from: d */
    public final C0962h m2135d() {
        C0962h c0962h = new C0962h();
        c0962h.f4033c = AbstractC2480a.m4876Q(getContext(), com.carwizard.p075li.youtube.R.attr.motionDurationShort2, 87);
        c0962h.f4034d = AbstractC2480a.m4877R(getContext(), com.carwizard.p075li.youtube.R.attr.motionEasingLinearInterpolator, AbstractC0367a.f1001a);
        return c0962h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int r7) {
        EditText editText = this.f3024d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, r7);
            return;
        }
        if (this.f3026e != null) {
            boolean z2 = this.f2999E;
            this.f2999E = false;
            CharSequence hint = editText.getHint();
            this.f3024d.setHint(this.f3026e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, r7);
                return;
            } finally {
                this.f3024d.setHint(hint);
                this.f2999E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, r7);
        onProvideAutofillVirtualStructure(viewStructure, r7);
        FrameLayout frameLayout = this.f3018a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int r2 = 0; r2 < frameLayout.getChildCount(); r2++) {
            View childAt = frameLayout.getChildAt(r2);
            ViewStructure newChild = viewStructure.newChild(r2);
            childAt.dispatchProvideAutofillStructure(newChild, r7);
            if (childAt == this.f3024d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2994A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2994A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0881g c0881g;
        int r3;
        super.draw(canvas);
        boolean z2 = this.f2997C;
        C0547b c0547b = this.f3061v0;
        if (z2) {
            c0547b.getClass();
            int save = canvas.save();
            if (c0547b.f1478B != null) {
                RectF rectF = c0547b.f1511e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0547b.f1490N;
                    textPaint.setTextSize(c0547b.f1483G);
                    float f = c0547b.f1524p;
                    float f2 = c0547b.f1525q;
                    float f3 = c0547b.f1482F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (c0547b.f1510d0 <= 1 || c0547b.f1479C) {
                        canvas.translate(f, f2);
                        c0547b.f1501Y.draw(canvas);
                    } else {
                        float lineStart = c0547b.f1524p - c0547b.f1501Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0547b.f1506b0 * f4));
                        int r15 = Build.VERSION.SDK_INT;
                        if (r15 >= 31) {
                            float f5 = c0547b.f1484H;
                            float f6 = c0547b.f1485I;
                            float f7 = c0547b.f1486J;
                            int r5 = c0547b.f1487K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0049a.m194d(r5, (textPaint.getAlpha() * Color.alpha(r5)) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        c0547b.f1501Y.draw(canvas);
                        textPaint.setAlpha((int) (c0547b.f1504a0 * f4));
                        if (r15 >= 31) {
                            float f8 = c0547b.f1484H;
                            float f9 = c0547b.f1485I;
                            float f10 = c0547b.f1486J;
                            int r4 = c0547b.f1487K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0049a.m194d(r4, (Color.alpha(r4) * textPaint.getAlpha()) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        int lineBaseline = c0547b.f1501Y.getLineBaseline(0);
                        CharSequence charSequence = c0547b.f1508c0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (r15 >= 31) {
                            textPaint.setShadowLayer(c0547b.f1484H, c0547b.f1485I, c0547b.f1486J, c0547b.f1487K);
                        }
                        String trim = c0547b.f1508c0.toString().trim();
                        if (trim.endsWith("…")) {
                            r3 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            r3 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0547b.f1501Y.getLineEnd(r3), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f3005K == null || (c0881g = this.f3004J) == null) {
            return;
        }
        c0881g.draw(canvas);
        if (this.f3024d.isFocused()) {
            Rect bounds = this.f3005K.getBounds();
            Rect bounds2 = this.f3004J.getBounds();
            float f12 = c0547b.f1505b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0367a.m1037c(centerX, bounds2.left, f12);
            bounds.right = AbstractC0367a.m1037c(centerX, bounds2.right, f12);
            this.f3005K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f3069z0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f3069z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            Y0.b r3 = r4.f3061v0
            if (r3 == 0) goto L2f
            r3.f1488L = r1
            android.content.res.ColorStateList r1 = r3.f1519k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1518j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m1398h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f3024d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = p028K.AbstractC0283P.f842a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m2151u(r0, r2)
        L47:
            r4.m2148r()
            r4.m2154x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f3069z0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final boolean m2136e() {
        return this.f2997C && !TextUtils.isEmpty(this.f2998D) && (this.f3000F instanceof C0927g);
    }

    /* renamed from: f */
    public final C0881g m2137f(boolean z2) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f3024d;
        float popupElevation = editText instanceof C0940t ? ((C0940t) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0883i c0883i = new C0883i();
        C0883i c0883i2 = new C0883i();
        C0883i c0883i3 = new C0883i();
        C0883i c0883i4 = new C0883i();
        C0879e c0879e = new C0879e();
        C0879e c0879e2 = new C0879e();
        C0879e c0879e3 = new C0879e();
        C0879e c0879e4 = new C0879e();
        C0875a c0875a = new C0875a(f);
        C0875a c0875a2 = new C0875a(f);
        C0875a c0875a3 = new C0875a(dimensionPixelOffset);
        C0875a c0875a4 = new C0875a(dimensionPixelOffset);
        C0885k c0885k = new C0885k();
        c0885k.f3694a = c0883i;
        c0885k.f3695b = c0883i2;
        c0885k.f3696c = c0883i3;
        c0885k.f3697d = c0883i4;
        c0885k.f3698e = c0875a;
        c0885k.f3699f = c0875a2;
        c0885k.f3700g = c0875a4;
        c0885k.f3701h = c0875a3;
        c0885k.f3702i = c0879e;
        c0885k.f3703j = c0879e2;
        c0885k.f3704k = c0879e3;
        c0885k.f3705l = c0879e4;
        EditText editText2 = this.f3024d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0940t ? ((C0940t) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0881g.f3658w;
            TypedValue m1088z = AbstractC0379e.m1088z(context, C0881g.class.getSimpleName(), com.carwizard.p075li.youtube.R.attr.colorSurface);
            int r4 = m1088z.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(r4 != 0 ? AbstractC0001b.m3a(context, r4) : m1088z.data);
        }
        C0881g c0881g = new C0881g();
        c0881g.m2405h(context);
        c0881g.m2407j(dropDownBackgroundTintList);
        c0881g.m2406i(popupElevation);
        c0881g.setShapeAppearanceModel(c0885k);
        C0880f c0880f = c0881g.f3659a;
        if (c0880f.f3648g == null) {
            c0880f.f3648g = new Rect();
        }
        c0881g.f3659a.f3648g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0881g.invalidateSelf();
        return c0881g;
    }

    /* renamed from: g */
    public final int m2138g(int r2, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f3024d.getCompoundPaddingLeft() : this.f3022c.m2493c() : this.f3020b.m2521a()) + r2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3024d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2134c() + getPaddingTop() + editText.getBaseline();
    }

    public C0881g getBoxBackground() {
        int r02 = this.f3009O;
        if (r02 == 1 || r02 == 2) {
            return this.f3000F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3015U;
    }

    public int getBoxBackgroundMode() {
        return this.f3009O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3010P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean m1411e = AbstractC0556k.m1411e(this);
        RectF rectF = this.f3019a0;
        return m1411e ? this.f3006L.f3701h.mo2392a(rectF) : this.f3006L.f3700g.mo2392a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean m1411e = AbstractC0556k.m1411e(this);
        RectF rectF = this.f3019a0;
        return m1411e ? this.f3006L.f3700g.mo2392a(rectF) : this.f3006L.f3701h.mo2392a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean m1411e = AbstractC0556k.m1411e(this);
        RectF rectF = this.f3019a0;
        return m1411e ? this.f3006L.f3698e.mo2392a(rectF) : this.f3006L.f3699f.mo2392a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean m1411e = AbstractC0556k.m1411e(this);
        RectF rectF = this.f3019a0;
        return m1411e ? this.f3006L.f3699f.mo2392a(rectF) : this.f3006L.f3698e.mo2392a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3043m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3045n0;
    }

    public int getBoxStrokeWidth() {
        return this.f3012R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3013S;
    }

    public int getCounterMaxLength() {
        return this.f3040l;
    }

    public CharSequence getCounterOverflowDescription() {
        C2562d0 c2562d0;
        if (this.f3038k && this.f3042m && (c2562d0 = this.f3046o) != null) {
            return c2562d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3068z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3066y;
    }

    public ColorStateList getCursorColor() {
        return this.f2993A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2995B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3035i0;
    }

    public EditText getEditText() {
        return this.f3024d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3022c.f3883g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3022c.f3883g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3022c.f3889m;
    }

    public int getEndIconMode() {
        return this.f3022c.f3885i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3022c.f3890n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3022c.f3883g;
    }

    public CharSequence getError() {
        C0937q c0937q = this.f3036j;
        if (c0937q.f3927q) {
            return c0937q.f3926p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3036j.f3930t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3036j.f3929s;
    }

    public int getErrorCurrentTextColors() {
        C2562d0 c2562d0 = this.f3036j.f3928r;
        if (c2562d0 != null) {
            return c2562d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3022c.f3879c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0937q c0937q = this.f3036j;
        if (c0937q.f3934x) {
            return c0937q.f3933w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C2562d0 c2562d0 = this.f3036j.f3935y;
        if (c2562d0 != null) {
            return c2562d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2997C) {
            return this.f2998D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3061v0.m1395d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0547b c0547b = this.f3061v0;
        return c0547b.m1396e(c0547b.f1519k);
    }

    public ColorStateList getHintTextColor() {
        return this.f3037j0;
    }

    public InterfaceC0945y getLengthCounter() {
        return this.f3044n;
    }

    public int getMaxEms() {
        return this.f3030g;
    }

    public int getMaxWidth() {
        return this.f3034i;
    }

    public int getMinEms() {
        return this.f3028f;
    }

    public int getMinWidth() {
        return this.f3032h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3022c.f3883g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3022c.f3883g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3054s) {
            return this.f3052r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3060v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3058u;
    }

    public CharSequence getPrefixText() {
        return this.f3020b.f3955c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3020b.f3954b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3020b.f3954b;
    }

    public C0885k getShapeAppearanceModel() {
        return this.f3006L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3020b.f3956d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3020b.f3956d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3020b.f3959g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3020b.f3960h;
    }

    public CharSequence getSuffixText() {
        return this.f3022c.f3892p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3022c.f3893q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3022c.f3893q;
    }

    public Typeface getTypeface() {
        return this.f3021b0;
    }

    /* renamed from: h */
    public final int m2139h(int r2, boolean z2) {
        return r2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f3024d.getCompoundPaddingRight() : this.f3020b.m2521a() : this.f3022c.m2493c());
    }

    /* renamed from: i */
    public final void m2140i() {
        int r02 = this.f3009O;
        if (r02 == 0) {
            this.f3000F = null;
            this.f3004J = null;
            this.f3005K = null;
        } else if (r02 == 1) {
            this.f3000F = new C0881g(this.f3006L);
            this.f3004J = new C0881g();
            this.f3005K = new C0881g();
        } else {
            if (r02 != 2) {
                throw new IllegalArgumentException(this.f3009O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2997C || (this.f3000F instanceof C0927g)) {
                this.f3000F = new C0881g(this.f3006L);
            } else {
                C0885k c0885k = this.f3006L;
                int r4 = C0927g.f3857y;
                if (c0885k == null) {
                    c0885k = new C0885k();
                }
                C0926f c0926f = new C0926f(c0885k, new RectF());
                C0927g c0927g = new C0927g(c0926f);
                c0927g.f3858x = c0926f;
                this.f3000F = c0927g;
            }
            this.f3004J = null;
            this.f3005K = null;
        }
        m2149s();
        m2154x();
        if (this.f3009O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f3010P = getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0387m.m1101D(getContext())) {
                this.f3010P = getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f3024d != null && this.f3009O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f3024d;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3024d.getPaddingEnd(), getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0387m.m1101D(getContext())) {
                EditText editText2 = this.f3024d;
                WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3024d.getPaddingEnd(), getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f3009O != 0) {
            m2150t();
        }
        EditText editText3 = this.f3024d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int r3 = this.f3009O;
                if (r3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (r3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m2141j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int r02;
        int r3;
        if (m2136e()) {
            int width = this.f3024d.getWidth();
            int gravity = this.f3024d.getGravity();
            C0547b c0547b = this.f3061v0;
            boolean m1393b = c0547b.m1393b(c0547b.f1477A);
            c0547b.f1479C = m1393b;
            Rect rect = c0547b.f1509d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (m1393b) {
                        r3 = rect.left;
                        f3 = r3;
                    } else {
                        f = rect.right;
                        f2 = c0547b.f1502Z;
                    }
                } else if (m1393b) {
                    f = rect.right;
                    f2 = c0547b.f1502Z;
                } else {
                    r3 = rect.left;
                    f3 = r3;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.f3019a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0547b.f1502Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0547b.f1479C) {
                        f4 = max + c0547b.f1502Z;
                    } else {
                        r02 = rect.right;
                        f4 = r02;
                    }
                } else if (c0547b.f1479C) {
                    r02 = rect.right;
                    f4 = r02;
                } else {
                    f4 = c0547b.f1502Z + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0547b.m1395d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f5 = rectF.left;
                float f6 = this.f3008N;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f3011Q);
                C0927g c0927g = (C0927g) this.f3000F;
                c0927g.getClass();
                c0927g.m2481n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0547b.f1502Z / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.f3019a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (c0547b.f1502Z / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0547b.m1395d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* renamed from: l */
    public final void m2142l(C2562d0 c2562d0, int r3) {
        try {
            c2562d0.setTextAppearance(r3);
            if (c2562d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c2562d0.setTextAppearance(com.carwizard.p075li.youtube.R.style.TextAppearance_AppCompat_Caption);
        c2562d0.setTextColor(AbstractC0001b.m3a(getContext(), com.carwizard.p075li.youtube.R.color.design_error));
    }

    /* renamed from: m */
    public final boolean m2143m() {
        C0937q c0937q = this.f3036j;
        return (c0937q.f3925o != 1 || c0937q.f3928r == null || TextUtils.isEmpty(c0937q.f3926p)) ? false : true;
    }

    /* renamed from: n */
    public final void m2144n(Editable editable) {
        ((C0120g) this.f3044n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f3042m;
        int r4 = this.f3040l;
        String str = null;
        if (r4 == -1) {
            this.f3046o.setText(String.valueOf(length));
            this.f3046o.setContentDescription(null);
            this.f3042m = false;
        } else {
            this.f3042m = length > r4;
            Context context = getContext();
            this.f3046o.setContentDescription(context.getString(this.f3042m ? com.carwizard.p075li.youtube.R.string.character_counter_overflowed_content_description : com.carwizard.p075li.youtube.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f3040l)));
            if (z2 != this.f3042m) {
                m2145o();
            }
            String str2 = C0193b.f591b;
            C0193b c0193b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0193b.f594e : C0193b.f593d;
            C2562d0 c2562d0 = this.f3046o;
            String string = getContext().getString(com.carwizard.p075li.youtube.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f3040l));
            if (string == null) {
                c0193b.getClass();
            } else {
                c0193b.getClass();
                C0201j c0201j = AbstractC0202k.f604a;
                str = c0193b.m558c(string).toString();
            }
            c2562d0.setText(str);
        }
        if (this.f3024d == null || z2 == this.f3042m) {
            return;
        }
        m2151u(false, false);
        m2154x();
        m2148r();
    }

    /* renamed from: o */
    public final void m2145o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2562d0 c2562d0 = this.f3046o;
        if (c2562d0 != null) {
            m2142l(c2562d0, this.f3042m ? this.f3048p : this.f3050q);
            if (!this.f3042m && (colorStateList2 = this.f3066y) != null) {
                this.f3046o.setTextColor(colorStateList2);
            }
            if (!this.f3042m || (colorStateList = this.f3068z) == null) {
                return;
            }
            this.f3046o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3061v0.m1397g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        C0933m c0933m = this.f3022c;
        c0933m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2996B0 = false;
        if (this.f3024d != null && this.f3024d.getMeasuredHeight() < (max = Math.max(c0933m.getMeasuredHeight(), this.f3020b.getMeasuredHeight()))) {
            this.f3024d.setMinimumHeight(max);
            z2 = true;
        }
        boolean m2147q = m2147q();
        if (z2 || m2147q) {
            this.f3024d.post(new RunnableC0458b(11, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r8, int r9, int r10, int r11) {
        super.onLayout(z2, r8, r9, r10, r11);
        EditText editText = this.f3024d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0548c.f1535a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f3016V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0548c.f1535a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0548c.m1404a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0548c.f1536b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0881g c0881g = this.f3004J;
            if (c0881g != null) {
                int r82 = rect.bottom;
                c0881g.setBounds(rect.left, r82 - this.f3012R, rect.right, r82);
            }
            C0881g c0881g2 = this.f3005K;
            if (c0881g2 != null) {
                int r83 = rect.bottom;
                c0881g2.setBounds(rect.left, r83 - this.f3013S, rect.right, r83);
            }
            if (this.f2997C) {
                float textSize = this.f3024d.getTextSize();
                C0547b c0547b = this.f3061v0;
                if (c0547b.f1516h != textSize) {
                    c0547b.f1516h = textSize;
                    c0547b.m1398h(false);
                }
                int gravity = this.f3024d.getGravity();
                int r92 = (gravity & (-113)) | 48;
                if (c0547b.f1515g != r92) {
                    c0547b.f1515g = r92;
                    c0547b.m1398h(false);
                }
                if (c0547b.f1513f != gravity) {
                    c0547b.f1513f = gravity;
                    c0547b.m1398h(false);
                }
                if (this.f3024d == null) {
                    throw new IllegalStateException();
                }
                boolean m1411e = AbstractC0556k.m1411e(this);
                int r93 = rect.bottom;
                Rect rect2 = this.f3017W;
                rect2.bottom = r93;
                int r94 = this.f3009O;
                if (r94 == 1) {
                    rect2.left = m2138g(rect.left, m1411e);
                    rect2.top = rect.top + this.f3010P;
                    rect2.right = m2139h(rect.right, m1411e);
                } else if (r94 != 2) {
                    rect2.left = m2138g(rect.left, m1411e);
                    rect2.top = getPaddingTop();
                    rect2.right = m2139h(rect.right, m1411e);
                } else {
                    rect2.left = this.f3024d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m2134c();
                    rect2.right = rect.right - this.f3024d.getPaddingRight();
                }
                int r7 = rect2.left;
                int r95 = rect2.top;
                int r2 = rect2.right;
                int r3 = rect2.bottom;
                Rect rect3 = c0547b.f1509d;
                if (rect3.left != r7 || rect3.top != r95 || rect3.right != r2 || rect3.bottom != r3) {
                    rect3.set(r7, r95, r2, r3);
                    c0547b.f1489M = true;
                }
                if (this.f3024d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0547b.f1491O;
                textPaint.setTextSize(c0547b.f1516h);
                textPaint.setTypeface(c0547b.f1529u);
                textPaint.setLetterSpacing(c0547b.f1499W);
                float f = -textPaint.ascent();
                rect2.left = this.f3024d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f3009O != 1 || this.f3024d.getMinLines() > 1) ? rect.top + this.f3024d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f3024d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f3009O != 1 || this.f3024d.getMinLines() > 1) ? rect.bottom - this.f3024d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int r96 = rect2.left;
                int r102 = rect2.top;
                int r02 = rect2.right;
                Rect rect4 = c0547b.f1507c;
                if (rect4.left != r96 || rect4.top != r102 || rect4.right != r02 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(r96, r102, r02, compoundPaddingBottom);
                    c0547b.f1489M = true;
                }
                c0547b.m1398h(false);
                if (!m2136e() || this.f3059u0) {
                    return;
                }
                m2141j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        EditText editText;
        super.onMeasure(r5, r6);
        boolean z2 = this.f2996B0;
        C0933m c0933m = this.f3022c;
        if (!z2) {
            c0933m.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2996B0 = true;
        }
        if (this.f3056t != null && (editText = this.f3024d) != null) {
            this.f3056t.setGravity(editText.getGravity());
            this.f3056t.setPadding(this.f3024d.getCompoundPaddingLeft(), this.f3024d.getCompoundPaddingTop(), this.f3024d.getCompoundPaddingRight(), this.f3024d.getCompoundPaddingBottom());
        }
        c0933m.m2503m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0946z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0946z c0946z = (C0946z) parcelable;
        super.onRestoreInstanceState(c0946z.f1263a);
        setError(c0946z.f3967c);
        if (c0946z.f3968d) {
            post(new RunnableC0107e(14, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int r14) {
        super.onRtlPropertiesChanged(r14);
        boolean z2 = r14 == 1;
        if (z2 != this.f3007M) {
            InterfaceC0877c interfaceC0877c = this.f3006L.f3698e;
            RectF rectF = this.f3019a0;
            float mo2392a = interfaceC0877c.mo2392a(rectF);
            float mo2392a2 = this.f3006L.f3699f.mo2392a(rectF);
            float mo2392a3 = this.f3006L.f3701h.mo2392a(rectF);
            float mo2392a4 = this.f3006L.f3700g.mo2392a(rectF);
            C0885k c0885k = this.f3006L;
            AbstractC0379e abstractC0379e = c0885k.f3694a;
            AbstractC0379e abstractC0379e2 = c0885k.f3695b;
            AbstractC0379e abstractC0379e3 = c0885k.f3697d;
            AbstractC0379e abstractC0379e4 = c0885k.f3696c;
            C0879e c0879e = new C0879e();
            C0879e c0879e2 = new C0879e();
            C0879e c0879e3 = new C0879e();
            C0879e c0879e4 = new C0879e();
            C0884j.m2411b(abstractC0379e2);
            C0884j.m2411b(abstractC0379e);
            C0884j.m2411b(abstractC0379e4);
            C0884j.m2411b(abstractC0379e3);
            C0875a c0875a = new C0875a(mo2392a2);
            C0875a c0875a2 = new C0875a(mo2392a);
            C0875a c0875a3 = new C0875a(mo2392a4);
            C0875a c0875a4 = new C0875a(mo2392a3);
            C0885k c0885k2 = new C0885k();
            c0885k2.f3694a = abstractC0379e2;
            c0885k2.f3695b = abstractC0379e;
            c0885k2.f3696c = abstractC0379e3;
            c0885k2.f3697d = abstractC0379e4;
            c0885k2.f3698e = c0875a;
            c0885k2.f3699f = c0875a2;
            c0885k2.f3700g = c0875a4;
            c0885k2.f3701h = c0875a3;
            c0885k2.f3702i = c0879e;
            c0885k2.f3703j = c0879e2;
            c0885k2.f3704k = c0879e3;
            c0885k2.f3705l = c0879e4;
            this.f3007M = z2;
            setShapeAppearanceModel(c0885k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0946z c0946z = new C0946z(super.onSaveInstanceState());
        if (m2143m()) {
            c0946z.f3967c = getError();
        }
        C0933m c0933m = this.f3022c;
        c0946z.f3968d = c0933m.f3885i != 0 && c0933m.f3883g.f2948d;
        return c0946z;
    }

    /* renamed from: p */
    public final void m2146p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2993A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue m1086x = AbstractC0379e.m1086x(context, com.carwizard.p075li.youtube.R.attr.colorControlActivated);
            if (m1086x != null) {
                int r3 = m1086x.resourceId;
                if (r3 != 0) {
                    colorStateList2 = AbstractC0005b.m75u(context, r3);
                } else {
                    int r02 = m1086x.data;
                    if (r02 != 0) {
                        colorStateList2 = ColorStateList.valueOf(r02);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f3024d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f3024d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m2143m() || (this.f3046o != null && this.f3042m)) && (colorStateList = this.f2995B) != null) {
                colorStateList2 = colorStateList;
            }
            AbstractC0095a.m319h(mutate, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2147q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2147q():boolean");
    }

    /* renamed from: r */
    public final void m2148r() {
        Drawable background;
        C2562d0 c2562d0;
        EditText editText = this.f3024d;
        if (editText == null || this.f3009O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] r12 = AbstractC2604r0.f8459a;
        Drawable mutate = background.mutate();
        if (m2143m()) {
            mutate.setColorFilter(C2609t.m5070c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3042m && (c2562d0 = this.f3046o) != null) {
            mutate.setColorFilter(C2609t.m5070c(c2562d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f3024d.refreshDrawableState();
        }
    }

    /* renamed from: s */
    public final void m2149s() {
        EditText editText = this.f3024d;
        if (editText == null || this.f3000F == null) {
            return;
        }
        if ((this.f3003I || editText.getBackground() == null) && this.f3009O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f3024d;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            editText2.setBackground(editTextBoxBackground);
            this.f3003I = true;
        }
    }

    public void setBoxBackgroundColor(int r2) {
        if (this.f3015U != r2) {
            this.f3015U = r2;
            this.f3047o0 = r2;
            this.f3051q0 = r2;
            this.f3053r0 = r2;
            m2133b();
        }
    }

    public void setBoxBackgroundColorResource(int r2) {
        setBoxBackgroundColor(AbstractC0001b.m3a(getContext(), r2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3047o0 = defaultColor;
        this.f3015U = defaultColor;
        this.f3049p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3051q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3053r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2133b();
    }

    public void setBoxBackgroundMode(int r2) {
        if (r2 == this.f3009O) {
            return;
        }
        this.f3009O = r2;
        if (this.f3024d != null) {
            m2140i();
        }
    }

    public void setBoxCollapsedPaddingTop(int r12) {
        this.f3010P = r12;
    }

    public void setBoxCornerFamily(int r4) {
        C0884j m2417e = this.f3006L.m2417e();
        InterfaceC0877c interfaceC0877c = this.f3006L.f3698e;
        AbstractC0379e m1116n = AbstractC0387m.m1116n(r4);
        m2417e.f3682a = m1116n;
        C0884j.m2411b(m1116n);
        m2417e.f3686e = interfaceC0877c;
        InterfaceC0877c interfaceC0877c2 = this.f3006L.f3699f;
        AbstractC0379e m1116n2 = AbstractC0387m.m1116n(r4);
        m2417e.f3683b = m1116n2;
        C0884j.m2411b(m1116n2);
        m2417e.f3687f = interfaceC0877c2;
        InterfaceC0877c interfaceC0877c3 = this.f3006L.f3701h;
        AbstractC0379e m1116n3 = AbstractC0387m.m1116n(r4);
        m2417e.f3685d = m1116n3;
        C0884j.m2411b(m1116n3);
        m2417e.f3689h = interfaceC0877c3;
        InterfaceC0877c interfaceC0877c4 = this.f3006L.f3700g;
        AbstractC0379e m1116n4 = AbstractC0387m.m1116n(r4);
        m2417e.f3684c = m1116n4;
        C0884j.m2411b(m1116n4);
        m2417e.f3688g = interfaceC0877c4;
        this.f3006L = m2417e.m2412a();
        m2133b();
    }

    public void setBoxStrokeColor(int r2) {
        if (this.f3043m0 != r2) {
            this.f3043m0 = r2;
            m2154x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f3039k0 = colorStateList.getDefaultColor();
            this.f3055s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3041l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f3043m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f3043m0 != colorStateList.getDefaultColor()) {
            this.f3043m0 = colorStateList.getDefaultColor();
        }
        m2154x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3045n0 != colorStateList) {
            this.f3045n0 = colorStateList;
            m2154x();
        }
    }

    public void setBoxStrokeWidth(int r12) {
        this.f3012R = r12;
        m2154x();
    }

    public void setBoxStrokeWidthFocused(int r12) {
        this.f3013S = r12;
        m2154x();
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(r2));
    }

    public void setBoxStrokeWidthResource(int r2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(r2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f3038k != z2) {
            C0937q c0937q = this.f3036j;
            if (z2) {
                C2562d0 c2562d0 = new C2562d0(getContext(), null);
                this.f3046o = c2562d0;
                c2562d0.setId(com.carwizard.p075li.youtube.R.id.textinput_counter);
                Typeface typeface = this.f3021b0;
                if (typeface != null) {
                    this.f3046o.setTypeface(typeface);
                }
                this.f3046o.setMaxLines(1);
                c0937q.m2508a(this.f3046o, 2);
                ((ViewGroup.MarginLayoutParams) this.f3046o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_textinput_counter_margin_start));
                m2145o();
                if (this.f3046o != null) {
                    EditText editText = this.f3024d;
                    m2144n(editText != null ? editText.getText() : null);
                }
            } else {
                c0937q.m2514g(this.f3046o, 2);
                this.f3046o = null;
            }
            this.f3038k = z2;
        }
    }

    public void setCounterMaxLength(int r2) {
        if (this.f3040l != r2) {
            if (r2 > 0) {
                this.f3040l = r2;
            } else {
                this.f3040l = -1;
            }
            if (!this.f3038k || this.f3046o == null) {
                return;
            }
            EditText editText = this.f3024d;
            m2144n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int r2) {
        if (this.f3048p != r2) {
            this.f3048p = r2;
            m2145o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3068z != colorStateList) {
            this.f3068z = colorStateList;
            m2145o();
        }
    }

    public void setCounterTextAppearance(int r2) {
        if (this.f3050q != r2) {
            this.f3050q = r2;
            m2145o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3066y != colorStateList) {
            this.f3066y = colorStateList;
            m2145o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2993A != colorStateList) {
            this.f2993A = colorStateList;
            m2146p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2995B != colorStateList) {
            this.f2995B = colorStateList;
            if (m2143m() || (this.f3046o != null && this.f3042m)) {
                m2146p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3035i0 = colorStateList;
        this.f3037j0 = colorStateList;
        if (this.f3024d != null) {
            m2151u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m2131k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f3022c.f3883g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f3022c.f3883g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int r3) {
        C0933m c0933m = this.f3022c;
        CharSequence text = r3 != 0 ? c0933m.getResources().getText(r3) : null;
        CheckableImageButton checkableImageButton = c0933m.f3883g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int r5) {
        C0933m c0933m = this.f3022c;
        Drawable m1449n = r5 != 0 ? AbstractC0580g.m1449n(c0933m.getContext(), r5) : null;
        CheckableImageButton checkableImageButton = c0933m.f3883g;
        checkableImageButton.setImageDrawable(m1449n);
        if (m1449n != null) {
            ColorStateList colorStateList = c0933m.f3887k;
            PorterDuff.Mode mode = c0933m.f3888l;
            TextInputLayout textInputLayout = c0933m.f3877a;
            AbstractC0580g.m1442f(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0580g.m1456w(textInputLayout, checkableImageButton, c0933m.f3887k);
        }
    }

    public void setEndIconMinSize(int r3) {
        C0933m c0933m = this.f3022c;
        if (r3 < 0) {
            c0933m.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (r3 != c0933m.f3889m) {
            c0933m.f3889m = r3;
            CheckableImageButton checkableImageButton = c0933m.f3883g;
            checkableImageButton.setMinimumWidth(r3);
            checkableImageButton.setMinimumHeight(r3);
            CheckableImageButton checkableImageButton2 = c0933m.f3879c;
            checkableImageButton2.setMinimumWidth(r3);
            checkableImageButton2.setMinimumHeight(r3);
        }
    }

    public void setEndIconMode(int r2) {
        this.f3022c.m2497g(r2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0933m c0933m = this.f3022c;
        View.OnLongClickListener onLongClickListener = c0933m.f3891o;
        CheckableImageButton checkableImageButton = c0933m.f3883g;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0933m c0933m = this.f3022c;
        c0933m.f3891o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0933m.f3883g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0933m c0933m = this.f3022c;
        c0933m.f3890n = scaleType;
        c0933m.f3883g.setScaleType(scaleType);
        c0933m.f3879c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0933m c0933m = this.f3022c;
        if (c0933m.f3887k != colorStateList) {
            c0933m.f3887k = colorStateList;
            AbstractC0580g.m1442f(c0933m.f3877a, c0933m.f3883g, colorStateList, c0933m.f3888l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0933m c0933m = this.f3022c;
        if (c0933m.f3888l != mode) {
            c0933m.f3888l = mode;
            AbstractC0580g.m1442f(c0933m.f3877a, c0933m.f3883g, c0933m.f3887k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f3022c.m2498h(z2);
    }

    public void setError(CharSequence charSequence) {
        C0937q c0937q = this.f3036j;
        if (!c0937q.f3927q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0937q.m2513f();
            return;
        }
        c0937q.m2510c();
        c0937q.f3926p = charSequence;
        c0937q.f3928r.setText(charSequence);
        int r12 = c0937q.f3924n;
        if (r12 != 1) {
            c0937q.f3925o = 1;
        }
        c0937q.m2516i(r12, c0937q.f3925o, c0937q.m2515h(c0937q.f3928r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int r3) {
        C0937q c0937q = this.f3036j;
        c0937q.f3930t = r3;
        C2562d0 c2562d0 = c0937q.f3928r;
        if (c2562d0 != null) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            c2562d0.setAccessibilityLiveRegion(r3);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0937q c0937q = this.f3036j;
        c0937q.f3929s = charSequence;
        C2562d0 c2562d0 = c0937q.f3928r;
        if (c2562d0 != null) {
            c2562d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        C0937q c0937q = this.f3036j;
        if (c0937q.f3927q == z2) {
            return;
        }
        c0937q.m2510c();
        TextInputLayout textInputLayout = c0937q.f3918h;
        if (z2) {
            C2562d0 c2562d0 = new C2562d0(c0937q.f3917g, null);
            c0937q.f3928r = c2562d0;
            c2562d0.setId(com.carwizard.p075li.youtube.R.id.textinput_error);
            c0937q.f3928r.setTextAlignment(5);
            Typeface typeface = c0937q.f3910B;
            if (typeface != null) {
                c0937q.f3928r.setTypeface(typeface);
            }
            int r3 = c0937q.f3931u;
            c0937q.f3931u = r3;
            C2562d0 c2562d02 = c0937q.f3928r;
            if (c2562d02 != null) {
                textInputLayout.m2142l(c2562d02, r3);
            }
            ColorStateList colorStateList = c0937q.f3932v;
            c0937q.f3932v = colorStateList;
            C2562d0 c2562d03 = c0937q.f3928r;
            if (c2562d03 != null && colorStateList != null) {
                c2562d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0937q.f3929s;
            c0937q.f3929s = charSequence;
            C2562d0 c2562d04 = c0937q.f3928r;
            if (c2562d04 != null) {
                c2562d04.setContentDescription(charSequence);
            }
            int r12 = c0937q.f3930t;
            c0937q.f3930t = r12;
            C2562d0 c2562d05 = c0937q.f3928r;
            if (c2562d05 != null) {
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                c2562d05.setAccessibilityLiveRegion(r12);
            }
            c0937q.f3928r.setVisibility(4);
            c0937q.m2508a(c0937q.f3928r, 0);
        } else {
            c0937q.m2513f();
            c0937q.m2514g(c0937q.f3928r, 0);
            c0937q.f3928r = null;
            textInputLayout.m2148r();
            textInputLayout.m2154x();
        }
        c0937q.f3927q = z2;
    }

    public void setErrorIconDrawable(int r3) {
        C0933m c0933m = this.f3022c;
        c0933m.m2499i(r3 != 0 ? AbstractC0580g.m1449n(c0933m.getContext(), r3) : null);
        AbstractC0580g.m1456w(c0933m.f3877a, c0933m.f3879c, c0933m.f3880d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0933m c0933m = this.f3022c;
        CheckableImageButton checkableImageButton = c0933m.f3879c;
        View.OnLongClickListener onLongClickListener = c0933m.f3882f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0933m c0933m = this.f3022c;
        c0933m.f3882f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0933m.f3879c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0933m c0933m = this.f3022c;
        if (c0933m.f3880d != colorStateList) {
            c0933m.f3880d = colorStateList;
            AbstractC0580g.m1442f(c0933m.f3877a, c0933m.f3879c, colorStateList, c0933m.f3881e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0933m c0933m = this.f3022c;
        if (c0933m.f3881e != mode) {
            c0933m.f3881e = mode;
            AbstractC0580g.m1442f(c0933m.f3877a, c0933m.f3879c, c0933m.f3880d, mode);
        }
    }

    public void setErrorTextAppearance(int r3) {
        C0937q c0937q = this.f3036j;
        c0937q.f3931u = r3;
        C2562d0 c2562d0 = c0937q.f3928r;
        if (c2562d0 != null) {
            c0937q.f3918h.m2142l(c2562d0, r3);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0937q c0937q = this.f3036j;
        c0937q.f3932v = colorStateList;
        C2562d0 c2562d0 = c0937q.f3928r;
        if (c2562d0 == null || colorStateList == null) {
            return;
        }
        c2562d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f3063w0 != z2) {
            this.f3063w0 = z2;
            m2151u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C0937q c0937q = this.f3036j;
        if (isEmpty) {
            if (c0937q.f3934x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0937q.f3934x) {
            setHelperTextEnabled(true);
        }
        c0937q.m2510c();
        c0937q.f3933w = charSequence;
        c0937q.f3935y.setText(charSequence);
        int r02 = c0937q.f3924n;
        if (r02 != 2) {
            c0937q.f3925o = 2;
        }
        c0937q.m2516i(r02, c0937q.f3925o, c0937q.m2515h(c0937q.f3935y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0937q c0937q = this.f3036j;
        c0937q.f3909A = colorStateList;
        C2562d0 c2562d0 = c0937q.f3935y;
        if (c2562d0 == null || colorStateList == null) {
            return;
        }
        c2562d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        C0937q c0937q = this.f3036j;
        if (c0937q.f3934x == z2) {
            return;
        }
        c0937q.m2510c();
        if (z2) {
            C2562d0 c2562d0 = new C2562d0(c0937q.f3917g, null);
            c0937q.f3935y = c2562d0;
            c2562d0.setId(com.carwizard.p075li.youtube.R.id.textinput_helper_text);
            c0937q.f3935y.setTextAlignment(5);
            Typeface typeface = c0937q.f3910B;
            if (typeface != null) {
                c0937q.f3935y.setTypeface(typeface);
            }
            c0937q.f3935y.setVisibility(4);
            c0937q.f3935y.setAccessibilityLiveRegion(1);
            int r12 = c0937q.f3936z;
            c0937q.f3936z = r12;
            C2562d0 c2562d02 = c0937q.f3935y;
            if (c2562d02 != null) {
                c2562d02.setTextAppearance(r12);
            }
            ColorStateList colorStateList = c0937q.f3909A;
            c0937q.f3909A = colorStateList;
            C2562d0 c2562d03 = c0937q.f3935y;
            if (c2562d03 != null && colorStateList != null) {
                c2562d03.setTextColor(colorStateList);
            }
            c0937q.m2508a(c0937q.f3935y, 1);
            c0937q.f3935y.setAccessibilityDelegate(new C0936p(c0937q));
        } else {
            c0937q.m2510c();
            int r3 = c0937q.f3924n;
            if (r3 == 2) {
                c0937q.f3925o = 0;
            }
            c0937q.m2516i(r3, c0937q.f3925o, c0937q.m2515h(c0937q.f3935y, ""));
            c0937q.m2514g(c0937q.f3935y, 1);
            c0937q.f3935y = null;
            TextInputLayout textInputLayout = c0937q.f3918h;
            textInputLayout.m2148r();
            textInputLayout.m2154x();
        }
        c0937q.f3934x = z2;
    }

    public void setHelperTextTextAppearance(int r2) {
        C0937q c0937q = this.f3036j;
        c0937q.f3936z = r2;
        C2562d0 c2562d0 = c0937q.f3935y;
        if (c2562d0 != null) {
            c2562d0.setTextAppearance(r2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2997C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f3065x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2997C) {
            this.f2997C = z2;
            if (z2) {
                CharSequence hint = this.f3024d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2998D)) {
                        setHint(hint);
                    }
                    this.f3024d.setHint((CharSequence) null);
                }
                this.f2999E = true;
            } else {
                this.f2999E = false;
                if (!TextUtils.isEmpty(this.f2998D) && TextUtils.isEmpty(this.f3024d.getHint())) {
                    this.f3024d.setHint(this.f2998D);
                }
                setHintInternal(null);
            }
            if (this.f3024d != null) {
                m2150t();
            }
        }
    }

    public void setHintTextAppearance(int r6) {
        C0547b c0547b = this.f3061v0;
        TextInputLayout textInputLayout = c0547b.f1503a;
        C0724d c0724d = new C0724d(textInputLayout.getContext(), r6);
        ColorStateList colorStateList = c0724d.f2608j;
        if (colorStateList != null) {
            c0547b.f1519k = colorStateList;
        }
        float f = c0724d.f2609k;
        if (f != 0.0f) {
            c0547b.f1517i = f;
        }
        ColorStateList colorStateList2 = c0724d.f2599a;
        if (colorStateList2 != null) {
            c0547b.f1497U = colorStateList2;
        }
        c0547b.f1495S = c0724d.f2603e;
        c0547b.f1496T = c0724d.f2604f;
        c0547b.f1494R = c0724d.f2605g;
        c0547b.f1498V = c0724d.f2607i;
        C0721a c0721a = c0547b.f1533y;
        if (c0721a != null) {
            c0721a.f2592g = true;
        }
        C0055g c0055g = new C0055g(16, c0547b);
        c0724d.m1979a();
        c0547b.f1533y = new C0721a(c0055g, c0724d.f2612n);
        c0724d.m1981c(textInputLayout.getContext(), c0547b.f1533y);
        c0547b.m1398h(false);
        this.f3037j0 = c0547b.f1519k;
        if (this.f3024d != null) {
            m2151u(false, false);
            m2150t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3037j0 != colorStateList) {
            if (this.f3035i0 == null) {
                C0547b c0547b = this.f3061v0;
                if (c0547b.f1519k != colorStateList) {
                    c0547b.f1519k = colorStateList;
                    c0547b.m1398h(false);
                }
            }
            this.f3037j0 = colorStateList;
            if (this.f3024d != null) {
                m2151u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0945y interfaceC0945y) {
        this.f3044n = interfaceC0945y;
    }

    public void setMaxEms(int r3) {
        this.f3030g = r3;
        EditText editText = this.f3024d;
        if (editText == null || r3 == -1) {
            return;
        }
        editText.setMaxEms(r3);
    }

    public void setMaxWidth(int r3) {
        this.f3034i = r3;
        EditText editText = this.f3024d;
        if (editText == null || r3 == -1) {
            return;
        }
        editText.setMaxWidth(r3);
    }

    public void setMaxWidthResource(int r2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(r2));
    }

    public void setMinEms(int r3) {
        this.f3028f = r3;
        EditText editText = this.f3024d;
        if (editText == null || r3 == -1) {
            return;
        }
        editText.setMinEms(r3);
    }

    public void setMinWidth(int r3) {
        this.f3032h = r3;
        EditText editText = this.f3024d;
        if (editText == null || r3 == -1) {
            return;
        }
        editText.setMinWidth(r3);
    }

    public void setMinWidthResource(int r2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(r2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r3) {
        C0933m c0933m = this.f3022c;
        c0933m.f3883g.setContentDescription(r3 != 0 ? c0933m.getResources().getText(r3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int r3) {
        C0933m c0933m = this.f3022c;
        c0933m.f3883g.setImageDrawable(r3 != 0 ? AbstractC0580g.m1449n(c0933m.getContext(), r3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        C0933m c0933m = this.f3022c;
        if (z2 && c0933m.f3885i != 1) {
            c0933m.m2497g(1);
        } else if (z2) {
            c0933m.getClass();
        } else {
            c0933m.m2497g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0933m c0933m = this.f3022c;
        c0933m.f3887k = colorStateList;
        AbstractC0580g.m1442f(c0933m.f3877a, c0933m.f3883g, colorStateList, c0933m.f3888l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0933m c0933m = this.f3022c;
        c0933m.f3888l = mode;
        AbstractC0580g.m1442f(c0933m.f3877a, c0933m.f3883g, c0933m.f3887k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3056t == null) {
            C2562d0 c2562d0 = new C2562d0(getContext(), null);
            this.f3056t = c2562d0;
            c2562d0.setId(com.carwizard.p075li.youtube.R.id.textinput_placeholder);
            this.f3056t.setImportantForAccessibility(2);
            C0962h m2135d = m2135d();
            this.f3062w = m2135d;
            m2135d.f4032b = 67L;
            this.f3064x = m2135d();
            setPlaceholderTextAppearance(this.f3060v);
            setPlaceholderTextColor(this.f3058u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3054s) {
                setPlaceholderTextEnabled(true);
            }
            this.f3052r = charSequence;
        }
        EditText editText = this.f3024d;
        m2152v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int r2) {
        this.f3060v = r2;
        C2562d0 c2562d0 = this.f3056t;
        if (c2562d0 != null) {
            c2562d0.setTextAppearance(r2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3058u != colorStateList) {
            this.f3058u = colorStateList;
            C2562d0 c2562d0 = this.f3056t;
            if (c2562d0 == null || colorStateList == null) {
                return;
            }
            c2562d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0942v c0942v = this.f3020b;
        c0942v.getClass();
        c0942v.f3955c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0942v.f3954b.setText(charSequence);
        c0942v.m2525e();
    }

    public void setPrefixTextAppearance(int r2) {
        this.f3020b.f3954b.setTextAppearance(r2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3020b.f3954b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0885k c0885k) {
        C0881g c0881g = this.f3000F;
        if (c0881g == null || c0881g.f3659a.f3642a == c0885k) {
            return;
        }
        this.f3006L = c0885k;
        m2133b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f3020b.f3956d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3020b.f3956d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int r2) {
        setStartIconDrawable(r2 != 0 ? AbstractC0580g.m1449n(getContext(), r2) : null);
    }

    public void setStartIconMinSize(int r3) {
        C0942v c0942v = this.f3020b;
        if (r3 < 0) {
            c0942v.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (r3 != c0942v.f3959g) {
            c0942v.f3959g = r3;
            CheckableImageButton checkableImageButton = c0942v.f3956d;
            checkableImageButton.setMinimumWidth(r3);
            checkableImageButton.setMinimumHeight(r3);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0942v c0942v = this.f3020b;
        View.OnLongClickListener onLongClickListener = c0942v.f3961i;
        CheckableImageButton checkableImageButton = c0942v.f3956d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0942v c0942v = this.f3020b;
        c0942v.f3961i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0942v.f3956d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0942v c0942v = this.f3020b;
        c0942v.f3960h = scaleType;
        c0942v.f3956d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0942v c0942v = this.f3020b;
        if (c0942v.f3957e != colorStateList) {
            c0942v.f3957e = colorStateList;
            AbstractC0580g.m1442f(c0942v.f3953a, c0942v.f3956d, colorStateList, c0942v.f3958f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0942v c0942v = this.f3020b;
        if (c0942v.f3958f != mode) {
            c0942v.f3958f = mode;
            AbstractC0580g.m1442f(c0942v.f3953a, c0942v.f3956d, c0942v.f3957e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f3020b.m2523c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0933m c0933m = this.f3022c;
        c0933m.getClass();
        c0933m.f3892p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0933m.f3893q.setText(charSequence);
        c0933m.m2504n();
    }

    public void setSuffixTextAppearance(int r2) {
        this.f3022c.f3893q.setTextAppearance(r2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3022c.f3893q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0944x c0944x) {
        EditText editText = this.f3024d;
        if (editText != null) {
            AbstractC0283P.m779l(editText, c0944x);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3021b0) {
            this.f3021b0 = typeface;
            this.f3061v0.m1403m(typeface);
            C0937q c0937q = this.f3036j;
            if (typeface != c0937q.f3910B) {
                c0937q.f3910B = typeface;
                C2562d0 c2562d0 = c0937q.f3928r;
                if (c2562d0 != null) {
                    c2562d0.setTypeface(typeface);
                }
                C2562d0 c2562d02 = c0937q.f3935y;
                if (c2562d02 != null) {
                    c2562d02.setTypeface(typeface);
                }
            }
            C2562d0 c2562d03 = this.f3046o;
            if (c2562d03 != null) {
                c2562d03.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m2150t() {
        if (this.f3009O != 1) {
            FrameLayout frameLayout = this.f3018a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int m2134c = m2134c();
            if (m2134c != layoutParams.topMargin) {
                layoutParams.topMargin = m2134c;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final void m2151u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C2562d0 c2562d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3024d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3024d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f3035i0;
        C0547b c0547b = this.f3061v0;
        if (colorStateList2 != null) {
            c0547b.m1399i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f3035i0;
            c0547b.m1399i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3055s0) : this.f3055s0));
        } else if (m2143m()) {
            C2562d0 c2562d02 = this.f3036j.f3928r;
            c0547b.m1399i(c2562d02 != null ? c2562d02.getTextColors() : null);
        } else if (this.f3042m && (c2562d0 = this.f3046o) != null) {
            c0547b.m1399i(c2562d0.getTextColors());
        } else if (z5 && (colorStateList = this.f3037j0) != null && c0547b.f1519k != colorStateList) {
            c0547b.f1519k = colorStateList;
            c0547b.m1398h(false);
        }
        C0933m c0933m = this.f3022c;
        C0942v c0942v = this.f3020b;
        if (z4 || !this.f3063w0 || (isEnabled() && z5)) {
            if (z3 || this.f3059u0) {
                ValueAnimator valueAnimator = this.f3067y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3067y0.cancel();
                }
                if (z2 && this.f3065x0) {
                    m2132a(1.0f);
                } else {
                    c0547b.m1401k(1.0f);
                }
                this.f3059u0 = false;
                if (m2136e()) {
                    m2141j();
                }
                EditText editText3 = this.f3024d;
                m2152v(editText3 != null ? editText3.getText() : null);
                c0942v.f3962j = false;
                c0942v.m2525e();
                c0933m.f3894r = false;
                c0933m.m2504n();
                return;
            }
            return;
        }
        if (z3 || !this.f3059u0) {
            ValueAnimator valueAnimator2 = this.f3067y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3067y0.cancel();
            }
            if (z2 && this.f3065x0) {
                m2132a(0.0f);
            } else {
                c0547b.m1401k(0.0f);
            }
            if (m2136e() && !((C0927g) this.f3000F).f3858x.f3856q.isEmpty() && m2136e()) {
                ((C0927g) this.f3000F).m2481n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3059u0 = true;
            C2562d0 c2562d03 = this.f3056t;
            if (c2562d03 != null && this.f3054s) {
                c2562d03.setText((CharSequence) null);
                AbstractC0971q.m2581a(this.f3018a, this.f3064x);
                this.f3056t.setVisibility(4);
            }
            c0942v.f3962j = true;
            c0942v.m2525e();
            c0933m.f3894r = true;
            c0933m.m2504n();
        }
    }

    /* renamed from: v */
    public final void m2152v(Editable editable) {
        ((C0120g) this.f3044n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3018a;
        if (length != 0 || this.f3059u0) {
            C2562d0 c2562d0 = this.f3056t;
            if (c2562d0 == null || !this.f3054s) {
                return;
            }
            c2562d0.setText((CharSequence) null);
            AbstractC0971q.m2581a(frameLayout, this.f3064x);
            this.f3056t.setVisibility(4);
            return;
        }
        if (this.f3056t == null || !this.f3054s || TextUtils.isEmpty(this.f3052r)) {
            return;
        }
        this.f3056t.setText(this.f3052r);
        AbstractC0971q.m2581a(frameLayout, this.f3062w);
        this.f3056t.setVisibility(0);
        this.f3056t.bringToFront();
        announceForAccessibility(this.f3052r);
    }

    /* renamed from: w */
    public final void m2153w(boolean z2, boolean z3) {
        int defaultColor = this.f3045n0.getDefaultColor();
        int colorForState = this.f3045n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3045n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f3014T = colorForState2;
        } else if (z3) {
            this.f3014T = colorForState;
        } else {
            this.f3014T = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m2154x() {
        C2562d0 c2562d0;
        EditText editText;
        EditText editText2;
        if (this.f3000F == null || this.f3009O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f3024d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f3024d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f3014T = this.f3055s0;
        } else if (m2143m()) {
            if (this.f3045n0 != null) {
                m2153w(z3, z2);
            } else {
                this.f3014T = getErrorCurrentTextColors();
            }
        } else if (!this.f3042m || (c2562d0 = this.f3046o) == null) {
            if (z3) {
                this.f3014T = this.f3043m0;
            } else if (z2) {
                this.f3014T = this.f3041l0;
            } else {
                this.f3014T = this.f3039k0;
            }
        } else if (this.f3045n0 != null) {
            m2153w(z3, z2);
        } else {
            this.f3014T = c2562d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m2146p();
        }
        C0933m c0933m = this.f3022c;
        c0933m.m2502l();
        CheckableImageButton checkableImageButton = c0933m.f3879c;
        ColorStateList colorStateList = c0933m.f3880d;
        TextInputLayout textInputLayout = c0933m.f3877a;
        AbstractC0580g.m1456w(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0933m.f3887k;
        CheckableImageButton checkableImageButton2 = c0933m.f3883g;
        AbstractC0580g.m1456w(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0933m.m2492b() instanceof C0930j) {
            if (!textInputLayout.m2143m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0580g.m1442f(textInputLayout, checkableImageButton2, c0933m.f3887k, c0933m.f3888l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                AbstractC0095a.m318g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        C0942v c0942v = this.f3020b;
        AbstractC0580g.m1456w(c0942v.f3953a, c0942v.f3956d, c0942v.f3957e);
        if (this.f3009O == 2) {
            int r3 = this.f3011Q;
            if (z3 && isEnabled()) {
                this.f3011Q = this.f3013S;
            } else {
                this.f3011Q = this.f3012R;
            }
            if (this.f3011Q != r3 && m2136e() && !this.f3059u0) {
                if (m2136e()) {
                    ((C0927g) this.f3000F).m2481n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m2141j();
            }
        }
        if (this.f3009O == 1) {
            if (!isEnabled()) {
                this.f3015U = this.f3049p0;
            } else if (z2 && !z3) {
                this.f3015U = this.f3053r0;
            } else if (z3) {
                this.f3015U = this.f3051q0;
            } else {
                this.f3015U = this.f3047o0;
            }
        }
        m2133b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3020b.m2522b(drawable);
    }

    public void setHint(int r2) {
        setHint(r2 != 0 ? getResources().getText(r2) : null);
    }

    public void setStartIconContentDescription(int r2) {
        setStartIconContentDescription(r2 != 0 ? getResources().getText(r2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3022c.f3883g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3022c.f3883g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3022c.m2499i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3022c.f3883g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0933m c0933m = this.f3022c;
        CheckableImageButton checkableImageButton = c0933m.f3883g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0933m.f3887k;
            PorterDuff.Mode mode = c0933m.f3888l;
            TextInputLayout textInputLayout = c0933m.f3877a;
            AbstractC0580g.m1442f(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0580g.m1456w(textInputLayout, checkableImageButton, c0933m.f3887k);
        }
    }
}
