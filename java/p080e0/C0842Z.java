package p080e0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: e0.Z */
/* loaded from: classes.dex */
public final class C0842Z {

    /* renamed from: a */
    public int f3448a;

    /* renamed from: b */
    public int f3449b;

    /* renamed from: c */
    public boolean f3450c;

    /* renamed from: d */
    public boolean f3451d;

    /* renamed from: e */
    public boolean f3452e;

    /* renamed from: f */
    public int[] f3453f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f3454g;

    public C0842Z(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3454g = staggeredGridLayoutManager;
        m2341a();
    }

    /* renamed from: a */
    public final void m2341a() {
        this.f3448a = -1;
        this.f3449b = Integer.MIN_VALUE;
        this.f3450c = false;
        this.f3451d = false;
        this.f3452e = false;
        int[] r12 = this.f3453f;
        if (r12 != null) {
            Arrays.fill(r12, -1);
        }
    }
}
