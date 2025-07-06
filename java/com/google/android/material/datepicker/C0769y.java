package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.Locale;
import p080e0.AbstractC0838V;
import p080e0.AbstractC0873y;
import p081e1.C0879e;

/* renamed from: com.google.android.material.datepicker.y */
/* loaded from: classes.dex */
public final class C0769y extends AbstractC0873y {

    /* renamed from: c */
    public final C0755k f2945c;

    public C0769y(C0755k c0755k) {
        this.f2945c = c0755k;
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: a */
    public final int mo2118a() {
        return this.f2945c.f2885T.f2864f;
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: c */
    public final void mo2120c(AbstractC0838V abstractC0838V, int r8) {
        C0755k c0755k = this.f2945c;
        int r3 = c0755k.f2885T.f2859a.f2925c + r8;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(r3));
        TextView textView = ((C0768x) abstractC0838V).f2944t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0767w.m2123b().get(1) == r3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(r3)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(r3)));
        C0747c c0747c = c0755k.f2888W;
        if (AbstractC0767w.m2123b().get(1) == r3) {
            C0879e c0879e = c0747c.f2867b;
        } else {
            C0879e c0879e2 = c0747c.f2866a;
        }
        throw null;
    }

    @Override // p080e0.AbstractC0873y
    /* renamed from: d */
    public final AbstractC0838V mo2121d(ViewGroup viewGroup) {
        return new C0768x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
