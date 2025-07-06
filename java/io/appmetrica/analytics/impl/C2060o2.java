package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.o2 */
/* loaded from: classes.dex */
public final class C2060o2 extends AbstractC2249vg {

    /* renamed from: b */
    public final C1409Nn f6833b;

    /* renamed from: c */
    public final C2327yj f6834c;

    public C2060o2(C2013m5 c2013m5) {
        this(c2013m5, c2013m5.m4180u(), C2327yj.m4662c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        C2013m5 c2013m5 = this.f7308a;
        if (!this.f6833b.m3143c() && !this.f6833b.m3144d()) {
            if (((C1501Rg) c2013m5.f6697l.m4598a()).f5336f) {
                this.f6834c.m4666b();
            }
            C1344L8 c1344l8 = this.f7308a.f6698m;
            if (c1344l8.f4998c == null) {
                c1344l8.m3043a();
            }
            C1394N8 c1394n8 = c1344l8.f4998c;
            c1394n8.getClass();
            c1394n8.f5119b = new HashSet();
            c1394n8.f5121d = 0;
            C1394N8 c1394n82 = c1344l8.f4998c;
            c1394n82.f5118a = true;
            C1469Q8 c1469q8 = c1344l8.f4997b;
            IBinaryDataHelper iBinaryDataHelper = c1469q8.f5247c;
            C1444P8 c1444p8 = c1469q8.f5246b;
            c1469q8.f5245a.getClass();
            C2192t9 m3167a = C1419O8.m3167a(c1394n82);
            c1444p8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m3167a));
        }
        return false;
    }

    public C2060o2(C2013m5 c2013m5, C1409Nn c1409Nn, C2327yj c2327yj) {
        super(c2013m5);
        this.f6833b = c1409Nn;
        this.f6834c = c2327yj;
    }
}
