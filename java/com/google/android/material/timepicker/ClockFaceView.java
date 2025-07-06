package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001A0.AbstractC0005b;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0387m;
import p132v.C2829i;
import p132v.C2830j;
import p132v.C2834n;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0775e implements InterfaceC0774d {

    /* renamed from: A */
    public final C0773c f3072A;

    /* renamed from: B */
    public final int[] f3073B;

    /* renamed from: C */
    public final float[] f3074C;

    /* renamed from: D */
    public final int f3075D;

    /* renamed from: E */
    public final int f3076E;

    /* renamed from: F */
    public final int f3077F;

    /* renamed from: G */
    public final int f3078G;

    /* renamed from: H */
    public final String[] f3079H;

    /* renamed from: I */
    public float f3080I;

    /* renamed from: J */
    public final ColorStateList f3081J;

    /* renamed from: v */
    public final ClockHandView f3082v;

    /* renamed from: w */
    public final Rect f3083w;

    /* renamed from: x */
    public final RectF f3084x;

    /* renamed from: y */
    public final Rect f3085y;

    /* renamed from: z */
    public final SparseArray f3086z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3083w = new Rect();
        this.f3084x = new RectF();
        this.f3085y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3086z = sparseArray;
        this.f3074C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f952d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m1121s = AbstractC0387m.m1121s(context, obtainStyledAttributes, 1);
        this.f3081J = m1121s;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3082v = clockHandView;
        this.f3075D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m1121s.getColorForState(new int[]{android.R.attr.state_selected}, m1121s.getDefaultColor());
        this.f3073B = new int[]{colorForState, colorForState, m1121s.getDefaultColor()};
        clockHandView.f3089c.add(this);
        int defaultColor = AbstractC0005b.m75u(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m1121s2 = AbstractC0387m.m1121s(context, obtainStyledAttributes, 0);
        setBackgroundColor(m1121s2 != null ? m1121s2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0772b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3072A = new C0773c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3079H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int r4 = 0; r4 < Math.max(this.f3079H.length, size); r4++) {
            TextView textView = (TextView) sparseArray.get(r4);
            if (r4 >= this.f3079H.length) {
                removeView(textView);
                sparseArray.remove(r4);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(r4, textView);
                    addView(textView);
                }
                textView.setText(this.f3079H[r4]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(r4));
                int r8 = (r4 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(r8));
                z2 = r8 > 1 ? true : z2;
                AbstractC0283P.m779l(textView, this.f3072A);
                textView.setTextColor(this.f3081J);
            }
        }
        ClockHandView clockHandView2 = this.f3082v;
        if (clockHandView2.f3088b && !z2) {
            clockHandView2.f3099m = 1;
        }
        clockHandView2.f3088b = z2;
        clockHandView2.invalidate();
        this.f3076E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3077F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3078G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0775e
    /* renamed from: m */
    public final void mo2161m() {
        C2834n c2834n = new C2834n();
        c2834n.m5453b(this);
        HashMap hashMap = new HashMap();
        for (int r3 = 0; r3 < getChildCount(); r3++) {
            View childAt = getChildAt(r3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int r5 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (r5 == null) {
                    r5 = 1;
                }
                if (!hashMap.containsKey(r5)) {
                    hashMap.put(r5, new ArrayList());
                }
                ((List) hashMap.get(r5)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3106t * 0.66f) : this.f3106t;
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = c2834n.f9368c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C2829i());
                }
                C2830j c2830j = ((C2829i) hashMap2.get(Integer.valueOf(id))).f9264d;
                c2830j.f9334z = R.id.circle_center;
                c2830j.f9268A = round;
                c2830j.f9269B = f;
                f += 360.0f / list.size();
            }
        }
        c2834n.m5452a(this);
        setConstraintSet(null);
        requestLayout();
        int r02 = 0;
        while (true) {
            SparseArray sparseArray = this.f3086z;
            if (r02 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(r02)).setVisibility(0);
            r02++;
        }
    }

    /* renamed from: n */
    public final void m2162n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f3082v.f3093g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int r5 = 0;
        while (true) {
            sparseArray = this.f3086z;
            int size = sparseArray.size();
            rectF = this.f3084x;
            rect = this.f3083w;
            if (r5 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(r5);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            r5++;
        }
        for (int r4 = 0; r4 < sparseArray.size(); r4++) {
            TextView textView3 = (TextView) sparseArray.get(r4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3085y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3073B, this.f3074C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3079H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        m2162n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f3078G / Math.max(Math.max(this.f3076E / displayMetrics.heightPixels, this.f3077F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
