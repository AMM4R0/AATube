package p088h1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;

/* renamed from: h1.w */
/* loaded from: classes.dex */
public final class C0943w implements TextWatcher {

    /* renamed from: a */
    public int f3963a;

    /* renamed from: b */
    public final /* synthetic */ EditText f3964b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f3965c;

    public C0943w(TextInputLayout textInputLayout, EditText editText) {
        this.f3965c = textInputLayout;
        this.f3964b = editText;
        this.f3963a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f3965c;
        textInputLayout.m2151u(!textInputLayout.f2994A0, false);
        if (textInputLayout.f3038k) {
            textInputLayout.m2144n(editable);
        }
        if (textInputLayout.f3054s) {
            textInputLayout.m2152v(editable);
        }
        EditText editText = this.f3964b;
        int lineCount = editText.getLineCount();
        int r2 = this.f3963a;
        if (lineCount != r2) {
            if (lineCount < r2) {
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                int minimumHeight = editText.getMinimumHeight();
                int r02 = textInputLayout.f3057t0;
                if (minimumHeight != r02) {
                    editText.setMinimumHeight(r02);
                }
            }
            this.f3963a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
    }
}
