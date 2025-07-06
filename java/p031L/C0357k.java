package p031L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p006C.C0055g;

/* renamed from: L.k */
/* loaded from: classes.dex */
public class C0357k extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0055g f1000a;

    public C0357k(C0055g c0055g) {
        this.f1000a = c0055g;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
        C0356j mo219r = this.f1000a.mo219r(r2);
        if (mo219r == null) {
            return null;
        }
        return mo219r.f998a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int r2) {
        this.f1000a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r2) {
        C0356j mo220s = this.f1000a.mo220s(r2);
        if (mo220s == null) {
            return null;
        }
        return mo220s.f998a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, Bundle bundle) {
        return this.f1000a.mo223v(r2, r3, bundle);
    }
}
