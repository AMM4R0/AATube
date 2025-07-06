package p109n;

import java.util.HashMap;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C2672a extends C2677f {

    /* renamed from: e */
    public final HashMap f8610e = new HashMap();

    @Override // p109n.C2677f
    /* renamed from: a */
    public final C2674c mo5131a(Object obj) {
        return (C2674c) this.f8610e.get(obj);
    }

    @Override // p109n.C2677f
    /* renamed from: b */
    public final Object mo5132b(Object obj) {
        Object mo5132b = super.mo5132b(obj);
        this.f8610e.remove(obj);
        return mo5132b;
    }
}
