package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import io.appmetrica.analytics.identifiers.impl.C1039a;
import io.appmetrica.analytics.identifiers.impl.C1041c;
import io.appmetrica.analytics.identifiers.impl.C1042d;
import io.appmetrica.analytics.identifiers.impl.InterfaceC1040b;

@Keep
/* loaded from: classes.dex */
public class AdvIdentifiersProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f4441a = 0;
    private static final C1042d retriever = new C1042d();

    public static Bundle requestIdentifiers(Context context, Bundle bundle) {
        C1041c mo2673a;
        InterfaceC1040b interfaceC1040b = (InterfaceC1040b) retriever.f4424a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (interfaceC1040b == null || (mo2673a = interfaceC1040b.mo2673a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        C1039a c1039a = mo2673a.f4422b;
        if (c1039a != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", c1039a.f4418a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", c1039a.f4419b);
            Boolean bool = c1039a.f4420c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", mo2673a.f4421a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", mo2673a.f4423c);
        return bundle2;
    }
}
