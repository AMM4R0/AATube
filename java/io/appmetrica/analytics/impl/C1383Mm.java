package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Mm */
/* loaded from: classes.dex */
public final class C1383Mm {

    /* renamed from: a */
    public final String f5092a;

    /* renamed from: b */
    public final int f5093b;

    /* renamed from: c */
    public final long f5094c;

    /* renamed from: d */
    public final String f5095d;

    /* renamed from: e */
    public final Integer f5096e;

    /* renamed from: f */
    public final List f5097f;

    public C1383Mm(String str, int r2, long j2, String str2, Integer num, List list) {
        this.f5092a = str;
        this.f5093b = r2;
        this.f5094c = j2;
        this.f5095d = str2;
        this.f5096e = num;
        this.f5097f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}
