package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.AbstractC2492i;
import p131u1.InterfaceC2799a;

/* renamed from: androidx.activity.o */
/* loaded from: classes.dex */
public final class C0596o {

    /* renamed from: a */
    public static final C0596o f1695a = new C0596o();

    /* renamed from: a */
    public final OnBackInvokedCallback m1478a(InterfaceC2799a onBackInvoked) {
        AbstractC2492i.m4915e(onBackInvoked, "onBackInvoked");
        return new C0595n(0, onBackInvoked);
    }

    /* renamed from: b */
    public final void m1479b(Object dispatcher, int r3, Object callback) {
        AbstractC2492i.m4915e(dispatcher, "dispatcher");
        AbstractC2492i.m4915e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(r3, (OnBackInvokedCallback) callback);
    }

    /* renamed from: c */
    public final void m1480c(Object dispatcher, Object callback) {
        AbstractC2492i.m4915e(dispatcher, "dispatcher");
        AbstractC2492i.m4915e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
