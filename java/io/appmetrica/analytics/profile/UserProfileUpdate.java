package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.AbstractC1921id;
import io.appmetrica.analytics.impl.InterfaceC2181sn;

/* loaded from: classes.dex */
public class UserProfileUpdate<T extends InterfaceC2181sn> {

    /* renamed from: a */
    private final InterfaceC2181sn f7802a;

    public UserProfileUpdate(AbstractC1921id abstractC1921id) {
        this.f7802a = abstractC1921id;
    }

    public T getUserProfileUpdatePatcher() {
        return (T) this.f7802a;
    }
}
