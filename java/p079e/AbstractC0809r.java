package p079e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0595n;
import java.util.Objects;
import p031L.AbstractC0350d;

/* renamed from: e.r */
/* loaded from: classes.dex */
public abstract class AbstractC0809r {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2235a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2236b(Object obj, LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x) {
        Objects.requireNonNull(layoutInflaterFactory2C0815x);
        C0595n c0595n = new C0595n(1, layoutInflaterFactory2C0815x);
        AbstractC0350d.m994g(obj).registerOnBackInvokedCallback(1000000, c0595n);
        return c0595n;
    }

    /* renamed from: c */
    public static void m2237c(Object obj, Object obj2) {
        AbstractC0350d.m994g(obj).unregisterOnBackInvokedCallback(AbstractC0350d.m991d(obj2));
    }
}
