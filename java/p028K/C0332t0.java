package p028K;

import android.graphics.Insets;
import android.view.WindowInsets;
import p006C.C0051c;

/* renamed from: K.t0 */
/* loaded from: classes.dex */
public class C0332t0 extends C0330s0 {

    /* renamed from: n */
    public C0051c f931n;

    /* renamed from: o */
    public C0051c f932o;

    /* renamed from: p */
    public C0051c f933p;

    public C0332t0(C0340x0 c0340x0, WindowInsets windowInsets) {
        super(c0340x0, windowInsets);
        this.f931n = null;
        this.f932o = null;
        this.f933p = null;
    }

    @Override // p028K.C0336v0
    /* renamed from: g */
    public C0051c mo967g() {
        Insets mandatorySystemGestureInsets;
        if (this.f932o == null) {
            mandatorySystemGestureInsets = this.f922c.getMandatorySystemGestureInsets();
            this.f932o = C0051c.m198c(mandatorySystemGestureInsets);
        }
        return this.f932o;
    }

    @Override // p028K.C0336v0
    /* renamed from: i */
    public C0051c mo968i() {
        Insets systemGestureInsets;
        if (this.f931n == null) {
            systemGestureInsets = this.f922c.getSystemGestureInsets();
            this.f931n = C0051c.m198c(systemGestureInsets);
        }
        return this.f931n;
    }

    @Override // p028K.C0336v0
    /* renamed from: k */
    public C0051c mo969k() {
        Insets tappableElementInsets;
        if (this.f933p == null) {
            tappableElementInsets = this.f922c.getTappableElementInsets();
            this.f933p = C0051c.m198c(tappableElementInsets);
        }
        return this.f933p;
    }

    @Override // p028K.AbstractC0326q0, p028K.C0336v0
    /* renamed from: l */
    public C0340x0 mo952l(int r2, int r3, int r4, int r5) {
        WindowInsets inset;
        inset = this.f922c.inset(r2, r3, r4, r5);
        return C0340x0.m975g(null, inset);
    }

    @Override // p028K.C0328r0, p028K.C0336v0
    /* renamed from: q */
    public void mo962q(C0051c c0051c) {
    }
}
