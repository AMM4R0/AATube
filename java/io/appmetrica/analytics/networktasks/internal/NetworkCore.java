package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.networktasks.impl.C2400d;
import io.appmetrica.analytics.networktasks.impl.C2402f;
import io.appmetrica.analytics.networktasks.impl.C2403g;
import io.appmetrica.analytics.networktasks.impl.RunnableC2404h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a */
    private final LinkedBlockingQueue f7737a;

    /* renamed from: b */
    private final Object f7738b;

    /* renamed from: c */
    private final Object f7739c;

    /* renamed from: d */
    private volatile C2400d f7740d;

    /* renamed from: e */
    private final C2403g f7741e;

    public NetworkCore() {
        this(new C2403g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f7739c) {
                }
                this.f7740d = (C2400d) this.f7737a.take();
                networkTask = this.f7740d.f7707a;
                Executor executor = networkTask.getExecutor();
                this.f7741e.getClass();
                executor.execute(new RunnableC2404h(networkTask, this, new C2402f()));
                synchronized (this.f7739c) {
                    this.f7740d = null;
                    networkTask.onTaskFinished();
                    networkTask.onTaskRemoved();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f7739c) {
                    try {
                        this.f7740d = null;
                        if (networkTask != null) {
                            networkTask.onTaskFinished();
                            networkTask.onTaskRemoved();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f7739c) {
                    try {
                        this.f7740d = null;
                        if (networkTask != null) {
                            networkTask.onTaskFinished();
                            networkTask.onTaskRemoved();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        }
    }

    public void startTask(NetworkTask networkTask) {
        synchronized (this.f7738b) {
            try {
                C2400d c2400d = new C2400d(networkTask);
                if (isRunning() && !this.f7737a.contains(c2400d) && !c2400d.equals(this.f7740d) && networkTask.onTaskAdded()) {
                    this.f7737a.offer(c2400d);
                }
            } finally {
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f7739c) {
            try {
                C2400d c2400d = this.f7740d;
                if (c2400d != null) {
                    c2400d.f7707a.onTaskRemoved();
                }
                ArrayList arrayList = new ArrayList(this.f7737a.size());
                this.f7737a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2400d) it.next()).f7707a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(C2403g c2403g) {
        this.f7737a = new LinkedBlockingQueue();
        this.f7738b = new Object();
        this.f7739c = new Object();
        this.f7741e = c2403g;
    }
}
