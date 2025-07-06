package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ig */
/* loaded from: classes.dex */
public final class C1277Ig extends AbstractC2249vg {

    /* renamed from: b */
    public final C1623Wd f4866b;

    /* renamed from: c */
    public final ProtobufStateStorage f4867c;

    /* renamed from: d */
    public final C1438P2 f4868d;

    /* renamed from: e */
    public final C1885h2 f4869e;

    /* renamed from: f */
    public final C1213G2 f4870f;

    public C1277Ig(C2013m5 c2013m5, C1623Wd c1623Wd) {
        this(c2013m5, c1623Wd, C2005lm.m4116a(C1661Y1.class).m4227a(c2013m5.getContext()), new C1438P2(c2013m5.getContext()), new C1885h2(), new C1213G2(c2013m5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        C2013m5 c2013m5 = this.f7308a;
        c2013m5.f6687b.toString();
        if (!c2013m5.f6707v.m3143c() || !c2013m5.m4183x()) {
            return false;
        }
        C1661Y1 c1661y1 = (C1661Y1) this.f4867c.read();
        List list = c1661y1.f5708a;
        C1413O2 c1413o2 = c1661y1.f5709b;
        C1438P2 c1438p2 = this.f4868d;
        c1438p2.getClass();
        C1661Y1 c1661y12 = null;
        C1413O2 m3038a = AndroidUtils.isApiAchieved(28) ? C1338L2.m3038a(c1438p2.f5197a, c1438p2.f5198b) : null;
        List list2 = c1661y1.f5710c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f4870f.f4765a, "getting available providers", "location manager", Collections.emptyList(), new C1188F2());
        C1623Wd c1623Wd = this.f4866b;
        Context context = this.f7308a.f6686a;
        c1623Wd.getClass();
        List m3498a = C1623Wd.m3498a(context, list);
        if (m3498a != null || !AbstractC2356zn.m4701a(c1413o2, m3038a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (m3498a != null) {
                list = m3498a;
            }
            c1661y12 = new C1661Y1(list, m3038a, list3);
        }
        if (c1661y12 != null) {
            C1992l9 c1992l9 = c2013m5.f6700o;
            C1615W5 m3462a = C1615W5.m3462a(c1615w5, c1661y12.f5708a, c1661y12.f5709b, this.f4869e, c1661y12.f5710c);
            c1992l9.m4100a(m3462a, C1903hk.m3946a(c1992l9.f6638c.m3950b(m3462a), m3462a.f5629i));
            long currentTimeSeconds = c1992l9.f6645j.currentTimeSeconds();
            c1992l9.f6647l = currentTimeSeconds;
            c1992l9.f6636a.m4612a(currentTimeSeconds).m4658b();
            this.f4867c.save(c1661y12);
            return false;
        }
        if (!c2013m5.m4159A()) {
            return false;
        }
        C1992l9 c1992l92 = c2013m5.f6700o;
        C1615W5 m3462a2 = C1615W5.m3462a(c1615w5, c1661y1.f5708a, c1661y1.f5709b, this.f4869e, c1661y1.f5710c);
        c1992l92.m4100a(m3462a2, C1903hk.m3946a(c1992l92.f6638c.m3950b(m3462a2), m3462a2.f5629i));
        long currentTimeSeconds2 = c1992l92.f6645j.currentTimeSeconds();
        c1992l92.f6647l = currentTimeSeconds2;
        c1992l92.f6636a.m4612a(currentTimeSeconds2).m4658b();
        return false;
    }

    public C1277Ig(C2013m5 c2013m5, C1623Wd c1623Wd, ProtobufStateStorage protobufStateStorage, C1438P2 c1438p2, C1885h2 c1885h2, C1213G2 c1213g2) {
        super(c2013m5);
        this.f4866b = c1623Wd;
        this.f4867c = protobufStateStorage;
        this.f4868d = c1438p2;
        this.f4869e = c1885h2;
        this.f4870f = c1213g2;
    }
}
