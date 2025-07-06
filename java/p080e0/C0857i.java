package p080e0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.i */
/* loaded from: classes.dex */
public final class C0857i extends AbstractC0827J {

    /* renamed from: a */
    public final /* synthetic */ C0859k f3531a;

    public C0857i(C0859k c0859k) {
        this.f3531a = c0859k;
    }

    @Override // p080e0.AbstractC0827J
    /* renamed from: b */
    public final void mo2105b(RecyclerView recyclerView, int r10, int r11) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0859k c0859k = this.f3531a;
        int computeVerticalScrollRange = c0859k.f3556s.computeVerticalScrollRange();
        int r12 = c0859k.f3555r;
        int r2 = computeVerticalScrollRange - r12;
        int r3 = c0859k.f3538a;
        c0859k.f3557t = r2 > 0 && r12 >= r3;
        int computeHorizontalScrollRange = c0859k.f3556s.computeHorizontalScrollRange();
        int r6 = c0859k.f3554q;
        boolean z2 = computeHorizontalScrollRange - r6 > 0 && r6 >= r3;
        c0859k.f3558u = z2;
        boolean z3 = c0859k.f3557t;
        if (!z3 && !z2) {
            if (c0859k.f3559v != 0) {
                c0859k.m2361f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = r12;
            c0859k.f3549l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            c0859k.f3548k = Math.min(r12, (r12 * r12) / computeVerticalScrollRange);
        }
        if (c0859k.f3558u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = r6;
            c0859k.f3552o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            c0859k.f3551n = Math.min(r6, (r6 * r6) / computeHorizontalScrollRange);
        }
        int r9 = c0859k.f3559v;
        if (r9 == 0 || r9 == 1) {
            c0859k.m2361f(1);
        }
    }
}
