package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.C2393c;
import io.appmetrica.analytics.network.impl.C2394d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkClient {

    /* renamed from: a */
    private final Integer f7679a;

    /* renamed from: b */
    private final Integer f7680b;

    /* renamed from: c */
    private final SSLSocketFactory f7681c;

    /* renamed from: d */
    private final Boolean f7682d;

    /* renamed from: e */
    private final Boolean f7683e;

    /* renamed from: f */
    private final int f7684f;

    public static class Builder {

        /* renamed from: a */
        private Integer f7685a;

        /* renamed from: b */
        private Integer f7686b;

        /* renamed from: c */
        private SSLSocketFactory f7687c;

        /* renamed from: d */
        private Boolean f7688d;

        /* renamed from: e */
        private Boolean f7689e;

        /* renamed from: f */
        private Integer f7690f;

        public NetworkClient build() {
            return new NetworkClient(this.f7685a, this.f7686b, this.f7687c, this.f7688d, this.f7689e, this.f7690f, 0);
        }

        public Builder withConnectTimeout(int r12) {
            this.f7685a = Integer.valueOf(r12);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z2) {
            this.f7689e = Boolean.valueOf(z2);
            return this;
        }

        public Builder withMaxResponseSize(int r12) {
            this.f7690f = Integer.valueOf(r12);
            return this;
        }

        public Builder withReadTimeout(int r12) {
            this.f7686b = Integer.valueOf(r12);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f7687c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z2) {
            this.f7688d = Boolean.valueOf(z2);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int r7) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f7679a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f7683e;
    }

    public int getMaxResponseSize() {
        return this.f7684f;
    }

    public Integer getReadTimeout() {
        return this.f7680b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f7681c;
    }

    public Boolean getUseCaches() {
        return this.f7682d;
    }

    public Call newCall(Request request) {
        return new C2393c(this, request, new C2394d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f7679a + ", readTimeout=" + this.f7680b + ", sslSocketFactory=" + this.f7681c + ", useCaches=" + this.f7682d + ", instanceFollowRedirects=" + this.f7683e + ", maxResponseSize=" + this.f7684f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f7679a = num;
        this.f7680b = num2;
        this.f7681c = sSLSocketFactory;
        this.f7682d = bool;
        this.f7683e = bool2;
        this.f7684f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
