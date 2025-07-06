package p090i0;

import android.view.ViewGroup;
import p001A0.AbstractC0005b;

/* renamed from: i0.d */
/* loaded from: classes.dex */
public final class C0958d extends AbstractC0968n {

    /* renamed from: a */
    public boolean f3997a = false;

    /* renamed from: b */
    public final ViewGroup f3998b;

    public C0958d(ViewGroup viewGroup) {
        this.f3998b = viewGroup;
    }

    @Override // p090i0.AbstractC0968n, p090i0.InterfaceC0965k
    /* renamed from: a */
    public final void mo2531a(AbstractC0967m abstractC0967m) {
        AbstractC0005b.m52Q(this.f3998b, false);
        this.f3997a = true;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: c */
    public final void mo2533c(AbstractC0967m abstractC0967m) {
        if (!this.f3997a) {
            AbstractC0005b.m52Q(this.f3998b, false);
        }
        abstractC0967m.mo2555x(this);
    }

    @Override // p090i0.AbstractC0968n, p090i0.InterfaceC0965k
    /* renamed from: d */
    public final void mo2534d() {
        AbstractC0005b.m52Q(this.f3998b, false);
    }

    @Override // p090i0.AbstractC0968n, p090i0.InterfaceC0965k
    /* renamed from: f */
    public final void mo2536f() {
        AbstractC0005b.m52Q(this.f3998b, true);
    }
}
