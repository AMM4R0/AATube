package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.H9 */
/* loaded from: classes.dex */
public final class C1245H9 extends AbstractC2249vg {

    /* renamed from: b */
    public final C1270I9 f4821b;

    public C1245H9(C2013m5 c2013m5, TimeProvider timeProvider) {
        super(c2013m5);
        this.f4821b = new C1270I9(c2013m5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        long optLong;
        C1270I9 r02 = this.f4821b;
        C1095B9 c1095b9 = r02.f4856a.m4179t().f7538C;
        Long valueOf = c1095b9 != null ? Long.valueOf(c1095b9.f4524a) : null;
        if (valueOf != null) {
            C1409Nn c1409Nn = r02.f4856a.f6707v;
            synchronized (c1409Nn) {
                optLong = c1409Nn.f5142a.m3193a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = r02.f4857b.currentTimeMillis();
                r02.f4856a.f6707v.m3136a(optLong);
            }
            if (r02.f4857b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                C1070A9 c1070a9 = (C1070A9) MessageNano.mergeFrom(new C1070A9(), c1615w5.getValueBytes());
                int r03 = c1070a9.f4461a;
                String str = new String(c1070a9.f4462b, AbstractC0008a.f6a);
                String str2 = this.f4821b.f4856a.f6688c.m4626j().get(Integer.valueOf(r03));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f7308a.f6699n.m3358a(4, "Ignoring attribution of type `" + AbstractC1320K9.m3011a(r03) + "` with value `" + str + "` since it is not new");
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C1270I9 r10 = this.f4821b;
                Map<Integer, String> m4626j = r10.f4856a.f6688c.m4626j();
                m4626j.put(Integer.valueOf(r03), str);
                r10.f4856a.f6688c.m4615a(m4626j);
                this.f7308a.f6699n.m3358a(4, "Handling attribution of type `" + AbstractC1320K9.m3011a(r03) + '`');
                return false;
            }
        }
        this.f7308a.f6699n.m3358a(4, "Ignoring attribution since out of collecting interval");
        return true;
    }
}
