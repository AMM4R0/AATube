package p002A1;

import java.util.regex.Matcher;
import p108m1.AbstractC2654d;

/* renamed from: A1.e */
/* loaded from: classes.dex */
public final class C0012e extends AbstractC2654d {

    /* renamed from: a */
    public final /* synthetic */ C0015h f19a;

    public C0012e(C0015h c0015h) {
        this.f19a = c0015h;
    }

    @Override // p108m1.AbstractC2651a
    /* renamed from: a */
    public final int mo98a() {
        return ((Matcher) this.f19a.f25b).groupCount() + 1;
    }

    @Override // p108m1.AbstractC2651a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        String group = ((Matcher) this.f19a.f25b).group(r2);
        return group == null ? "" : group;
    }

    @Override // p108m1.AbstractC2654d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p108m1.AbstractC2654d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
