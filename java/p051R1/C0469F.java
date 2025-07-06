package p051R1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: R1.F */
/* loaded from: classes.dex */
public class C0469F {

    /* renamed from: d */
    public static final C0468E f1191d = new C0468E();

    /* renamed from: a */
    public boolean f1192a;

    /* renamed from: b */
    public long f1193b;

    /* renamed from: c */
    public long f1194c;

    /* renamed from: a */
    public C0469F mo1237a() {
        this.f1192a = false;
        return this;
    }

    /* renamed from: b */
    public C0469F mo1238b() {
        this.f1194c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo1239c() {
        if (this.f1192a) {
            return this.f1193b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0469F mo1234d(long j2) {
        this.f1192a = true;
        this.f1193b = j2;
        return this;
    }

    /* renamed from: e */
    public boolean mo1240e() {
        return this.f1192a;
    }

    /* renamed from: f */
    public void mo1235f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1192a && this.f1193b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C0469F mo1236g(long j2, TimeUnit unit) {
        AbstractC2492i.m4915e(unit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("timeout < 0: ", j2).toString());
        }
        this.f1194c = unit.toNanos(j2);
        return this;
    }
}
