package p081e1;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: e1.r */
/* loaded from: classes.dex */
public final class C0892r extends AbstractC0893s {

    /* renamed from: b */
    public float f3732b;

    /* renamed from: c */
    public float f3733c;

    @Override // p081e1.AbstractC0893s
    /* renamed from: a */
    public final void mo2422a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3734a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3732b, this.f3733c);
        path.transform(matrix);
    }
}
