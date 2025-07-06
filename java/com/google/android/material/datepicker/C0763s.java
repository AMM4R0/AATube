package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.carwizard.p075li.youtube.R;
import java.util.Calendar;
import p006C.C0055g;
import p080e0.AbstractC0838V;
import p080e0.AbstractC0873y;
import p080e0.C0825H;

/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes.dex */
public final class C0763s extends AbstractC0873y {

    /* renamed from: c */
    public final C0746b f2939c;

    /* renamed from: d */
    public final C0055g f2940d;

    /* renamed from: e */
    public final int f2941e;

    public C0763s(ContextThemeWrapper contextThemeWrapper, C0746b c0746b, C0055g c0055g) {
        C0759o c0759o = c0746b.f2859a;
        C0759o c0759o2 = c0746b.f2862d;
        if (c0759o.f2923a.compareTo(c0759o2.f2923a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0759o2.f2923a.compareTo(c0746b.f2860b.f2923a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2941e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0760p.f2930d) + (C0757m.m2109D(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f2939c = c0746b;
        this.f2940d = c0055g;
        if (this.f3636a.m2391a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3637b = true;
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: a */
    public final int mo2118a() {
        return this.f2939c.f2865g;
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: b */
    public final long mo2119b(int r4) {
        Calendar m2122a = AbstractC0767w.m2122a(this.f2939c.f2859a.f2923a);
        m2122a.add(2, r4);
        m2122a.set(5, 1);
        Calendar m2122a2 = AbstractC0767w.m2122a(m2122a);
        m2122a2.get(2);
        m2122a2.get(1);
        m2122a2.getMaximum(7);
        m2122a2.getActualMaximum(5);
        m2122a2.getTimeInMillis();
        return m2122a2.getTimeInMillis();
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: c */
    public final void mo2120c(AbstractC0838V abstractC0838V, int r5) {
        C0762r c0762r = (C0762r) abstractC0838V;
        C0746b c0746b = this.f2939c;
        Calendar m2122a = AbstractC0767w.m2122a(c0746b.f2859a.f2923a);
        m2122a.add(2, r5);
        C0759o c0759o = new C0759o(m2122a);
        c0762r.f2937t.setText(c0759o.m2113c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0762r.f2938u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m2102a() == null || !c0759o.equals(materialCalendarGridView.m2102a().f2932a)) {
            new C0760p(c0759o, c0746b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m2102a().getClass();
        throw null;
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: d */
    public final AbstractC0838V mo2121d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0757m.m2109D(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0762r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0825H(-1, this.f2941e));
        return new C0762r(linearLayout, true);
    }
}
