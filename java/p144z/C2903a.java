package p144z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import p010D0.RunnableC0106d;

/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C2903a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f9532a;

    /* renamed from: b */
    public Activity f9533b;

    /* renamed from: c */
    public final int f9534c;

    /* renamed from: d */
    public boolean f9535d = false;

    /* renamed from: e */
    public boolean f9536e = false;

    /* renamed from: f */
    public boolean f9537f = false;

    public C2903a(Activity activity) {
        this.f9533b = activity;
        this.f9534c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9533b == activity) {
            this.f9533b = null;
            this.f9536e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f9536e || this.f9537f || this.f9535d) {
            return;
        }
        Object obj = this.f9532a;
        try {
            Object obj2 = AbstractC2904b.f9540c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f9534c) {
                AbstractC2904b.f9544g.postAtFrontOfQueue(new RunnableC0106d(AbstractC2904b.f9539b.get(activity), 12, obj2));
                this.f9537f = true;
                this.f9532a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f9533b == activity) {
            this.f9535d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
