package p130u0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import p010D0.C0109g;
import p010D0.C0113k;
import p026J0.AbstractC0225f;
import p026J0.C0224e;
import p026J0.C0226g;
import p026J0.C0232m;
import p044P0.C0422f;
import p081e1.C0879e;
import p124s0.C2733d;
import p127t0.C2767d;
import p127t0.C2773j;

/* renamed from: u0.u */
/* loaded from: classes.dex */
public final class C2797u extends AbstractC2792p {

    /* renamed from: b */
    public final C0422f f9146b;

    /* renamed from: c */
    public final C0224e f9147c;

    /* renamed from: d */
    public final C0879e f9148d;

    public C2797u(int r12, C0422f c0422f, C0224e c0224e, C0879e c0879e) {
        super(r12);
        this.f9147c = c0224e;
        this.f9146b = c0422f;
        this.f9148d = c0879e;
        if (r12 == 2 && c0422f.f1094c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: a */
    public final boolean mo5417a(C2787k c2787k) {
        return this.f9146b.f1094c;
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: b */
    public final C2733d[] mo5418b(C2787k c2787k) {
        return (C2733d[]) this.f9146b.f1095d;
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: c */
    public final void mo5419c(Status status) {
        this.f9148d.getClass();
        this.f9147c.m611a(status.f2696d != null ? new C2773j(status) : new C2767d(status));
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: d */
    public final void mo5420d(RuntimeException runtimeException) {
        this.f9147c.m611a(runtimeException);
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: e */
    public final void mo5421e(C2787k c2787k) {
        C0224e c0224e = this.f9147c;
        try {
            C0422f c0422f = this.f9146b;
            ((InterfaceC2784h) ((C0422f) c0422f.f1096e).f1095d).mo5034h(c2787k.f9103c, c0224e);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            mo5419c(AbstractC2792p.m5416g(e3));
        } catch (RuntimeException e4) {
            c0224e.m611a(e4);
        }
    }

    @Override // p130u0.AbstractC2792p
    /* renamed from: f */
    public final void mo5422f(C0113k c0113k, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Map map = (Map) c0113k.f348c;
        C0224e c0224e = this.f9147c;
        map.put(c0224e, valueOf);
        C0109g c0109g = new C0109g(c0113k, 11, c0224e);
        C0232m c0232m = c0224e.f652a;
        c0232m.getClass();
        c0232m.f670b.m619d(new C0226g(AbstractC0225f.f653a, c0109g));
        c0232m.m628h();
    }
}
