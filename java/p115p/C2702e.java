package p115p;

import p036M1.AbstractC0387m;

/* renamed from: p.e */
/* loaded from: classes.dex */
public final class C2702e extends AbstractC0387m {
    @Override // p036M1.AbstractC0387m
    /* renamed from: J */
    public final void mo1131J(C2703f c2703f, C2703f c2703f2) {
        c2703f.f8715b = c2703f2;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: K */
    public final void mo1132K(C2703f c2703f, Thread thread) {
        c2703f.f8714a = thread;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: d */
    public final boolean mo1136d(AbstractFutureC2704g abstractFutureC2704g, C2700c c2700c) {
        C2700c c2700c2 = C2700c.f8706b;
        synchronized (abstractFutureC2704g) {
            try {
                if (abstractFutureC2704g.f8721b != c2700c) {
                    return false;
                }
                abstractFutureC2704g.f8721b = c2700c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: e */
    public final boolean mo1137e(AbstractFutureC2704g abstractFutureC2704g, Object obj, Object obj2) {
        synchronized (abstractFutureC2704g) {
            try {
                if (abstractFutureC2704g.f8720a != obj) {
                    return false;
                }
                abstractFutureC2704g.f8720a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: f */
    public final boolean mo1138f(AbstractFutureC2704g abstractFutureC2704g, C2703f c2703f, C2703f c2703f2) {
        synchronized (abstractFutureC2704g) {
            try {
                if (abstractFutureC2704g.f8722c != c2703f) {
                    return false;
                }
                abstractFutureC2704g.f8722c = c2703f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
