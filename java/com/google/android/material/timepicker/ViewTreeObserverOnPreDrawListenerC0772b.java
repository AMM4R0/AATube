package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0772b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f3103a;

    public ViewTreeObserverOnPreDrawListenerC0772b(ClockFaceView clockFaceView) {
        this.f3103a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3103a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f3082v.f3090d) - clockFaceView.f3075D;
        if (height != clockFaceView.f3106t) {
            clockFaceView.f3106t = height;
            clockFaceView.mo2161m();
            int r12 = clockFaceView.f3106t;
            ClockHandView clockHandView = clockFaceView.f3082v;
            clockHandView.f3098l = r12;
            clockHandView.invalidate();
        }
        return true;
    }
}
