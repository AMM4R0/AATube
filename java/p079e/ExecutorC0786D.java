package p079e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p003B.RunnableC0040n;
import p026J0.ExecutorC0230k;

/* renamed from: e.D */
/* loaded from: classes.dex */
public final class ExecutorC0786D implements Executor {

    /* renamed from: a */
    public final Object f3162a = new Object();

    /* renamed from: b */
    public final ArrayDeque f3163b = new ArrayDeque();

    /* renamed from: c */
    public final ExecutorC0230k f3164c;

    /* renamed from: d */
    public Runnable f3165d;

    public ExecutorC0786D(ExecutorC0230k executorC0230k) {
        this.f3164c = executorC0230k;
    }

    /* renamed from: a */
    public final void m2168a() {
        synchronized (this.f3162a) {
            try {
                Runnable runnable = (Runnable) this.f3163b.poll();
                this.f3165d = runnable;
                if (runnable != null) {
                    this.f3164c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3162a) {
            try {
                this.f3163b.add(new RunnableC0040n(this, 2, runnable));
                if (this.f3165d == null) {
                    m2168a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
