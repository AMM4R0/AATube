package p058V;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.C0620j;
import p036M1.AbstractC0387m;

/* renamed from: V.g */
/* loaded from: classes.dex */
public final class C0531g extends AbstractC0387m {

    /* renamed from: e */
    public final C0530f f1449e;

    public C0531g(TextView textView) {
        this.f1449e = new C0530f(textView);
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: C */
    public final boolean mo1128C() {
        return this.f1449e.f1448g;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: L */
    public final void mo1133L(boolean z2) {
        if (C0620j.f2070j != null) {
            this.f1449e.mo1133L(z2);
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: M */
    public final void mo1134M(boolean z2) {
        boolean z3 = C0620j.f2070j != null;
        C0530f c0530f = this.f1449e;
        if (z3) {
            c0530f.mo1134M(z2);
        } else {
            c0530f.f1448g = z2;
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: Q */
    public final TransformationMethod mo1135Q(TransformationMethod transformationMethod) {
        return !(C0620j.f2070j != null) ? transformationMethod : this.f1449e.mo1135Q(transformationMethod);
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: u */
    public final InputFilter[] mo1139u(InputFilter[] inputFilterArr) {
        return !(C0620j.f2070j != null) ? inputFilterArr : this.f1449e.mo1139u(inputFilterArr);
    }
}
