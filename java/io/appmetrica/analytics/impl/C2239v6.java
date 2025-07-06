package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* renamed from: io.appmetrica.analytics.impl.v6 */
/* loaded from: classes.dex */
public final class C2239v6 implements CryptoProvider {

    /* renamed from: a */
    public final AESRSAEncrypter f7260a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    public final Encrypter getAesRsaEncrypter() {
        return this.f7260a;
    }
}
