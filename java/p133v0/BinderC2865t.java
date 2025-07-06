package p133v0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0744a;
import p010D0.C0104b;
import p015F0.AbstractBinderC0130a;
import p015F0.AbstractC0131b;

/* renamed from: v0.t */
/* loaded from: classes.dex */
public final class BinderC2865t extends AbstractBinderC0130a {

    /* renamed from: c */
    public AbstractC0744a f9461c;

    /* renamed from: d */
    public final int f9462d;

    public BinderC2865t(AbstractC0744a abstractC0744a, int r3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f9461c = abstractC0744a;
        this.f9462d = r3;
    }

    @Override // p015F0.AbstractBinderC0130a
    /* renamed from: d */
    public final boolean mo424d(int r9, Parcel parcel, Parcel parcel2) {
        if (r9 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC0131b.m425a(parcel, Bundle.CREATOR);
            AbstractC2863r.m5475d(this.f9461c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0744a abstractC0744a = this.f9461c;
            abstractC0744a.getClass();
            C2867v c2867v = new C2867v(abstractC0744a, readInt, readStrongBinder, bundle);
            HandlerC2864s handlerC2864s = abstractC0744a.f2703e;
            handlerC2864s.sendMessage(handlerC2864s.obtainMessage(1, this.f9462d, -1, c2867v));
            this.f9461c = null;
        } else if (r9 == 2) {
            parcel.readInt();
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (r9 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C2869x c2869x = (C2869x) AbstractC0131b.m425a(parcel, C2869x.CREATOR);
            AbstractC0744a abstractC0744a2 = this.f9461c;
            AbstractC2863r.m5475d(abstractC0744a2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC2863r.m5474c(c2869x);
            abstractC0744a2.f2719u = c2869x;
            if (abstractC0744a2 instanceof C0104b) {
                C2848c c2848c = c2869x.f9471d;
                C2852g m5459b = C2852g.m5459b();
                C2853h c2853h = c2848c == null ? null : c2848c.f9395a;
                synchronized (m5459b) {
                    if (c2853h == null) {
                        c2853h = C2852g.f9425c;
                    } else {
                        C2853h c2853h2 = (C2853h) m5459b.f9426a;
                        if (c2853h2 != null) {
                            if (c2853h2.f9427a < c2853h.f9427a) {
                            }
                        }
                    }
                    m5459b.f9426a = c2853h;
                }
            }
            Bundle bundle2 = c2869x.f9468a;
            AbstractC2863r.m5475d(this.f9461c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0744a abstractC0744a3 = this.f9461c;
            abstractC0744a3.getClass();
            C2867v c2867v2 = new C2867v(abstractC0744a3, readInt2, readStrongBinder2, bundle2);
            HandlerC2864s handlerC2864s2 = abstractC0744a3.f2703e;
            handlerC2864s2.sendMessage(handlerC2864s2.obtainMessage(1, this.f9462d, -1, c2867v2));
            this.f9461c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
