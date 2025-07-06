package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ra */
/* loaded from: classes.dex */
public final class C2143ra extends AbstractC1537T2 {
    public C2143ra(int r12) {
        super(r12);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1537T2, io.appmetrica.analytics.impl.InterfaceC2168sa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1731an mo3342a(String str) {
        int r02 = 0;
        if (str != null) {
            int length = str.length();
            int r2 = this.f5459a;
            if (length > r2) {
                String substring = str.substring(0, r2);
                r02 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new C1731an(str, new C1089B3(r02));
    }
}
