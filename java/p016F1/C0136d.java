package p016F1;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p006C.C0055g;
import p008C1.C0083o;
import p010D0.RunnableC0107e;
import p011D1.AbstractC0122i;
import p011D1.ThreadFactoryC0121h;

/* renamed from: F1.d */
/* loaded from: classes.dex */
public final class C0136d {

    /* renamed from: k */
    public static final Logger f393k;

    /* renamed from: l */
    public static final C0136d f394l;

    /* renamed from: a */
    public final C0055g f395a;

    /* renamed from: b */
    public final Logger f396b;

    /* renamed from: c */
    public final ReentrantLock f397c;

    /* renamed from: d */
    public final Condition f398d;

    /* renamed from: e */
    public int f399e;

    /* renamed from: f */
    public boolean f400f;

    /* renamed from: g */
    public long f401g;

    /* renamed from: h */
    public final ArrayList f402h;

    /* renamed from: i */
    public final ArrayList f403i;

    /* renamed from: j */
    public final RunnableC0107e f404j;

    static {
        Logger logger = Logger.getLogger(C0136d.class.getName());
        AbstractC2492i.m4914d(logger, "getLogger(...)");
        f393k = logger;
        String name = AbstractC0122i.f370c + " TaskRunner";
        AbstractC2492i.m4915e(name, "name");
        f394l = new C0136d(new C0055g(new ThreadFactoryC0121h(name, true)));
    }

    public C0136d(C0055g c0055g) {
        Logger logger = f393k;
        AbstractC2492i.m4915e(logger, "logger");
        this.f395a = c0055g;
        this.f396b = logger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f397c = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC2492i.m4914d(newCondition, "newCondition(...)");
        this.f398d = newCondition;
        this.f399e = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f402h = new ArrayList();
        this.f403i = new ArrayList();
        this.f404j = new RunnableC0107e(1, this);
    }

    /* renamed from: a */
    public static final void m433a(C0136d c0136d, AbstractC0133a abstractC0133a) {
        ReentrantLock reentrantLock = c0136d.f397c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(abstractC0133a.f381a);
        try {
            long mo426a = abstractC0133a.mo426a();
            reentrantLock.lock();
            try {
                c0136d.m434b(abstractC0133a, mo426a);
                reentrantLock.unlock();
                currentThread.setName(name);
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock.lock();
            try {
                c0136d.m434b(abstractC0133a, -1L);
                reentrantLock.unlock();
                currentThread.setName(name);
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final void m434b(AbstractC0133a abstractC0133a, long j2) {
        C0083o c0083o = AbstractC0122i.f368a;
        C0135c c0135c = abstractC0133a.f383c;
        AbstractC2492i.m4912b(c0135c);
        if (c0135c.f390d != abstractC0133a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = c0135c.f392f;
        c0135c.f392f = false;
        c0135c.f390d = null;
        this.f402h.remove(c0135c);
        if (j2 != -1 && !z2 && !c0135c.f389c) {
            c0135c.m431e(abstractC0133a, j2, true);
        }
        if (c0135c.f391e.isEmpty()) {
            return;
        }
        this.f403i.add(c0135c);
    }

    /* renamed from: c */
    public final AbstractC0133a m435c() {
        boolean z2;
        C0136d c0136d = this;
        C0083o c0083o = AbstractC0122i.f368a;
        while (true) {
            ArrayList arrayList = c0136d.f403i;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0055g c0055g = c0136d.f395a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            AbstractC0133a abstractC0133a = null;
            while (true) {
                if (!it.hasNext()) {
                    c0136d = this;
                    z2 = false;
                    break;
                }
                AbstractC0133a abstractC0133a2 = (AbstractC0133a) ((C0135c) it.next()).f391e.get(0);
                long max = Math.max(0L, abstractC0133a2.f384d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (abstractC0133a != null) {
                        c0136d = this;
                        z2 = true;
                        break;
                    }
                    abstractC0133a = abstractC0133a2;
                }
            }
            ArrayList arrayList2 = c0136d.f402h;
            if (abstractC0133a != null) {
                C0083o c0083o2 = AbstractC0122i.f368a;
                abstractC0133a.f384d = -1L;
                C0135c c0135c = abstractC0133a.f383c;
                AbstractC2492i.m4912b(c0135c);
                c0135c.f391e.remove(abstractC0133a);
                arrayList.remove(c0135c);
                c0135c.f390d = abstractC0133a;
                arrayList2.add(c0135c);
                if (z2 || (!c0136d.f400f && !arrayList.isEmpty())) {
                    RunnableC0107e runnable = c0136d.f404j;
                    AbstractC2492i.m4915e(runnable, "runnable");
                    ((ThreadPoolExecutor) c0055g.f107b).execute(runnable);
                }
                return abstractC0133a;
            }
            boolean z3 = c0136d.f400f;
            Condition condition = c0136d.f398d;
            if (z3) {
                if (j2 < c0136d.f401g - nanoTime) {
                    condition.signal();
                }
                return null;
            }
            c0136d.f400f = true;
            c0136d.f401g = nanoTime + j2;
            try {
                try {
                    C0083o c0083o3 = AbstractC0122i.f368a;
                    if (j2 > 0) {
                        condition.awaitNanos(j2);
                    }
                } catch (InterruptedException unused) {
                    C0083o c0083o4 = AbstractC0122i.f368a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C0135c) arrayList2.get(size)).m429b();
                    }
                    int r3 = -1;
                    for (int size2 = arrayList.size() - 1; r3 < size2; size2--) {
                        C0135c c0135c2 = (C0135c) arrayList.get(size2);
                        c0135c2.m429b();
                        if (c0135c2.f391e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        r3 = -1;
                    }
                }
            } finally {
                c0136d.f400f = false;
            }
        }
    }

    /* renamed from: d */
    public final void m436d(C0135c taskQueue) {
        AbstractC2492i.m4915e(taskQueue, "taskQueue");
        C0083o c0083o = AbstractC0122i.f368a;
        if (taskQueue.f390d == null) {
            boolean isEmpty = taskQueue.f391e.isEmpty();
            ArrayList arrayList = this.f403i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                AbstractC2492i.m4915e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z2 = this.f400f;
        C0055g c0055g = this.f395a;
        if (z2) {
            this.f398d.signal();
            return;
        }
        RunnableC0107e runnable = this.f404j;
        AbstractC2492i.m4915e(runnable, "runnable");
        ((ThreadPoolExecutor) c0055g.f107b).execute(runnable);
    }

    /* renamed from: e */
    public final C0135c m437e() {
        ReentrantLock reentrantLock = this.f397c;
        reentrantLock.lock();
        try {
            int r12 = this.f399e;
            this.f399e = r12 + 1;
            reentrantLock.unlock();
            return new C0135c(this, AbstractC0002c.m11f(r12, "Q"));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
