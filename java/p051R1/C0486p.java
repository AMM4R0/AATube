package p051R1;

import java.util.zip.Inflater;

/* renamed from: R1.p */
/* loaded from: classes.dex */
public final class C0486p implements InterfaceC0467D {

    /* renamed from: a */
    public final C0494x f1234a;

    /* renamed from: b */
    public final Inflater f1235b;

    /* renamed from: c */
    public int f1236c;

    /* renamed from: d */
    public boolean f1237d;

    public C0486p(C0494x c0494x, Inflater inflater) {
        this.f1234a = c0494x;
        this.f1235b = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo390a(p051R1.C0477g r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r11, r0)
        L5:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb5
            boolean r3 = r10.f1237d
            if (r3 != 0) goto Lad
            R1.x r3 = r10.f1234a
            java.util.zip.Inflater r4 = r10.f1235b
            if (r2 != 0) goto L17
        L15:
            r8 = r0
            goto L82
        L17:
            r2 = 1
            R1.y r2 = r11.m1270v(r2)     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = r2.f1254c     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> L70
            long r5 = java.lang.Math.min(r12, r5)     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> L70
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> L70
            if (r6 != 0) goto L2d
            goto L47
        L2d:
            boolean r6 = r3.m1290b()     // Catch: java.util.zip.DataFormatException -> L70
            if (r6 == 0) goto L34
            goto L47
        L34:
            R1.g r6 = r3.f1250b     // Catch: java.util.zip.DataFormatException -> L70
            R1.y r6 = r6.f1216a     // Catch: java.util.zip.DataFormatException -> L70
            kotlin.jvm.internal.AbstractC2492i.m4912b(r6)     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r6.f1254c     // Catch: java.util.zip.DataFormatException -> L70
            int r8 = r6.f1253b     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r7 - r8
            r10.f1236c = r7     // Catch: java.util.zip.DataFormatException -> L70
            byte[] r6 = r6.f1252a     // Catch: java.util.zip.DataFormatException -> L70
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L70
        L47:
            byte[] r6 = r2.f1252a     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r2.f1254c     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r10.f1236c     // Catch: java.util.zip.DataFormatException -> L70
            if (r6 != 0) goto L54
            goto L62
        L54:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r6 - r7
            int r7 = r10.f1236c     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r7 - r6
            r10.f1236c = r7     // Catch: java.util.zip.DataFormatException -> L70
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L70
            r3.m1303s(r6)     // Catch: java.util.zip.DataFormatException -> L70
        L62:
            if (r5 <= 0) goto L72
            int r6 = r2.f1254c     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r6 + r5
            r2.f1254c = r6     // Catch: java.util.zip.DataFormatException -> L70
            long r6 = r11.f1217b     // Catch: java.util.zip.DataFormatException -> L70
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> L70
            long r6 = r6 + r8
            r11.f1217b = r6     // Catch: java.util.zip.DataFormatException -> L70
            goto L82
        L70:
            r11 = move-exception
            goto La7
        L72:
            int r5 = r2.f1253b     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r2.f1254c     // Catch: java.util.zip.DataFormatException -> L70
            if (r5 != r6) goto L15
            R1.y r5 = r2.m1304a()     // Catch: java.util.zip.DataFormatException -> L70
            r11.f1216a = r5     // Catch: java.util.zip.DataFormatException -> L70
            p051R1.AbstractC0496z.m1308a(r2)     // Catch: java.util.zip.DataFormatException -> L70
            goto L15
        L82:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L87
            return r8
        L87:
            boolean r0 = r4.finished()
            if (r0 != 0) goto La4
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L94
            goto La4
        L94:
            boolean r0 = r3.m1290b()
            if (r0 != 0) goto L9c
            goto L5
        L9c:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La4:
            r11 = -1
            return r11
        La7:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lad:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        Lb5:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = p000A.AbstractC0002c.m14i(r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p051R1.C0486p.mo390a(R1.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1237d) {
            return;
        }
        this.f1235b.end();
        this.f1237d = true;
        this.f1234a.close();
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f1234a.f1249a.mo391d();
    }
}
