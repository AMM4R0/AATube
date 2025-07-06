package p104l;

import android.view.View;
import p102k.InterfaceC2464k;
import p102k.MenuC2466m;

/* renamed from: l.h */
/* loaded from: classes.dex */
public final class RunnableC2573h implements Runnable {

    /* renamed from: a */
    public final C2567f f8371a;

    /* renamed from: b */
    public final /* synthetic */ C2582k f8372b;

    public RunnableC2573h(C2582k c2582k, C2567f c2567f) {
        this.f8372b = c2582k;
        this.f8371a = c2567f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2464k interfaceC2464k;
        C2582k c2582k = this.f8372b;
        MenuC2466m menuC2466m = c2582k.f8385c;
        if (menuC2466m != null && (interfaceC2464k = menuC2466m.f8069e) != null) {
            interfaceC2464k.mo2176g(menuC2466m);
        }
        View view = (View) c2582k.f8390h;
        if (view != null && view.getWindowToken() != null) {
            C2567f c2567f = this.f8371a;
            if (!c2567f.m4859b()) {
                if (c2567f.f8137e != null) {
                    c2567f.m4861d(0, 0, false, false);
                }
            }
            c2582k.f8401s = c2567f;
        }
        c2582k.f8403u = null;
    }
}
