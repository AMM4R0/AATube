package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import io.appmetrica.analytics.network.impl.AbstractC2395e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Request {

    /* renamed from: a */
    private final String f7691a;

    /* renamed from: b */
    private final String f7692b;

    /* renamed from: c */
    private final byte[] f7693c;

    /* renamed from: d */
    private final Map f7694d;

    public static class Builder {

        /* renamed from: a */
        private final String f7695a;

        /* renamed from: b */
        private String f7696b;

        /* renamed from: c */
        private byte[] f7697c = new byte[0];

        /* renamed from: d */
        private final HashMap f7698d = new HashMap();

        public Builder(String str) {
            this.f7695a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f7698d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f7695a, this.f7696b, this.f7697c, this.f7698d, 0);
        }

        public Builder post(byte[] bArr) {
            this.f7697c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f7696b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int r5) {
        this(str, str2, bArr, hashMap);
    }

    public byte[] getBody() {
        return this.f7693c;
    }

    public Map<String, String> getHeaders() {
        return this.f7694d;
    }

    public String getMethod() {
        return this.f7692b;
    }

    public String getUrl() {
        return this.f7691a;
    }

    public String toString() {
        return "Request{url=" + this.f7691a + ", method='" + this.f7692b + "', bodyLength=" + this.f7693c.length + ", headers=" + this.f7694d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.f7691a = str;
        this.f7692b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f7693c = bArr;
        this.f7694d = AbstractC2395e.m4753a(hashMap);
    }
}
