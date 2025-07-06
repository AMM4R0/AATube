package p028K;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* renamed from: K.G */
/* loaded from: classes.dex */
public abstract class AbstractC0274G {
    /* renamed from: a */
    public static void m727a(View view, Collection<View> collection, int r2) {
        view.addKeyboardNavigationClusters(collection, r2);
    }

    /* renamed from: b */
    public static AutofillId m728b(View view) {
        return view.getAutofillId();
    }

    /* renamed from: c */
    public static int m729c(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: d */
    public static int m730d(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: e */
    public static boolean m731e(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: f */
    public static boolean m732f(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: g */
    public static boolean m733g(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: h */
    public static boolean m734h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: i */
    public static View m735i(View view, View view2, int r2) {
        return view.keyboardNavigationClusterSearch(view2, r2);
    }

    /* renamed from: j */
    public static boolean m736j(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: k */
    public static void m737k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: l */
    public static void m738l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    /* renamed from: m */
    public static void m739m(View view, int r12) {
        view.setImportantForAutofill(r12);
    }

    /* renamed from: n */
    public static void m740n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    /* renamed from: o */
    public static void m741o(View view, int r12) {
        view.setNextClusterForwardId(r12);
    }

    /* renamed from: p */
    public static void m742p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
