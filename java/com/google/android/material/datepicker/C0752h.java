package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p080e0.AbstractC0821D;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C0752h extends AbstractC0821D {

    /* renamed from: a */
    public final /* synthetic */ C0755k f2878a;

    public C0752h(C0755k c0755k) {
        this.f2878a = c0755k;
        AbstractC0767w.m2124c(null);
        AbstractC0767w.m2124c(null);
    }

    @Override // p080e0.AbstractC0821D
    /* renamed from: a */
    public final void mo2103a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0769y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2878a.getClass();
            throw null;
        }
    }
}
