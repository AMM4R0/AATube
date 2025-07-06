package p002A1;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC2492i;
import p036M1.AbstractC0379e;
import p108m1.AbstractC2651a;
import p108m1.C2666p;
import p140x1.C2893e;
import p145z1.C2924g;
import p145z1.C2925h;

/* renamed from: A1.g */
/* loaded from: classes.dex */
public final class C0014g extends AbstractC2651a {

    /* renamed from: a */
    public final /* synthetic */ C0015h f22a;

    public C0014g(C0015h c0015h) {
        this.f22a = c0015h;
    }

    @Override // p108m1.AbstractC2651a
    /* renamed from: a */
    public final int mo98a() {
        return ((Matcher) this.f22a.f25b).groupCount() + 1;
    }

    /* renamed from: b */
    public final C0011d m99b(int r4) {
        C0015h c0015h = this.f22a;
        Matcher matcher = (Matcher) c0015h.f25b;
        C2893e m1069E = AbstractC0379e.m1069E(matcher.start(r4), matcher.end(r4));
        if (m1069E.f9519a < 0) {
            return null;
        }
        String group = ((Matcher) c0015h.f25b).group(r4);
        AbstractC2492i.m4914d(group, "group(...)");
        return new C0011d(group, m1069E);
    }

    @Override // p108m1.AbstractC2651a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C0011d) {
            return super.contains((C0011d) obj);
        }
        return false;
    }

    @Override // p108m1.AbstractC2651a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2924g(new C2925h(new C2666p(0, new C2893e(0, mo98a() - 1, 1)), new C0013f(0, this)));
    }
}
