package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0660j implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0662l f2266a;

    public DialogInterfaceOnDismissListenerC0660j(DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l) {
        this.f2266a = dialogInterfaceOnCancelListenerC0662l;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l = this.f2266a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0662l.f2278a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0662l.onDismiss(dialog);
        }
    }
}
