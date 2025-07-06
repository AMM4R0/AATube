package p088h1;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p081e1.C0880f;
import p081e1.C0885k;

/* renamed from: h1.f */
/* loaded from: classes.dex */
public final class C0926f extends C0880f {

    /* renamed from: q */
    public final RectF f3856q;

    public C0926f(C0885k c0885k, RectF rectF) {
        super(c0885k);
        this.f3856q = rectF;
    }

    @Override // p081e1.C0880f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0927g c0927g = new C0927g(this);
        c0927g.f3858x = this;
        c0927g.invalidateSelf();
        return c0927g;
    }

    public C0926f(C0926f c0926f) {
        super(c0926f);
        this.f3856q = c0926f.f3856q;
    }
}
