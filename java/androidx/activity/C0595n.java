package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.AbstractC2492i;
import p079e.LayoutInflaterFactory2C0815x;
import p131u1.InterfaceC2799a;

/* renamed from: androidx.activity.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0595n implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f1693a;

    /* renamed from: b */
    public final /* synthetic */ Object f1694b;

    public /* synthetic */ C0595n(int r12, Object obj) {
        this.f1693a = r12;
        this.f1694b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1693a) {
            case 0:
                InterfaceC2799a onBackInvoked = (InterfaceC2799a) this.f1694b;
                AbstractC2492i.m4915e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((LayoutInflaterFactory2C0815x) this.f1694b).m2249E();
                break;
            default:
                ((Runnable) this.f1694b).run();
                break;
        }
    }
}
