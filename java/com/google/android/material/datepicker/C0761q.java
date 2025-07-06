package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C0761q implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f2935a;

    /* renamed from: b */
    public final /* synthetic */ C0763s f2936b;

    public C0761q(C0763s c0763s, MaterialCalendarGridView materialCalendarGridView) {
        this.f2936b = c0763s;
        this.f2935a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2935a;
        C0760p m2102a = materialCalendarGridView.m2102a();
        if (r3 < m2102a.m2115a() || r3 > m2102a.m2117c()) {
            return;
        }
        if (materialCalendarGridView.m2102a().getItem(r3).longValue() >= ((C0755k) this.f2936b.f2940d.f107b).f2885T.f2861c.f2868a) {
            throw null;
        }
    }
}
