package p058V;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0618h;
import androidx.emoji2.text.C0620j;
import java.lang.ref.WeakReference;

/* renamed from: V.c */
/* loaded from: classes.dex */
public final class C0527c extends AbstractC0618h {

    /* renamed from: a */
    public final WeakReference f1440a;

    /* renamed from: b */
    public final WeakReference f1441b;

    public C0527c(TextView textView, C0528d c0528d) {
        this.f1440a = new WeakReference(textView);
        this.f1441b = new WeakReference(c0528d);
    }

    @Override // androidx.emoji2.text.AbstractC0618h
    /* renamed from: b */
    public final void mo1386b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1440a.get();
        InputFilter inputFilter = (InputFilter) this.f1441b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0620j m1629a = C0620j.m1629a();
                    if (text == null) {
                        length = 0;
                    } else {
                        m1629a.getClass();
                        length = text.length();
                    }
                    CharSequence m1633e = m1629a.m1633e(text, 0, length);
                    if (text == m1633e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(m1633e);
                    int selectionEnd = Selection.getSelectionEnd(m1633e);
                    textView.setText(m1633e);
                    if (m1633e instanceof Spannable) {
                        Spannable spannable = (Spannable) m1633e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
