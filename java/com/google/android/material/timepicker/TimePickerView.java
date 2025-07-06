package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f3100t = 0;

    /* renamed from: s */
    public final Chip f3101s;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0777g viewOnClickListenerC0777g = new ViewOnClickListenerC0777g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f2824c.add(new C0776f(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f3101s = chip2;
        ViewOnTouchListenerC0779i viewOnTouchListenerC0779i = new ViewOnTouchListenerC0779i(new GestureDetector(getContext(), new C0778h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0779i);
        chip2.setOnTouchListener(viewOnTouchListenerC0779i);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0777g);
        chip2.setOnClickListener(viewOnClickListenerC0777g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int r2) {
        super.onVisibilityChanged(view, r2);
        if (view == this && r2 == 0) {
            this.f3101s.sendAccessibilityEvent(8);
        }
    }
}
