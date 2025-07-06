package p124s0;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p133v0.AbstractC2863r;

/* renamed from: s0.c */
/* loaded from: classes.dex */
public class DialogFragmentC2732c extends DialogFragment {

    /* renamed from: a */
    public AlertDialog f8975a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f8976b;

    /* renamed from: c */
    public AlertDialog f8977c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8976b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f8975a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f8977c == null) {
            Activity activity = getActivity();
            AbstractC2863r.m5474c(activity);
            this.f8977c = new AlertDialog.Builder(activity).create();
        }
        return this.f8977c;
    }
}
