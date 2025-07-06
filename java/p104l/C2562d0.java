package p104l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p001A0.AbstractC0005b;
import p006C.AbstractC0056h;
import p022I.AbstractC0199h;
import p022I.C0198g;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p046Q.AbstractC0439m;
import p046Q.InterfaceC0445s;

/* renamed from: l.d0 */
/* loaded from: classes.dex */
public class C2562d0 extends TextView implements InterfaceC0445s {

    /* renamed from: a */
    public final C2597p f8332a;

    /* renamed from: b */
    public final C2553a0 f8333b;

    /* renamed from: c */
    public final C2503B f8334c;

    /* renamed from: d */
    public C2618w f8335d;

    /* renamed from: e */
    public boolean f8336e;

    /* renamed from: f */
    public C2579j f8337f;

    /* renamed from: g */
    public Future f8338g;

    public C2562d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2618w getEmojiTextViewHelper() {
        if (this.f8335d == null) {
            this.f8335d = new C2618w(this);
        }
        return this.f8335d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    /* renamed from: f */
    public final void m5018f() {
        Future future = this.f8338g;
        if (future == null) {
            return;
        }
        try {
            this.f8338g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0005b.m76v(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeMaxTextSize();
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            return Math.round(c2553a0.f8323i.f8412e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeMinTextSize();
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            return Math.round(c2553a0.f8323i.f8411d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeStepGranularity();
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            return Math.round(c2553a0.f8323i.f8410c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2553a0 c2553a0 = this.f8333b;
        return c2553a0 != null ? c2553a0.f8323i.f8413f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            return c2553a0.f8323i.f8408a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0005b.m53S(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2556b0 getSuperCaller() {
        if (this.f8337f == null) {
            int r02 = Build.VERSION.SDK_INT;
            if (r02 >= 28) {
                this.f8337f = new C2559c0(this);
            } else if (r02 >= 26) {
                this.f8337f = new C2579j(this);
            }
        }
        return this.f8337f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8333b.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8333b.m5005e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m5018f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2503B c2503b;
        if (Build.VERSION.SDK_INT >= 28 || (c2503b = this.f8334c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2503b.f8190c;
        return textClassifier == null ? AbstractC2538T.m4987a((TextView) c2503b.f8189b) : textClassifier;
    }

    public C0198g getTextMetricsParamsCompat() {
        return AbstractC0005b.m76v(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8333b.getClass();
        C2553a0.m5001h(editorInfo, onCreateInputConnection, this);
        AbstractC0387m.m1104G(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 == null || AbstractC2502A1.f8186b) {
            return;
        }
        c2553a0.f8323i.m5043a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r12, int r2) {
        m5018f();
        super.onMeasure(r12, r2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        super.onTextChanged(charSequence, r2, r3, r4);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 == null || AbstractC2502A1.f8186b) {
            return;
        }
        C2583k0 c2583k0 = c2553a0.f8323i;
        if (c2583k0.m5045f()) {
            c2583k0.m5043a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m5086c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        if (AbstractC2502A1.f8186b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
            return;
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5008i(r2, r3, r4, r5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        if (AbstractC2502A1.f8186b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
            return;
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5009j(r2, r3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (AbstractC2502A1.f8186b) {
            super.setAutoSizeTextTypeWithDefaults(r2);
            return;
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5010k(r2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0005b.m54T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m5087d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m5084a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo5015f(r3);
        } else {
            AbstractC0005b.m48K(this, r3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo5014e(r3);
        } else {
            AbstractC0005b.m49L(this, r3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3) {
        AbstractC0379e.m1072c(r3);
        if (r3 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(r3 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0199h abstractC0199h) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0005b.m76v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8332a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8333b;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8333b;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5007g(context, r3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2503B c2503b;
        if (Build.VERSION.SDK_INT >= 28 || (c2503b = this.f8334c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2503b.f8190c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0199h> future) {
        this.f8338g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0198g c0198g) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0198g.f598b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int r2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                r2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                r2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                r2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                r2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                r2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                r2 = 7;
            }
        }
        setTextDirection(r2);
        getPaint().set(c0198g.f597a);
        AbstractC0439m.m1189e(this, c0198g.f599c);
        AbstractC0439m.m1192h(this, c0198g.f600d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float f) {
        boolean z2 = AbstractC2502A1.f8186b;
        if (z2) {
            super.setTextSize(r3, f);
            return;
        }
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 == null || z2) {
            return;
        }
        C2583k0 c2583k0 = c2553a0.f8323i;
        if (c2583k0.m5045f()) {
            return;
        }
        c2583k0.m5046g(r3, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int r4) {
        Typeface typeface2;
        if (this.f8336e) {
            return;
        }
        if (typeface == null || r4 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0379e abstractC0379e = AbstractC0056h.f108a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, r4);
        }
        this.f8336e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, r4);
        } finally {
            this.f8336e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562d0(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        AbstractC2581j1.m5035a(context);
        this.f8336e = false;
        this.f8337f = null;
        AbstractC2578i1.m5030a(this, getContext());
        C2597p c2597p = new C2597p(this);
        this.f8332a = c2597p;
        c2597p.m5058d(attributeSet, r3);
        C2553a0 c2553a0 = new C2553a0(this);
        this.f8333b = c2553a0;
        c2553a0.m5006f(attributeSet, r3);
        c2553a0.m5003b();
        C2503B c2503b = new C2503B();
        c2503b.f8189b = this;
        this.f8334c = c2503b;
        getEmojiTextViewHelper().m5085b(attributeSet, r3);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(r3 != 0 ? AbstractC0580g.m1449n(context, r3) : null, r4 != 0 ? AbstractC0580g.m1449n(context, r4) : null, r5 != 0 ? AbstractC0580g.m1449n(context, r5) : null, r6 != 0 ? AbstractC0580g.m1449n(context, r6) : null);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(r3 != 0 ? AbstractC0580g.m1449n(context, r3) : null, r4 != 0 ? AbstractC0580g.m1449n(context, r4) : null, r5 != 0 ? AbstractC0580g.m1449n(context, r5) : null, r6 != 0 ? AbstractC0580g.m1449n(context, r6) : null);
        C2553a0 c2553a0 = this.f8333b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }
}
