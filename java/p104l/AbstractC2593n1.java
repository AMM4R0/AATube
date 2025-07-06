package p104l;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0595n;
import java.util.Objects;

/* renamed from: l.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC2593n1 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m5051a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m5052b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0595n(2, runnable);
    }

    /* renamed from: c */
    public static void m5053c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m5054d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
