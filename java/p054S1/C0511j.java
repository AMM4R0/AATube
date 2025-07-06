package p054S1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import kotlin.jvm.internal.C2495l;
import kotlin.jvm.internal.C2496m;
import kotlin.jvm.internal.C2497n;
import p051R1.C0494x;
import p105l1.C2636g;
import p131u1.InterfaceC2814p;

/* renamed from: S1.j */
/* loaded from: classes.dex */
public final class C0511j extends AbstractC2493j implements InterfaceC2814p {

    /* renamed from: e */
    public final /* synthetic */ C2495l f1318e;

    /* renamed from: f */
    public final /* synthetic */ long f1319f;

    /* renamed from: g */
    public final /* synthetic */ C2496m f1320g;

    /* renamed from: h */
    public final /* synthetic */ C0494x f1321h;

    /* renamed from: i */
    public final /* synthetic */ C2496m f1322i;

    /* renamed from: j */
    public final /* synthetic */ C2496m f1323j;

    /* renamed from: k */
    public final /* synthetic */ C2497n f1324k;

    /* renamed from: l */
    public final /* synthetic */ C2497n f1325l;

    /* renamed from: m */
    public final /* synthetic */ C2497n f1326m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511j(C2495l c2495l, long j2, C2496m c2496m, C0494x c0494x, C2496m c2496m2, C2496m c2496m3, C2497n c2497n, C2497n c2497n2, C2497n c2497n3) {
        super(2);
        this.f1318e = c2495l;
        this.f1319f = j2;
        this.f1320g = c2496m;
        this.f1321h = c0494x;
        this.f1322i = c2496m2;
        this.f1323j = c2496m3;
        this.f1324k = c2497n;
        this.f1325l = c2497n2;
        this.f1326m = c2497n3;
    }

    @Override // p131u1.InterfaceC2814p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        C0494x c0494x = this.f1321h;
        if (intValue == 1) {
            C2495l c2495l = this.f1318e;
            if (c2495l.f8172a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c2495l.f8172a = true;
            if (longValue < this.f1319f) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C2496m c2496m = this.f1320g;
            long j2 = c2496m.f8173a;
            if (j2 == 4294967295L) {
                j2 = c0494x.m1296l();
            }
            c2496m.f8173a = j2;
            C2496m c2496m2 = this.f1322i;
            c2496m2.f8173a = c2496m2.f8173a == 4294967295L ? c0494x.m1296l() : 0L;
            C2496m c2496m3 = this.f1323j;
            c2496m3.f8173a = c2496m3.f8173a == 4294967295L ? c0494x.m1296l() : 0L;
        } else if (intValue == 10) {
            if (longValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            c0494x.m1303s(4L);
            AbstractC0503b.m1316e(c0494x, (int) (longValue - 4), new C0510i(this.f1324k, c0494x, this.f1325l, this.f1326m));
        }
        return C2636g.f8557a;
    }
}
