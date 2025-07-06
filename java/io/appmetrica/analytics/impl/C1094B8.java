package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.B8 */
/* loaded from: classes.dex */
public class C1094B8 implements StateSerializer {

    /* renamed from: a */
    public final StateSerializer f4522a;

    /* renamed from: b */
    public final AESEncrypter f4523b;

    public C1094B8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f4522a = stateSerializer;
        this.f4523b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f4522a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f4523b.encrypt(this.f4522a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) {
        try {
            return this.f4522a.toState(this.f4523b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
