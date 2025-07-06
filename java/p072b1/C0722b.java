package p072b1;

import android.graphics.Typeface;
import android.support.v4.media.session.AbstractC0580g;
import p003B.AbstractC0028b;

/* renamed from: b1.b */
/* loaded from: classes.dex */
public final class C0722b extends AbstractC0028b {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0580g f2593h;

    /* renamed from: i */
    public final /* synthetic */ C0724d f2594i;

    public C0722b(C0724d c0724d, AbstractC0580g abstractC0580g) {
        this.f2594i = c0724d;
        this.f2593h = abstractC0580g;
    }

    @Override // p003B.AbstractC0028b
    /* renamed from: j */
    public final void mo174j(int r3) {
        this.f2594i.f2611m = true;
        this.f2593h.mo1350r(r3);
    }

    @Override // p003B.AbstractC0028b
    /* renamed from: k */
    public final void mo175k(Typeface typeface) {
        C0724d c0724d = this.f2594i;
        c0724d.f2612n = Typeface.create(typeface, c0724d.f2601c);
        c0724d.f2611m = true;
        this.f2593h.mo1351s(c0724d.f2612n, false);
    }
}
