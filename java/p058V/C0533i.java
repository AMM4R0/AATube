package p058V;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0620j;

/* renamed from: V.i */
/* loaded from: classes.dex */
public final class C0533i implements TextWatcher {

    /* renamed from: a */
    public final EditText f1452a;

    /* renamed from: b */
    public C0532h f1453b;

    /* renamed from: c */
    public boolean f1454c = true;

    public C0533i(EditText editText) {
        this.f1452a = editText;
    }

    /* renamed from: a */
    public static void m1388a(EditText editText, int r5) {
        int length;
        if (r5 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0620j m1629a = C0620j.m1629a();
            if (editableText == null) {
                length = 0;
            } else {
                m1629a.getClass();
                length = editableText.length();
            }
            m1629a.m1633e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int r4, int r5, int r6) {
        EditText editText = this.f1452a;
        if (editText.isInEditMode() || !this.f1454c || C0620j.f2070j == null || r5 > r6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m1630b = C0620j.m1629a().m1630b();
        if (m1630b != 0) {
            if (m1630b == 1) {
                C0620j.m1629a().m1633e((Spannable) charSequence, r4, r6 + r4);
                return;
            } else if (m1630b != 3) {
                return;
            }
        }
        C0620j m1629a = C0620j.m1629a();
        if (this.f1453b == null) {
            this.f1453b = new C0532h(editText);
        }
        m1629a.m1634f(this.f1453b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
    }
}
