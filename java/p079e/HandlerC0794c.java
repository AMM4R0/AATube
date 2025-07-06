package p079e;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: e.c */
/* loaded from: classes.dex */
public final class HandlerC0794c extends Handler {

    /* renamed from: a */
    public WeakReference f3213a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int r02 = message.what;
        if (r02 == -3 || r02 == -2 || r02 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f3213a.get(), message.what);
        } else {
            if (r02 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
