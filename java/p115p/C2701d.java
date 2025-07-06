package p115p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p036M1.AbstractC0387m;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C2701d extends AbstractC0387m {

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f8708e;

    /* renamed from: f */
    public final AtomicReferenceFieldUpdater f8709f;

    /* renamed from: g */
    public final AtomicReferenceFieldUpdater f8710g;

    /* renamed from: h */
    public final AtomicReferenceFieldUpdater f8711h;

    /* renamed from: i */
    public final AtomicReferenceFieldUpdater f8712i;

    public C2701d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8708e = atomicReferenceFieldUpdater;
        this.f8709f = atomicReferenceFieldUpdater2;
        this.f8710g = atomicReferenceFieldUpdater3;
        this.f8711h = atomicReferenceFieldUpdater4;
        this.f8712i = atomicReferenceFieldUpdater5;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: J */
    public final void mo1131J(C2703f c2703f, C2703f c2703f2) {
        this.f8709f.lazySet(c2703f, c2703f2);
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: K */
    public final void mo1132K(C2703f c2703f, Thread thread) {
        this.f8708e.lazySet(c2703f, thread);
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: d */
    public final boolean mo1136d(AbstractFutureC2704g abstractFutureC2704g, C2700c c2700c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2700c c2700c2 = C2700c.f8706b;
        do {
            atomicReferenceFieldUpdater = this.f8711h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2704g, c2700c, c2700c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2704g) == c2700c);
        return false;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: e */
    public final boolean mo1137e(AbstractFutureC2704g abstractFutureC2704g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8712i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2704g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2704g) == obj);
        return false;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: f */
    public final boolean mo1138f(AbstractFutureC2704g abstractFutureC2704g, C2703f c2703f, C2703f c2703f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8710g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2704g, c2703f, c2703f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2704g) == c2703f);
        return false;
    }
}
