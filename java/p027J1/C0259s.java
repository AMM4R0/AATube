package p027J1;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0083o;
import p008C1.C0084p;
import p011D1.AbstractC0119f;
import p011D1.AbstractC0122i;
import p016F1.C0134b;
import p016F1.C0135c;
import p016F1.C0136d;
import p030K1.C0346a;
import p051R1.C0493w;
import p051R1.C0494x;

/* renamed from: J1.s */
/* loaded from: classes.dex */
public final class C0259s implements Closeable {

    /* renamed from: A */
    public static final C0239G f770A;

    /* renamed from: a */
    public final AbstractC0251k f771a;

    /* renamed from: b */
    public final LinkedHashMap f772b = new LinkedHashMap();

    /* renamed from: c */
    public final String f773c;

    /* renamed from: d */
    public int f774d;

    /* renamed from: e */
    public int f775e;

    /* renamed from: f */
    public boolean f776f;

    /* renamed from: g */
    public final C0136d f777g;

    /* renamed from: h */
    public final C0135c f778h;

    /* renamed from: i */
    public final C0135c f779i;

    /* renamed from: j */
    public final C0135c f780j;

    /* renamed from: k */
    public final C0238F f781k;

    /* renamed from: l */
    public long f782l;

    /* renamed from: m */
    public long f783m;

    /* renamed from: n */
    public long f784n;

    /* renamed from: o */
    public long f785o;

    /* renamed from: p */
    public long f786p;

    /* renamed from: q */
    public final C0243c f787q;

    /* renamed from: r */
    public final C0239G f788r;

    /* renamed from: s */
    public C0239G f789s;

    /* renamed from: t */
    public final C0346a f790t;

    /* renamed from: u */
    public long f791u;

    /* renamed from: v */
    public long f792v;

    /* renamed from: w */
    public final Socket f793w;

    /* renamed from: x */
    public final C0235C f794x;

    /* renamed from: y */
    public final C0254n f795y;

    /* renamed from: z */
    public final LinkedHashSet f796z;

    static {
        C0239G c0239g = new C0239G();
        c0239g.m653c(7, 65535);
        c0239g.m653c(5, 16384);
        f770A = c0239g;
    }

    public C0259s(C0084p c0084p) {
        this.f771a = (AbstractC0251k) c0084p.f237h;
        String str = c0084p.f231b;
        if (str == null) {
            AbstractC2492i.m4918h("connectionName");
            throw null;
        }
        this.f773c = str;
        this.f775e = 3;
        C0136d c0136d = (C0136d) c0084p.f233d;
        this.f777g = c0136d;
        C0135c m437e = c0136d.m437e();
        this.f778h = m437e;
        this.f779i = c0136d.m437e();
        this.f780j = c0136d.m437e();
        this.f781k = C0238F.f701a;
        this.f787q = (C0243c) c0084p.f238i;
        C0239G c0239g = new C0239G();
        c0239g.m653c(7, 16777216);
        this.f788r = c0239g;
        this.f789s = f770A;
        this.f790t = new C0346a(0);
        this.f792v = r2.m651a();
        Socket socket = (Socket) c0084p.f234e;
        if (socket == null) {
            AbstractC2492i.m4918h("socket");
            throw null;
        }
        this.f793w = socket;
        C0493w c0493w = (C0493w) c0084p.f236g;
        if (c0493w == null) {
            AbstractC2492i.m4918h("sink");
            throw null;
        }
        this.f794x = new C0235C(c0493w);
        C0494x c0494x = (C0494x) c0084p.f235f;
        if (c0494x == null) {
            AbstractC2492i.m4918h("source");
            throw null;
        }
        this.f795y = new C0254n(this, new C0264x(c0494x));
        this.f796z = new LinkedHashSet();
        int r7 = c0084p.f232c;
        if (r7 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(r7);
            String name = str.concat(" ping");
            C0249i c0249i = new C0249i(this, nanos);
            AbstractC2492i.m4915e(name, "name");
            m437e.m430d(new C0134b(name, c0249i), nanos);
        }
    }

    /* renamed from: b */
    public final void m670b(EnumC0242b enumC0242b, EnumC0242b enumC0242b2, IOException iOException) {
        int r02;
        Object[] objArr;
        C0083o c0083o = AbstractC0122i.f368a;
        try {
            m675k(enumC0242b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f772b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f772b.values().toArray(new C0234B[0]);
                this.f772b.clear();
            }
        }
        C0234B[] c0234bArr = (C0234B[]) objArr;
        if (c0234bArr != null) {
            for (C0234B c0234b : c0234bArr) {
                try {
                    c0234b.m632c(enumC0242b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f794x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f793w.close();
        } catch (IOException unused4) {
        }
        this.f778h.m432f();
        this.f779i.m432f();
        this.f780j.m432f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m670b(EnumC0242b.NO_ERROR, EnumC0242b.CANCEL, null);
    }

    public final void flush() {
        this.f794x.flush();
    }

    /* renamed from: g */
    public final void m671g(IOException iOException) {
        EnumC0242b enumC0242b = EnumC0242b.PROTOCOL_ERROR;
        m670b(enumC0242b, enumC0242b, iOException);
    }

    /* renamed from: h */
    public final synchronized C0234B m672h(int r2) {
        return (C0234B) this.f772b.get(Integer.valueOf(r2));
    }

    /* renamed from: i */
    public final synchronized boolean m673i(long j2) {
        if (this.f776f) {
            return false;
        }
        if (this.f785o < this.f784n) {
            if (j2 >= this.f786p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final synchronized C0234B m674j(int r2) {
        C0234B c0234b;
        c0234b = (C0234B) this.f772b.remove(Integer.valueOf(r2));
        notifyAll();
        return c0234b;
    }

    /* renamed from: k */
    public final void m675k(EnumC0242b enumC0242b) {
        synchronized (this.f794x) {
            synchronized (this) {
                if (this.f776f) {
                    return;
                }
                this.f776f = true;
                this.f794x.m645i(this.f774d, enumC0242b, AbstractC0119f.f362a);
            }
        }
    }

    /* renamed from: l */
    public final synchronized void m676l(long j2) {
        try {
            C0346a.m982c(this.f790t, j2, 0L, 2);
            long m984b = this.f790t.m984b();
            if (m984b >= this.f788r.m651a() / 2) {
                m679o(0, m984b);
                C0346a.m982c(this.f790t, 0L, m984b, 1);
            }
            C0243c c0243c = this.f787q;
            C0346a windowCounter = this.f790t;
            c0243c.getClass();
            AbstractC2492i.m4915e(windowCounter, "windowCounter");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f794x.f692c);
        r6 = r2;
        r8.f791u += r6;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m677m(int r9, boolean r10, p051R1.C0477g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            J1.C r12 = r8.f794x
            r12.m643g(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f791u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f792v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f772b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            J1.C r4 = r8.f794x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f692c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f791u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f791u = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            J1.C r4 = r8.f794x
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m643g(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0259s.m677m(int, boolean, R1.g, long):void");
    }

    /* renamed from: n */
    public final void m678n(int r3, EnumC0242b enumC0242b) {
        C0135c.m427c(this.f778h, this.f773c + '[' + r3 + "] writeSynReset", new C0257q(this, r3, enumC0242b));
    }

    /* renamed from: o */
    public final void m679o(int r3, long j2) {
        C0135c.m427c(this.f778h, this.f773c + '[' + r3 + "] windowUpdate", new C0258r(this, r3, j2));
    }
}
