package p080e0;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p028K.AbstractC0283P;
import p028K.C0295b;

/* renamed from: e0.M */
/* loaded from: classes.dex */
public final class C0830M {

    /* renamed from: a */
    public final ArrayList f3386a;

    /* renamed from: b */
    public ArrayList f3387b;

    /* renamed from: c */
    public final ArrayList f3388c;

    /* renamed from: d */
    public final List f3389d;

    /* renamed from: e */
    public int f3390e;

    /* renamed from: f */
    public int f3391f;

    /* renamed from: g */
    public C0829L f3392g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3393h;

    public C0830M(RecyclerView recyclerView) {
        this.f3393h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3386a = arrayList;
        this.f3387b = null;
        this.f3388c = new ArrayList();
        this.f3389d = Collections.unmodifiableList(arrayList);
        this.f3390e = 2;
        this.f3391f = 2;
    }

    /* renamed from: a */
    public final void m2308a(AbstractC0838V abstractC0838V, boolean z2) {
        RecyclerView.m1897j(abstractC0838V);
        RecyclerView recyclerView = this.f3393h;
        C0840X c0840x = recyclerView.f2528j0;
        if (c0840x != null) {
            C0839W c0839w = c0840x.f3445e;
            boolean z3 = c0839w instanceof C0839W;
            View view = abstractC0838V.f3424a;
            AbstractC0283P.m779l(view, z3 ? (C0295b) c0839w.f3443e.remove(view) : null);
        }
        if (z2 && recyclerView.f2514c0 != null) {
            recyclerView.f2519f.m388l(abstractC0838V);
        }
        abstractC0838V.f3441r = null;
        C0829L m2310c = m2310c();
        m2310c.getClass();
        int r02 = abstractC0838V.f3429f;
        ArrayList arrayList = m2310c.m2307a(r02).f3380a;
        if (((C0828K) m2310c.f3384a.get(r02)).f3381b <= arrayList.size()) {
            return;
        }
        abstractC0838V.m2337n();
        arrayList.add(abstractC0838V);
    }

    /* renamed from: b */
    public final int m2309b(int r5) {
        RecyclerView recyclerView = this.f3393h;
        if (r5 >= 0 && r5 < recyclerView.f2514c0.m2321b()) {
            return !recyclerView.f2514c0.f3408g ? r5 : recyclerView.f2515d.m294e(r5, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + r5 + ". State item count is " + recyclerView.f2514c0.m2321b() + recyclerView.m1943y());
    }

    /* renamed from: c */
    public final C0829L m2310c() {
        if (this.f3392g == null) {
            C0829L c0829l = new C0829L();
            c0829l.f3384a = new SparseArray();
            c0829l.f3385b = 0;
            this.f3392g = c0829l;
        }
        return this.f3392g;
    }

    /* renamed from: d */
    public final void m2311d() {
        ArrayList arrayList = this.f3388c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2312e(size);
        }
        arrayList.clear();
        int[] r12 = RecyclerView.f2483s0;
        C0860l c0860l = this.f3393h.f2512b0;
        int[] r2 = c0860l.f3566c;
        if (r2 != null) {
            Arrays.fill(r2, -1);
        }
        c0860l.f3567d = 0;
    }

    /* renamed from: e */
    public final void m2312e(int r4) {
        ArrayList arrayList = this.f3388c;
        m2308a((AbstractC0838V) arrayList.get(r4), true);
        arrayList.remove(r4);
    }

    /* renamed from: f */
    public final void m2313f(View view) {
        AbstractC0838V m1892I = RecyclerView.m1892I(view);
        boolean m2334k = m1892I.m2334k();
        RecyclerView recyclerView = this.f3393h;
        if (m2334k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (m1892I.m2333j()) {
            m1892I.f3437n.m2317j(m1892I);
        } else if (m1892I.m2340q()) {
            m1892I.f3433j &= -33;
        }
        m2314g(m1892I);
        if (recyclerView.f2493H == null || m1892I.m2331h()) {
            return;
        }
        recyclerView.f2493H.mo2268d(m1892I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2314g(p080e0.AbstractC0838V r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.C0830M.m2314g(e0.V):void");
    }

    /* renamed from: h */
    public final void m2315h(View view) {
        AbstractC0820C abstractC0820C;
        AbstractC0838V m1892I = RecyclerView.m1892I(view);
        boolean m2327d = m1892I.m2327d(12);
        RecyclerView recyclerView = this.f3393h;
        if (!m2327d && m1892I.m2335l() && (abstractC0820C = recyclerView.f2493H) != null) {
            C0856h c0856h = (C0856h) abstractC0820C;
            if (m1892I.m2326c().isEmpty() && c0856h.f3519g && !m1892I.m2330g()) {
                if (this.f3387b == null) {
                    this.f3387b = new ArrayList();
                }
                m1892I.f3437n = this;
                m1892I.f3438o = true;
                this.f3387b.add(m1892I);
                return;
            }
        }
        if (m1892I.m2330g() && !m1892I.m2332i() && !recyclerView.f2529k.f3637b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m1943y());
        }
        m1892I.f3437n = this;
        m1892I.f3438o = false;
        this.f3386a.add(m1892I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (r11.m2330g() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043e, code lost:
    
        if ((r14 + r12) >= r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cb, code lost:
    
        if (r11.f3429f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p080e0.AbstractC0838V m2316i(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.C0830M.m2316i(int, long):e0.V");
    }

    /* renamed from: j */
    public final void m2317j(AbstractC0838V abstractC0838V) {
        if (abstractC0838V.f3438o) {
            this.f3387b.remove(abstractC0838V);
        } else {
            this.f3386a.remove(abstractC0838V);
        }
        abstractC0838V.f3437n = null;
        abstractC0838V.f3438o = false;
        abstractC0838V.f3433j &= -33;
    }

    /* renamed from: k */
    public final void m2318k() {
        AbstractC0824G abstractC0824G = this.f3393h.f2531l;
        this.f3391f = this.f3390e + (abstractC0824G != null ? abstractC0824G.f3370j : 0);
        ArrayList arrayList = this.f3388c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3391f; size--) {
            m2312e(size);
        }
    }
}
