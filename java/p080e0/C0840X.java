package p080e0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import p028K.C0295b;
import p031L.C0356j;

/* renamed from: e0.X */
/* loaded from: classes.dex */
public final class C0840X extends C0295b {

    /* renamed from: d */
    public final RecyclerView f3444d;

    /* renamed from: e */
    public final C0839W f3445e;

    public C0840X(RecyclerView recyclerView) {
        this.f3444d = recyclerView;
        C0839W c0839w = this.f3445e;
        if (c0839w != null) {
            this.f3445e = c0839w;
        } else {
            this.f3445e = new C0839W(this);
        }
    }

    @Override // p028K.C0295b
    /* renamed from: c */
    public final void mo806c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo806c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3444d.m1906K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1868T(accessibilityEvent);
        }
    }

    @Override // p028K.C0295b
    /* renamed from: d */
    public final void mo807d(View view, C0356j c0356j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f856a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f3444d;
        if (recyclerView.m1906K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0824G layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3362b;
        C0830M c0830m = recyclerView2.f2511b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3362b.canScrollHorizontally(-1)) {
            c0356j.m1025a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3362b.canScrollVertically(1) || layoutManager.f3362b.canScrollHorizontally(1)) {
            c0356j.m1025a(Base64Utils.IO_BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0835S c0835s = recyclerView2.f2514c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo1813J(c0830m, c0835s), layoutManager.mo1847x(c0830m, c0835s), false, 0));
    }

    @Override // p028K.C0295b
    /* renamed from: g */
    public final boolean mo810g(View view, int r5, Bundle bundle) {
        int m2288G;
        int m2286E;
        if (super.mo810g(view, r5, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3444d;
        if (recyclerView.m1906K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0824G layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3362b;
        C0830M c0830m = recyclerView2.f2511b;
        if (r5 == 4096) {
            m2288G = recyclerView2.canScrollVertically(1) ? (layoutManager.f3375o - layoutManager.m2288G()) - layoutManager.m2285D() : 0;
            if (layoutManager.f3362b.canScrollHorizontally(1)) {
                m2286E = (layoutManager.f3374n - layoutManager.m2286E()) - layoutManager.m2287F();
            }
            m2286E = 0;
        } else if (r5 != 8192) {
            m2286E = 0;
            m2288G = 0;
        } else {
            m2288G = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f3375o - layoutManager.m2288G()) - layoutManager.m2285D()) : 0;
            if (layoutManager.f3362b.canScrollHorizontally(-1)) {
                m2286E = -((layoutManager.f3374n - layoutManager.m2286E()) - layoutManager.m2287F());
            }
            m2286E = 0;
        }
        if (m2288G == 0 && m2286E == 0) {
            return false;
        }
        layoutManager.f3362b.m1921Z(m2286E, m2288G, true);
        return true;
    }
}
