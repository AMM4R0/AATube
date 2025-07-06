package p028K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p006C.C0051c;
import p010D0.C0113k;
import p019H.RunnableC0182l;

/* renamed from: K.d0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0300d0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final C0301e f866a;

    /* renamed from: b */
    public C0340x0 f867b;

    public ViewOnApplyWindowInsetsListenerC0300d0(View view, C0301e c0301e) {
        C0340x0 c0340x0;
        this.f866a = c0301e;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        C0340x0 m723a = AbstractC0273F.m723a(view);
        if (m723a != null) {
            int r3 = Build.VERSION.SDK_INT;
            c0340x0 = (r3 >= 30 ? new C0322o0(m723a) : r3 >= 29 ? new C0320n0(m723a) : new C0316l0(m723a)).mo892b();
        } else {
            c0340x0 = null;
        }
        this.f867b = c0340x0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0336v0 c0336v0;
        if (!view.isLaidOut()) {
            this.f867b = C0340x0.m975g(view, windowInsets);
            return C0302e0.m834i(view, windowInsets);
        }
        C0340x0 m975g = C0340x0.m975g(view, windowInsets);
        if (this.f867b == null) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            this.f867b = AbstractC0273F.m723a(view);
        }
        if (this.f867b == null) {
            this.f867b = m975g;
            return C0302e0.m834i(view, windowInsets);
        }
        C0301e m835j = C0302e0.m835j(view);
        if (m835j != null && Objects.equals((WindowInsets) m835j.f869b, windowInsets)) {
            return C0302e0.m834i(view, windowInsets);
        }
        C0340x0 c0340x0 = this.f867b;
        int r6 = 1;
        int r5 = 0;
        while (true) {
            c0336v0 = m975g.f944a;
            if (r6 > 256) {
                break;
            }
            if (!c0336v0.mo950f(r6).equals(c0340x0.f944a.mo950f(r6))) {
                r5 |= r6;
            }
            r6 <<= 1;
        }
        if (r5 == 0) {
            return C0302e0.m834i(view, windowInsets);
        }
        C0340x0 c0340x02 = this.f867b;
        C0312j0 c0312j0 = new C0312j0(r5, (r5 & 8) != 0 ? c0336v0.mo950f(8).f101d > c0340x02.f944a.mo950f(8).f101d ? C0302e0.f874e : C0302e0.f875f : C0302e0.f876g, 160L);
        c0312j0.f896a.mo870d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0312j0.f896a.mo867a());
        C0051c mo950f = c0336v0.mo950f(r5);
        C0051c mo950f2 = c0340x02.f944a.mo950f(r5);
        int min = Math.min(mo950f.f98a, mo950f2.f98a);
        int r10 = mo950f.f99b;
        int r13 = mo950f2.f99b;
        int min2 = Math.min(r10, r13);
        int r15 = mo950f.f100c;
        int r4 = mo950f2.f100c;
        int min3 = Math.min(r15, r4);
        int r12 = mo950f.f101d;
        int r17 = r5;
        int r52 = mo950f2.f101d;
        C0113k c0113k = new C0113k(C0051c.m197b(min, min2, min3, Math.min(r12, r52)), 4, C0051c.m197b(Math.max(mo950f.f98a, mo950f2.f98a), Math.max(r10, r13), Math.max(r15, r4), Math.max(r12, r52)));
        C0302e0.m831f(view, windowInsets, false);
        duration.addUpdateListener(new C0296b0(c0312j0, m975g, c0340x02, r17, view));
        duration.addListener(new C0298c0(c0312j0, view));
        ViewTreeObserverOnPreDrawListenerC0331t.m966a(view, new RunnableC0182l(view, c0312j0, c0113k, duration));
        this.f867b = m975g;
        return C0302e0.m834i(view, windowInsets);
    }
}
