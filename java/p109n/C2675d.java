package p109n;

import java.util.Iterator;

/* renamed from: n.d */
/* loaded from: classes.dex */
public final class C2675d extends AbstractC2676e implements Iterator {

    /* renamed from: a */
    public C2674c f8618a;

    /* renamed from: b */
    public boolean f8619b = true;

    /* renamed from: c */
    public final /* synthetic */ C2677f f8620c;

    public C2675d(C2677f c2677f) {
        this.f8620c = c2677f;
    }

    @Override // p109n.AbstractC2676e
    /* renamed from: a */
    public final void mo5133a(C2674c c2674c) {
        C2674c c2674c2 = this.f8618a;
        if (c2674c == c2674c2) {
            C2674c c2674c3 = c2674c2.f8617d;
            this.f8618a = c2674c3;
            this.f8619b = c2674c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8619b) {
            return this.f8620c.f8621a != null;
        }
        C2674c c2674c = this.f8618a;
        return (c2674c == null || c2674c.f8616c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8619b) {
            this.f8619b = false;
            this.f8618a = this.f8620c.f8621a;
        } else {
            C2674c c2674c = this.f8618a;
            this.f8618a = c2674c != null ? c2674c.f8616c : null;
        }
        return this.f8618a;
    }
}
