package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.T9 */
/* loaded from: classes.dex */
public final class C1544T9 {

    /* renamed from: a */
    public final C2029ml f5467a = new C2029ml();

    /* renamed from: b */
    public C1594V9 f5468b = new C1594V9();

    /* renamed from: a */
    public final synchronized void m3354a(C1594V9 c1594v9) {
        this.f5468b = c1594v9;
    }

    /* renamed from: a */
    public final synchronized void m3355a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC2492i.m4911a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f5468b.f5572a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C1594V9 c1594v9 = this.f5468b;
                    IdentifierStatus identifierStatus = c1594v9.f5573b;
                    String str2 = c1594v9.f5574c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new C0665o();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f5467a.m4226a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
