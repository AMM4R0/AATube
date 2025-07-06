package p088h1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p028K.AbstractC0283P;
import p036M1.AbstractC0387m;
import p065Y0.AbstractC0556k;
import p104l.C2562d0;

/* renamed from: h1.v */
/* loaded from: classes.dex */
public final class C0942v extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f3953a;

    /* renamed from: b */
    public final C2562d0 f3954b;

    /* renamed from: c */
    public CharSequence f3955c;

    /* renamed from: d */
    public final CheckableImageButton f3956d;

    /* renamed from: e */
    public ColorStateList f3957e;

    /* renamed from: f */
    public PorterDuff.Mode f3958f;

    /* renamed from: g */
    public int f3959g;

    /* renamed from: h */
    public ImageView.ScaleType f3960h;

    /* renamed from: i */
    public View.OnLongClickListener f3961i;

    /* renamed from: j */
    public boolean f3962j;

    public C0942v(TextInputLayout textInputLayout, C0015h c0015h) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f3953a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3956d = checkableImageButton;
        C2562d0 c2562d0 = new C2562d0(getContext(), null);
        this.f3954b = c2562d0;
        if (AbstractC0387m.m1101D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3961i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
        this.f3961i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0580g.m1457x(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0015h.f26c;
        if (typedArray.hasValue(69)) {
            this.f3957e = AbstractC0387m.m1120r(getContext(), c0015h, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f3958f = AbstractC0556k.m1413g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m2522b(c0015h.m121p(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3959g) {
            this.f3959g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType m1444i = AbstractC0580g.m1444i(typedArray.getInt(68, -1));
            this.f3960h = m1444i;
            checkableImageButton.setScaleType(m1444i);
        }
        c2562d0.setVisibility(8);
        c2562d0.setId(R.id.textinput_prefix_text);
        c2562d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        c2562d0.setAccessibilityLiveRegion(1);
        c2562d0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c2562d0.setTextColor(c0015h.m120o(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f3955c = TextUtils.isEmpty(text2) ? null : text2;
        c2562d0.setText(text2);
        m2525e();
        addView(checkableImageButton);
        addView(c2562d0);
    }

    /* renamed from: a */
    public final int m2521a() {
        int r02;
        CheckableImageButton checkableImageButton = this.f3956d;
        if (checkableImageButton.getVisibility() == 0) {
            r02 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            r02 = 0;
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return this.f3954b.getPaddingStart() + getPaddingStart() + r02;
    }

    /* renamed from: b */
    public final void m2522b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3956d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3957e;
            PorterDuff.Mode mode = this.f3958f;
            TextInputLayout textInputLayout = this.f3953a;
            AbstractC0580g.m1442f(textInputLayout, checkableImageButton, colorStateList, mode);
            m2523c(true);
            AbstractC0580g.m1456w(textInputLayout, checkableImageButton, this.f3957e);
            return;
        }
        m2523c(false);
        View.OnLongClickListener onLongClickListener = this.f3961i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0580g.m1457x(checkableImageButton, onLongClickListener);
        this.f3961i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0580g.m1457x(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m2523c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f3956d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            m2524d();
            m2525e();
        }
    }

    /* renamed from: d */
    public final void m2524d() {
        int paddingStart;
        EditText editText = this.f3953a.f3024d;
        if (editText == null) {
            return;
        }
        if (this.f3956d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
        this.f3954b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m2525e() {
        int r02 = (this.f3955c == null || this.f3962j) ? 8 : 0;
        setVisibility((this.f3956d.getVisibility() == 0 || r02 == 0) ? 0 : 8);
        this.f3954b.setVisibility(r02);
        this.f3953a.m2147q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r12, int r2) {
        super.onMeasure(r12, r2);
        m2524d();
    }
}
