package p081e1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p078d1.C0782a;

/* renamed from: e1.o */
/* loaded from: classes.dex */
public final class C0889o extends AbstractC0894t {

    /* renamed from: c */
    public final C0891q f3721c;

    public C0889o(C0891q c0891q) {
        this.f3721c = c0891q;
    }

    @Override // p081e1.AbstractC0894t
    /* renamed from: a */
    public final void mo2420a(Matrix matrix, C0782a c0782a, int r22, Canvas canvas) {
        C0891q c0891q = this.f3721c;
        float f = c0891q.f3730f;
        float f2 = c0891q.f3731g;
        RectF rectF = new RectF(c0891q.f3726b, c0891q.f3727c, c0891q.f3728d, c0891q.f3729e);
        c0782a.getClass();
        boolean z2 = f2 < 0.0f;
        Path path = c0782a.f3151g;
        int[] r16 = C0782a.f3143k;
        if (z2) {
            r16[0] = 0;
            r16[1] = c0782a.f3150f;
            r16[2] = c0782a.f3149e;
            r16[3] = c0782a.f3148d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -r22;
            rectF.inset(f3, f3);
            r16[0] = 0;
            r16[1] = c0782a.f3148d;
            r16[2] = c0782a.f3149e;
            r16[3] = c0782a.f3150f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (r22 / width);
        float[] fArr = C0782a.f3144l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, r16, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0782a.f3146b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0782a.f3152h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
