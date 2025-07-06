package p046Q;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p028K.C0305g;
import p028K.InterfaceC0303f;
import p028K.InterfaceC0327r;

/* renamed from: Q.q */
/* loaded from: classes.dex */
public final class C0443q implements InterfaceC0327r {
    /* renamed from: a */
    public final C0305g m1198a(View view, C0305g c0305g) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0305g);
        }
        if (c0305g.f877a.mo214l() == 2) {
            return c0305g;
        }
        InterfaceC0303f interfaceC0303f = c0305g.f877a;
        ClipData mo203a = interfaceC0303f.mo203a();
        int mo208f = interfaceC0303f.mo208f();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int r3 = 0; r3 < mo203a.getItemCount(); r3++) {
            ClipData.Item itemAt = mo203a.getItemAt(r3);
            if ((mo208f & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
