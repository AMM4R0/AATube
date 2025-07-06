package p088h1;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p028K.C0295b;
import p031L.C0356j;
import p104l.C2562d0;

/* renamed from: h1.x */
/* loaded from: classes.dex */
public final class C0944x extends C0295b {

    /* renamed from: d */
    public final TextInputLayout f3966d;

    public C0944x(TextInputLayout textInputLayout) {
        this.f3966d = textInputLayout;
    }

    @Override // p028K.C0295b
    /* renamed from: d */
    public final void mo807d(View view, C0356j c0356j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f856a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3966d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f3059u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        C0942v c0942v = textInputLayout.f3020b;
        C2562d0 c2562d0 = c0942v.f3954b;
        if (c2562d0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c2562d0);
            accessibilityNodeInfo.setTraversalAfter(c2562d0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c0942v.f3956d);
        }
        if (!isEmpty) {
            c0356j.m1034k(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            c0356j.m1034k(charSequence);
            if (!z2 && placeholderText != null) {
                c0356j.m1034k(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c0356j.m1034k(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int r7 = Build.VERSION.SDK_INT;
            if (r7 >= 26) {
                c0356j.m1033j(charSequence);
            } else {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                c0356j.m1034k(charSequence);
            }
            if (r7 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                c0356j.m1031h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C2562d0 c2562d02 = textInputLayout.f3036j.f3935y;
        if (c2562d02 != null) {
            accessibilityNodeInfo.setLabelFor(c2562d02);
        }
        textInputLayout.f3022c.m2492b().mo2486n(c0356j);
    }

    @Override // p028K.C0295b
    /* renamed from: e */
    public final void mo808e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo808e(view, accessibilityEvent);
        this.f3966d.f3022c.m2492b().mo2487o(accessibilityEvent);
    }
}
