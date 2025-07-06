package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.Sn */
/* loaded from: classes.dex */
public final class C1533Sn extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final WeakHashMap f5437a;

    public C1533Sn() {
        super(false, "[WakelocksToggle]");
        this.f5437a = new WeakHashMap();
    }

    /* renamed from: a */
    public final synchronized void m3328a(Object obj) {
        this.f5437a.put(obj, null);
        if (this.f5437a.size() == 1) {
            updateState(true);
        }
    }

    /* renamed from: b */
    public final synchronized void m3329b(Object obj) {
        this.f5437a.remove(obj);
        if (this.f5437a.isEmpty()) {
            updateState(false);
        }
    }
}
