package p088h1;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: h1.l */
/* loaded from: classes.dex */
public final class C0932l {

    /* renamed from: a */
    public final /* synthetic */ C0933m f3876a;

    public C0932l(C0933m c0933m) {
        this.f3876a = c0933m;
    }

    /* renamed from: a */
    public final void m2490a(TextInputLayout textInputLayout) {
        C0933m c0933m = this.f3876a;
        if (c0933m.f3895s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0933m.f3895s;
        C0931k c0931k = c0933m.f3898v;
        if (editText != null) {
            editText.removeTextChangedListener(c0931k);
            if (c0933m.f3895s.getOnFocusChangeListener() == c0933m.m2492b().mo2472e()) {
                c0933m.f3895s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0933m.f3895s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0931k);
        }
        c0933m.m2492b().mo2475m(c0933m.f3895s);
        c0933m.m2500j(c0933m.m2492b());
    }
}
