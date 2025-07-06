package p133v0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0744a;
import p124s0.C2731b;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;

/* renamed from: v0.v */
/* loaded from: classes.dex */
public final class C2867v extends AbstractC2861p {

    /* renamed from: g */
    public final IBinder f9465g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC0744a f9466h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2867v(AbstractC0744a abstractC0744a, int r2, IBinder iBinder, Bundle bundle) {
        super(abstractC0744a, r2, bundle);
        this.f9466h = abstractC0744a;
        this.f9465g = iBinder;
    }

    @Override // p133v0.AbstractC2861p
    /* renamed from: a */
    public final void mo5467a(C2731b c2731b) {
        C2852g c2852g = this.f9466h.f2713o;
        if (c2852g != null) {
            ((InterfaceC2771h) c2852g.f9426a).mo5390a(c2731b);
        }
        System.currentTimeMillis();
    }

    @Override // p133v0.AbstractC2861p
    /* renamed from: b */
    public final boolean mo5468b() {
        IBinder iBinder = this.f9465g;
        try {
            AbstractC2863r.m5474c(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0744a abstractC0744a = this.f9466h;
            if (!abstractC0744a.mo337r().equals(interfaceDescriptor)) {
                String mo337r = abstractC0744a.mo337r();
                StringBuilder sb = new StringBuilder(mo337r.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(mo337r);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface mo335n = abstractC0744a.mo335n(iBinder);
            if (mo335n == null || !(AbstractC0744a.m2028v(abstractC0744a, 2, 4, mo335n) || AbstractC0744a.m2028v(abstractC0744a, 3, 4, mo335n))) {
                return false;
            }
            abstractC0744a.f2717s = null;
            C2852g c2852g = abstractC0744a.f2712n;
            if (c2852g == null) {
                return true;
            }
            ((InterfaceC2770g) c2852g.f9426a).mo5389c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
