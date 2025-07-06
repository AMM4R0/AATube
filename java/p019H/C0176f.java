package p019H;

import java.util.ArrayList;
import p010D0.C0113k;
import p112o.C2691k;

/* renamed from: H.f */
/* loaded from: classes.dex */
public final class C0176f {

    /* renamed from: a */
    public final /* synthetic */ int f553a;

    /* renamed from: b */
    public final /* synthetic */ Object f554b;

    public /* synthetic */ C0176f(int r12, Object obj) {
        this.f553a = r12;
        this.f554b = obj;
    }

    /* renamed from: a */
    public final void m537a(Object obj) {
        switch (this.f553a) {
            case 0:
                C0177g c0177g = (C0177g) obj;
                if (c0177g == null) {
                    c0177g = new C0177g(-3);
                }
                ((C0113k) this.f554b).m384h(c0177g);
                return;
            default:
                C0177g c0177g2 = (C0177g) obj;
                synchronized (AbstractC0178h.f559c) {
                    try {
                        C2691k c2691k = AbstractC0178h.f560d;
                        ArrayList arrayList = (ArrayList) c2691k.getOrDefault((String) this.f554b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c2691k.remove((String) this.f554b);
                        for (int r02 = 0; r02 < arrayList.size(); r02++) {
                            ((C0176f) arrayList.get(r02)).m537a(c0177g2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
