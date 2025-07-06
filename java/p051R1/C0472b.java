package p051R1;

import java.util.concurrent.locks.ReentrantLock;
import p124s0.C2738i;

/* renamed from: R1.b */
/* loaded from: classes.dex */
public final class C0472b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0475e m5332d;
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C0475e.f1206h;
                reentrantLock = C0475e.f1206h;
                reentrantLock.lock();
                try {
                    m5332d = C2738i.m5332d();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (m5332d == C0475e.f1210l) {
                C0475e.f1210l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (m5332d != null) {
                    m5332d.mo508j();
                }
            }
        }
    }
}
