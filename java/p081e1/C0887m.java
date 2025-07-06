package p081e1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p006C.C0055g;
import p036M1.AbstractC0379e;

/* renamed from: e1.m */
/* loaded from: classes.dex */
public final class C0887m {

    /* renamed from: a */
    public final C0895u[] f3707a = new C0895u[4];

    /* renamed from: b */
    public final Matrix[] f3708b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f3709c = new Matrix[4];

    /* renamed from: d */
    public final PointF f3710d = new PointF();

    /* renamed from: e */
    public final Path f3711e = new Path();

    /* renamed from: f */
    public final Path f3712f = new Path();

    /* renamed from: g */
    public final C0895u f3713g = new C0895u();

    /* renamed from: h */
    public final float[] f3714h = new float[2];

    /* renamed from: i */
    public final float[] f3715i = new float[2];

    /* renamed from: j */
    public final Path f3716j = new Path();

    /* renamed from: k */
    public final Path f3717k = new Path();

    /* renamed from: l */
    public final boolean f3718l = true;

    public C0887m() {
        for (int r12 = 0; r12 < 4; r12++) {
            this.f3707a[r12] = new C0895u();
            this.f3708b[r12] = new Matrix();
            this.f3709c[r12] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void m2418a(C0885k c0885k, float f, RectF rectF, C0055g c0055g, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0895u[] c0895uArr;
        int r13;
        float[] fArr;
        int r17;
        C0887m c0887m = this;
        path.rewind();
        Path path2 = c0887m.f3711e;
        path2.rewind();
        Path path3 = c0887m.f3712f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int r8 = 0;
        while (true) {
            matrixArr = c0887m.f3709c;
            matrixArr2 = c0887m.f3708b;
            c0895uArr = c0887m.f3707a;
            r13 = 4;
            fArr = c0887m.f3714h;
            if (r8 >= 4) {
                break;
            }
            InterfaceC0877c interfaceC0877c = r8 != 1 ? r8 != 2 ? r8 != 3 ? c0885k.f3699f : c0885k.f3698e : c0885k.f3701h : c0885k.f3700g;
            AbstractC0379e abstractC0379e = r8 != 1 ? r8 != 2 ? r8 != 3 ? c0885k.f3695b : c0885k.f3694a : c0885k.f3697d : c0885k.f3696c;
            C0895u c0895u = c0895uArr[r8];
            abstractC0379e.getClass();
            abstractC0379e.mo1091q(c0895u, f, interfaceC0877c.mo2392a(rectF));
            int r132 = r8 + 1;
            float f2 = (r132 % 4) * 90;
            matrixArr2[r8].reset();
            PointF pointF = c0887m.f3710d;
            if (r8 == 1) {
                r17 = r132;
                pointF.set(rectF.right, rectF.bottom);
            } else if (r8 == 2) {
                r17 = r132;
                pointF.set(rectF.left, rectF.bottom);
            } else if (r8 != 3) {
                r17 = r132;
                pointF.set(rectF.right, rectF.top);
            } else {
                r17 = r132;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[r8].setTranslate(pointF.x, pointF.y);
            matrixArr2[r8].preRotate(f2);
            C0895u c0895u2 = c0895uArr[r8];
            fArr[0] = c0895u2.f3738b;
            fArr[1] = c0895u2.f3739c;
            matrixArr2[r8].mapPoints(fArr);
            matrixArr[r8].reset();
            matrixArr[r8].setTranslate(fArr[0], fArr[1]);
            matrixArr[r8].preRotate(f2);
            r8 = r17;
        }
        int r82 = 0;
        while (r82 < r13) {
            C0895u c0895u3 = c0895uArr[r82];
            c0895u3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c0895u3.f3737a;
            matrixArr2[r82].mapPoints(fArr);
            if (r82 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c0895uArr[r82].m2424b(matrixArr2[r82], path);
            if (c0055g != null) {
                C0895u c0895u4 = c0895uArr[r82];
                Matrix matrix = matrixArr2[r82];
                C0881g c0881g = (C0881g) c0055g.f107b;
                BitSet bitSet = c0881g.f3662d;
                c0895u4.getClass();
                bitSet.set(r82, false);
                c0895u4.m2423a(c0895u4.f3741e);
                c0881g.f3660b[r82] = new C0888n(new ArrayList(c0895u4.f3743g), new Matrix(matrix));
            }
            int r133 = r82 + 1;
            int r2 = r133 % 4;
            C0895u c0895u5 = c0895uArr[r82];
            fArr[0] = c0895u5.f3738b;
            fArr[1] = c0895u5.f3739c;
            matrixArr2[r82].mapPoints(fArr);
            C0895u c0895u6 = c0895uArr[r2];
            c0895u6.getClass();
            float[] fArr2 = c0887m.f3715i;
            fArr2[0] = 0.0f;
            fArr2[1] = c0895u6.f3737a;
            matrixArr2[r2].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C0895u c0895u7 = c0895uArr[r82];
            fArr[0] = c0895u7.f3738b;
            fArr[1] = c0895u7.f3739c;
            matrixArr2[r82].mapPoints(fArr);
            if (r82 == 1 || r82 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0895u c0895u8 = c0887m.f3713g;
            c0895u8.m2426d(0.0f, 270.0f, 0.0f);
            (r82 != 1 ? r82 != 2 ? r82 != 3 ? c0885k.f3703j : c0885k.f3702i : c0885k.f3705l : c0885k.f3704k).getClass();
            c0895u8.m2425c(max, 0.0f);
            Path path4 = c0887m.f3716j;
            path4.reset();
            c0895u8.m2424b(matrixArr[r82], path4);
            if (c0887m.f3718l && (c0887m.m2419b(path4, r82) || c0887m.m2419b(path4, r2))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c0895u8.f3737a;
                matrixArr[r82].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0895u8.m2424b(matrixArr[r82], path2);
            } else {
                c0895u8.m2424b(matrixArr[r82], path);
            }
            if (c0055g != null) {
                Matrix matrix2 = matrixArr[r82];
                C0881g c0881g2 = (C0881g) c0055g.f107b;
                c0881g2.f3662d.set(r82 + 4, false);
                c0895u8.m2423a(c0895u8.f3741e);
                c0881g2.f3661c[r82] = new C0888n(new ArrayList(c0895u8.f3743g), new Matrix(matrix2));
            }
            r13 = 4;
            c0887m = this;
            r82 = r133;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m2419b(Path path, int r5) {
        Path path2 = this.f3717k;
        path2.reset();
        this.f3707a[r5].m2424b(this.f3708b[r5], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
