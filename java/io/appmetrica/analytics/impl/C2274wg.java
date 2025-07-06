package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.wg */
/* loaded from: classes.dex */
public final class C2274wg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C1077Ag f7372a;

    public C2274wg(C1077Ag c1077Ag) {
        this.f7372a = c1077Ag;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C1869gb c1869gb = (C1869gb) obj;
        C1077Ag c1077Ag = this.f7372a;
        String str = c1869gb.f6320h;
        String str2 = c1869gb.f6317e;
        Integer num = c1869gb.f6318f;
        String str3 = c1869gb.f6319g;
        C2062o4 c2062o4 = new C2062o4(str, str2, num, str3, c1869gb.f6321i);
        String str4 = c1869gb.f6314b;
        byte[] bArr = c1869gb.f6313a;
        int r3 = c1869gb.f6315c;
        HashMap hashMap = c1869gb.f6316d;
        String str5 = c1869gb.f6322j;
        C2123qf m3315a = AbstractC1521Sb.m3315a(str);
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(bArr, str4, 5889, m3315a);
        c1987l4.f6615q = hashMap;
        c1987l4.f5627g = r3;
        c1987l4.f5623c = str5;
        C1290J4 c1290j4 = new C1290J4(new C2179sl(), new C1265I4(), null);
        c1077Ag.f4483c.m4596a(c2062o4, c1290j4).mo2692a(c1987l4, c1290j4);
        c1077Ag.f4483c.m4597a(num.intValue(), str2, str3);
    }
}
