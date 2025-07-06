package p104l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p001A0.AbstractC0005b;
import p002A1.C0015h;
import p036M1.AbstractC0387m;
import p046Q.InterfaceC0445s;

/* renamed from: l.o */
/* loaded from: classes.dex */
public class C2594o extends AutoCompleteTextView implements InterfaceC0445s {

    /* renamed from: d */
    public static final int[] f8431d = {R.attr.popupBackground};

    /* renamed from: a */
    public final C2597p f8432a;

    /* renamed from: b */
    public final C2553a0 f8433b;

    /* renamed from: c */
    public final C2503B f8434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.carwizard.p075li.youtube.R.attr.autoCompleteTextViewStyle);
        AbstractC2581j1.m5035a(context);
        AbstractC2578i1.m5030a(this, getContext());
        C0015h m100A = C0015h.m100A(getContext(), attributeSet, f8431d, com.carwizard.p075li.youtube.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) m100A.f26c).hasValue(0)) {
            setDropDownBackgroundDrawable(m100A.m121p(0));
        }
        m100A.m102C();
        C2597p c2597p = new C2597p(this);
        this.f8432a = c2597p;
        c2597p.m5058d(attributeSet, com.carwizard.p075li.youtube.R.attr.autoCompleteTextViewStyle);
        C2553a0 c2553a0 = new C2553a0(this);
        this.f8433b = c2553a0;
        c2553a0.m5006f(attributeSet, com.carwizard.p075li.youtube.R.attr.autoCompleteTextViewStyle);
        c2553a0.m5003b();
        C2503B c2503b = new C2503B(this);
        this.f8434c = c2503b;
        c2503b.mo4924b(attributeSet, com.carwizard.p075li.youtube.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener m4923a = c2503b.m4923a(keyListener);
        if (m4923a == keyListener) {
            return;
        }
        super.setKeyListener(m4923a);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C2553a0 c2553a0 = this.f8433b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0005b.m53S(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8433b.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8433b.m5005e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0387m.m1104G(editorInfo, onCreateInputConnection, this);
        return this.f8434c.m4925c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8433b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8433b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0005b.m54T(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
        setDropDownBackgroundDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f8434c.m4926d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8434c.m4923a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8432a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8433b;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8433b;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C2553a0 c2553a0 = this.f8433b;
        if (c2553a0 != null) {
            c2553a0.m5007g(context, r3);
        }
    }
}
