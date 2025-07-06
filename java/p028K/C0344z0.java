package p028K;

import android.view.View;
import android.view.Window;

/* renamed from: K.z0 */
/* loaded from: classes.dex */
public final class C0344z0 extends C0342y0 {
    @Override // p001A0.AbstractC0005b
    /* renamed from: I */
    public final void mo83I(boolean z2) {
        if (!z2) {
            m981b0(16);
            return;
        }
        Window window = this.f945d;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
