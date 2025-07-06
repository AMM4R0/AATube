package p107m0;

import android.content.SharedPreferences;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2492i;
import p050R0.RunnableC0458b;

/* renamed from: m0.l */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2650l implements View.OnTouchListener {

    /* renamed from: a */
    public int f8584a;

    /* renamed from: b */
    public int f8585b;

    /* renamed from: c */
    public boolean f8586c;

    /* renamed from: d */
    public final /* synthetic */ int f8587d;

    /* renamed from: e */
    public final /* synthetic */ Handler f8588e;

    /* renamed from: f */
    public final /* synthetic */ RunnableC0458b f8589f;

    /* renamed from: g */
    public final /* synthetic */ FrameLayout.LayoutParams f8590g;

    /* renamed from: h */
    public final /* synthetic */ Button f8591h;

    /* renamed from: i */
    public final /* synthetic */ SharedPreferences f8592i;

    /* renamed from: j */
    public final /* synthetic */ AtomicBoolean f8593j;

    public ViewOnTouchListenerC2650l(int r12, Handler handler, RunnableC0458b runnableC0458b, FrameLayout.LayoutParams layoutParams, Button button, SharedPreferences sharedPreferences, AtomicBoolean atomicBoolean) {
        this.f8587d = r12;
        this.f8588e = handler;
        this.f8589f = runnableC0458b;
        this.f8590g = layoutParams;
        this.f8591h = button;
        this.f8592i = sharedPreferences;
        this.f8593j = atomicBoolean;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v2, MotionEvent event) {
        AbstractC2492i.m4915e(v2, "v");
        AbstractC2492i.m4915e(event, "event");
        Handler handler = this.f8588e;
        RunnableC0458b runnableC0458b = this.f8589f;
        handler.removeCallbacks(runnableC0458b);
        int action = event.getAction();
        if (action != 0) {
            FrameLayout.LayoutParams layoutParams = this.f8590g;
            if (action == 1) {
                if (this.f8586c) {
                    SharedPreferences.Editor edit = this.f8592i.edit();
                    edit.putInt("leftMargin", layoutParams.leftMargin);
                    edit.putInt("topMargin", layoutParams.topMargin);
                    edit.apply();
                } else {
                    v2.performClick();
                }
                this.f8586c = false;
                this.f8593j.set(false);
            } else if (action == 2) {
                int rawX = ((int) event.getRawX()) - this.f8584a;
                int rawY = ((int) event.getRawY()) - this.f8585b;
                if ((rawY * rawY) + (rawX * rawX) > 25) {
                    this.f8586c = true;
                }
                if (this.f8586c) {
                    int r6 = layoutParams.leftMargin + rawX;
                    int r9 = layoutParams.topMargin + rawY;
                    int max = Math.max(this.f8587d <= 2000 ? 974 : 0, Math.min(r6, 2700));
                    int max2 = Math.max(80, Math.min(r9, 1250));
                    layoutParams.leftMargin = max;
                    layoutParams.topMargin = max2;
                    this.f8591h.setLayoutParams(layoutParams);
                    this.f8584a = (int) event.getRawX();
                    this.f8585b = (int) event.getRawY();
                }
            }
        } else {
            this.f8586c = false;
            this.f8584a = (int) event.getRawX();
            this.f8585b = (int) event.getRawY();
        }
        handler.postDelayed(runnableC0458b, 5000L);
        return true;
    }
}
