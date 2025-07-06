package p058V;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0620j;

/* renamed from: V.d */
/* loaded from: classes.dex */
public final class C0528d implements InputFilter {

    /* renamed from: a */
    public final TextView f1442a;

    /* renamed from: b */
    public C0527c f1443b;

    public C0528d(TextView textView) {
        this.f1442a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int r5, int r6, Spanned spanned, int r8, int r9) {
        TextView textView = this.f1442a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int m1630b = C0620j.m1629a().m1630b();
        if (m1630b != 0) {
            if (m1630b == 1) {
                if ((r9 == 0 && r8 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (r5 != 0 || r6 != charSequence.length()) {
                    charSequence = charSequence.subSequence(r5, r6);
                }
                return C0620j.m1629a().m1633e(charSequence, 0, charSequence.length());
            }
            if (m1630b != 3) {
                return charSequence;
            }
        }
        C0620j m1629a = C0620j.m1629a();
        if (this.f1443b == null) {
            this.f1443b = new C0527c(textView, this);
        }
        m1629a.m1634f(this.f1443b);
        return charSequence;
    }
}
