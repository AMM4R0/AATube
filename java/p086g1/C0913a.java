package p086g1;

import android.os.Handler;
import android.os.Message;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C0913a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int r02 = message.what;
        if (r02 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (r02 != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
