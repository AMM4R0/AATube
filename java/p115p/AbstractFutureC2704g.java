package p115p;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000A.AbstractC0002c;
import p036M1.AbstractC0387m;

/* renamed from: p.g */
/* loaded from: classes.dex */
public abstract class AbstractFutureC2704g implements Future {

    /* renamed from: d */
    public static final boolean f8716d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f8717e = Logger.getLogger(AbstractFutureC2704g.class.getName());

    /* renamed from: f */
    public static final AbstractC0387m f8718f;

    /* renamed from: g */
    public static final Object f8719g;

    /* renamed from: a */
    public volatile Object f8720a;

    /* renamed from: b */
    public volatile C2700c f8721b;

    /* renamed from: c */
    public volatile C2703f f8722c;

    static {
        AbstractC0387m c2702e;
        try {
            c2702e = new C2701d(AtomicReferenceFieldUpdater.newUpdater(C2703f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2703f.class, C2703f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2704g.class, C2703f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2704g.class, C2700c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2704g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2702e = new C2702e();
        }
        f8718f = c2702e;
        if (th != null) {
            f8717e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8719g = new Object();
    }

    /* renamed from: b */
    public static void m5190b(AbstractFutureC2704g abstractFutureC2704g) {
        C2703f c2703f;
        C2700c c2700c;
        do {
            c2703f = abstractFutureC2704g.f8722c;
        } while (!f8718f.mo1138f(abstractFutureC2704g, c2703f, C2703f.f8713c));
        while (c2703f != null) {
            Thread thread = c2703f.f8714a;
            if (thread != null) {
                c2703f.f8714a = null;
                LockSupport.unpark(thread);
            }
            c2703f = c2703f.f8715b;
        }
        do {
            c2700c = abstractFutureC2704g.f8721b;
        } while (!f8718f.mo1136d(abstractFutureC2704g, c2700c));
        C2700c c2700c2 = null;
        while (c2700c != null) {
            C2700c c2700c3 = c2700c.f8707a;
            c2700c.f8707a = c2700c2;
            c2700c2 = c2700c;
            c2700c = c2700c3;
        }
        while (c2700c2 != null) {
            c2700c2 = c2700c2.f8707a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f8717e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* renamed from: c */
    public static Object m5191c(Object obj) {
        if (obj instanceof C2698a) {
            CancellationException cancellationException = ((C2698a) obj).f8705a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC2699b) {
            ((AbstractC2699b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f8719g) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m5192d(AbstractFutureC2704g abstractFutureC2704g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC2704g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m5193a(StringBuilder sb) {
        try {
            Object m5192d = m5192d(this);
            sb.append("SUCCESS, result=[");
            sb.append(m5192d == this ? "this future" : String.valueOf(m5192d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f8720a;
        if (obj != null) {
            return false;
        }
        if (!f8718f.mo1137e(this, obj, f8716d ? new C2698a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C2698a.f8703b : C2698a.f8704c)) {
            return false;
        }
        m5190b(this);
        return true;
    }

    /* renamed from: e */
    public final void m5194e(C2703f c2703f) {
        c2703f.f8714a = null;
        while (true) {
            C2703f c2703f2 = this.f8722c;
            if (c2703f2 == C2703f.f8713c) {
                return;
            }
            C2703f c2703f3 = null;
            while (c2703f2 != null) {
                C2703f c2703f4 = c2703f2.f8715b;
                if (c2703f2.f8714a != null) {
                    c2703f3 = c2703f2;
                } else if (c2703f3 != null) {
                    c2703f3.f8715b = c2703f4;
                    if (c2703f3.f8714a == null) {
                        break;
                    }
                } else if (!f8718f.mo1138f(this, c2703f2, c2703f4)) {
                    break;
                }
                c2703f2 = c2703f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8720a;
        if (obj != null) {
            return m5191c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2703f c2703f = this.f8722c;
            C2703f c2703f2 = C2703f.f8713c;
            if (c2703f != c2703f2) {
                C2703f c2703f3 = new C2703f();
                do {
                    AbstractC0387m abstractC0387m = f8718f;
                    abstractC0387m.mo1131J(c2703f3, c2703f);
                    if (abstractC0387m.mo1138f(this, c2703f, c2703f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5194e(c2703f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8720a;
                            if (obj2 != null) {
                                return m5191c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5194e(c2703f3);
                    } else {
                        c2703f = this.f8722c;
                    }
                } while (c2703f != c2703f2);
            }
            return m5191c(this.f8720a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8720a;
            if (obj3 != null) {
                return m5191c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC2704g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String m15j = AbstractC0002c.m15j(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = m15j + convert + " " + lowerCase;
                if (z2) {
                    str2 = AbstractC0002c.m15j(str2, StringUtils.COMMA);
                }
                m15j = AbstractC0002c.m15j(str2, " ");
            }
            if (z2) {
                m15j = m15j + nanos2 + " nanoseconds ";
            }
            str = AbstractC0002c.m15j(m15j, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0002c.m15j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + abstractFutureC2704g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8720a instanceof C2698a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8720a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8720a instanceof C2698a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5193a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m5193a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8720a;
            if (obj2 != null) {
                return m5191c(obj2);
            }
            C2703f c2703f = this.f8722c;
            C2703f c2703f2 = C2703f.f8713c;
            if (c2703f != c2703f2) {
                C2703f c2703f3 = new C2703f();
                do {
                    AbstractC0387m abstractC0387m = f8718f;
                    abstractC0387m.mo1131J(c2703f3, c2703f);
                    if (abstractC0387m.mo1138f(this, c2703f, c2703f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8720a;
                            } else {
                                m5194e(c2703f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m5191c(obj);
                    }
                    c2703f = this.f8722c;
                } while (c2703f != c2703f2);
            }
            return m5191c(this.f8720a);
        }
        throw new InterruptedException();
    }
}
