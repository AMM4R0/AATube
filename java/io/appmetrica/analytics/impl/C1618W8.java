package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.W8 */
/* loaded from: classes.dex */
public final class C1618W8 extends AbstractC1643X8 {

    /* renamed from: a */
    public final List f5637a;

    public C1618W8(List<Object> list) {
        this.f5637a = CollectionUtils.unmodifiableListCopy(list);
    }

    /* renamed from: a */
    public final List<Object> m3494a() {
        return this.f5637a;
    }
}
