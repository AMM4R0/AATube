package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.lifecycle.A */
/* loaded from: classes.dex */
public final class C0677A extends AbstractC0696f {
    final /* synthetic */ C0678B this$0;

    /* renamed from: androidx.lifecycle.A$a */
    public static final class a extends AbstractC0696f {
        final /* synthetic */ C0678B this$0;

        public a(C0678B c0678b) {
            this.this$0 = c0678b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            this.this$0.m1778a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC2492i.m4915e(activity, "activity");
            C0678B c0678b = this.this$0;
            int r02 = c0678b.f2365a + 1;
            c0678b.f2365a = r02;
            if (r02 == 1 && c0678b.f2368d) {
                c0678b.f2370f.m1794d(EnumC0702l.ON_START);
                c0678b.f2368d = false;
            }
        }
    }

    public C0677A(C0678B c0678b) {
        this.this$0 = c0678b;
    }

    @Override // androidx.lifecycle.AbstractC0696f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC2492i.m4915e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int r3 = FragmentC0681E.f2376b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC2492i.m4913c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0681E) findFragmentByTag).f2377a = this.this$0.f2372h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0696f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC2492i.m4915e(activity, "activity");
        C0678B c0678b = this.this$0;
        int r02 = c0678b.f2366b - 1;
        c0678b.f2366b = r02;
        if (r02 == 0) {
            Handler handler = c0678b.f2369e;
            AbstractC2492i.m4912b(handler);
            handler.postDelayed(c0678b.f2371g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2492i.m4915e(activity, "activity");
        AbstractC0716z.m1807a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0696f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC2492i.m4915e(activity, "activity");
        C0678B c0678b = this.this$0;
        int r02 = c0678b.f2365a - 1;
        c0678b.f2365a = r02;
        if (r02 == 0 && c0678b.f2367c) {
            c0678b.f2370f.m1794d(EnumC0702l.ON_STOP);
            c0678b.f2368d = true;
        }
    }
}
