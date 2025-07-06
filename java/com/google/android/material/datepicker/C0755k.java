package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p006C.C0055g;
import p019H.RunnableC0171a;
import p028K.AbstractC0283P;
import p046Q.C0434h;
import p047Q0.C0450e;
import p080e0.C0841Y;
import p080e0.C0871w;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0755k<S> extends AbstractC0764t {

    /* renamed from: S */
    public int f2884S;

    /* renamed from: T */
    public C0746b f2885T;

    /* renamed from: U */
    public C0759o f2886U;

    /* renamed from: V */
    public int f2887V;

    /* renamed from: W */
    public C0747c f2888W;

    /* renamed from: X */
    public RecyclerView f2889X;

    /* renamed from: Y */
    public RecyclerView f2890Y;

    /* renamed from: Z */
    public View f2891Z;

    /* renamed from: a0 */
    public View f2892a0;

    /* renamed from: b0 */
    public View f2893b0;

    /* renamed from: c0 */
    public View f2894c0;

    /* renamed from: A */
    public final void m2106A(C0759o c0759o) {
        C0763s c0763s = (C0763s) this.f2890Y.getAdapter();
        int m2114d = c0763s.f2939c.f2859a.m2114d(c0759o);
        int m2114d2 = m2114d - c0763s.f2939c.f2859a.m2114d(this.f2886U);
        boolean z2 = Math.abs(m2114d2) > 3;
        boolean z3 = m2114d2 > 0;
        this.f2886U = c0759o;
        if (z2 && z3) {
            this.f2890Y.m1920Y(m2114d - 3);
            this.f2890Y.post(new RunnableC0171a(m2114d, 2, this));
        } else if (!z2) {
            this.f2890Y.post(new RunnableC0171a(m2114d, 2, this));
        } else {
            this.f2890Y.m1920Y(m2114d + 3);
            this.f2890Y.post(new RunnableC0171a(m2114d, 2, this));
        }
    }

    /* renamed from: B */
    public final void m2107B(int r5) {
        this.f2887V = r5;
        if (r5 == 2) {
            this.f2889X.getLayoutManager().mo1887n0(this.f2886U.f2925c - ((C0769y) this.f2889X.getAdapter()).f2945c.f2885T.f2859a.f2925c);
            this.f2893b0.setVisibility(0);
            this.f2894c0.setVisibility(8);
            this.f2891Z.setVisibility(8);
            this.f2892a0.setVisibility(8);
            return;
        }
        if (r5 == 1) {
            this.f2893b0.setVisibility(8);
            this.f2894c0.setVisibility(0);
            this.f2891Z.setVisibility(0);
            this.f2892a0.setVisibility(0);
            m2106A(this.f2886U);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: m */
    public final void mo1754m(Bundle bundle) {
        super.mo1754m(bundle);
        if (bundle == null) {
            bundle = this.f2317f;
        }
        this.f2884S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2885T = (C0746b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2886U = (C0759o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: n */
    public final View mo1769n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int r3;
        int r6;
        C0871w c0871w;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1765h(), this.f2884S);
        this.f2888W = new C0747c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0759o c0759o = this.f2885T.f2859a;
        if (C0757m.m2109D(contextThemeWrapper, R.attr.windowFullscreen)) {
            r3 = com.carwizard.p075li.youtube.R.layout.mtrl_calendar_vertical;
            r6 = 1;
        } else {
            r3 = com.carwizard.p075li.youtube.R.layout.mtrl_calendar_horizontal;
            r6 = 0;
        }
        View inflate = cloneInContext.inflate(r3, viewGroup, false);
        Resources resources = m1770w().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_days_of_week_height);
        int r8 = C0760p.f2930d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_month_vertical_padding) * (r8 - 1)) + (resources.getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_day_height) * r8) + resources.getDimensionPixelOffset(com.carwizard.p075li.youtube.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.carwizard.p075li.youtube.R.id.mtrl_calendar_days_of_week);
        AbstractC0283P.m779l(gridView, new C0434h(1));
        int r32 = this.f2885T.f2863e;
        gridView.setAdapter((ListAdapter) (r32 > 0 ? new C0749e(r32) : new C0749e()));
        gridView.setNumColumns(c0759o.f2926d);
        gridView.setEnabled(false);
        this.f2890Y = (RecyclerView) inflate.findViewById(com.carwizard.p075li.youtube.R.id.mtrl_calendar_months);
        this.f2890Y.setLayoutManager(new C0751g(this, r6, r6));
        this.f2890Y.setTag("MONTHS_VIEW_GROUP_TAG");
        C0763s c0763s = new C0763s(contextThemeWrapper, this.f2885T, new C0055g(23, this));
        this.f2890Y.setAdapter(c0763s);
        int integer = contextThemeWrapper.getResources().getInteger(com.carwizard.p075li.youtube.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.carwizard.p075li.youtube.R.id.mtrl_calendar_year_selector_frame);
        this.f2889X = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2889X.setLayoutManager(new GridLayoutManager(integer));
            this.f2889X.setAdapter(new C0769y(this));
            this.f2889X.m1926g(new C0752h(this));
        }
        if (inflate.findViewById(com.carwizard.p075li.youtube.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.carwizard.p075li.youtube.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0283P.m779l(materialButton, new C0450e(3, this));
            View findViewById = inflate.findViewById(com.carwizard.p075li.youtube.R.id.month_navigation_previous);
            this.f2891Z = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.carwizard.p075li.youtube.R.id.month_navigation_next);
            this.f2892a0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2893b0 = inflate.findViewById(com.carwizard.p075li.youtube.R.id.mtrl_calendar_year_selector_frame);
            this.f2894c0 = inflate.findViewById(com.carwizard.p075li.youtube.R.id.mtrl_calendar_day_selector_frame);
            m2107B(1);
            materialButton.setText(this.f2886U.m2113c());
            this.f2890Y.m1927h(new C0753i(this, c0763s, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0754j(0, this));
            this.f2892a0.setOnClickListener(new ViewOnClickListenerC0750f(this, c0763s, 1));
            this.f2891Z.setOnClickListener(new ViewOnClickListenerC0750f(this, c0763s, 0));
        }
        if (!C0757m.m2109D(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0871w = new C0871w()).f3631a) != (recyclerView = this.f2890Y)) {
            C0841Y c0841y = c0871w.f3632b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2518e0;
                if (arrayList != null) {
                    arrayList.remove(c0841y);
                }
                c0871w.f3631a.setOnFlingListener(null);
            }
            c0871w.f3631a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0871w.f3631a.m1927h(c0841y);
                c0871w.f3631a.setOnFlingListener(c0871w);
                new Scroller(c0871w.f3631a.getContext(), new DecelerateInterpolator());
                c0871w.m2382f();
            }
        }
        this.f2890Y.m1920Y(c0763s.f2939c.f2859a.m2114d(this.f2886U));
        AbstractC0283P.m779l(this.f2890Y, new C0434h(2));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: r */
    public final void mo1758r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2884S);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2885T);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2886U);
    }
}
