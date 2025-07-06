package p104l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p006C.C0055g;
import p036M1.AbstractC0387m;
import p076d.AbstractC0780a;

/* renamed from: l.w */
/* loaded from: classes.dex */
public final class C2618w {

    /* renamed from: a */
    public final TextView f8503a;

    /* renamed from: b */
    public final C0055g f8504b;

    public C2618w(TextView textView) {
        this.f8503a = textView;
        this.f8504b = new C0055g(textView);
    }

    /* renamed from: a */
    public final InputFilter[] m5084a(InputFilter[] inputFilterArr) {
        return ((AbstractC0387m) this.f8504b.f107b).mo1139u(inputFilterArr);
    }

    /* renamed from: b */
    public final void m5085b(AttributeSet attributeSet, int r5) {
        TypedArray obtainStyledAttributes = this.f8503a.getContext().obtainStyledAttributes(attributeSet, AbstractC0780a.f3122i, r5, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m5087d(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public final void m5086c(boolean z2) {
        ((AbstractC0387m) this.f8504b.f107b).mo1133L(z2);
    }

    /* renamed from: d */
    public final void m5087d(boolean z2) {
        ((AbstractC0387m) this.f8504b.f107b).mo1134M(z2);
    }
}
