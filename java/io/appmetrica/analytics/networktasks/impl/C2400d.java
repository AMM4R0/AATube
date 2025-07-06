package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.networktasks.impl.d */
/* loaded from: classes.dex */
public final class C2400d {

    /* renamed from: a */
    public final NetworkTask f7707a;

    /* renamed from: b */
    public final String f7708b;

    public C2400d(NetworkTask networkTask) {
        this.f7707a = networkTask;
        this.f7708b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2400d.class != obj.getClass()) {
            return false;
        }
        return this.f7708b.equals(((C2400d) obj).f7708b);
    }

    public final int hashCode() {
        return this.f7708b.hashCode();
    }
}
