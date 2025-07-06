package p124s0;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l;
import p133v0.AbstractC2863r;

/* renamed from: s0.j */
/* loaded from: classes.dex */
public class C2739j extends DialogInterfaceOnCancelListenerC0662l {

    /* renamed from: f0 */
    public AlertDialog f8991f0;

    /* renamed from: g0 */
    public DialogInterface.OnCancelListener f8992g0;

    /* renamed from: h0 */
    public AlertDialog f8993h0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l
    /* renamed from: A */
    public final Dialog mo1751A() {
        AlertDialog alertDialog = this.f8991f0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f2274W = false;
        if (this.f8993h0 == null) {
            Context m1765h = m1765h();
            AbstractC2863r.m5474c(m1765h);
            this.f8993h0 = new AlertDialog.Builder(m1765h).create();
        }
        return this.f8993h0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8992g0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
