package p080e0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p017G.AbstractC0149m;
import p054S1.C0509h;

/* renamed from: e0.n */
/* loaded from: classes.dex */
public final class RunnableC0862n implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f3573e = new ThreadLocal();

    /* renamed from: f */
    public static final C0509h f3574f = new C0509h(2);

    /* renamed from: a */
    public ArrayList f3575a;

    /* renamed from: b */
    public long f3576b;

    /* renamed from: c */
    public long f3577c;

    /* renamed from: d */
    public ArrayList f3578d;

    /* renamed from: c */
    public static AbstractC0838V m2365c(RecyclerView recyclerView, int r6, long j2) {
        int m127v = recyclerView.f2517e.m127v();
        for (int r2 = 0; r2 < m127v; r2++) {
            AbstractC0838V m1892I = RecyclerView.m1892I(recyclerView.f2517e.m126u(r2));
            if (m1892I.f3426c == r6 && !m1892I.m2330g()) {
                return null;
            }
        }
        C0830M c0830m = recyclerView.f2511b;
        try {
            recyclerView.m1911P();
            AbstractC0838V m2316i = c0830m.m2316i(r6, j2);
            if (m2316i != null) {
                if (!m2316i.m2329f() || m2316i.m2330g()) {
                    c0830m.m2308a(m2316i, false);
                } else {
                    c0830m.m2313f(m2316i.f3424a);
                }
            }
            recyclerView.m1912Q(false);
            return m2316i;
        } catch (Throwable th) {
            recyclerView.m1912Q(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m2366a(RecyclerView recyclerView, int r6, int r7) {
        if (recyclerView.f2539p && this.f3576b == 0) {
            this.f3576b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0860l c0860l = recyclerView.f2512b0;
        c0860l.f3564a = r6;
        c0860l.f3565b = r7;
    }

    /* renamed from: b */
    public final void m2367b(long j2) {
        C0861m c0861m;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0861m c0861m2;
        ArrayList arrayList = this.f3575a;
        int size = arrayList.size();
        int r6 = 0;
        for (int r5 = 0; r5 < size; r5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(r5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0860l c0860l = recyclerView3.f2512b0;
                c0860l.m2364b(recyclerView3, false);
                r6 += c0860l.f3567d;
            }
        }
        ArrayList arrayList2 = this.f3578d;
        arrayList2.ensureCapacity(r6);
        int r7 = 0;
        for (int r62 = 0; r62 < size; r62++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(r62);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0860l c0860l2 = recyclerView4.f2512b0;
                int abs = Math.abs(c0860l2.f3565b) + Math.abs(c0860l2.f3564a);
                for (int r10 = 0; r10 < c0860l2.f3567d * 2; r10 += 2) {
                    if (r7 >= arrayList2.size()) {
                        c0861m2 = new C0861m();
                        arrayList2.add(c0861m2);
                    } else {
                        c0861m2 = (C0861m) arrayList2.get(r7);
                    }
                    int[] r13 = c0860l2.f3566c;
                    int r14 = r13[r10 + 1];
                    c0861m2.f3568a = r14 <= abs;
                    c0861m2.f3569b = abs;
                    c0861m2.f3570c = r14;
                    c0861m2.f3571d = recyclerView4;
                    c0861m2.f3572e = r13[r10];
                    r7++;
                }
            }
        }
        Collections.sort(arrayList2, f3574f);
        for (int r2 = 0; r2 < arrayList2.size() && (recyclerView = (c0861m = (C0861m) arrayList2.get(r2)).f3571d) != null; r2++) {
            AbstractC0838V m2365c = m2365c(recyclerView, c0861m.f3572e, c0861m.f3568a ? Long.MAX_VALUE : j2);
            if (m2365c != null && m2365c.f3425b != null && m2365c.m2329f() && !m2365c.m2330g() && (recyclerView2 = (RecyclerView) m2365c.f3425b.get()) != null) {
                if (recyclerView2.f2551y && recyclerView2.f2517e.m127v() != 0) {
                    AbstractC0820C abstractC0820C = recyclerView2.f2493H;
                    if (abstractC0820C != null) {
                        abstractC0820C.mo2269e();
                    }
                    AbstractC0824G abstractC0824G = recyclerView2.f2531l;
                    C0830M c0830m = recyclerView2.f2511b;
                    if (abstractC0824G != null) {
                        abstractC0824G.m2292g0(c0830m);
                        recyclerView2.f2531l.m2293h0(c0830m);
                    }
                    c0830m.f3386a.clear();
                    c0830m.m2311d();
                }
                C0860l c0860l3 = recyclerView2.f2512b0;
                c0860l3.m2364b(recyclerView2, true);
                if (c0860l3.f3567d != 0) {
                    try {
                        int r9 = AbstractC0149m.f416a;
                        Trace.beginSection("RV Nested Prefetch");
                        C0835S c0835s = recyclerView2.f2514c0;
                        AbstractC0873y abstractC0873y = recyclerView2.f2529k;
                        c0835s.f3405d = 1;
                        c0835s.f3406e = abstractC0873y.mo2118a();
                        c0835s.f3408g = false;
                        c0835s.f3409h = false;
                        c0835s.f3410i = false;
                        for (int r8 = 0; r8 < c0860l3.f3567d * 2; r8 += 2) {
                            m2365c(recyclerView2, c0860l3.f3566c[r8], j2);
                        }
                        Trace.endSection();
                        c0861m.f3568a = false;
                        c0861m.f3569b = 0;
                        c0861m.f3570c = 0;
                        c0861m.f3571d = null;
                        c0861m.f3572e = 0;
                    } catch (Throwable th) {
                        int r22 = AbstractC0149m.f416a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0861m.f3568a = false;
            c0861m.f3569b = 0;
            c0861m.f3570c = 0;
            c0861m.f3571d = null;
            c0861m.f3572e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int r3 = AbstractC0149m.f416a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3575a;
            if (arrayList.isEmpty()) {
                this.f3576b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int r4 = 0; r4 < size; r4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(r4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f3576b = 0L;
                Trace.endSection();
            } else {
                m2367b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f3577c);
                this.f3576b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3576b = 0L;
            int r02 = AbstractC0149m.f416a;
            Trace.endSection();
            throw th;
        }
    }
}
