package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p026J0.C0229j;
import p050R0.RunnableC0458b;
import p079e.AbstractActivityC0798g;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public final class ExecutorC0591j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b */
    public Runnable f1672b;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0798g f1674d;

    /* renamed from: a */
    public final long f1671a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c */
    public boolean f1673c = false;

    public ExecutorC0591j(AbstractActivityC0798g abstractActivityC0798g) {
        this.f1674d = abstractActivityC0798g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1672b = runnable;
        View decorView = this.f1674d.getWindow().getDecorView();
        if (!this.f1673c) {
            decorView.postOnAnimation(new RunnableC0458b(3, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1672b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1671a) {
                this.f1673c = false;
                this.f1674d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1672b = null;
        C0229j c0229j = this.f1674d.f1682i;
        synchronized (c0229j.f663a) {
            z2 = c0229j.f664b;
        }
        if (z2) {
            this.f1673c = false;
            this.f1674d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1674d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
