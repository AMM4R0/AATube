package p080e0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p006C.C0055g;
import p028K.C0295b;
import p031L.C0356j;

/* renamed from: e0.W */
/* loaded from: classes.dex */
public final class C0839W extends C0295b {

    /* renamed from: d */
    public final C0840X f3442d;

    /* renamed from: e */
    public final WeakHashMap f3443e = new WeakHashMap();

    public C0839W(C0840X c0840x) {
        this.f3442d = c0840x;
    }

    @Override // p028K.C0295b
    /* renamed from: a */
    public final boolean mo804a(View view, AccessibilityEvent accessibilityEvent) {
        C0295b c0295b = (C0295b) this.f3443e.get(view);
        return c0295b != null ? c0295b.mo804a(view, accessibilityEvent) : this.f856a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p028K.C0295b
    /* renamed from: b */
    public final C0055g mo805b(View view) {
        C0295b c0295b = (C0295b) this.f3443e.get(view);
        return c0295b != null ? c0295b.mo805b(view) : super.mo805b(view);
    }

    @Override // p028K.C0295b
    /* renamed from: c */
    public final void mo806c(View view, AccessibilityEvent accessibilityEvent) {
        C0295b c0295b = (C0295b) this.f3443e.get(view);
        if (c0295b != null) {
            c0295b.mo806c(view, accessibilityEvent);
        } else {
            super.mo806c(view, accessibilityEvent);
        }
    }

    @Override // p028K.C0295b
    /* renamed from: d */
    public final void mo807d(View view, C0356j c0356j) {
        C0840X c0840x = this.f3442d;
        boolean m1906K = c0840x.f3444d.m1906K();
        View.AccessibilityDelegate accessibilityDelegate = this.f856a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        if (!m1906K) {
            RecyclerView recyclerView = c0840x.f3444d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m2290U(view, c0356j);
                C0295b c0295b = (C0295b) this.f3443e.get(view);
                if (c0295b != null) {
                    c0295b.mo807d(view, c0356j);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p028K.C0295b
    /* renamed from: e */
    public final void mo808e(View view, AccessibilityEvent accessibilityEvent) {
        C0295b c0295b = (C0295b) this.f3443e.get(view);
        if (c0295b != null) {
            c0295b.mo808e(view, accessibilityEvent);
        } else {
            super.mo808e(view, accessibilityEvent);
        }
    }

    @Override // p028K.C0295b
    /* renamed from: f */
    public final boolean mo809f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0295b c0295b = (C0295b) this.f3443e.get(viewGroup);
        return c0295b != null ? c0295b.mo809f(viewGroup, view, accessibilityEvent) : this.f856a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p028K.C0295b
    /* renamed from: g */
    public final boolean mo810g(View view, int r5, Bundle bundle) {
        C0840X c0840x = this.f3442d;
        if (!c0840x.f3444d.m1906K()) {
            RecyclerView recyclerView = c0840x.f3444d;
            if (recyclerView.getLayoutManager() != null) {
                C0295b c0295b = (C0295b) this.f3443e.get(view);
                if (c0295b != null) {
                    if (c0295b.mo810g(view, r5, bundle)) {
                        return true;
                    }
                } else if (super.mo810g(view, r5, bundle)) {
                    return true;
                }
                C0830M c0830m = recyclerView.getLayoutManager().f3362b.f2511b;
                return false;
            }
        }
        return super.mo810g(view, r5, bundle);
    }

    @Override // p028K.C0295b
    /* renamed from: h */
    public final void mo811h(View view, int r3) {
        C0295b c0295b = (C0295b) this.f3443e.get(view);
        if (c0295b != null) {
            c0295b.mo811h(view, r3);
        } else {
            super.mo811h(view, r3);
        }
    }

    @Override // p028K.C0295b
    /* renamed from: i */
    public final void mo812i(View view, AccessibilityEvent accessibilityEvent) {
        C0295b c0295b = (C0295b) this.f3443e.get(view);
        if (c0295b != null) {
            c0295b.mo812i(view, accessibilityEvent);
        } else {
            super.mo812i(view, accessibilityEvent);
        }
    }
}
