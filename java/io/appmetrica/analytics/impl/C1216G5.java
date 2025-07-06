package io.appmetrica.analytics.impl;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.G5 */
/* loaded from: classes.dex */
public final class C1216G5 implements InterfaceC1169E8, InterfaceC1493R8 {

    /* renamed from: a */
    public final HashSet f4767a;

    /* renamed from: b */
    public final AtomicLong f4768b;

    public C1216G5(C1417O6 c1417o6) {
        HashSet hashSet = new HashSet();
        this.f4767a = hashSet;
        hashSet.add(Integer.valueOf(EnumC1670Ya.EVENT_TYPE_FIRST_ACTIVATION.m3539a()));
        hashSet.add(Integer.valueOf(EnumC1670Ya.EVENT_TYPE_APP_UPDATE.m3539a()));
        hashSet.add(Integer.valueOf(EnumC1670Ya.EVENT_TYPE_INIT.m3539a()));
        hashSet.add(Integer.valueOf(EnumC1670Ya.EVENT_TYPE_SEND_REFERRER.m3539a()));
        c1417o6.m3162a(this);
        this.f4768b = new AtomicLong(c1417o6.m3156a(hashSet));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1169E8
    /* renamed from: a */
    public final boolean mo2852a() {
        return this.f4768b.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1493R8
    /* renamed from: b */
    public final void mo2891b(List<Integer> list) {
        int r02 = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.f4767a.contains(num)) {
                r02++;
            }
        }
        this.f4768b.addAndGet(-r02);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1493R8
    /* renamed from: a */
    public final void mo2890a(List<Integer> list) {
        int r02 = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.f4767a.contains(num)) {
                r02++;
            }
        }
        this.f4768b.addAndGet(r02);
    }
}
