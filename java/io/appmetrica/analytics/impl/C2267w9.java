package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.w9 */
/* loaded from: classes.dex */
public final class C2267w9 {

    /* renamed from: a */
    public final ReentrantLock f7343a;

    /* renamed from: b */
    public final C1669Y9 f7344b;

    public C2267w9(Context context, String str) {
        this(new ReentrantLock(), new C1669Y9(context, str));
    }

    /* renamed from: a */
    public final void m4534a() {
        this.f7343a.lock();
        this.f7344b.m3536a();
    }

    /* renamed from: b */
    public final void m4535b() {
        this.f7344b.m3537b();
        this.f7343a.unlock();
    }

    /* renamed from: c */
    public final void m4536c() {
        C1669Y9 c1669y9 = this.f7344b;
        synchronized (c1669y9) {
            c1669y9.m3537b();
            c1669y9.f5725a.delete();
        }
        this.f7343a.unlock();
    }

    public C2267w9(ReentrantLock reentrantLock, C1669Y9 c1669y9) {
        this.f7343a = reentrantLock;
        this.f7344b = c1669y9;
    }
}
