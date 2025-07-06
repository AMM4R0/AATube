package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.o3 */
/* loaded from: classes.dex */
public final class C2061o3 implements BillingInfoStorage {

    /* renamed from: a */
    public final ProtobufStateStorage f6835a;

    /* renamed from: b */
    public C2335z2 f6836b;

    public C2061o3(Context context) {
        this(C2005lm.m4116a(C2335z2.class).m4227a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f6836b.f7513a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f6836b.f7514b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<BillingInfo> list, boolean z2) {
        for (BillingInfo billingInfo : list) {
        }
        C2335z2 c2335z2 = new C2335z2(list, z2);
        this.f6836b = c2335z2;
        this.f6835a.save(c2335z2);
    }

    public C2061o3(ProtobufStateStorage protobufStateStorage) {
        this.f6835a = protobufStateStorage;
        this.f6836b = (C2335z2) protobufStateStorage.read();
    }
}
