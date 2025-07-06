package p104l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p001A0.AbstractC0005b;
import p046Q.InterfaceC0445s;

/* renamed from: l.q */
/* loaded from: classes.dex */
public class C2600q extends Button implements InterfaceC0445s {

    /* renamed from: a */
    public final C2597p f8452a;

    /* renamed from: b */
    public final C2553a0 f8453b;

    /* renamed from: c */
    public C2618w f8454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2600q(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        AbstractC2581j1.m5035a(context);
        AbstractC2578i1.m5030a(this, getContext());
        C2597p c2597p = new C2597p(this);
        this.f8452a = c2597p;
        c2597p.m5058d(attributeSet, r3);
        C2553a0 c2553a0 = new C2553a0(this);
        this.f8453b = c2553a0;
        c2553a0.m5006f(attributeSet, r3);
        c2553a0.m5003b();
        getEmojiTextViewHelper().m5085b(attributeSet, r3);
    }

    private C2618w getEmojiTextViewHelper() {
        if (this.f8454c == null) {
            this.f8454c = new C2618w(this);
        }
        return this.f8454c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeMaxTextSize();
        }
        C2553a0 c2553a0 = this.f8453b;
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
        C2553a0 c2553a0 = this.f8453b;
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
        C2553a0 c2553a0 = this.f8453b;
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
        C2553a0 c2553a0 = this.f8453b;
        return c2553a0 != null ? c2553a0.f8323i.f8413f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC2502A1.f8186b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 != null) {
            return c2553a0.f8323i.f8408a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0005b.m53S(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8453b.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8453b.m5005e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 == null || AbstractC2502A1.f8186b) {
            return;
        }
        c2553a0.f8323i.m5043a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        super.onTextChanged(charSequence, r2, r3, r4);
        C2553a0 c2553a0 = this.f8453b;
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
        C2553a0 c2553a0 = this.f8453b;
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
        C2553a0 c2553a0 = this.f8453b;
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
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 != null) {
            c2553a0.m5010k(r2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
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

    public void setSupportAllCaps(boolean z2) {
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 != null) {
            c2553a0.f8315a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8452a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8453b;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8453b;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 != null) {
            c2553a0.m5007g(context, r3);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float f) {
        boolean z2 = AbstractC2502A1.f8186b;
        if (z2) {
            super.setTextSize(r3, f);
            return;
        }
        C2553a0 c2553a0 = this.f8453b;
        if (c2553a0 == null || z2) {
            return;
        }
        C2583k0 c2583k0 = c2553a0.f8323i;
        if (c2583k0.m5045f()) {
            return;
        }
        c2583k0.m5046g(r3, f);
    }
}
