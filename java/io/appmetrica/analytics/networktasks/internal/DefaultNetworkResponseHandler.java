package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;

/* loaded from: classes.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler<DefaultResponseParser.Response> {

    /* renamed from: a */
    private final DefaultResponseParser f7725a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    public DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f7725a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    public DefaultResponseParser.Response handle(ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f7725a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
