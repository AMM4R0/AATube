package p031L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.f */
/* loaded from: classes.dex */
public abstract class AbstractC0352f {
    /* renamed from: a */
    public static Object m998a(int r12, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(r12, f, f2, f3);
    }

    /* renamed from: b */
    public static CharSequence m999b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m1000c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
