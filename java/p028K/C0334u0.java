package p028K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import p006C.C0051c;

/* renamed from: K.u0 */
/* loaded from: classes.dex */
public final class C0334u0 extends C0332t0 {

    /* renamed from: q */
    public static final C0340x0 f934q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f934q = C0340x0.m975g(null, windowInsets);
    }

    public C0334u0(C0340x0 c0340x0, WindowInsets windowInsets) {
        super(c0340x0, windowInsets);
    }

    @Override // p028K.AbstractC0326q0, p028K.C0336v0
    /* renamed from: f */
    public C0051c mo950f(int r2) {
        Insets insets;
        insets = this.f922c.getInsets(AbstractC0338w0.m973a(r2));
        return C0051c.m198c(insets);
    }

    @Override // p028K.AbstractC0326q0, p028K.C0336v0
    /* renamed from: d */
    public final void mo949d(View view) {
    }
}
