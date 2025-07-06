package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a */
    private int f7759a;

    /* renamed from: b */
    private byte[] f7760b;

    /* renamed from: c */
    private Map f7761c;

    /* renamed from: d */
    private final ResponseValidityChecker f7762d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f7762d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f7759a;
    }

    public byte[] getResponseData() {
        return this.f7760b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f7761c;
    }

    public boolean isValidResponse() {
        return this.f7762d.isResponseValid(this.f7759a);
    }

    public void setResponseCode(int r12) {
        this.f7759a = r12;
    }

    public void setResponseData(byte[] bArr) {
        this.f7760b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f7761c = map;
    }
}
