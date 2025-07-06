package p026J0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p006C.C0055g;
import p010D0.RunnableC0106d;

/* renamed from: J0.g */
/* loaded from: classes.dex */
public final class C0226g implements InterfaceC0222c, InterfaceC0228i {

    /* renamed from: a */
    public final /* synthetic */ int f655a;

    /* renamed from: b */
    public final Executor f656b;

    /* renamed from: c */
    public final Object f657c;

    /* renamed from: d */
    public final Object f658d;

    public C0226g(ExecutorC0231l executorC0231l, C0055g c0055g, C0232m c0232m) {
        this.f655a = 0;
        this.f656b = executorC0231l;
        this.f657c = c0055g;
        this.f658d = c0232m;
    }

    /* renamed from: c */
    private final void m612c(Task task) {
        synchronized (this.f657c) {
        }
        this.f656b.execute(new RunnableC0106d(this, task, 4, false));
    }

    @Override // p026J0.InterfaceC0228i
    /* renamed from: a */
    public final void mo613a(Task task) {
        switch (this.f655a) {
            case 0:
                ((ExecutorC0231l) this.f656b).execute(new RunnableC0106d(this, task, 3, false));
                return;
            case 1:
                m612c(task);
                return;
            default:
                if (task.mo624d()) {
                    synchronized (this.f657c) {
                        try {
                            if (((InterfaceC0222c) this.f658d) != null) {
                                this.f656b.execute(new RunnableC0106d(this, task, 6, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    /* renamed from: b */
    public void m614b() {
        C0232m c0232m = (C0232m) this.f658d;
        synchronized (c0232m.f669a) {
            try {
                if (c0232m.f671c) {
                    return;
                }
                c0232m.f671c = true;
                c0232m.f672d = true;
                c0232m.f670b.m620e(c0232m);
            } finally {
            }
        }
    }

    @Override // p026J0.InterfaceC0222c
    public void onSuccess(Object obj) {
        ((C0232m) this.f658d).m626f(obj);
    }

    public C0226g(Executor executor, InterfaceC0221b interfaceC0221b) {
        this.f655a = 1;
        this.f657c = new Object();
        this.f656b = executor;
        this.f658d = interfaceC0221b;
    }

    public C0226g(Executor executor, InterfaceC0222c interfaceC0222c) {
        this.f655a = 2;
        this.f657c = new Object();
        this.f656b = executor;
        this.f658d = interfaceC0222c;
    }
}
