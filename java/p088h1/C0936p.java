package p088h1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: h1.p */
/* loaded from: classes.dex */
public final class C0936p extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C0937q f3908a;

    public C0936p(C0937q c0937q) {
        this.f3908a = c0937q;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f3908a.f3918h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
