package p133v0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC0744a;

/* renamed from: v0.u */
/* loaded from: classes.dex */
public final class ServiceConnectionC2866u implements ServiceConnection {

    /* renamed from: a */
    public final int f9463a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0744a f9464b;

    public ServiceConnectionC2866u(AbstractC0744a abstractC0744a, int r2) {
        this.f9464b = abstractC0744a;
        this.f9463a = r2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0744a abstractC0744a = this.f9464b;
        if (iBinder == null) {
            AbstractC0744a.m2027u(abstractC0744a);
            return;
        }
        synchronized (abstractC0744a.f2705g) {
            try {
                AbstractC0744a abstractC0744a2 = this.f9464b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0744a2.f2706h = (queryLocalInterface == null || !(queryLocalInterface instanceof C2862q)) ? new C2862q(iBinder) : (C2862q) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0744a abstractC0744a3 = this.f9464b;
        int r5 = this.f9463a;
        abstractC0744a3.getClass();
        C2868w c2868w = new C2868w(abstractC0744a3, 0);
        HandlerC2864s handlerC2864s = abstractC0744a3.f2703e;
        handlerC2864s.sendMessage(handlerC2864s.obtainMessage(7, r5, -1, c2868w));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0744a abstractC0744a;
        synchronized (this.f9464b.f2705g) {
            abstractC0744a = this.f9464b;
            abstractC0744a.f2706h = null;
        }
        HandlerC2864s handlerC2864s = abstractC0744a.f2703e;
        handlerC2864s.sendMessage(handlerC2864s.obtainMessage(6, this.f9463a, 1));
    }
}
