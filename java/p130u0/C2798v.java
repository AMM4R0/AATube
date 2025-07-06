package p130u0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p010D0.C0113k;
import p026J0.C0224e;
import p026J0.C0232m;
import p124s0.C2733d;
import p127t0.C2767d;

/* renamed from: u0.v */
/* loaded from: classes.dex */
public final class C2798v extends AbstractC2792p {

    /* renamed from: b */
    public final C0224e f9149b;

    public C2798v(C0224e c0224e) {
        super(4);
        this.f9149b = c0224e;
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: a */
    public final boolean mo5417a(C2787k c2787k) {
        if (c2787k.f9107g.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: b */
    public final C2733d[] mo5418b(C2787k c2787k) {
        if (c2787k.f9107g.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: c */
    public final void mo5419c(Status status) {
        this.f9149b.m611a(new C2767d(status));
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: d */
    public final void mo5420d(RuntimeException runtimeException) {
        this.f9149b.m611a(runtimeException);
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: e */
    public final void mo5421e(C2787k c2787k) {
        try {
            m5424h(c2787k);
        } catch (DeadObjectException e2) {
            mo5419c(AbstractC2792p.m5416g(e2));
            throw e2;
        } catch (RemoteException e3) {
            mo5419c(AbstractC2792p.m5416g(e3));
        } catch (RuntimeException e4) {
            this.f9149b.m611a(e4);
        }
    }

    /* renamed from: h */
    public final void m5424h(C2787k c2787k) {
        if (c2787k.f9107g.remove(null) != null) {
            throw new ClassCastException();
        }
        C0224e c0224e = this.f9149b;
        Boolean bool = Boolean.FALSE;
        C0232m c0232m = c0224e.f652a;
        synchronized (c0232m.f669a) {
            try {
                if (c0232m.f671c) {
                    return;
                }
                c0232m.f671c = true;
                c0232m.f673e = bool;
                c0232m.f670b.m620e(c0232m);
            } finally {
            }
        }
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo5422f(C0113k c0113k, boolean z2) {
    }
}
