package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.carwizard.p075li.youtube.R;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p081e1.C0879e;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C0747c {

    /* renamed from: a */
    public final C0879e f2866a;

    /* renamed from: b */
    public final C0879e f2867b;

    public C0747c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0379e.m1088z(context, C0755k.class.getCanonicalName(), R.attr.materialCalendarStyle).data, AbstractC0345a.f960l);
        C0879e.m2394f(context, obtainStyledAttributes.getResourceId(4, 0));
        C0879e.m2394f(context, obtainStyledAttributes.getResourceId(2, 0));
        C0879e.m2394f(context, obtainStyledAttributes.getResourceId(3, 0));
        C0879e.m2394f(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m1121s = AbstractC0387m.m1121s(context, obtainStyledAttributes, 7);
        this.f2866a = C0879e.m2394f(context, obtainStyledAttributes.getResourceId(9, 0));
        C0879e.m2394f(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2867b = C0879e.m2394f(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m1121s.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
