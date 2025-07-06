package p028K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p001A0.AbstractC0005b;
import p124s0.C2738i;

/* renamed from: K.A0 */
/* loaded from: classes.dex */
public final class C0268A0 extends AbstractC0005b {

    /* renamed from: d */
    public final WindowInsetsController f828d;

    /* renamed from: e */
    public Window f829e;

    public C0268A0(WindowInsetsController windowInsetsController, C2738i c2738i) {
        this.f828d = windowInsetsController;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: I */
    public final void mo83I(boolean z2) {
        Window window = this.f829e;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f828d.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f828d.setSystemBarsAppearance(0, 16);
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: J */
    public final void mo84J(boolean z2) {
        Window window = this.f829e;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f828d.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f828d.setSystemBarsAppearance(0, 8);
    }
}
