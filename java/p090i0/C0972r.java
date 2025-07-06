package p090i0;

/* renamed from: i0.r */
/* loaded from: classes.dex */
public final class C0972r extends AbstractC0968n {

    /* renamed from: a */
    public final /* synthetic */ int f4060a = 1;

    /* renamed from: b */
    public AbstractC0967m f4061b;

    public /* synthetic */ C0972r() {
    }

    @Override // p090i0.AbstractC0968n, p090i0.InterfaceC0965k
    /* renamed from: b */
    public void mo2532b(AbstractC0967m abstractC0967m) {
        switch (this.f4060a) {
            case 1:
                C0955a c0955a = (C0955a) this.f4061b;
                if (!c0955a.f3994D) {
                    c0955a.m2570G();
                    c0955a.f3994D = true;
                    break;
                }
                break;
        }
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: c */
    public final void mo2533c(AbstractC0967m abstractC0967m) {
        switch (this.f4060a) {
            case 0:
                this.f4061b.mo2557z();
                abstractC0967m.mo2555x(this);
                break;
            default:
                C0955a c0955a = (C0955a) this.f4061b;
                int r12 = c0955a.f3993C - 1;
                c0955a.f3993C = r12;
                if (r12 == 0) {
                    c0955a.f3994D = false;
                    c0955a.m2575m();
                }
                abstractC0967m.mo2555x(this);
                break;
        }
    }

    public C0972r(AbstractC0967m abstractC0967m) {
        this.f4061b = abstractC0967m;
    }
}
