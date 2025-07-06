package p051R1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: R1.z */
/* loaded from: classes.dex */
public abstract class AbstractC0496z {

    /* renamed from: a */
    public static final C0495y f1259a = new C0495y(new byte[0], 0, 0, false);

    /* renamed from: b */
    public static final int f1260b;

    /* renamed from: c */
    public static final AtomicReference[] f1261c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1260b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int r12 = 0; r12 < highestOneBit; r12++) {
            atomicReferenceArr[r12] = new AtomicReference();
        }
        f1261c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m1308a(C0495y segment) {
        AbstractC2492i.m4915e(segment, "segment");
        if (segment.f1257f != null || segment.f1258g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f1255d) {
            return;
        }
        AtomicReference atomicReference = f1261c[(int) (Thread.currentThread().getId() & (f1260b - 1))];
        C0495y c0495y = f1259a;
        C0495y c0495y2 = (C0495y) atomicReference.getAndSet(c0495y);
        if (c0495y2 == c0495y) {
            return;
        }
        int r3 = c0495y2 != null ? c0495y2.f1254c : 0;
        if (r3 >= 65536) {
            atomicReference.set(c0495y2);
            return;
        }
        segment.f1257f = c0495y2;
        segment.f1253b = 0;
        segment.f1254c = r3 + 8192;
        atomicReference.set(segment);
    }

    /* renamed from: b */
    public static final C0495y m1309b() {
        AtomicReference atomicReference = f1261c[(int) (Thread.currentThread().getId() & (f1260b - 1))];
        C0495y c0495y = f1259a;
        C0495y c0495y2 = (C0495y) atomicReference.getAndSet(c0495y);
        if (c0495y2 == c0495y) {
            return new C0495y();
        }
        if (c0495y2 == null) {
            atomicReference.set(null);
            return new C0495y();
        }
        atomicReference.set(c0495y2.f1257f);
        c0495y2.f1257f = null;
        c0495y2.f1254c = 0;
        return c0495y2;
    }
}
