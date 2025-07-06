package p130u0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p010D0.C0113k;
import p124s0.C2733d;

/* renamed from: u0.p */
/* loaded from: classes.dex */
public abstract class AbstractC2792p {

    /* renamed from: a */
    public final int f9125a;

    public AbstractC2792p(int r12) {
        this.f9125a = r12;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ Status m5416g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract boolean mo5417a(C2787k c2787k);

    /* renamed from: b */
    public abstract C2733d[] mo5418b(C2787k c2787k);

    /* renamed from: c */
    public abstract void mo5419c(Status status);

    /* renamed from: d */
    public abstract void mo5420d(RuntimeException runtimeException);

    /* renamed from: e */
    public abstract void mo5421e(C2787k c2787k);

    /* renamed from: f */
    public abstract void mo5422f(C0113k c0113k, boolean z2);
}
