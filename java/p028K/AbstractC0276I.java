package p028K;

import android.view.View;
import com.carwizard.p075li.youtube.R;
import java.util.Objects;
import p037N.AbstractC0390a;
import p112o.C2691k;

/* renamed from: K.I */
/* loaded from: classes.dex */
public abstract class AbstractC0276I {
    /* renamed from: a */
    public static void m743a(View view, InterfaceC0281N interfaceC0281N) {
        C2691k c2691k = (C2691k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c2691k == null) {
            c2691k = new C2691k();
            view.setTag(R.id.tag_unhandled_key_listeners, c2691k);
        }
        Objects.requireNonNull(interfaceC0281N);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0275H = new ViewOnUnhandledKeyEventListenerC0275H();
        c2691k.put(interfaceC0281N, viewOnUnhandledKeyEventListenerC0275H);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0275H);
    }

    /* renamed from: b */
    public static CharSequence m744b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: c */
    public static boolean m745c(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: d */
    public static boolean m746d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: e */
    public static void m747e(View view, InterfaceC0281N interfaceC0281N) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C2691k c2691k = (C2691k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c2691k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c2691k.getOrDefault(interfaceC0281N, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* renamed from: f */
    public static <T> T m748f(View view, int r12) {
        return (T) view.requireViewById(r12);
    }

    /* renamed from: g */
    public static void m749g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* renamed from: h */
    public static void m750h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: i */
    public static void m751i(View view, AbstractC0390a abstractC0390a) {
        view.setAutofillId(null);
    }

    /* renamed from: j */
    public static void m752j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
