package p026J0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p133v0.AbstractC2863r;

/* renamed from: J0.m */
/* loaded from: classes.dex */
public final class C0232m extends Task {

    /* renamed from: a */
    public final Object f669a = new Object();

    /* renamed from: b */
    public final C0229j f670b = new C0229j();

    /* renamed from: c */
    public boolean f671c;

    /* renamed from: d */
    public volatile boolean f672d;

    /* renamed from: e */
    public Object f673e;

    /* renamed from: f */
    public Exception f674f;

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: a */
    public final C0232m mo621a(Executor executor, InterfaceC0222c interfaceC0222c) {
        this.f670b.m619d(new C0226g(executor, interfaceC0222c));
        m628h();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b */
    public final Exception mo622b() {
        Exception exc;
        synchronized (this.f669a) {
            exc = this.f674f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c */
    public final Object mo623c() {
        Object obj;
        synchronized (this.f669a) {
            try {
                if (!this.f671c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f672d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f674f;
                if (exc != null) {
                    throw new C0223d(exc);
                }
                obj = this.f673e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: d */
    public final boolean mo624d() {
        boolean z2;
        synchronized (this.f669a) {
            try {
                z2 = false;
                if (this.f671c && !this.f672d && this.f674f == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    /* renamed from: e */
    public final void m625e(Exception exc) {
        AbstractC2863r.m5475d(exc, "Exception must not be null");
        synchronized (this.f669a) {
            m627g();
            this.f671c = true;
            this.f674f = exc;
        }
        this.f670b.m620e(this);
    }

    /* renamed from: f */
    public final void m626f(Object obj) {
        synchronized (this.f669a) {
            m627g();
            this.f671c = true;
            this.f673e = obj;
        }
        this.f670b.m620e(this);
    }

    /* renamed from: g */
    public final void m627g() {
        boolean z2;
        if (this.f671c) {
            int r02 = C0220a.f651a;
            synchronized (this.f669a) {
                z2 = this.f671c;
            }
            if (!z2) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception mo622b = mo622b();
            String concat = mo622b != null ? "failure" : mo624d() ? "result ".concat(String.valueOf(mo623c())) : this.f672d ? "cancellation" : "unknown issue";
        }
    }

    /* renamed from: h */
    public final void m628h() {
        synchronized (this.f669a) {
            try {
                if (this.f671c) {
                    this.f670b.m620e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
