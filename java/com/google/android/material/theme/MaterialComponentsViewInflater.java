package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.button.MaterialButton;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p046Q.AbstractC0428b;
import p053S0.C0501c;
import p065Y0.AbstractC0556k;
import p069a1.C0565a;
import p079e.C0783A;
import p088h1.C0940t;
import p091i1.C0981a;
import p101j1.AbstractC2447a;
import p104l.C2505C;
import p104l.C2562d0;
import p104l.C2594o;
import p104l.C2600q;
import p104l.C2603r;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0783A {
    @Override // p079e.C0783A
    /* renamed from: a */
    public final C2594o mo2155a(Context context, AttributeSet attributeSet) {
        return new C0940t(context, attributeSet);
    }

    @Override // p079e.C0783A
    /* renamed from: b */
    public final C2600q mo2156b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p079e.C0783A
    /* renamed from: c */
    public final C2603r mo2157c(Context context, AttributeSet attributeSet) {
        return new C0501c(context, attributeSet);
    }

    @Override // p079e.C0783A
    /* renamed from: d */
    public final C2505C mo2158d(Context context, AttributeSet attributeSet) {
        C0565a c0565a = new C0565a(AbstractC2447a.m4797a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0565a.getContext();
        TypedArray m1412f = AbstractC0556k.m1412f(context2, attributeSet, AbstractC0345a.f963o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (m1412f.hasValue(0)) {
            AbstractC0428b.m1164c(c0565a, AbstractC0387m.m1121s(context2, m1412f, 0));
        }
        c0565a.f1574f = m1412f.getBoolean(1, false);
        m1412f.recycle();
        return c0565a;
    }

    @Override // p079e.C0783A
    /* renamed from: e */
    public final C2562d0 mo2159e(Context context, AttributeSet attributeSet) {
        C0981a c0981a = new C0981a(AbstractC2447a.m4797a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0981a.getContext();
        if (AbstractC0379e.m1087y(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] r5 = AbstractC0345a.f966r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, r5, android.R.attr.textViewStyle, 0);
            int m2606g = C0981a.m2606g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m2606g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, r5, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0345a.f965q);
                    int m2606g2 = C0981a.m2606g(c0981a.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (m2606g2 >= 0) {
                        c0981a.setLineHeight(m2606g2);
                    }
                }
            }
        }
        return c0981a;
    }
}
