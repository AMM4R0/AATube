package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.f3 */
/* loaded from: classes.dex */
public final class C1836f3 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C1861g3 f6190a;

    public C1836f3(C1861g3 c1861g3) {
        this.f6190a = c1861g3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f6190a) {
            try {
                C1861g3 c1861g3 = this.f6190a;
                c1861g3.f6291b = intent;
                Iterator it = c1861g3.f6290a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
