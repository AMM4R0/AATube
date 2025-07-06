package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0681E;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.lifecycle.C */
/* loaded from: classes.dex */
public abstract class AbstractC0679C {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1779a(Activity activity, EnumC0702l event) {
        AbstractC2492i.m4915e(activity, "activity");
        AbstractC2492i.m4915e(event, "event");
        if (activity instanceof InterfaceC0708r) {
            C0710t mo1475e = ((InterfaceC0708r) activity).mo1475e();
            if (mo1475e instanceof C0710t) {
                mo1475e.m1794d(event);
            }
        }
    }

    /* renamed from: b */
    public static void m1780b(Activity activity) {
        AbstractC2492i.m4915e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0681E.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0681E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0681E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
