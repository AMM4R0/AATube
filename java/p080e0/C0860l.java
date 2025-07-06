package p080e0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: e0.l */
/* loaded from: classes.dex */
public final class C0860l {

    /* renamed from: a */
    public int f3564a;

    /* renamed from: b */
    public int f3565b;

    /* renamed from: c */
    public int[] f3566c;

    /* renamed from: d */
    public int f3567d;

    /* renamed from: a */
    public final void m2363a(int r6, int r7) {
        if (r6 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (r7 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int r02 = this.f3567d;
        int r12 = r02 * 2;
        int[] r2 = this.f3566c;
        if (r2 == null) {
            int[] r03 = new int[4];
            this.f3566c = r03;
            Arrays.fill(r03, -1);
        } else if (r12 >= r2.length) {
            int[] r04 = new int[r02 * 4];
            this.f3566c = r04;
            System.arraycopy(r2, 0, r04, 0, r2.length);
        }
        int[] r05 = this.f3566c;
        r05[r12] = r6;
        r05[r12 + 1] = r7;
        this.f3567d++;
    }

    /* renamed from: b */
    public final void m2364b(RecyclerView recyclerView, boolean z2) {
        this.f3567d = 0;
        int[] r02 = this.f3566c;
        if (r02 != null) {
            Arrays.fill(r02, -1);
        }
        AbstractC0824G abstractC0824G = recyclerView.f2531l;
        if (recyclerView.f2529k == null || abstractC0824G == null || !abstractC0824G.f3369i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f2515d.m295f()) {
                abstractC0824G.mo1884i(recyclerView.f2529k.mo2118a(), this);
            }
        } else if (!recyclerView.m1906K()) {
            abstractC0824G.mo1883h(this.f3564a, this.f3565b, recyclerView.f2514c0, this);
        }
        int r12 = this.f3567d;
        if (r12 > abstractC0824G.f3370j) {
            abstractC0824G.f3370j = r12;
            abstractC0824G.f3371k = z2;
            recyclerView.f2511b.m2318k();
        }
    }
}
