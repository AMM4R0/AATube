package p081e1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: e1.q */
/* loaded from: classes.dex */
public final class C0891q extends AbstractC0893s {

    /* renamed from: h */
    public static final RectF f3725h = new RectF();

    /* renamed from: b */
    public final float f3726b;

    /* renamed from: c */
    public final float f3727c;

    /* renamed from: d */
    public final float f3728d;

    /* renamed from: e */
    public final float f3729e;

    /* renamed from: f */
    public float f3730f;

    /* renamed from: g */
    public float f3731g;

    public C0891q(float f, float f2, float f3, float f4) {
        this.f3726b = f;
        this.f3727c = f2;
        this.f3728d = f3;
        this.f3729e = f4;
    }

    @Override // p081e1.AbstractC0893s
    /* renamed from: a */
    public final void mo2422a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3734a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f3725h;
        rectF.set(this.f3726b, this.f3727c, this.f3728d, this.f3729e);
        path.arcTo(rectF, this.f3730f, this.f3731g, false);
        path.transform(matrix);
    }
}
