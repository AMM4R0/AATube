package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import kotlin.jvm.internal.C2497n;
import p016F1.C0135c;
import p036M1.C0389o;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.l */
/* loaded from: classes.dex */
public final class C0252l extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ int f749e;

    /* renamed from: f */
    public final /* synthetic */ Object f750f;

    /* renamed from: g */
    public final /* synthetic */ Object f751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0252l(Object obj, int r2, Object obj2) {
        super(0);
        this.f749e = r2;
        this.f750f = obj;
        this.f751g = obj2;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        long m651a;
        C0234B[] c0234bArr;
        int r02 = 0;
        switch (this.f749e) {
            case 0:
                C0259s c0259s = (C0259s) this.f750f;
                c0259s.f771a.mo517a(c0259s, (C0239G) ((C2497n) this.f751g).f8174a);
                return C2636g.f8557a;
            case 1:
                try {
                    ((C0259s) this.f750f).f771a.mo518c((C0234B) this.f751g);
                } catch (IOException e2) {
                    C0389o c0389o = C0389o.f1050a;
                    C0389o c0389o2 = C0389o.f1050a;
                    String str = "Http2Connection.Listener failure for " + ((C0259s) this.f750f).f773c;
                    c0389o2.getClass();
                    C0389o.m1140i(str, 4, e2);
                    try {
                        ((C0234B) this.f751g).m632c(EnumC0242b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
                return C2636g.f8557a;
            default:
                C0254n c0254n = (C0254n) this.f750f;
                C0239G c0239g = (C0239G) this.f751g;
                c0254n.getClass();
                C2497n c2497n = new C2497n();
                C0259s c0259s2 = c0254n.f756b;
                synchronized (c0259s2.f794x) {
                    synchronized (c0259s2) {
                        try {
                            C0239G c0239g2 = c0259s2.f789s;
                            C0239G c0239g3 = new C0239G();
                            c0239g3.m652b(c0239g2);
                            c0239g3.m652b(c0239g);
                            c2497n.f8174a = c0239g3;
                            m651a = c0239g3.m651a() - c0239g2.m651a();
                            if (m651a != 0 && !c0259s2.f772b.isEmpty()) {
                                c0234bArr = (C0234B[]) c0259s2.f772b.values().toArray(new C0234B[0]);
                                C0239G c0239g4 = (C0239G) c2497n.f8174a;
                                AbstractC2492i.m4915e(c0239g4, "<set-?>");
                                c0259s2.f789s = c0239g4;
                                C0135c.m427c(c0259s2.f780j, c0259s2.f773c + " onSettings", new C0252l(c0259s2, r02, c2497n));
                            }
                            c0234bArr = null;
                            C0239G c0239g42 = (C0239G) c2497n.f8174a;
                            AbstractC2492i.m4915e(c0239g42, "<set-?>");
                            c0259s2.f789s = c0239g42;
                            C0135c.m427c(c0259s2.f780j, c0259s2.f773c + " onSettings", new C0252l(c0259s2, r02, c2497n));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c0259s2.f794x.m642b((C0239G) c2497n.f8174a);
                    } catch (IOException e3) {
                        c0259s2.m671g(e3);
                    }
                }
                if (c0234bArr != null) {
                    int length = c0234bArr.length;
                    while (r02 < length) {
                        C0234B c0234b = c0234bArr[r02];
                        synchronized (c0234b) {
                            c0234b.f680e += m651a;
                            if (m651a > 0) {
                                c0234b.notifyAll();
                            }
                        }
                        r02++;
                    }
                }
                return C2636g.f8557a;
        }
    }
}
