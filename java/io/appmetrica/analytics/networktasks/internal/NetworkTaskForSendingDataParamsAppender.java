package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a */
    private final RequestBodyEncrypter f7752a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f7752a = requestBodyEncrypter;
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f7752a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
