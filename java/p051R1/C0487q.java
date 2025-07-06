package p051R1;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: R1.q */
/* loaded from: classes.dex */
public final class C0487q implements Closeable {

    /* renamed from: a */
    public boolean f1238a;

    /* renamed from: b */
    public int f1239b;

    /* renamed from: c */
    public final ReentrantLock f1240c = new ReentrantLock();

    /* renamed from: d */
    public final RandomAccessFile f1241d;

    public C0487q(RandomAccessFile randomAccessFile) {
        this.f1241d = randomAccessFile;
    }

    /* renamed from: b */
    public final long m1282b() {
        long length;
        ReentrantLock reentrantLock = this.f1240c;
        reentrantLock.lock();
        try {
            if (this.f1238a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f1241d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f1240c;
        reentrantLock.lock();
        try {
            if (this.f1238a) {
                return;
            }
            this.f1238a = true;
            if (this.f1239b != 0) {
                return;
            }
            synchronized (this) {
                this.f1241d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final C0481k m1283g(long j2) {
        ReentrantLock reentrantLock = this.f1240c;
        reentrantLock.lock();
        try {
            if (this.f1238a) {
                throw new IllegalStateException("closed");
            }
            this.f1239b++;
            reentrantLock.unlock();
            return new C0481k(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
