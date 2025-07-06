package p018G1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0080l;
import p008C1.C0083o;
import p008C1.C0088t;
import p008C1.C0091w;
import p008C1.C0094z;
import p011D1.AbstractC0122i;
import p036M1.C0389o;

/* renamed from: G1.m */
/* loaded from: classes.dex */
public final class C0162m implements Cloneable {

    /* renamed from: a */
    public final C0088t f470a;

    /* renamed from: b */
    public final C0091w f471b;

    /* renamed from: c */
    public final C0164o f472c;

    /* renamed from: d */
    public final C0161l f473d;

    /* renamed from: e */
    public final AtomicBoolean f474e;

    /* renamed from: f */
    public Object f475f;

    /* renamed from: g */
    public InterfaceC0156g f476g;

    /* renamed from: h */
    public C0163n f477h;

    /* renamed from: i */
    public C0155f f478i;

    /* renamed from: j */
    public boolean f479j;

    /* renamed from: k */
    public boolean f480k;

    /* renamed from: l */
    public boolean f481l;

    /* renamed from: m */
    public volatile boolean f482m;

    /* renamed from: n */
    public volatile C0155f f483n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f484o;

    public C0162m(C0088t c0088t, C0091w c0091w) {
        this.f470a = c0088t;
        this.f471b = c0091w;
        this.f472c = (C0164o) c0088t.f250A.f107b;
        c0088t.f254d.getClass();
        C0161l c0161l = new C0161l(this);
        c0161l.mo1236g(0, TimeUnit.MILLISECONDS);
        this.f473d = c0161l;
        this.f474e = new AtomicBoolean();
        this.f481l = true;
        this.f484o = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public final IOException m509a(IOException iOException) {
        IOException interruptedIOException;
        Socket m515g;
        C0083o c0083o = AbstractC0122i.f368a;
        C0163n c0163n = this.f477h;
        if (c0163n != null) {
            synchronized (c0163n) {
                m515g = m515g();
            }
            if (this.f477h == null) {
                if (m515g != null) {
                    AbstractC0122i.m412b(m515g);
                }
            } else if (m515g != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f473d.m1244i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC2492i.m4912b(interruptedIOException);
        }
        return interruptedIOException;
    }

    /* renamed from: b */
    public final C0094z m510b() {
        if (!this.f474e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f473d.m1243h();
        C0389o c0389o = C0389o.f1050a;
        this.f475f = C0389o.f1050a.mo1061g();
        try {
            C0080l c0080l = this.f470a.f251a;
            synchronized (c0080l) {
                ((ArrayDeque) c0080l.f222d).add(this);
            }
            return m512d();
        } finally {
            this.f470a.f251a.m267c(this);
        }
    }

    /* renamed from: c */
    public final void m511c(boolean z2) {
        C0155f c0155f;
        synchronized (this) {
            if (!this.f481l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (c0155f = this.f483n) != null) {
            c0155f.f457c.cancel();
            c0155f.f455a.m513e(c0155f, true, true, null);
        }
        this.f478i = null;
    }

    public final Object clone() {
        return new C0162m(this.f470a, this.f471b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p008C1.C0094z m512d() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            C1.t r0 = r11.f470a
            java.util.List r0 = r0.f252b
            p108m1.AbstractC2665o.m5123a0(r2, r0)
            H1.a r0 = new H1.a
            C1.t r1 = r11.f470a
            r0.<init>(r1)
            r2.add(r0)
            H1.a r0 = new H1.a
            C1.t r1 = r11.f470a
            C1.b r1 = r1.f260j
            r0.<init>(r1)
            r2.add(r0)
            E1.a r0 = new E1.a
            r1 = 0
            r0.<init>(r1)
            r2.add(r0)
            G1.a r0 = p018G1.C0150a.f417a
            r2.add(r0)
            C1.t r0 = r11.f470a
            java.util.List r0 = r0.f253c
            p108m1.AbstractC2665o.m5123a0(r2, r0)
            E1.a r0 = new E1.a
            r1 = 1
            r0.<init>(r1)
            r2.add(r0)
            H1.g r9 = new H1.g
            C1.w r5 = r11.f471b
            C1.t r0 = r11.f470a
            int r6 = r0.f272v
            int r7 = r0.f273w
            int r8 = r0.f274x
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            C1.w r2 = r11.f471b     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
            C1.z r2 = r9.m554b(r2)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
            boolean r3 = r11.f482m     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
            if (r3 != 0) goto L63
            r11.m514f(r0)
            return r2
        L63:
            p011D1.AbstractC0119f.m396b(r2)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
            throw r2     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
        L6e:
            r2 = move-exception
            goto L80
        L70:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.m514f(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.AbstractC2492i.m4913c(r1, r3)     // Catch: java.lang.Throwable -> L7c
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L80:
            if (r1 != 0) goto L85
            r11.m514f(r0)
        L85:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0162m.m512d():C1.z");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:43:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001b), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:43:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001b), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException m513e(p018G1.C0155f r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r2, r0)
            G1.f r0 = r1.f483n
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f479j     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L41
        L19:
            if (r4 == 0) goto L43
            boolean r0 = r1.f480k     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L43
        L1f:
            if (r3 == 0) goto L23
            r1.f479j = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f480k = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f479j     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f480k     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f480k     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f481l     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L44
        L41:
            monitor-exit(r1)
            throw r2
        L43:
            r3 = r2
        L44:
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.f483n = r2
            G1.n r2 = r1.f477h
            if (r2 == 0) goto L51
            r2.m519f()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.m509a(r5)
            return r2
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0162m.m513e(G1.f, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: f */
    public final IOException m514f(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f481l) {
                this.f481l = false;
                if (!this.f479j) {
                    if (!this.f480k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? m509a(iOException) : iOException;
    }

    /* renamed from: g */
    public final Socket m515g() {
        C0163n c0163n = this.f477h;
        AbstractC2492i.m4912b(c0163n);
        C0083o c0083o = AbstractC0122i.f368a;
        ArrayList arrayList = c0163n.f503t;
        Iterator it = arrayList.iterator();
        int r4 = 0;
        while (true) {
            if (!it.hasNext()) {
                r4 = -1;
                break;
            }
            if (AbstractC2492i.m4911a(((Reference) it.next()).get(), this)) {
                break;
            }
            r4++;
        }
        if (r4 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(r4);
        this.f477h = null;
        if (arrayList.isEmpty()) {
            c0163n.f504u = System.nanoTime();
            C0164o c0164o = this.f472c;
            c0164o.getClass();
            C0083o c0083o2 = AbstractC0122i.f368a;
            if (c0163n.f497n || c0164o.f505a == 0) {
                c0163n.f497n = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = c0164o.f511g;
                concurrentLinkedQueue.remove(c0163n);
                if (concurrentLinkedQueue.isEmpty()) {
                    c0164o.f509e.m428a();
                }
                if (c0164o.f508d.get(c0163n.f487d.f129a) != null) {
                    throw new ClassCastException();
                }
                Socket socket = c0163n.f489f;
                AbstractC2492i.m4912b(socket);
                return socket;
            }
            c0164o.f509e.m430d(c0164o.f510f, 0L);
        }
        return null;
    }
}
