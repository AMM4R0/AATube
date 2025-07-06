package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: J1.i */
/* loaded from: classes.dex */
public final class C0249i extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ C0259s f746e;

    /* renamed from: f */
    public final /* synthetic */ long f747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249i(C0259s c0259s, long j2) {
        super(0);
        this.f746e = c0259s;
        this.f747f = j2;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        boolean z2;
        C0259s c0259s = this.f746e;
        synchronized (c0259s) {
            long j2 = c0259s.f783m;
            long j3 = c0259s.f782l;
            if (j2 < j3) {
                z2 = true;
            } else {
                c0259s.f782l = j3 + 1;
                z2 = false;
            }
        }
        if (z2) {
            this.f746e.m671g(null);
            return -1L;
        }
        C0259s c0259s2 = this.f746e;
        c0259s2.getClass();
        try {
            c0259s2.f794x.m647k(1, 0, false);
        } catch (IOException e2) {
            c0259s2.m671g(e2);
        }
        return Long.valueOf(this.f747f);
    }
}
