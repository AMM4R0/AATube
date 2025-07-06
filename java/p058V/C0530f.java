package p058V;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p036M1.AbstractC0387m;

/* renamed from: V.f */
/* loaded from: classes.dex */
public final class C0530f extends AbstractC0387m {

    /* renamed from: e */
    public final TextView f1446e;

    /* renamed from: f */
    public final C0528d f1447f;

    /* renamed from: g */
    public boolean f1448g = true;

    public C0530f(TextView textView) {
        this.f1446e = textView;
        this.f1447f = new C0528d(textView);
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: C */
    public final boolean mo1128C() {
        return this.f1448g;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: L */
    public final void mo1133L(boolean z2) {
        if (z2) {
            TextView textView = this.f1446e;
            textView.setTransformationMethod(mo1135Q(textView.getTransformationMethod()));
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: M */
    public final void mo1134M(boolean z2) {
        this.f1448g = z2;
        TextView textView = this.f1446e;
        textView.setTransformationMethod(mo1135Q(textView.getTransformationMethod()));
        textView.setFilters(mo1139u(textView.getFilters()));
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: Q */
    public final TransformationMethod mo1135Q(TransformationMethod transformationMethod) {
        return this.f1448g ? ((transformationMethod instanceof C0534j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0534j(transformationMethod) : transformationMethod instanceof C0534j ? ((C0534j) transformationMethod).f1455a : transformationMethod;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: u */
    public final InputFilter[] mo1139u(InputFilter[] inputFilterArr) {
        if (!this.f1448g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int r2 = 0; r2 < inputFilterArr.length; r2++) {
                InputFilter inputFilter = inputFilterArr[r2];
                if (inputFilter instanceof C0528d) {
                    sparseArray.put(r2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int r4 = 0;
            for (int r12 = 0; r12 < length; r12++) {
                if (sparseArray.indexOfKey(r12) < 0) {
                    inputFilterArr2[r4] = inputFilterArr[r12];
                    r4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int r3 = 0;
        while (true) {
            C0528d c0528d = this.f1447f;
            if (r3 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0528d;
                return inputFilterArr3;
            }
            if (inputFilterArr[r3] == c0528d) {
                return inputFilterArr;
            }
            r3++;
        }
    }
}
