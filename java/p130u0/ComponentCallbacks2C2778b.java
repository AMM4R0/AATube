package p130u0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p013E0.HandlerC0128e;

/* renamed from: u0.b */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C2778b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    public static final ComponentCallbacks2C2778b f9078e = new ComponentCallbacks2C2778b();

    /* renamed from: a */
    public final AtomicBoolean f9079a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f9080b = new AtomicBoolean();

    /* renamed from: c */
    public final ArrayList f9081c = new ArrayList();

    /* renamed from: d */
    public boolean f9082d = false;

    /* renamed from: a */
    public final void m5391a(C2786j c2786j) {
        synchronized (f9078e) {
            this.f9081c.add(c2786j);
        }
    }

    /* renamed from: b */
    public final void m5392b(boolean z2) {
        synchronized (f9078e) {
            try {
                Iterator it = this.f9081c.iterator();
                while (it.hasNext()) {
                    HandlerC0128e handlerC0128e = ((C2786j) it.next()).f9101a.f9099m;
                    handlerC0128e.sendMessage(handlerC0128e.obtainMessage(1, Boolean.valueOf(z2)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9079a.compareAndSet(true, false);
        this.f9080b.set(true);
        if (compareAndSet) {
            m5392b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9079a.compareAndSet(true, false);
        this.f9080b.set(true);
        if (compareAndSet) {
            m5392b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
        if (r3 == 20 && this.f9079a.compareAndSet(false, true)) {
            this.f9080b.set(true);
            m5392b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
