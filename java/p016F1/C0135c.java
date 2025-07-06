package p016F1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;
import p008C1.C0083o;
import p011D1.AbstractC0122i;
import p131u1.InterfaceC2799a;

/* renamed from: F1.c */
/* loaded from: classes.dex */
public final class C0135c {

    /* renamed from: a */
    public final C0136d f387a;

    /* renamed from: b */
    public final String f388b;

    /* renamed from: c */
    public boolean f389c;

    /* renamed from: d */
    public AbstractC0133a f390d;

    /* renamed from: e */
    public final ArrayList f391e;

    /* renamed from: f */
    public boolean f392f;

    public C0135c(C0136d taskRunner, String name) {
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        AbstractC2492i.m4915e(name, "name");
        this.f387a = taskRunner;
        this.f388b = name;
        new ReentrantLock();
        this.f391e = new ArrayList();
    }

    /* renamed from: c */
    public static void m427c(C0135c c0135c, String name, InterfaceC2799a block) {
        c0135c.getClass();
        AbstractC2492i.m4915e(name, "name");
        AbstractC2492i.m4915e(block, "block");
        c0135c.m430d(new C0134b(name, true, block), 0L);
    }

    /* renamed from: a */
    public final void m428a() {
        C0083o c0083o = AbstractC0122i.f368a;
        C0136d c0136d = this.f387a;
        ReentrantLock reentrantLock = c0136d.f397c;
        reentrantLock.lock();
        try {
            if (m429b()) {
                c0136d.m436d(this);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final boolean m429b() {
        AbstractC0133a abstractC0133a = this.f390d;
        if (abstractC0133a != null && abstractC0133a.f382b) {
            this.f392f = true;
        }
        ArrayList arrayList = this.f391e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC0133a) arrayList.get(size)).f382b) {
                Logger logger = this.f387a.f396b;
                AbstractC0133a abstractC0133a2 = (AbstractC0133a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0580g.m1440d(logger, abstractC0133a2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: d */
    public final void m430d(AbstractC0133a task, long j2) {
        AbstractC2492i.m4915e(task, "task");
        C0136d c0136d = this.f387a;
        ReentrantLock reentrantLock = c0136d.f397c;
        reentrantLock.lock();
        try {
            if (!this.f389c) {
                if (m431e(task, j2, false)) {
                    c0136d.m436d(this);
                }
                return;
            }
            boolean z2 = task.f382b;
            Logger logger = c0136d.f396b;
            if (z2) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0580g.m1440d(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0580g.m1440d(logger, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final boolean m431e(AbstractC0133a task, long j2, boolean z2) {
        AbstractC2492i.m4915e(task, "task");
        C0135c c0135c = task.f383c;
        if (c0135c != this) {
            if (c0135c != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f383c = this;
        }
        C0136d c0136d = this.f387a;
        C0055g c0055g = c0136d.f395a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f391e;
        int indexOf = arrayList.indexOf(task);
        Logger logger = c0136d.f396b;
        if (indexOf != -1) {
            if (task.f384d <= j3) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0580g.m1440d(logger, task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f384d = j3;
        if (logger.isLoggable(Level.FINE)) {
            AbstractC0580g.m1440d(logger, task, this, z2 ? "run again after ".concat(AbstractC0580g.m1447l(j3 - nanoTime)) : "scheduled after ".concat(AbstractC0580g.m1447l(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int r02 = 0;
        while (true) {
            if (!it.hasNext()) {
                r02 = -1;
                break;
            }
            if (((AbstractC0133a) it.next()).f384d - nanoTime > j2) {
                break;
            }
            r02++;
        }
        if (r02 == -1) {
            r02 = arrayList.size();
        }
        arrayList.add(r02, task);
        return r02 == 0;
    }

    /* renamed from: f */
    public final void m432f() {
        C0083o c0083o = AbstractC0122i.f368a;
        C0136d c0136d = this.f387a;
        ReentrantLock reentrantLock = c0136d.f397c;
        reentrantLock.lock();
        try {
            this.f389c = true;
            if (m429b()) {
                c0136d.m436d(this);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.f388b;
    }
}
