package p008C1;

import android.support.v4.media.session.AbstractC0580g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import p108m1.AbstractC2661k;
import p131u1.InterfaceC2799a;

/* renamed from: C1.d */
/* loaded from: classes.dex */
public final class C0072d extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ int f168e;

    /* renamed from: f */
    public final /* synthetic */ C0073e f169f;

    /* renamed from: g */
    public final /* synthetic */ Object f170g;

    /* renamed from: h */
    public final /* synthetic */ Object f171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0072d(C0073e c0073e, Object obj, Object obj2, int r4) {
        super(0);
        this.f168e = r4;
        this.f169f = c0073e;
        this.f170g = obj;
        this.f171h = obj2;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        switch (this.f168e) {
            case 0:
                AbstractC0580g abstractC0580g = this.f169f.f174b;
                List<Certificate> list = (List) this.f170g;
                if (abstractC0580g != null) {
                    list = abstractC0580g.mo1145h(list, (String) this.f171h);
                }
                ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(list));
                for (Certificate certificate : list) {
                    AbstractC2492i.m4913c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                AbstractC0580g abstractC0580g2 = this.f169f.f174b;
                AbstractC2492i.m4912b(abstractC0580g2);
                return abstractC0580g2.mo1145h(((C0082n) this.f170g).m273a(), ((C0069a) this.f171h).f147h.f242d);
        }
    }
}
