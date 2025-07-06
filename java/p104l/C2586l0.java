package p104l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p046Q.InterfaceC0445s;

/* renamed from: l.l0 */
/* loaded from: classes.dex */
public final class C2586l0 extends ToggleButton implements InterfaceC0445s {

    /* renamed from: a */
    public final C2597p f8419a;

    /* renamed from: b */
    public final C2553a0 f8420b;

    /* renamed from: c */
    public C2618w f8421c;

    public C2586l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC2578i1.m5030a(this, getContext());
        C2597p c2597p = new C2597p(this);
        this.f8419a = c2597p;
        c2597p.m5058d(attributeSet, R.attr.buttonStyleToggle);
        C2553a0 c2553a0 = new C2553a0(this);
        this.f8420b = c2553a0;
        c2553a0.m5006f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m5085b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C2618w getEmojiTextViewHelper() {
        if (this.f8421c == null) {
            this.f8421c = new C2618w(this);
        }
        return this.f8421c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C2553a0 c2553a0 = this.f8420b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8420b.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8420b.m5005e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m5086c(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8420b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8420b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m5087d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m5084a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8419a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8420b;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8420b;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }
}
