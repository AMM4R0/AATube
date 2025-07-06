package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.u3 */
/* loaded from: classes.dex */
public final class C2211u3 implements IBinaryDataHelper {

    /* renamed from: a */
    public final IBinaryDataHelper f7210a;

    public C2211u3(IBinaryDataHelper iBinaryDataHelper) {
        this.f7210a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        return this.f7210a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        this.f7210a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        this.f7210a.remove(str);
    }
}
