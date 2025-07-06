package p031L;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p036M1.AbstractC0387m;
import p043P.C0412d;
import p088h1.C0930j;

/* renamed from: L.b */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0348b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C0412d f983a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0348b(C0412d c0412d) {
        this.f983a = c0412d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0348b) {
            return this.f983a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0348b) obj).f983a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f983a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0930j c0930j = (C0930j) this.f983a.f1074a;
        AutoCompleteTextView autoCompleteTextView = c0930j.f3864h;
        if (autoCompleteTextView == null || AbstractC0387m.m1100B(autoCompleteTextView)) {
            return;
        }
        int r3 = z2 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        c0930j.f3902d.setImportantForAccessibility(r3);
    }
}
