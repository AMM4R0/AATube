package p031L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.g */
/* loaded from: classes.dex */
public abstract class AbstractC0353g {
    /* renamed from: a */
    public static C0355i m1001a(boolean z2, int r3, int r4, int r5, int r6, boolean z3, String str, String str2) {
        return new C0355i(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(r3).setRowIndex(r4).setColumnSpan(r5).setRowSpan(r6).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* renamed from: b */
    public static C0356j m1002b(AccessibilityNodeInfo accessibilityNodeInfo, int r12, int r2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(r12, r2);
        if (child != null) {
            return new C0356j(child, 0);
        }
        return null;
    }

    /* renamed from: c */
    public static String m1003c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* renamed from: d */
    public static String m1004d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m1005e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* renamed from: f */
    public static C0356j m1006f(AccessibilityNodeInfo accessibilityNodeInfo, int r2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(r2);
        if (parent != null) {
            return new C0356j(parent, 0);
        }
        return null;
    }

    /* renamed from: g */
    public static String m1007g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: h */
    public static boolean m1008h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: i */
    public static void m1009i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* renamed from: j */
    public static void m1010j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
