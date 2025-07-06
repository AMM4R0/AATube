package p018G1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A.AbstractC0002c;
import p008C1.C0070b;
import p008C1.C0076h;
import p008C1.C0083o;
import p011D1.AbstractC0122i;
import p016F1.C0134b;
import p016F1.C0135c;
import p016F1.C0136d;
import p036M1.C0389o;
import p108m1.C2669s;

/* renamed from: G1.o */
/* loaded from: classes.dex */
public final class C0164o {

    /* renamed from: a */
    public final int f505a;

    /* renamed from: b */
    public final C0070b f506b;

    /* renamed from: c */
    public final long f507c;

    /* renamed from: e */
    public final C0135c f509e;

    /* renamed from: d */
    public volatile Map f508d = C2669s.f8608a;

    /* renamed from: f */
    public final C0134b f510f = new C0134b(this, AbstractC0002c.m17l(new StringBuilder(), AbstractC0122i.f370c, " ConnectionPool connection closer"));

    /* renamed from: g */
    public final ConcurrentLinkedQueue f511g = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(C0164o.class, Map.class, "d");
    }

    public C0164o(C0136d c0136d, int r2, long j2, TimeUnit timeUnit, C0070b c0070b, C0076h c0076h) {
        this.f505a = r2;
        this.f506b = c0070b;
        this.f507c = timeUnit.toNanos(j2);
        this.f509e = c0136d.m437e();
        if (j2 <= 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("keepAliveDuration <= 0: ", j2).toString());
        }
    }

    /* renamed from: a */
    public final int m523a(C0163n c0163n, long j2) {
        C0083o c0083o = AbstractC0122i.f368a;
        ArrayList arrayList = c0163n.f503t;
        int r2 = 0;
        while (r2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(r2);
            if (reference.get() != null) {
                r2++;
            } else {
                String str = "A connection to " + c0163n.f487d.f129a.f147h + " was leaked. Did you forget to close a response body?";
                C0389o c0389o = C0389o.f1050a;
                C0389o.f1050a.mo1063j(((C0160k) reference).f468a, str);
                arrayList.remove(r2);
                if (arrayList.isEmpty()) {
                    c0163n.f504u = j2 - this.f507c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
