package p031L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.i */
/* loaded from: classes.dex */
public final class C0355i {

    /* renamed from: a */
    public final AccessibilityNodeInfo.CollectionItemInfo f996a;

    public C0355i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f996a = collectionItemInfo;
    }

    /* renamed from: a */
    public static C0355i m1023a(boolean z2, int r8, int r9, int r10, int r11) {
        return new C0355i(AccessibilityNodeInfo.CollectionItemInfo.obtain(r8, r9, r10, r11, false, z2));
    }
}
