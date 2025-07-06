package p109n;

import java.util.Iterator;

/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C2673b extends AbstractC2676e implements Iterator {

    /* renamed from: a */
    public C2674c f8611a;

    /* renamed from: b */
    public C2674c f8612b;

    /* renamed from: c */
    public final /* synthetic */ int f8613c;

    public C2673b(C2674c c2674c, C2674c c2674c2, int r3) {
        this.f8613c = r3;
        this.f8611a = c2674c2;
        this.f8612b = c2674c;
    }

    @Override // p109n.AbstractC2676e
    /* renamed from: a */
    public final void mo5133a(C2674c c2674c) {
        C2674c c2674c2;
        C2674c c2674c3 = null;
        if (this.f8611a == c2674c && c2674c == this.f8612b) {
            this.f8612b = null;
            this.f8611a = null;
        }
        C2674c c2674c4 = this.f8611a;
        if (c2674c4 == c2674c) {
            switch (this.f8613c) {
                case 0:
                    c2674c2 = c2674c4.f8617d;
                    break;
                default:
                    c2674c2 = c2674c4.f8616c;
                    break;
            }
            this.f8611a = c2674c2;
        }
        C2674c c2674c5 = this.f8612b;
        if (c2674c5 == c2674c) {
            C2674c c2674c6 = this.f8611a;
            if (c2674c5 != c2674c6 && c2674c6 != null) {
                c2674c3 = m5134b(c2674c5);
            }
            this.f8612b = c2674c3;
        }
    }

    /* renamed from: b */
    public final C2674c m5134b(C2674c c2674c) {
        switch (this.f8613c) {
            case 0:
                return c2674c.f8616c;
            default:
                return c2674c.f8617d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8612b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2674c c2674c = this.f8612b;
        C2674c c2674c2 = this.f8611a;
        this.f8612b = (c2674c == c2674c2 || c2674c2 == null) ? null : m5134b(c2674c);
        return c2674c;
    }
}
