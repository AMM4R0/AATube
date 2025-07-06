package p133v0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* renamed from: v0.A */
/* loaded from: classes.dex */
public final class C2841A implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C2842B f9382a;

    public /* synthetic */ C2841A(C2842B c2842b) {
        this.f9382a = c2842b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int r02 = message.what;
        if (r02 == 0) {
            synchronized (this.f9382a.f9386a) {
                try {
                    C2870y c2870y = (C2870y) message.obj;
                    ServiceConnectionC2871z serviceConnectionC2871z = (ServiceConnectionC2871z) this.f9382a.f9386a.get(c2870y);
                    if (serviceConnectionC2871z != null && serviceConnectionC2871z.f9477a.isEmpty()) {
                        if (serviceConnectionC2871z.f9479c) {
                            serviceConnectionC2871z.f9483g.f9388c.removeMessages(1, serviceConnectionC2871z.f9481e);
                            C2842B c2842b = serviceConnectionC2871z.f9483g;
                            c2842b.f9389d.m5485b(c2842b.f9387b, serviceConnectionC2871z);
                            serviceConnectionC2871z.f9479c = false;
                            serviceConnectionC2871z.f9478b = 2;
                        }
                        this.f9382a.f9386a.remove(c2870y);
                    }
                } finally {
                }
            }
            return true;
        }
        if (r02 != 1) {
            return false;
        }
        synchronized (this.f9382a.f9386a) {
            try {
                C2870y c2870y2 = (C2870y) message.obj;
                ServiceConnectionC2871z serviceConnectionC2871z2 = (ServiceConnectionC2871z) this.f9382a.f9386a.get(c2870y2);
                if (serviceConnectionC2871z2 != null && serviceConnectionC2871z2.f9478b == 3) {
                    String valueOf = String.valueOf(c2870y2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = serviceConnectionC2871z2.f9482f;
                    if (componentName == null) {
                        c2870y2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c2870y2.f9474b;
                        AbstractC2863r.m5474c(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    serviceConnectionC2871z2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
