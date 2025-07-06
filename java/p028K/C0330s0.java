package p028K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: K.s0 */
/* loaded from: classes.dex */
public class C0330s0 extends C0328r0 {
    public C0330s0(C0340x0 c0340x0, WindowInsets windowInsets) {
        super(c0340x0, windowInsets);
    }

    @Override // p028K.C0336v0
    /* renamed from: a */
    public C0340x0 mo964a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f922c.consumeDisplayCutout();
        return C0340x0.m975g(null, consumeDisplayCutout);
    }

    @Override // p028K.C0336v0
    /* renamed from: e */
    public C0311j mo965e() {
        DisplayCutout displayCutout;
        displayCutout = this.f922c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0311j(displayCutout);
    }

    @Override // p028K.AbstractC0326q0, p028K.C0336v0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0330s0)) {
            return false;
        }
        C0330s0 c0330s0 = (C0330s0) obj;
        return Objects.equals(this.f922c, c0330s0.f922c) && Objects.equals(this.f926g, c0330s0.f926g);
    }

    @Override // p028K.C0336v0
    public int hashCode() {
        return this.f922c.hashCode();
    }
}
