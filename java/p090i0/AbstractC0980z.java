package p090i0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: i0.z */
/* loaded from: classes.dex */
public abstract class AbstractC0980z {
    /* renamed from: a */
    public static void m2603a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m2604b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m2605c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
