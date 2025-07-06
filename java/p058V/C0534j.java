package p058V;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0620j;

/* renamed from: V.j */
/* loaded from: classes.dex */
public final class C0534j implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f1455a;

    public C0534j(TransformationMethod transformationMethod) {
        this.f1455a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1455a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0620j.m1629a().m1630b() != 1) {
            return charSequence;
        }
        C0620j m1629a = C0620j.m1629a();
        m1629a.getClass();
        return m1629a.m1633e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int r10, Rect rect) {
        TransformationMethod transformationMethod = this.f1455a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, r10, rect);
        }
    }
}
