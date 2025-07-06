package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import p088h1.C0924d;
import p088h1.C0930j;
import p088h1.C0941u;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0756l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2895a;

    /* renamed from: b */
    public final /* synthetic */ Object f2896b;

    public /* synthetic */ ViewOnClickListenerC0756l(int r12, Object obj) {
        this.f2895a = r12;
        this.f2896b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2895a) {
            case 0:
                ((C0757m) this.f2896b).m2110B();
                throw null;
            case 1:
                C0924d c0924d = (C0924d) this.f2896b;
                EditText editText = c0924d.f3850i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0924d.m2507q();
                return;
            case 2:
                ((C0930j) this.f2896b).m2489u();
                return;
            default:
                C0941u c0941u = (C0941u) this.f2896b;
                EditText editText2 = c0941u.f3951f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0941u.f3951f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0941u.f3951f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0941u.f3951f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0941u.f3951f.setSelection(selectionEnd);
                }
                c0941u.m2507q();
                return;
        }
    }
}
