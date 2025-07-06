package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p046Q.InterfaceC0444r;
import p046Q.InterfaceC0445s;
import p082f0.C0900d;

/* renamed from: l.r */
/* loaded from: classes.dex */
public class C2603r extends CheckBox implements InterfaceC0444r, InterfaceC0445s {

    /* renamed from: a */
    public final C0900d f8455a;

    /* renamed from: b */
    public final C2597p f8456b;

    /* renamed from: c */
    public final C2553a0 f8457c;

    /* renamed from: d */
    public C2618w f8458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603r(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        AbstractC2581j1.m5035a(context);
        AbstractC2578i1.m5030a(this, getContext());
        C0900d c0900d = new C0900d(this);
        this.f8455a = c0900d;
        c0900d.m2430d(attributeSet, r3);
        C2597p c2597p = new C2597p(this);
        this.f8456b = c2597p;
        c2597p.m5058d(attributeSet, r3);
        C2553a0 c2553a0 = new C2553a0(this);
        this.f8457c = c2553a0;
        c2553a0.m5006f(attributeSet, r3);
        getEmojiTextViewHelper().m5085b(attributeSet, r3);
    }

    private C2618w getEmojiTextViewHelper() {
        if (this.f8458d == null) {
            this.f8458d = new C2618w(this);
        }
        return this.f8458d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C2553a0 c2553a0 = this.f8457c;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0900d c0900d = this.f8455a;
        if (c0900d != null) {
            c0900d.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    @Override // p046Q.InterfaceC0444r
    public ColorStateList getSupportButtonTintList() {
        C0900d c0900d = this.f8455a;
        if (c0900d != null) {
            return (ColorStateList) c0900d.f3749e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0900d c0900d = this.f8455a;
        if (c0900d != null) {
            return (PorterDuff.Mode) c0900d.f3750f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8457c.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8457c.m5005e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m5086c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0900d c0900d = this.f8455a;
        if (c0900d != null) {
            if (c0900d.f3747c) {
                c0900d.f3747c = false;
            } else {
                c0900d.f3747c = true;
                c0900d.m2427a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8457c;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8457c;
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
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8456b;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // p046Q.InterfaceC0444r
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0900d c0900d = this.f8455a;
        if (c0900d != null) {
            c0900d.f3749e = colorStateList;
            c0900d.f3745a = true;
            c0900d.m2427a();
        }
    }

    @Override // p046Q.InterfaceC0444r
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0900d c0900d = this.f8455a;
        if (c0900d != null) {
            c0900d.f3750f = mode;
            c0900d.f3746b = true;
            c0900d.m2427a();
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8457c;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8457c;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }
}
