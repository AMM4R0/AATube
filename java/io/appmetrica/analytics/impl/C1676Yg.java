package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Yg */
/* loaded from: classes.dex */
public final class C1676Yg implements InterfaceC1208Fm {

    /* renamed from: a */
    public final /* synthetic */ C1967k9 f5770a;

    /* renamed from: b */
    public final /* synthetic */ C1750bh f5771b;

    public C1676Yg(C1750bh c1750bh, C1967k9 c1967k9) {
        this.f5771b = c1750bh;
        this.f5770a = c1967k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1208Fm
    /* renamed from: a */
    public final void mo2883a(Object obj) {
        List list = (List) obj;
        C1967k9 c1967k9 = this.f5770a;
        if (AbstractC2356zn.m4702a((Collection) list)) {
            return;
        }
        c1967k9.f6576d = new C1917i9[list.size()];
        for (int r12 = 0; r12 < list.size(); r12++) {
            C1081Ak c1081Ak = (C1081Ak) list.get(r12);
            C1917i9[] c1917i9Arr = c1967k9.f6576d;
            Map map = AbstractC2098pf.f6912a;
            C1917i9 c1917i9 = new C1917i9();
            Integer num = c1081Ak.f4487a;
            if (num != null) {
                c1917i9.f6481a = num.intValue();
            }
            Integer num2 = c1081Ak.f4488b;
            if (num2 != null) {
                c1917i9.f6482b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c1081Ak.f4490d)) {
                c1917i9.f6483c = c1081Ak.f4490d;
            }
            c1917i9.f6484d = c1081Ak.f4489c;
            c1917i9Arr[r12] = c1917i9;
            this.f5771b.f5932g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c1967k9.f6576d[r12]);
            this.f5771b.f5932g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
