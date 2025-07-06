package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Eg */
/* loaded from: classes.dex */
public final class C1177Eg extends AbstractC2249vg {

    /* renamed from: b */
    public final C1344L8 f4699b;

    public C1177Eg(C2013m5 c2013m5) {
        this(c2013m5, c2013m5.m4168i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        EnumC1768ca enumC1768ca;
        if (!TextUtils.isEmpty(c1615w5.getName())) {
            C1344L8 c1344l8 = this.f4699b;
            String name = c1615w5.getName();
            if (c1344l8.f4998c == null) {
                c1344l8.m3043a();
            }
            int hashCode = name.hashCode();
            if (c1344l8.f4998c.f5119b.contains(Integer.valueOf(hashCode))) {
                enumC1768ca = EnumC1768ca.NON_FIRST_OCCURENCE;
            } else {
                C1394N8 c1394n8 = c1344l8.f4998c;
                EnumC1768ca enumC1768ca2 = c1394n8.f5118a ? EnumC1768ca.FIRST_OCCURRENCE : EnumC1768ca.UNKNOWN;
                if (c1394n8.f5121d < 1000) {
                    c1394n8.f5119b.add(Integer.valueOf(hashCode));
                    c1394n8.f5121d++;
                } else {
                    c1394n8.f5118a = false;
                }
                C1469Q8 c1469q8 = c1344l8.f4997b;
                C1394N8 c1394n82 = c1344l8.f4998c;
                IBinaryDataHelper iBinaryDataHelper = c1469q8.f5247c;
                C1444P8 c1444p8 = c1469q8.f5246b;
                c1469q8.f5245a.getClass();
                C2192t9 m3167a = C1419O8.m3167a(c1394n82);
                c1444p8.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m3167a));
                enumC1768ca = enumC1768ca2;
            }
            c1615w5.f5631k = enumC1768ca;
        }
        return false;
    }

    public C1177Eg(C2013m5 c2013m5, C1344L8 c1344l8) {
        super(c2013m5);
        this.f4699b = c1344l8;
    }
}
