package p018G1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p011D1.AbstractC0122i;
import p016F1.C0136d;

/* renamed from: G1.j */
/* loaded from: classes.dex */
public final class C0159j implements InterfaceC0156g {

    /* renamed from: a */
    public final C0165p f462a;

    /* renamed from: b */
    public final C0136d f463b;

    /* renamed from: c */
    public final long f464c;

    /* renamed from: d */
    public long f465d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f466e;

    /* renamed from: f */
    public final LinkedBlockingDeque f467f;

    public C0159j(C0165p c0165p, C0136d taskRunner) {
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        this.f462a = c0165p;
        this.f463b = taskRunner;
        this.f464c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f465d = Long.MIN_VALUE;
        this.f466e = new CopyOnWriteArrayList();
        this.f467f = new LinkedBlockingDeque();
    }

    /* renamed from: a */
    public final void m506a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f466e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0168s interfaceC0168s = (InterfaceC0168s) it.next();
            interfaceC0168s.cancel();
            InterfaceC0168s mo482a = interfaceC0168s.mo482a();
            if (mo482a != null) {
                this.f462a.m525b().m5098d(mo482a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* renamed from: b */
    public final C0167r m507b() {
        InterfaceC0168s c0157h;
        C0165p c0165p = this.f462a;
        if (c0165p.m526c(null)) {
            try {
                c0157h = c0165p.m528e();
            } catch (Throwable th) {
                c0157h = new C0157h(th);
            }
            if (c0157h.mo484c()) {
                return new C0167r(c0157h, (Throwable) null, 6);
            }
            if (c0157h instanceof C0157h) {
                return ((C0157h) c0157h).f459a;
            }
            this.f466e.add(c0157h);
            this.f463b.m437e().m430d(new C0158i(AbstractC0122i.f370c + " connect " + c0165p.m524a().f147h.m287f(), c0157h, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[SYNTHETIC] */
    @Override // p018G1.InterfaceC0156g
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p018G1.C0163n mo210h() {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList r2 = r11.f466e
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L62
            G1.p r4 = r11.f462a
            if (r3 == 0) goto L1a
            boolean r3 = r4.m526c(r0)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L13
            goto L1a
        L13:
            r11.m506a()
            kotlin.jvm.internal.AbstractC2492i.m4912b(r1)
            throw r1
        L1a:
            boolean r3 = r4.m527d()     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto Lb7
            F1.d r3 = r11.f463b     // Catch: java.lang.Throwable -> L62
            C.g r3 = r3.f395a     // Catch: java.lang.Throwable -> L62
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L62
            long r7 = r11.f465d     // Catch: java.lang.Throwable -> L62
            long r7 = r7 - r5
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L3a
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 > 0) goto L38
            goto L3a
        L38:
            r3 = r0
            goto L43
        L3a:
            G1.r r3 = r11.m507b()     // Catch: java.lang.Throwable -> L62
            long r7 = r11.f464c     // Catch: java.lang.Throwable -> L62
            long r5 = r5 + r7
            r11.f465d = r5     // Catch: java.lang.Throwable -> L62
        L43:
            if (r3 != 0) goto L64
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L62
            boolean r5 = r2.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L4f
        L4d:
            r3 = r0
            goto L5f
        L4f:
            java.util.concurrent.LinkedBlockingDeque r5 = r11.f467f     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r5.poll(r7, r3)     // Catch: java.lang.Throwable -> L62
            G1.r r3 = (p018G1.C0167r) r3     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L5a
            goto L4d
        L5a:
            G1.s r5 = r3.f529a     // Catch: java.lang.Throwable -> L62
            r2.remove(r5)     // Catch: java.lang.Throwable -> L62
        L5f:
            if (r3 != 0) goto L64
            goto L2
        L62:
            r0 = move-exception
            goto Lbf
        L64:
            G1.s r2 = r3.f529a     // Catch: java.lang.Throwable -> L62
            G1.s r5 = r3.f530b     // Catch: java.lang.Throwable -> L62
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L72
            java.lang.Throwable r5 = r3.f531c     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L72
            r5 = r7
            goto L73
        L72:
            r5 = r6
        L73:
            if (r5 == 0) goto L97
            r11.m506a()     // Catch: java.lang.Throwable -> L62
            boolean r5 = r2.mo484c()     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L82
            G1.r r3 = r2.mo487f()     // Catch: java.lang.Throwable -> L62
        L82:
            G1.s r2 = r3.f530b     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L8b
            java.lang.Throwable r2 = r3.f531c     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L8b
            r6 = r7
        L8b:
            if (r6 == 0) goto L97
            G1.s r0 = r3.f529a     // Catch: java.lang.Throwable -> L62
            G1.n r0 = r0.mo488g()     // Catch: java.lang.Throwable -> L62
            r11.m506a()
            return r0
        L97:
            java.lang.Throwable r2 = r3.f531c     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto Laa
            boolean r5 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto La9
            if (r1 != 0) goto La5
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L62
            r1 = r2
            goto Laa
        La5:
            p001A0.AbstractC0005b.m63f(r1, r2)     // Catch: java.lang.Throwable -> L62
            goto Laa
        La9:
            throw r2     // Catch: java.lang.Throwable -> L62
        Laa:
            G1.s r2 = r3.f530b     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L2
            m1.g r3 = r4.m525b()     // Catch: java.lang.Throwable -> L62
            r3.m5097c(r2)     // Catch: java.lang.Throwable -> L62
            goto L2
        Lb7:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        Lbf:
            r11.m506a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G1.C0159j.mo210h():G1.n");
    }

    @Override // p018G1.InterfaceC0156g
    /* renamed from: m */
    public final C0165p mo215m() {
        return this.f462a;
    }
}
