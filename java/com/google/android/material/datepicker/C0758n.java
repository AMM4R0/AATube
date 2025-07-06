package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C0758n<S> extends AbstractC0764t {

    /* renamed from: S */
    public int f2921S;

    /* renamed from: T */
    public C0746b f2922T;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: m */
    public final void mo1754m(Bundle bundle) {
        super.mo1754m(bundle);
        if (bundle == null) {
            bundle = this.f2317f;
        }
        this.f2921S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2922T = (C0746b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: n */
    public final View mo1769n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1765h(), this.f2921S));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: r */
    public final void mo1758r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2921S);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2922T);
    }
}
