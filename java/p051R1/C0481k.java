package p051R1;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: R1.k */
/* loaded from: classes.dex */
public final class C0481k implements InterfaceC0467D {

    /* renamed from: a */
    public final C0487q f1222a;

    /* renamed from: b */
    public long f1223b;

    /* renamed from: c */
    public boolean f1224c;

    public C0481k(C0487q fileHandle, long j2) {
        AbstractC2492i.m4915e(fileHandle, "fileHandle");
        this.f1222a = fileHandle;
        this.f1223b = j2;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        long j3;
        long j4;
        int r11;
        int r10;
        AbstractC2492i.m4915e(sink, "sink");
        if (this.f1224c) {
            throw new IllegalStateException("closed");
        }
        C0487q c0487q = this.f1222a;
        long j5 = this.f1223b;
        c0487q.getClass();
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
        }
        long j6 = j2 + j5;
        long j7 = j5;
        while (true) {
            if (j7 >= j6) {
                break;
            }
            C0495y m1270v = sink.m1270v(1);
            byte[] array = m1270v.f1252a;
            int r13 = m1270v.f1254c;
            int min = (int) Math.min(j6 - j7, 8192 - r13);
            synchronized (c0487q) {
                AbstractC2492i.m4915e(array, "array");
                c0487q.f1241d.seek(j7);
                r11 = 0;
                while (true) {
                    if (r11 >= min) {
                        break;
                    }
                    int read = c0487q.f1241d.read(array, r13, min - r11);
                    if (read != -1) {
                        r11 += read;
                    } else if (r11 == 0) {
                        r10 = -1;
                        r11 = -1;
                    }
                }
                r10 = -1;
            }
            if (r11 == r10) {
                if (m1270v.f1253b == m1270v.f1254c) {
                    sink.f1216a = m1270v.m1304a();
                    AbstractC0496z.m1308a(m1270v);
                }
                if (j5 == j7) {
                    j4 = -1;
                    j3 = -1;
                }
            } else {
                m1270v.f1254c += r11;
                long j8 = r11;
                j7 += j8;
                sink.f1217b += j8;
            }
        }
        j3 = j7 - j5;
        j4 = -1;
        if (j3 != j4) {
            this.f1223b += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1224c) {
            return;
        }
        this.f1224c = true;
        C0487q c0487q = this.f1222a;
        ReentrantLock reentrantLock = c0487q.f1240c;
        reentrantLock.lock();
        try {
            int r2 = c0487q.f1239b - 1;
            c0487q.f1239b = r2;
            if (r2 == 0) {
                if (c0487q.f1238a) {
                    synchronized (c0487q) {
                        c0487q.f1241d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return C0469F.f1191d;
    }
}
