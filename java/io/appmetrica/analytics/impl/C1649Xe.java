package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Xe */
/* loaded from: classes.dex */
public final class C1649Xe implements Converter {

    /* renamed from: a */
    public final C1609W f5693a;

    /* renamed from: b */
    public final C1674Ye f5694b;

    public C1649Xe() {
        this(new C1609W(), new C1674Ye(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(C1698Ze c1698Ze) {
        int r5;
        C2041n8 c2041n8 = new C2041n8();
        C1876gi fromModel = this.f5693a.fromModel(c1698Ze.f5805a);
        c2041n8.f6799a = (C1791d8) fromModel.f6330a;
        C1731an mo3342a = this.f5694b.mo3342a(c1698Ze.f5806b);
        if (AbstractC2356zn.m4702a((Collection) mo3342a.f5895a)) {
            r5 = 0;
        } else {
            c2041n8.f6800b = new C1791d8[((List) mo3342a.f5895a).size()];
            r5 = 0;
            for (int r3 = 0; r3 < ((List) mo3342a.f5895a).size(); r3++) {
                C1876gi fromModel2 = this.f5693a.fromModel((C1634X) ((List) mo3342a.f5895a).get(r3));
                c2041n8.f6800b[r3] = (C1791d8) fromModel2.f6330a;
                r5 += fromModel2.f6331b.getBytesTruncated();
            }
        }
        return new C1876gi(c2041n8, new C1089B3(C1089B3.m2745b(fromModel, mo3342a, new C1089B3(r5))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1649Xe(C1609W c1609w, C1674Ye c1674Ye) {
        this.f5693a = c1609w;
        this.f5694b = c1674Ye;
    }

    /* renamed from: a */
    public final C1698Ze m3512a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
