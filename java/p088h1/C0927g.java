package p088h1;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p081e1.C0881g;

/* renamed from: h1.g */
/* loaded from: classes.dex */
public final class C0927g extends C0881g {

    /* renamed from: y */
    public static final /* synthetic */ int f3857y = 0;

    /* renamed from: x */
    public C0926f f3858x;

    @Override // p081e1.C0881g
    /* renamed from: e */
    public final void mo2402e(Canvas canvas) {
        if (this.f3858x.f3856q.isEmpty()) {
            super.mo2402e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f3858x.f3856q);
        } else {
            canvas.clipRect(this.f3858x.f3856q, Region.Op.DIFFERENCE);
        }
        super.mo2402e(canvas);
        canvas.restore();
    }

    @Override // p081e1.C0881g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3858x = new C0926f(this.f3858x);
        return this;
    }

    /* renamed from: n */
    public final void m2481n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f3858x.f3856q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
