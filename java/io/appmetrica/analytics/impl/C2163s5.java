package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.s5 */
/* loaded from: classes.dex */
public final class C2163s5 {

    /* renamed from: a */
    public final HashMap f7112a = new HashMap();

    /* renamed from: b */
    public final HashMap f7113b = new HashMap();

    /* renamed from: c */
    public final Context f7114c;

    public C2163s5(Context context) {
        this.f7114c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final InterfaceC1196Fa m4411a(C1838f5 c1838f5, C1290J4 c1290j4, InterfaceC1418O7 interfaceC1418O7, HashMap hashMap) {
        InterfaceC1196Fa interfaceC1196Fa = (InterfaceC1196Fa) hashMap.get(c1838f5.toString());
        if (interfaceC1196Fa != null) {
            interfaceC1196Fa.mo2873a(c1290j4);
            return interfaceC1196Fa;
        }
        InterfaceC1196Fa mo3166a = interfaceC1418O7.mo3166a(this.f7114c, c1838f5, c1290j4);
        hashMap.put(c1838f5.toString(), mo3166a);
        return mo3166a;
    }
}
