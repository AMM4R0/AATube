package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import p006C.C0055g;
import p010D0.C0112j;
import p010D0.C0113k;
import p026J0.AbstractC0225f;
import p026J0.C0226g;
import p026J0.C0232m;
import p026J0.ExecutorC0231l;
import p026J0.InterfaceC0221b;
import p044P0.C0422f;
import p116p0.AbstractC2708c;
import p116p0.C2706a;
import p124s0.C2733d;
import p124s0.C2738i;
import p127t0.C2767d;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a */
    private final Object f4167a = new Object();

    /* renamed from: b */
    private final ArrayList f4168b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int r12) {
        appSetIdRetriever.getClass();
        return r12 != 1 ? r12 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) {
        C0232m c0232m;
        C0113k c0113k = new C0113k(context);
        C0112j c0112j = (C0112j) c0113k.f347b;
        if (c0112j.f345j.m5329b(c0112j.f344i, 212800000) == 0) {
            C0422f c0422f = new C0422f();
            c0422f.f1096e = new C2733d[]{AbstractC2708c.f8727a};
            c0422f.f1095d = new C2738i(c0112j);
            c0422f.f1094c = false;
            c0422f.f1093b = 27601;
            c0232m = c0112j.m5387b(0, c0422f.m1155a());
        } else {
            C2767d c2767d = new C2767d(new Status(17, null));
            C0232m c0232m2 = new C0232m();
            c0232m2.m625e(c2767d);
            c0232m = c0232m2;
        }
        C0055g c0055g = new C0055g(3, c0113k);
        c0232m.getClass();
        ExecutorC0231l executorC0231l = AbstractC0225f.f653a;
        C0232m c0232m3 = new C0232m();
        c0232m.f670b.m619d(new C0226g(executorC0231l, c0055g, c0232m3));
        c0232m.m628h();
        InterfaceC0221b interfaceC0221b = new InterfaceC0221b() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // p026J0.InterfaceC0221b
            public void onComplete(Task task) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f4167a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f4168b;
                    list.remove(this);
                }
                if (task.mo624d()) {
                    appSetIdListener.onAppSetIdRetrieved(((C2706a) task.mo623c()).f8723a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((C2706a) task.mo623c()).f8724b));
                } else {
                    appSetIdListener.onFailure(task.mo622b());
                }
            }
        };
        synchronized (this.f4167a) {
            this.f4168b.add(interfaceC0221b);
        }
        c0232m3.f670b.m619d(new C0226g(executorC0231l, interfaceC0221b));
        c0232m3.m628h();
    }
}
