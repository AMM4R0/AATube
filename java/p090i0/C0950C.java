package p090i0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p036M1.AbstractC0379e;

/* renamed from: i0.C */
/* loaded from: classes.dex */
public class C0950C extends AbstractC0379e {

    /* renamed from: f */
    public static boolean f3970f = true;

    /* renamed from: g */
    public static boolean f3971g = true;

    /* renamed from: h */
    public static boolean f3972h = true;

    /* renamed from: i */
    public static boolean f3973i = true;

    @Override // p036M1.AbstractC0379e
    /* renamed from: B */
    public void mo1090B(View view, int r4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1090B(view, r4);
        } else if (f3973i) {
            try {
                AbstractC0949B.m2527a(view, r4);
            } catch (NoSuchMethodError unused) {
                f3973i = false;
            }
        }
    }

    /* renamed from: F */
    public void mo2528F(View view, int r3, int r4, int r5, int r6) {
        if (f3972h) {
            try {
                AbstractC0948A.m2526a(view, r3, r4, r5, r6);
            } catch (NoSuchMethodError unused) {
                f3972h = false;
            }
        }
    }

    /* renamed from: G */
    public void mo2529G(View view, Matrix matrix) {
        if (f3970f) {
            try {
                AbstractC0980z.m2604b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3970f = false;
            }
        }
    }

    /* renamed from: H */
    public void mo2530H(View view, Matrix matrix) {
        if (f3971g) {
            try {
                AbstractC0980z.m2605c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3971g = false;
            }
        }
    }
}
