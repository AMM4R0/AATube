package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C1532Sm;
import io.appmetrica.analytics.impl.C1708a0;
import io.appmetrica.analytics.impl.C2263w5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: l */
        private static final C1532Sm f4134l = new C1532Sm(new C1708a0());

        /* renamed from: a */
        private final C2263w5 f4135a;

        /* renamed from: b */
        private final String f4136b;

        /* renamed from: c */
        private Integer f4137c;

        /* renamed from: d */
        private Boolean f4138d;

        /* renamed from: e */
        private Boolean f4139e;

        /* renamed from: f */
        private Integer f4140f;

        /* renamed from: g */
        private String f4141g;

        /* renamed from: h */
        private Integer f4142h;

        /* renamed from: i */
        private Integer f4143i;

        /* renamed from: j */
        private final HashMap f4144j;

        /* renamed from: k */
        private final HashMap f4145k;

        public /* synthetic */ Builder(String str, int r2) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f4145k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f4144j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z2) {
            this.f4139e = Boolean.valueOf(z2);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int r12) {
            this.f4142h = Integer.valueOf(r12);
            return this;
        }

        public Builder withLogs() {
            this.f4138d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int r12) {
            this.f4143i = Integer.valueOf(r12);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int r2) {
            this.f4140f = Integer.valueOf(this.f4135a.m4533a(r2));
            return this;
        }

        public Builder withSessionTimeout(int r12) {
            this.f4137c = Integer.valueOf(r12);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f4141g = str;
            return this;
        }

        private Builder(String str) {
            this.f4144j = new HashMap();
            this.f4145k = new HashMap();
            f4134l.mo2706a(str);
            this.f4135a = new C2263w5(str);
            this.f4136b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int r2) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f4136b;
        this.sessionTimeout = builder.f4137c;
        this.logs = builder.f4138d;
        this.dataSendingEnabled = builder.f4139e;
        this.maxReportsInDatabaseCount = builder.f4140f;
        this.userProfileID = builder.f4141g;
        this.dispatchPeriodSeconds = builder.f4142h;
        this.maxReportsCount = builder.f4143i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f4144j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f4145k);
    }
}
