package p114o1;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public final class C2696a implements Comparator {

    /* renamed from: b */
    public static final C2696a f8690b = new C2696a(0);

    /* renamed from: c */
    public static final C2696a f8691c = new C2696a(1);

    /* renamed from: a */
    public final /* synthetic */ int f8692a;

    public /* synthetic */ C2696a(int r12) {
        this.f8692a = r12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8692a) {
            case 0:
                Comparable a2 = (Comparable) obj;
                Comparable b2 = (Comparable) obj2;
                AbstractC2492i.m4915e(a2, "a");
                AbstractC2492i.m4915e(b2, "b");
                return a2.compareTo(b2);
            default:
                Comparable a3 = (Comparable) obj;
                Comparable b3 = (Comparable) obj2;
                AbstractC2492i.m4915e(a3, "a");
                AbstractC2492i.m4915e(b3, "b");
                return b3.compareTo(a3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f8692a) {
            case 0:
                return f8691c;
            default:
                return f8690b;
        }
    }
}
