package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ai */
/* loaded from: classes.dex */
public final class C1079Ai extends AbstractC2249vg {
    public C1079Ai(C2013m5 c2013m5) {
        super(c2013m5);
        String m3805a = c2013m5.mo2829b().m3805a();
        if (m3805a != null) {
            AbstractC2356zn.m4696a(m3805a);
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        Object remove;
        for (Map.Entry entry : c1615w5.f5636p.entrySet()) {
            C1703Zj c1703Zj = this.f7308a.f6708w;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                c1703Zj.getClass();
                if (bArr.length != 0) {
                    remove = c1703Zj.f5814b.put(str, bArr);
                    C1803dk c1803dk = c1703Zj.f5813a;
                    Map<String, byte[]> map = c1703Zj.f5814b;
                    IBinaryDataHelper iBinaryDataHelper = c1803dk.f6110d;
                    String str2 = c1803dk.f6107a;
                    C1778ck c1778ck = c1803dk.f6109c;
                    C1728ak fromModel = c1803dk.f6108b.fromModel(map);
                    c1778ck.getClass();
                    iBinaryDataHelper.insert(str2, MessageNano.toByteArray(fromModel));
                }
            }
            remove = c1703Zj.f5814b.remove(str);
            C1803dk c1803dk2 = c1703Zj.f5813a;
            Map<String, byte[]> map2 = c1703Zj.f5814b;
            IBinaryDataHelper iBinaryDataHelper2 = c1803dk2.f6110d;
            String str22 = c1803dk2.f6107a;
            C1778ck c1778ck2 = c1803dk2.f6109c;
            C1728ak fromModel2 = c1803dk2.f6108b.fromModel(map2);
            c1778ck2.getClass();
            iBinaryDataHelper2.insert(str22, MessageNano.toByteArray(fromModel2));
        }
        return true;
    }
}
