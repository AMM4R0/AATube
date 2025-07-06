package p086g1;

import android.os.Handler;
import android.os.Message;
import p006C.C0055g;

/* renamed from: g1.e */
/* loaded from: classes.dex */
public final class C0917e implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C0055g f3836a;

    public C0917e(C0055g c0055g) {
        this.f3836a = c0055g;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0055g c0055g = this.f3836a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c0055g.f107b) {
            throw null;
        }
    }
}
