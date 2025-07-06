package p028K;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: K.j0 */
/* loaded from: classes.dex */
public final class C0312j0 {

    /* renamed from: a */
    public AbstractC0310i0 f896a;

    public C0312j0(int r3, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f896a = new C0308h0(AbstractC0304f0.m848i(r3, interpolator, j2));
        } else {
            this.f896a = new C0302e0(r3, interpolator, j2);
        }
    }
}
