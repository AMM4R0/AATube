package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p028K.C0343z;
import p080e0.AbstractC0838V;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0762r extends AbstractC0838V {

    /* renamed from: t */
    public final TextView f2937t;

    /* renamed from: u */
    public final MaterialCalendarGridView f2938u;

    public C0762r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2937t = textView;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        new C0343z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m692d(textView, Boolean.TRUE);
        this.f2938u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
