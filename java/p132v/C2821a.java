package p132v;

import p123s.C2720a;
import p123s.C2723d;

/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C2821a extends AbstractC2823c {

    /* renamed from: h */
    public int f9150h;

    /* renamed from: i */
    public int f9151i;

    /* renamed from: j */
    public C2720a f9152j;

    public boolean getAllowsGoneWidget() {
        return this.f9152j.f8786t0;
    }

    public int getMargin() {
        return this.f9152j.f8787u0;
    }

    public int getType() {
        return this.f9150h;
    }

    @Override // p132v.AbstractC2823c
    /* renamed from: h */
    public final void mo1561h(C2723d c2723d, boolean z2) {
        int r02 = this.f9150h;
        this.f9151i = r02;
        if (z2) {
            if (r02 == 5) {
                this.f9151i = 1;
            } else if (r02 == 6) {
                this.f9151i = 0;
            }
        } else if (r02 == 5) {
            this.f9151i = 0;
        } else if (r02 == 6) {
            this.f9151i = 1;
        }
        if (c2723d instanceof C2720a) {
            ((C2720a) c2723d).f8785s0 = this.f9151i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f9152j.f8786t0 = z2;
    }

    public void setDpMargin(int r2) {
        this.f9152j.f8787u0 = (int) ((r2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int r2) {
        this.f9152j.f8787u0 = r2;
    }

    public void setType(int r12) {
        this.f9150h = r12;
    }
}
