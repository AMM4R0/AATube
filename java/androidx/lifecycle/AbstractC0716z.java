package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public abstract class AbstractC0716z {
    /* renamed from: a */
    public static final void m1807a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        AbstractC2492i.m4915e(activity, "activity");
        AbstractC2492i.m4915e(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
