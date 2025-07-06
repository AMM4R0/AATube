package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p080e0.C0835S;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0751g extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f2876E;

    /* renamed from: F */
    public final /* synthetic */ C0755k f2877F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751g(C0755k c0755k, int r2, int r3) {
        super(r2);
        this.f2877F = c0755k;
        this.f2876E = r3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A0 */
    public final void mo1849A0(C0835S c0835s, int[] r5) {
        int r4 = this.f2876E;
        C0755k c0755k = this.f2877F;
        if (r4 == 0) {
            r5[0] = c0755k.f2890Y.getWidth();
            r5[1] = c0755k.f2890Y.getWidth();
        } else {
            r5[0] = c0755k.f2890Y.getHeight();
            r5[1] = c0755k.f2890Y.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: x0 */
    public final void mo1890x0(RecyclerView recyclerView, int r3) {
        C0765u c0765u = new C0765u(recyclerView.getContext());
        c0765u.f3614a = r3;
        m2306y0(c0765u);
    }
}
