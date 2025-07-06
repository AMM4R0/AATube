package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.p095io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a */
    private final RequestBodyEncrypter f7763a;

    /* renamed from: b */
    private final Compressor f7764b;

    /* renamed from: c */
    private final TimeProvider f7765c;

    /* renamed from: d */
    private final RequestDataHolder f7766d;

    /* renamed from: e */
    private final ResponseDataHolder f7767e;

    /* renamed from: f */
    private final NetworkResponseHandler f7768f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f7768f.handle(this.f7767e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f7766d.applySendTime(this.f7765c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f7764b.compress(bArr);
            if (compress == null || (encrypt = this.f7763a.encrypt(compress)) == null) {
                return false;
            }
            this.f7766d.setPostData(encrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f7763a = requestBodyEncrypter;
        this.f7764b = compressor;
        this.f7765c = timeProvider;
        this.f7766d = requestDataHolder;
        this.f7767e = responseDataHolder;
        this.f7768f = networkResponseHandler;
    }
}
