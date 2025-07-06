package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a */
    private final String f4130a;

    /* renamed from: b */
    private final Map f4131b;

    public static class Builder {

        /* renamed from: a */
        private final String f4132a;

        /* renamed from: b */
        private final HashMap f4133b;

        public /* synthetic */ Builder(String str, int r2) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f4133b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f4132a = str;
            this.f4133b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int r2) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f4131b;
    }

    public String getTrackingId() {
        return this.f4130a;
    }

    private PreloadInfo(Builder builder) {
        this.f4130a = builder.f4132a;
        this.f4131b = CollectionUtils.unmodifiableMapCopy(builder.f4133b);
    }
}
