package p028K;

import android.view.WindowInsets;
import p006C.C0051c;

/* renamed from: K.r0 */
/* loaded from: classes.dex */
public class C0328r0 extends AbstractC0326q0 {

    /* renamed from: m */
    public C0051c f927m;

    public C0328r0(C0340x0 c0340x0, WindowInsets windowInsets) {
        super(c0340x0, windowInsets);
        this.f927m = null;
    }

    @Override // p028K.C0336v0
    /* renamed from: b */
    public C0340x0 mo958b() {
        return C0340x0.m975g(null, this.f922c.consumeStableInsets());
    }

    @Override // p028K.C0336v0
    /* renamed from: c */
    public C0340x0 mo959c() {
        return C0340x0.m975g(null, this.f922c.consumeSystemWindowInsets());
    }

    @Override // p028K.C0336v0
    /* renamed from: h */
    public final C0051c mo960h() {
        if (this.f927m == null) {
            WindowInsets windowInsets = this.f922c;
            this.f927m = C0051c.m197b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f927m;
    }

    @Override // p028K.C0336v0
    /* renamed from: m */
    public boolean mo961m() {
        return this.f922c.isConsumed();
    }

    @Override // p028K.C0336v0
    /* renamed from: q */
    public void mo962q(C0051c c0051c) {
        this.f927m = c0051c;
    }
}
