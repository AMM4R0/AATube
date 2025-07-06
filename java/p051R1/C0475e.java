package p051R1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2492i;
import p124s0.C2738i;

/* renamed from: R1.e */
/* loaded from: classes.dex */
public class C0475e extends C0469F {

    /* renamed from: h */
    public static final ReentrantLock f1206h;

    /* renamed from: i */
    public static final Condition f1207i;

    /* renamed from: j */
    public static final long f1208j;

    /* renamed from: k */
    public static final long f1209k;

    /* renamed from: l */
    public static C0475e f1210l;

    /* renamed from: e */
    public int f1211e;

    /* renamed from: f */
    public C0475e f1212f;

    /* renamed from: g */
    public long f1213g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f1206h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC2492i.m4914d(newCondition, "newCondition(...)");
        f1207i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f1208j = millis;
        f1209k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: h */
    public final void m1243h() {
        long j2 = this.f1194c;
        boolean z2 = this.f1192a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = f1206h;
            reentrantLock.lock();
            try {
                if (this.f1211e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f1211e = 1;
                C2738i.m5331b(this, j2, z2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: i */
    public final boolean m1244i() {
        ReentrantLock reentrantLock = f1206h;
        reentrantLock.lock();
        try {
            int r12 = this.f1211e;
            this.f1211e = 0;
            if (r12 != 1) {
                return r12 == 2;
            }
            C0475e c0475e = f1210l;
            while (c0475e != null) {
                C0475e c0475e2 = c0475e.f1212f;
                if (c0475e2 == this) {
                    c0475e.f1212f = this.f1212f;
                    this.f1212f = null;
                    return false;
                }
                c0475e = c0475e2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public void mo508j() {
    }
}
