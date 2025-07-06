package p027J1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0083o;
import p011D1.AbstractC0122i;
import p030K1.C0346a;

/* renamed from: J1.B */
/* loaded from: classes.dex */
public final class C0234B {

    /* renamed from: a */
    public final int f676a;

    /* renamed from: b */
    public final C0259s f677b;

    /* renamed from: c */
    public final C0346a f678c;

    /* renamed from: d */
    public long f679d;

    /* renamed from: e */
    public long f680e;

    /* renamed from: f */
    public final ArrayDeque f681f;

    /* renamed from: g */
    public boolean f682g;

    /* renamed from: h */
    public final C0266z f683h;

    /* renamed from: i */
    public final C0265y f684i;

    /* renamed from: j */
    public final C0233A f685j;

    /* renamed from: k */
    public final C0233A f686k;

    /* renamed from: l */
    public EnumC0242b f687l;

    /* renamed from: m */
    public IOException f688m;

    public C0234B(int r4, C0259s connection, boolean z2, boolean z3, C0083o c0083o) {
        AbstractC2492i.m4915e(connection, "connection");
        this.f676a = r4;
        this.f677b = connection;
        this.f678c = new C0346a(r4);
        this.f680e = connection.f789s.m651a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f681f = arrayDeque;
        this.f683h = new C0266z(this, connection.f788r.m651a(), z3);
        this.f684i = new C0265y(this, z2);
        this.f685j = new C0233A(this);
        this.f686k = new C0233A(this);
        if (c0083o == null) {
            if (!m637h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m637h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c0083o);
        }
    }

    /* renamed from: a */
    public final void m630a() {
        boolean z2;
        boolean m638i;
        C0083o c0083o = AbstractC0122i.f368a;
        synchronized (this) {
            try {
                C0266z c0266z = this.f683h;
                if (!c0266z.f821b && c0266z.f825f) {
                    C0265y c0265y = this.f684i;
                    if (c0265y.f816a || c0265y.f818c) {
                        z2 = true;
                        m638i = m638i();
                    }
                }
                z2 = false;
                m638i = m638i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m632c(EnumC0242b.CANCEL, null);
        } else {
            if (m638i) {
                return;
            }
            this.f677b.m674j(this.f676a);
        }
    }

    /* renamed from: b */
    public final void m631b() {
        C0265y c0265y = this.f684i;
        if (c0265y.f818c) {
            throw new IOException("stream closed");
        }
        if (c0265y.f816a) {
            throw new IOException("stream finished");
        }
        if (this.f687l != null) {
            IOException iOException = this.f688m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0242b enumC0242b = this.f687l;
            AbstractC2492i.m4912b(enumC0242b);
            throw new C0240H(enumC0242b);
        }
    }

    /* renamed from: c */
    public final void m632c(EnumC0242b enumC0242b, IOException iOException) {
        if (m633d(enumC0242b, iOException)) {
            this.f677b.f794x.m648l(this.f676a, enumC0242b);
        }
    }

    /* renamed from: d */
    public final boolean m633d(EnumC0242b enumC0242b, IOException iOException) {
        C0083o c0083o = AbstractC0122i.f368a;
        synchronized (this) {
            if (this.f687l != null) {
                return false;
            }
            this.f687l = enumC0242b;
            this.f688m = iOException;
            notifyAll();
            if (this.f683h.f821b) {
                if (this.f684i.f816a) {
                    return false;
                }
            }
            this.f677b.m674j(this.f676a);
            return true;
        }
    }

    /* renamed from: e */
    public final void m634e(EnumC0242b enumC0242b) {
        if (m633d(enumC0242b, null)) {
            this.f677b.m678n(this.f676a, enumC0242b);
        }
    }

    /* renamed from: f */
    public final synchronized EnumC0242b m635f() {
        return this.f687l;
    }

    /* renamed from: g */
    public final C0265y m636g() {
        synchronized (this) {
            if (!this.f682g && !m637h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f684i;
    }

    /* renamed from: h */
    public final boolean m637h() {
        boolean z2 = (this.f676a & 1) == 1;
        this.f677b.getClass();
        return true == z2;
    }

    /* renamed from: i */
    public final synchronized boolean m638i() {
        if (this.f687l != null) {
            return false;
        }
        C0266z c0266z = this.f683h;
        if (c0266z.f821b || c0266z.f825f) {
            C0265y c0265y = this.f684i;
            if (c0265y.f816a || c0265y.f818c) {
                if (this.f682g) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002e, B:14:0x0032, B:22:0x0025), top: B:3:0x0008 }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m639j(p008C1.C0083o r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r3, r0)
            C1.o r0 = p011D1.AbstractC0122i.f368a
            monitor-enter(r2)
            boolean r0 = r2.f682g     // Catch: java.lang.Throwable -> L23
            r1 = 1
            if (r0 == 0) goto L25
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.m274a(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.m274a(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
            goto L25
        L1e:
            J1.z r0 = r2.f683h     // Catch: java.lang.Throwable -> L23
            r0.f824e = r3     // Catch: java.lang.Throwable -> L23
            goto L2c
        L23:
            r3 = move-exception
            goto L44
        L25:
            r2.f682g = r1     // Catch: java.lang.Throwable -> L23
            java.util.ArrayDeque r0 = r2.f681f     // Catch: java.lang.Throwable -> L23
            r0.add(r3)     // Catch: java.lang.Throwable -> L23
        L2c:
            if (r4 == 0) goto L32
            J1.z r3 = r2.f683h     // Catch: java.lang.Throwable -> L23
            r3.f821b = r1     // Catch: java.lang.Throwable -> L23
        L32:
            boolean r3 = r2.m638i()     // Catch: java.lang.Throwable -> L23
            r2.notifyAll()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            if (r3 != 0) goto L43
            J1.s r3 = r2.f677b
            int r4 = r2.f676a
            r3.m674j(r4)
        L43:
            return
        L44:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0234B.m639j(C1.o, boolean):void");
    }

    /* renamed from: k */
    public final synchronized void m640k(EnumC0242b enumC0242b) {
        if (this.f687l == null) {
            this.f687l = enumC0242b;
            notifyAll();
        }
    }

    /* renamed from: l */
    public final void m641l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
