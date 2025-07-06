package androidx.fragment.app;

import android.view.View;
import p001A0.AbstractC0005b;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class C0663m extends AbstractC0005b {

    /* renamed from: d */
    public final /* synthetic */ AbstractComponentCallbacksC0666p f2283d;

    public C0663m(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        this.f2283d = abstractComponentCallbacksC0666p;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: y */
    public final View mo93y(int r4) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = this.f2283d;
        View view = abstractComponentCallbacksC0666p.f2300E;
        if (view != null) {
            return view.findViewById(r4);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0666p + " does not have a view");
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: z */
    public final boolean mo94z() {
        return this.f2283d.f2300E != null;
    }
}
