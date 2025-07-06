package p013E0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: E0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0124a implements IInterface {

    /* renamed from: a */
    public final IBinder f371a;

    /* renamed from: c */
    public final String f372c;

    public AbstractC0124a(IBinder iBinder, String str) {
        this.f371a = iBinder;
        this.f372c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f371a;
    }
}
