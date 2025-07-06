package p126t;

import java.util.ArrayList;

/* renamed from: t.l */
/* loaded from: classes.dex */
public final class C2760l {

    /* renamed from: a */
    public AbstractC2763o f9040a;

    /* renamed from: b */
    public ArrayList f9041b;

    /* renamed from: a */
    public static long m5374a(C2754f c2754f, long j2) {
        AbstractC2763o abstractC2763o = c2754f.f9028d;
        if (abstractC2763o instanceof C2758j) {
            return j2;
        }
        ArrayList arrayList = c2754f.f9035k;
        int size = arrayList.size();
        long j3 = j2;
        for (int r3 = 0; r3 < size; r3++) {
            InterfaceC2752d interfaceC2752d = (InterfaceC2752d) arrayList.get(r3);
            if (interfaceC2752d instanceof C2754f) {
                C2754f c2754f2 = (C2754f) interfaceC2752d;
                if (c2754f2.f9028d != abstractC2763o) {
                    j3 = Math.min(j3, m5374a(c2754f2, c2754f2.f9030f + j2));
                }
            }
        }
        if (c2754f != abstractC2763o.f9058i) {
            return j3;
        }
        long mo5347j = abstractC2763o.mo5347j();
        long j4 = j2 - mo5347j;
        return Math.min(Math.min(j3, m5374a(abstractC2763o.f9057h, j4)), j4 - r9.f9030f);
    }

    /* renamed from: b */
    public static long m5375b(C2754f c2754f, long j2) {
        AbstractC2763o abstractC2763o = c2754f.f9028d;
        if (abstractC2763o instanceof C2758j) {
            return j2;
        }
        ArrayList arrayList = c2754f.f9035k;
        int size = arrayList.size();
        long j3 = j2;
        for (int r3 = 0; r3 < size; r3++) {
            InterfaceC2752d interfaceC2752d = (InterfaceC2752d) arrayList.get(r3);
            if (interfaceC2752d instanceof C2754f) {
                C2754f c2754f2 = (C2754f) interfaceC2752d;
                if (c2754f2.f9028d != abstractC2763o) {
                    j3 = Math.max(j3, m5375b(c2754f2, c2754f2.f9030f + j2));
                }
            }
        }
        if (c2754f != abstractC2763o.f9057h) {
            return j3;
        }
        long mo5347j = abstractC2763o.mo5347j();
        long j4 = j2 + mo5347j;
        return Math.max(Math.max(j3, m5375b(abstractC2763o.f9058i, j4)), j4 - r9.f9030f);
    }
}
