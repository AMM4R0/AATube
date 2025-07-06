package p080e0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p002A1.C0015h;
import p024I1.C0209a;
import p028K.C0323p;

/* renamed from: e0.C */
/* loaded from: classes.dex */
public abstract class AbstractC0820C {

    /* renamed from: a */
    public C0872x f3349a;

    /* renamed from: b */
    public ArrayList f3350b;

    /* renamed from: c */
    public long f3351c;

    /* renamed from: d */
    public long f3352d;

    /* renamed from: e */
    public long f3353e;

    /* renamed from: f */
    public long f3354f;

    /* renamed from: b */
    public static void m2265b(AbstractC0838V abstractC0838V) {
        RecyclerView recyclerView;
        int r02 = abstractC0838V.f3433j;
        if (abstractC0838V.m2330g() || (r02 & 4) != 0 || (recyclerView = abstractC0838V.f3441r) == null) {
            return;
        }
        recyclerView.m1902F(abstractC0838V);
    }

    /* renamed from: a */
    public abstract boolean mo2266a(AbstractC0838V abstractC0838V, AbstractC0838V abstractC0838V2, C0323p c0323p, C0323p c0323p2);

    /* renamed from: c */
    public final void m2267c(AbstractC0838V abstractC0838V) {
        C0872x c0872x = this.f3349a;
        if (c0872x != null) {
            boolean z2 = true;
            abstractC0838V.m2338o(true);
            if (abstractC0838V.f3431h != null && abstractC0838V.f3432i == null) {
                abstractC0838V.f3431h = null;
            }
            abstractC0838V.f3432i = null;
            if ((abstractC0838V.f3433j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0872x.f3635a;
            recyclerView.m1922a0();
            C0015h c0015h = recyclerView.f2517e;
            C0872x c0872x2 = (C0872x) c0015h.f25b;
            RecyclerView recyclerView2 = c0872x2.f3635a;
            View view = abstractC0838V.f3424a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0015h.m104E(view);
            } else {
                C0209a c0209a = (C0209a) c0015h.f26c;
                if (c0209a.m599d(indexOfChild)) {
                    c0209a.m602g(indexOfChild);
                    c0015h.m104E(view);
                    c0872x2.m2390h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                AbstractC0838V m1892I = RecyclerView.m1892I(view);
                C0830M c0830m = recyclerView.f2511b;
                c0830m.m2317j(m1892I);
                c0830m.m2314g(m1892I);
            }
            recyclerView.m1923b0(!z2);
            if (z2 || !abstractC0838V.m2334k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo2268d(AbstractC0838V abstractC0838V);

    /* renamed from: e */
    public abstract void mo2269e();

    /* renamed from: f */
    public abstract boolean mo2270f();
}
