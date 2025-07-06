package p107m0;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2492i;
import p050R0.RunnableC0458b;

/* renamed from: m0.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2647i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f8574a;

    /* renamed from: b */
    public final /* synthetic */ Activity f8575b;

    /* renamed from: c */
    public final /* synthetic */ View f8576c;

    /* renamed from: d */
    public final /* synthetic */ int f8577d;

    public /* synthetic */ RunnableC2647i(FrameLayout frameLayout, Activity activity, View view, int r4) {
        this.f8574a = frameLayout;
        this.f8575b = activity;
        this.f8576c = view;
        this.f8577d = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.f8575b;
        AbstractC2492i.m4915e(activity, "$activity");
        ViewGroup viewGroup = this.f8574a;
        if (viewGroup == null) {
            View decorView = activity.getWindow().getDecorView();
            AbstractC2492i.m4913c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) decorView;
        }
        if (viewGroup.findViewWithTag("backButton") == null) {
            final Button button = new Button(activity);
            button.setTag("backButton");
            final Handler handler = new Handler(Looper.getMainLooper());
            final RunnableC0458b runnableC0458b = new RunnableC0458b(13, button);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            button.setOnClickListener(new ViewOnClickListenerC2644f(atomicBoolean, activity, 1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            SharedPreferences sharedPreferences = activity.getSharedPreferences("backButtonPrefs", 0);
            layoutParams.leftMargin = sharedPreferences.getInt("leftMargin", 1700);
            layoutParams.topMargin = sharedPreferences.getInt("topMargin", 700);
            button.setBackground(new C2649k());
            button.setVisibility(8);
            viewGroup.addView(button, layoutParams);
            button.bringToFront();
            button.setElevation(10.0f);
            button.setOnTouchListener(new ViewOnTouchListenerC2650l(this.f8577d, handler, runnableC0458b, layoutParams, button, sharedPreferences, atomicBoolean));
            View view = this.f8576c;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: m0.j
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        Button button2 = button;
                        Handler handler2 = handler;
                        RunnableC0458b runnableC0458b2 = runnableC0458b;
                        if (motionEvent.getAction() == 0) {
                            button2.setVisibility(0);
                            handler2.removeCallbacks(runnableC0458b2);
                            handler2.postDelayed(runnableC0458b2, 5000L);
                        }
                        return false;
                    }
                });
            }
        }
    }
}
