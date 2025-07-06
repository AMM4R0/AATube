package p026J0;

import com.google.android.gms.tasks.Task;
import p010D0.RunnableC0106d;
import p010D0.RunnableC0107e;

/* renamed from: J0.h */
/* loaded from: classes.dex */
public final class C0227h implements InterfaceC0228i {

    /* renamed from: a */
    public final /* synthetic */ int f659a;

    /* renamed from: b */
    public final ExecutorC0230k f660b;

    /* renamed from: c */
    public final Object f661c;

    /* renamed from: d */
    public final C0226g f662d;

    public C0227h(ExecutorC0230k executorC0230k, C0226g c0226g, int r3) {
        this.f659a = r3;
        switch (r3) {
            case 1:
                this.f661c = new Object();
                this.f660b = executorC0230k;
                this.f662d = c0226g;
                break;
            default:
                this.f661c = new Object();
                this.f660b = executorC0230k;
                this.f662d = c0226g;
                break;
        }
    }

    /* renamed from: b */
    private final void m615b(Task task) {
        if (((C0232m) task).f672d) {
            synchronized (this.f661c) {
                try {
                    if (this.f662d == null) {
                        return;
                    }
                    ExecutorC0230k executorC0230k = this.f660b;
                    RunnableC0107e runnableC0107e = new RunnableC0107e(2, this);
                    executorC0230k.getClass();
                    runnableC0107e.run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p026J0.InterfaceC0228i
    /* renamed from: a */
    public final void mo613a(Task task) {
        switch (this.f659a) {
            case 0:
                m615b(task);
                return;
            default:
                if (task.mo624d() || ((C0232m) task).f672d) {
                    return;
                }
                synchronized (this.f661c) {
                    try {
                        if (this.f662d != null) {
                            ExecutorC0230k executorC0230k = this.f660b;
                            RunnableC0106d runnableC0106d = new RunnableC0106d(this, task, 5, false);
                            executorC0230k.getClass();
                            runnableC0106d.run();
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
