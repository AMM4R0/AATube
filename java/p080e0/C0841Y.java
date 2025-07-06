package p080e0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.Y */
/* loaded from: classes.dex */
public final class C0841Y extends AbstractC0827J {

    /* renamed from: a */
    public boolean f3446a = false;

    /* renamed from: b */
    public final /* synthetic */ C0871w f3447b;

    public C0841Y(C0871w c0871w) {
        this.f3447b = c0871w;
    }

    @Override // p080e0.AbstractC0827J
    /* renamed from: a */
    public final void mo2104a(RecyclerView recyclerView, int r2) {
        if (r2 == 0 && this.f3446a) {
            this.f3446a = false;
            this.f3447b.m2382f();
        }
    }

    @Override // p080e0.AbstractC0827J
    /* renamed from: b */
    public final void mo2105b(RecyclerView recyclerView, int r2, int r3) {
        if (r2 == 0 && r3 == 0) {
            return;
        }
        this.f3446a = true;
    }
}
