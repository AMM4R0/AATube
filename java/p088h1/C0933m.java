package p088h1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ViewOnAttachStateChangeListenerC0643J;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p002A1.C0015h;
import p011D1.C0117d;
import p028K.AbstractC0283P;
import p031L.AccessibilityManagerTouchExplorationStateChangeListenerC0348b;
import p036M1.AbstractC0387m;
import p043P.C0412d;
import p065Y0.AbstractC0556k;
import p104l.C2562d0;

/* renamed from: h1.m */
/* loaded from: classes.dex */
public final class C0933m extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f3877a;

    /* renamed from: b */
    public final FrameLayout f3878b;

    /* renamed from: c */
    public final CheckableImageButton f3879c;

    /* renamed from: d */
    public ColorStateList f3880d;

    /* renamed from: e */
    public PorterDuff.Mode f3881e;

    /* renamed from: f */
    public View.OnLongClickListener f3882f;

    /* renamed from: g */
    public final CheckableImageButton f3883g;

    /* renamed from: h */
    public final C0117d f3884h;

    /* renamed from: i */
    public int f3885i;

    /* renamed from: j */
    public final LinkedHashSet f3886j;

    /* renamed from: k */
    public ColorStateList f3887k;

    /* renamed from: l */
    public PorterDuff.Mode f3888l;

    /* renamed from: m */
    public int f3889m;

    /* renamed from: n */
    public ImageView.ScaleType f3890n;

    /* renamed from: o */
    public View.OnLongClickListener f3891o;

    /* renamed from: p */
    public CharSequence f3892p;

    /* renamed from: q */
    public final C2562d0 f3893q;

    /* renamed from: r */
    public boolean f3894r;

    /* renamed from: s */
    public EditText f3895s;

    /* renamed from: t */
    public final AccessibilityManager f3896t;

    /* renamed from: u */
    public C0412d f3897u;

    /* renamed from: v */
    public final C0931k f3898v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933m(TextInputLayout textInputLayout, C0015h c0015h) {
        super(textInputLayout.getContext());
        CharSequence text;
        int r3 = 1;
        this.f3885i = 0;
        this.f3886j = new LinkedHashSet();
        this.f3898v = new C0931k(this);
        C0932l c0932l = new C0932l(this);
        this.f3896t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3877a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3878b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m2491a = m2491a(this, from, R.id.text_input_error_icon);
        this.f3879c = m2491a;
        CheckableImageButton m2491a2 = m2491a(frameLayout, from, R.id.text_input_end_icon);
        this.f3883g = m2491a2;
        this.f3884h = new C0117d(this, c0015h);
        C2562d0 c2562d0 = new C2562d0(getContext(), null);
        this.f3893q = c2562d0;
        TypedArray typedArray = (TypedArray) c0015h.f26c;
        if (typedArray.hasValue(38)) {
            this.f3880d = AbstractC0387m.m1120r(getContext(), c0015h, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f3881e = AbstractC0556k.m1413g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m2499i(c0015h.m121p(37));
        }
        m2491a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        m2491a.setImportantForAccessibility(2);
        m2491a.setClickable(false);
        m2491a.setPressable(false);
        m2491a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f3887k = AbstractC0387m.m1120r(getContext(), c0015h, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f3888l = AbstractC0556k.m1413g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m2497g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && m2491a2.getContentDescription() != (text = typedArray.getText(27))) {
                m2491a2.setContentDescription(text);
            }
            m2491a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f3887k = AbstractC0387m.m1120r(getContext(), c0015h, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f3888l = AbstractC0556k.m1413g(typedArray.getInt(55, -1), null);
            }
            m2497g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (m2491a2.getContentDescription() != text2) {
                m2491a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3889m) {
            this.f3889m = dimensionPixelSize;
            m2491a2.setMinimumWidth(dimensionPixelSize);
            m2491a2.setMinimumHeight(dimensionPixelSize);
            m2491a.setMinimumWidth(dimensionPixelSize);
            m2491a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType m1444i = AbstractC0580g.m1444i(typedArray.getInt(31, -1));
            this.f3890n = m1444i;
            m2491a2.setScaleType(m1444i);
            m2491a.setScaleType(m1444i);
        }
        c2562d0.setVisibility(8);
        c2562d0.setId(R.id.textinput_suffix_text);
        c2562d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c2562d0.setAccessibilityLiveRegion(1);
        c2562d0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c2562d0.setTextColor(c0015h.m120o(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f3892p = TextUtils.isEmpty(text3) ? null : text3;
        c2562d0.setText(text3);
        m2504n();
        frameLayout.addView(m2491a2);
        addView(c2562d0);
        addView(frameLayout);
        addView(m2491a);
        textInputLayout.f3027e0.add(c0932l);
        if (textInputLayout.f3024d != null) {
            c0932l.m2490a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0643J(r3, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m2491a(ViewGroup viewGroup, LayoutInflater layoutInflater, int r5) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(r5);
        if (AbstractC0387m.m1101D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0934n m2492b() {
        AbstractC0934n c0925e;
        int r02 = this.f3885i;
        C0117d c0117d = this.f3884h;
        SparseArray sparseArray = (SparseArray) c0117d.f356c;
        AbstractC0934n abstractC0934n = (AbstractC0934n) sparseArray.get(r02);
        if (abstractC0934n == null) {
            C0933m c0933m = (C0933m) c0117d.f357d;
            if (r02 == -1) {
                c0925e = new C0925e(c0933m, 0);
            } else if (r02 == 0) {
                c0925e = new C0925e(c0933m, 1);
            } else if (r02 == 1) {
                abstractC0934n = new C0941u(c0933m, c0117d.f355b);
                sparseArray.append(r02, abstractC0934n);
            } else if (r02 == 2) {
                c0925e = new C0924d(c0933m);
            } else {
                if (r02 != 3) {
                    throw new IllegalArgumentException(AbstractC0002c.m11f(r02, "Invalid end icon mode: "));
                }
                c0925e = new C0930j(c0933m);
            }
            abstractC0934n = c0925e;
            sparseArray.append(r02, abstractC0934n);
        }
        return abstractC0934n;
    }

    /* renamed from: c */
    public final int m2493c() {
        int marginStart;
        if (m2494d() || m2495e()) {
            CheckableImageButton checkableImageButton = this.f3883g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return this.f3893q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m2494d() {
        return this.f3878b.getVisibility() == 0 && this.f3883g.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m2495e() {
        return this.f3879c.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m2496f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        AbstractC0934n m2492b = m2492b();
        boolean mo2506k = m2492b.mo2506k();
        CheckableImageButton checkableImageButton = this.f3883g;
        boolean z5 = true;
        if (!mo2506k || (z4 = checkableImageButton.f2948d) == m2492b.mo2485l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(m2492b instanceof C0930j) || (isActivated = checkableImageButton.isActivated()) == m2492b.mo2484j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            AbstractC0580g.m1456w(this.f3877a, checkableImageButton, this.f3887k);
        }
    }

    /* renamed from: g */
    public final void m2497g(int r9) {
        if (this.f3885i == r9) {
            return;
        }
        AbstractC0934n m2492b = m2492b();
        C0412d c0412d = this.f3897u;
        AccessibilityManager accessibilityManager = this.f3896t;
        if (c0412d != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0348b(c0412d));
        }
        this.f3897u = null;
        m2492b.mo2478s();
        this.f3885i = r9;
        Iterator it = this.f3886j.iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        m2498h(r9 != 0);
        AbstractC0934n m2492b2 = m2492b();
        int r4 = this.f3884h.f354a;
        if (r4 == 0) {
            r4 = m2492b2.mo2471d();
        }
        Drawable m1449n = r4 != 0 ? AbstractC0580g.m1449n(getContext(), r4) : null;
        CheckableImageButton checkableImageButton = this.f3883g;
        checkableImageButton.setImageDrawable(m1449n);
        TextInputLayout textInputLayout = this.f3877a;
        if (m1449n != null) {
            AbstractC0580g.m1442f(textInputLayout, checkableImageButton, this.f3887k, this.f3888l);
            AbstractC0580g.m1456w(textInputLayout, checkableImageButton, this.f3887k);
        }
        int mo2470c = m2492b2.mo2470c();
        CharSequence text = mo2470c != 0 ? getResources().getText(mo2470c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(m2492b2.mo2506k());
        if (!m2492b2.mo2483i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + r9);
        }
        m2492b2.mo2477r();
        C0412d mo2482h = m2492b2.mo2482h();
        this.f3897u = mo2482h;
        if (mo2482h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0348b(this.f3897u));
            }
        }
        View.OnClickListener mo2473f = m2492b2.mo2473f();
        View.OnLongClickListener onLongClickListener = this.f3891o;
        checkableImageButton.setOnClickListener(mo2473f);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
        EditText editText = this.f3895s;
        if (editText != null) {
            m2492b2.mo2475m(editText);
            m2500j(m2492b2);
        }
        AbstractC0580g.m1442f(textInputLayout, checkableImageButton, this.f3887k, this.f3888l);
        m2496f(true);
    }

    /* renamed from: h */
    public final void m2498h(boolean z2) {
        if (m2494d() != z2) {
            this.f3883g.setVisibility(z2 ? 0 : 8);
            m2501k();
            m2503m();
            this.f3877a.m2147q();
        }
    }

    /* renamed from: i */
    public final void m2499i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3879c;
        checkableImageButton.setImageDrawable(drawable);
        m2502l();
        AbstractC0580g.m1442f(this.f3877a, checkableImageButton, this.f3880d, this.f3881e);
    }

    /* renamed from: j */
    public final void m2500j(AbstractC0934n abstractC0934n) {
        if (this.f3895s == null) {
            return;
        }
        if (abstractC0934n.mo2472e() != null) {
            this.f3895s.setOnFocusChangeListener(abstractC0934n.mo2472e());
        }
        if (abstractC0934n.mo2474g() != null) {
            this.f3883g.setOnFocusChangeListener(abstractC0934n.mo2474g());
        }
    }

    /* renamed from: k */
    public final void m2501k() {
        this.f3878b.setVisibility((this.f3883g.getVisibility() != 0 || m2495e()) ? 8 : 0);
        setVisibility((m2494d() || m2495e() || !((this.f3892p == null || this.f3894r) ? 8 : false)) ? 0 : 8);
    }

    /* renamed from: l */
    public final void m2502l() {
        CheckableImageButton checkableImageButton = this.f3879c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f3877a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f3036j.f3927q && textInputLayout.m2143m()) ? 0 : 8);
        m2501k();
        m2503m();
        if (this.f3885i != 0) {
            return;
        }
        textInputLayout.m2147q();
    }

    /* renamed from: m */
    public final void m2503m() {
        int r12;
        TextInputLayout textInputLayout = this.f3877a;
        if (textInputLayout.f3024d == null) {
            return;
        }
        if (m2494d() || m2495e()) {
            r12 = 0;
        } else {
            EditText editText = textInputLayout.f3024d;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            r12 = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f3024d.getPaddingTop();
        int paddingBottom = textInputLayout.f3024d.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
        this.f3893q.setPaddingRelative(dimensionPixelSize, paddingTop, r12, paddingBottom);
    }

    /* renamed from: n */
    public final void m2504n() {
        C2562d0 c2562d0 = this.f3893q;
        int visibility = c2562d0.getVisibility();
        int r2 = (this.f3892p == null || this.f3894r) ? 8 : 0;
        if (visibility != r2) {
            m2492b().mo2476p(r2 == 0);
        }
        m2501k();
        c2562d0.setVisibility(r2);
        this.f3877a.m2147q();
    }
}
