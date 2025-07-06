package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.AbstractC2492i;
import p131u1.InterfaceC2799a;
import p131u1.InterfaceC2810l;

/* renamed from: androidx.activity.p */
/* loaded from: classes.dex */
public final class C0597p implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2810l f1696a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2810l f1697b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2799a f1698c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2799a f1699d;

    public C0597p(InterfaceC2810l interfaceC2810l, InterfaceC2810l interfaceC2810l2, InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2) {
        this.f1696a = interfaceC2810l;
        this.f1697b = interfaceC2810l2;
        this.f1698c = interfaceC2799a;
        this.f1699d = interfaceC2799a2;
    }

    public final void onBackCancelled() {
        this.f1699d.invoke();
    }

    public final void onBackInvoked() {
        this.f1698c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        this.f1697b.invoke(new C0583b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        this.f1696a.invoke(new C0583b(backEvent));
    }
}
