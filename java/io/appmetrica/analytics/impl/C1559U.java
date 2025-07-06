package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.U */
/* loaded from: classes.dex */
public final class C1559U {

    /* renamed from: a */
    public final C1383Mm f5508a;

    /* renamed from: b */
    public final List f5509b;

    /* renamed from: c */
    public final String f5510c;

    public C1559U(C1383Mm c1383Mm, ArrayList arrayList, String str) {
        this.f5508a = c1383Mm;
        this.f5509b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f5510c = str;
    }
}
