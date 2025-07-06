package p054S1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.AbstractC0483m;
import p051R1.C0477g;
import p051R1.InterfaceC0467D;

/* renamed from: S1.e */
/* loaded from: classes.dex */
public final class C0506e extends AbstractC0483m {

    /* renamed from: b */
    public final long f1300b;

    /* renamed from: c */
    public final boolean f1301c;

    /* renamed from: d */
    public long f1302d;

    public C0506e(InterfaceC0467D interfaceC0467D, long j2, boolean z2) {
        super(interfaceC0467D);
        this.f1300b = j2;
        this.f1301c = z2;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        AbstractC2492i.m4915e(sink, "sink");
        long j3 = this.f1302d;
        long j4 = this.f1300b;
        if (j3 > j4) {
            j2 = 0;
        } else if (this.f1301c) {
            long j5 = j4 - j3;
            if (j5 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j5);
        }
        long mo390a = this.f1227a.mo390a(sink, j2);
        if (mo390a != -1) {
            this.f1302d += mo390a;
        }
        long j6 = this.f1302d;
        if ((j6 >= j4 || mo390a != -1) && j6 <= j4) {
            return mo390a;
        }
        if (mo390a > 0 && j6 > j4) {
            long j7 = sink.f1217b - (j6 - j4);
            C0477g c0477g = new C0477g();
            c0477g.m1273y(sink);
            sink.mo497e(c0477g, j7);
            c0477g.m1268t(c0477g.f1217b);
        }
        throw new IOException("expected " + j4 + " bytes but got " + this.f1302d);
    }
}
