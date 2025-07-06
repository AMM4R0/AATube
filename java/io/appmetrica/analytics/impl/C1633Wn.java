package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Wn */
/* loaded from: classes.dex */
public final class C1633Wn {

    /* renamed from: a */
    public final ArrayList f5674a = new ArrayList();

    /* renamed from: b */
    public C2123qf f5675b;

    /* renamed from: a */
    public final synchronized void m3500a(Consumer consumer) {
        try {
            C2123qf c2123qf = this.f5675b;
            if (c2123qf == null) {
                this.f5674a.add(consumer);
            } else {
                consumer.consume(c2123qf);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
