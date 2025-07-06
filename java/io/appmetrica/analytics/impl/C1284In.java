package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.In */
/* loaded from: classes.dex */
public final class C1284In implements InterfaceC1259Hn {

    /* renamed from: a */
    public final C1119C8 f4888a;

    public C1284In() {
        this(new C1119C8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1259Hn
    /* renamed from: a */
    public final byte[] mo2793a(C1369M8 c1369m8, C1501Rg c1501Rg) {
        if (!((C2013m5) c1501Rg.f5343m).m4160B() && !TextUtils.isEmpty(c1369m8.f5032b)) {
            try {
                JSONObject jSONObject = new JSONObject(c1369m8.f5032b);
                jSONObject.remove("preloadInfo");
                c1369m8.f5032b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f4888a.mo2793a(c1369m8, c1501Rg);
    }

    public C1284In(C1119C8 c1119c8) {
        this.f4888a = c1119c8;
    }
}
