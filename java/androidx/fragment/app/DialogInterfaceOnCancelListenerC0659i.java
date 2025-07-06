package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0659i implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0662l f2265a;

    public DialogInterfaceOnCancelListenerC0659i(DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l) {
        this.f2265a = dialogInterfaceOnCancelListenerC0662l;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l = this.f2265a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0662l.f2278a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0662l.onCancel(dialog);
        }
    }
}
