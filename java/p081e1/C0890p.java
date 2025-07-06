package p081e1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p078d1.C0782a;

/* renamed from: e1.p */
/* loaded from: classes.dex */
public final class C0890p extends AbstractC0894t {

    /* renamed from: c */
    public final C0892r f3722c;

    /* renamed from: d */
    public final float f3723d;

    /* renamed from: e */
    public final float f3724e;

    public C0890p(C0892r c0892r, float f, float f2) {
        this.f3722c = c0892r;
        this.f3723d = f;
        this.f3724e = f2;
    }

    @Override // p081e1.AbstractC0894t
    /* renamed from: a */
    public final void mo2420a(Matrix matrix, C0782a c0782a, int r20, Canvas canvas) {
        C0892r c0892r = this.f3722c;
        float f = c0892r.f3733c;
        float f2 = this.f3724e;
        float f3 = c0892r.f3732b;
        float f4 = this.f3723d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f3736a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m2421b());
        c0782a.getClass();
        rectF.bottom += r20;
        rectF.offset(0.0f, -r20);
        int[] r14 = C0782a.f3141i;
        r14[0] = c0782a.f3150f;
        r14[1] = c0782a.f3149e;
        r14[2] = c0782a.f3148d;
        Paint paint = c0782a.f3147c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, r14, C0782a.f3142j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m2421b() {
        C0892r c0892r = this.f3722c;
        return (float) Math.toDegrees(Math.atan((c0892r.f3733c - this.f3724e) / (c0892r.f3732b - this.f3723d)));
    }
}
