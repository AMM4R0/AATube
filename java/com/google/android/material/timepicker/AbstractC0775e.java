package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p050R0.RunnableC0458b;
import p081e1.C0881g;
import p081e1.C0882h;
import p081e1.C0884j;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public abstract class AbstractC0775e extends ConstraintLayout {

    /* renamed from: s */
    public final RunnableC0458b f3105s;

    /* renamed from: t */
    public int f3106t;

    /* renamed from: u */
    public final C0881g f3107u;

    public AbstractC0775e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0881g c0881g = new C0881g();
        this.f3107u = c0881g;
        C0882h c0882h = new C0882h(0.5f);
        C0884j m2417e = c0881g.f3659a.f3642a.m2417e();
        m2417e.f3686e = c0882h;
        m2417e.f3687f = c0882h;
        m2417e.f3688g = c0882h;
        m2417e.f3689h = c0882h;
        c0881g.setShapeAppearanceModel(m2417e.m2412a());
        this.f3107u.m2407j(ColorStateList.valueOf(-1));
        C0881g c0881g2 = this.f3107u;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setBackground(c0881g2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f968t, R.attr.materialClockStyle, 0);
        this.f3106t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3105s = new RunnableC0458b(7, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, r2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0458b runnableC0458b = this.f3105s;
            handler.removeCallbacks(runnableC0458b);
            handler.post(runnableC0458b);
        }
    }

    /* renamed from: m */
    public abstract void mo2161m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2161m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0458b runnableC0458b = this.f3105s;
            handler.removeCallbacks(runnableC0458b);
            handler.post(runnableC0458b);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
        this.f3107u.m2407j(ColorStateList.valueOf(r2));
    }
}
