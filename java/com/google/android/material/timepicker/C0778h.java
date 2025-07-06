package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes.dex */
public final class C0778h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f3110a;

    public C0778h(TimePickerView timePickerView) {
        this.f3110a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int r12 = TimePickerView.f3100t;
        this.f3110a.getClass();
        return false;
    }
}
