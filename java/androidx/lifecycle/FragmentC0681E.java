package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;

/* renamed from: androidx.lifecycle.E */
/* loaded from: classes.dex */
public class FragmentC0681E extends Fragment {

    /* renamed from: b */
    public static final /* synthetic */ int f2376b = 0;

    /* renamed from: a */
    public C0055g f2377a;

    /* renamed from: androidx.lifecycle.E$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0680D Companion = new C0680D();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC2492i.m4915e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC2492i.m4915e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC2492i.m4915e(activity, "activity");
            int r2 = FragmentC0681E.f2376b;
            AbstractC0679C.m1779a(activity, EnumC0702l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            int r02 = FragmentC0681E.f2376b;
            AbstractC0679C.m1779a(activity, EnumC0702l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            int r02 = FragmentC0681E.f2376b;
            AbstractC0679C.m1779a(activity, EnumC0702l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            int r02 = FragmentC0681E.f2376b;
            AbstractC0679C.m1779a(activity, EnumC0702l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            int r02 = FragmentC0681E.f2376b;
            AbstractC0679C.m1779a(activity, EnumC0702l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            int r02 = FragmentC0681E.f2376b;
            AbstractC0679C.m1779a(activity, EnumC0702l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC2492i.m4915e(activity, "activity");
            AbstractC2492i.m4915e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m1781a(EnumC0702l enumC0702l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC2492i.m4914d(activity, "activity");
            AbstractC0679C.m1779a(activity, enumC0702l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1781a(EnumC0702l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1781a(EnumC0702l.ON_DESTROY);
        this.f2377a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1781a(EnumC0702l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0055g c0055g = this.f2377a;
        if (c0055g != null) {
            ((C0678B) c0055g.f107b).m1778a();
        }
        m1781a(EnumC0702l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0055g c0055g = this.f2377a;
        if (c0055g != null) {
            C0678B c0678b = (C0678B) c0055g.f107b;
            int r12 = c0678b.f2365a + 1;
            c0678b.f2365a = r12;
            if (r12 == 1 && c0678b.f2368d) {
                c0678b.f2370f.m1794d(EnumC0702l.ON_START);
                c0678b.f2368d = false;
            }
        }
        m1781a(EnumC0702l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1781a(EnumC0702l.ON_STOP);
    }
}
