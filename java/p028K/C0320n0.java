package p028K;

import android.view.WindowInsets;
import p006C.C0051c;

/* renamed from: K.n0 */
/* loaded from: classes.dex */
public class C0320n0 extends AbstractC0324p0 {

    /* renamed from: c */
    public final WindowInsets.Builder f912c;

    public C0320n0() {
        this.f912c = AbstractC0318m0.m912f();
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: b */
    public C0340x0 mo892b() {
        WindowInsets build;
        m944a();
        build = this.f912c.build();
        C0340x0 m975g = C0340x0.m975g(null, build);
        m975g.f944a.mo954o(this.f916b);
        return m975g;
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: d */
    public void mo938d(C0051c c0051c) {
        this.f912c.setMandatorySystemGestureInsets(c0051c.m199d());
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: e */
    public void mo893e(C0051c c0051c) {
        this.f912c.setStableInsets(c0051c.m199d());
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: f */
    public void mo939f(C0051c c0051c) {
        this.f912c.setSystemGestureInsets(c0051c.m199d());
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: g */
    public void mo894g(C0051c c0051c) {
        this.f912c.setSystemWindowInsets(c0051c.m199d());
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: h */
    public void mo940h(C0051c c0051c) {
        this.f912c.setTappableElementInsets(c0051c.m199d());
    }

    public C0320n0(C0340x0 c0340x0) {
        super(c0340x0);
        WindowInsets.Builder m912f;
        WindowInsets m980f = c0340x0.m980f();
        if (m980f != null) {
            m912f = AbstractC0318m0.m913g(m980f);
        } else {
            m912f = AbstractC0318m0.m912f();
        }
        this.f912c = m912f;
    }
}
