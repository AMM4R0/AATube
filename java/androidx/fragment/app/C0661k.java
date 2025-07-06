package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p001A0.AbstractC0005b;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public final class C0661k extends AbstractC0005b {

    /* renamed from: d */
    public final /* synthetic */ C0663m f2267d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0662l f2268e;

    public C0661k(DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l, C0663m c0663m) {
        this.f2268e = dialogInterfaceOnCancelListenerC0662l;
        this.f2267d = c0663m;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: y */
    public final View mo93y(int r3) {
        C0663m c0663m = this.f2267d;
        if (c0663m.mo94z()) {
            return c0663m.mo93y(r3);
        }
        Dialog dialog = this.f2268e.f2278a0;
        if (dialog != null) {
            return dialog.findViewById(r3);
        }
        return null;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: z */
    public final boolean mo94z() {
        return this.f2267d.mo94z() || this.f2268e.f2282e0;
    }
}
