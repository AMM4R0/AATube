package p028K;

import android.view.View;
import android.view.Window;
import p001A0.AbstractC0005b;
import p124s0.C2738i;

/* renamed from: K.y0 */
/* loaded from: classes.dex */
public class C0342y0 extends AbstractC0005b {

    /* renamed from: d */
    public final Window f945d;

    public C0342y0(Window window, C2738i c2738i) {
        this.f945d = window;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: J */
    public final void mo84J(boolean z2) {
        if (!z2) {
            m981b0(8192);
            return;
        }
        Window window = this.f945d;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* renamed from: b0 */
    public final void m981b0(int r3) {
        View decorView = this.f945d.getDecorView();
        decorView.setSystemUiVisibility((~r3) & decorView.getSystemUiVisibility());
    }
}
