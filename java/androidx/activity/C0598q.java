package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.AbstractC2492i;
import p131u1.InterfaceC2799a;
import p131u1.InterfaceC2810l;

/* renamed from: androidx.activity.q */
/* loaded from: classes.dex */
public final class C0598q {

    /* renamed from: a */
    public static final C0598q f1700a = new C0598q();

    /* renamed from: a */
    public final OnBackInvokedCallback m1481a(InterfaceC2810l onBackStarted, InterfaceC2810l onBackProgressed, InterfaceC2799a onBackInvoked, InterfaceC2799a onBackCancelled) {
        AbstractC2492i.m4915e(onBackStarted, "onBackStarted");
        AbstractC2492i.m4915e(onBackProgressed, "onBackProgressed");
        AbstractC2492i.m4915e(onBackInvoked, "onBackInvoked");
        AbstractC2492i.m4915e(onBackCancelled, "onBackCancelled");
        return new C0597p(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
