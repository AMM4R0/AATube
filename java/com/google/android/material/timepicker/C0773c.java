package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.carwizard.p075li.youtube.R;
import p028K.C0295b;
import p031L.C0351e;
import p031L.C0355i;
import p031L.C0356j;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C0773c extends C0295b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f3104d;

    public C0773c(ClockFaceView clockFaceView) {
        this.f3104d = clockFaceView;
    }

    @Override // p028K.C0295b
    /* renamed from: d */
    public final void mo807d(View view, C0356j c0356j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f856a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f3104d.f3086z.get(intValue - 1));
        }
        c0356j.m1032i(C0355i.m1023a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0356j.m1026b(C0351e.f984e);
    }

    @Override // p028K.C0295b
    /* renamed from: g */
    public final boolean mo810g(View view, int r13, Bundle bundle) {
        if (r13 != 16) {
            return super.mo810g(view, r13, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f3104d;
        view.getHitRect(clockFaceView.f3083w);
        float centerX = clockFaceView.f3083w.centerX();
        float centerY = clockFaceView.f3083w.centerY();
        clockFaceView.f3082v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f3082v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
