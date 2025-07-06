package io.appmetrica.analytics;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a */
    private final int f4114a;

    /* renamed from: b */
    private final String f4115b;

    /* renamed from: c */
    private final String f4116c;

    /* renamed from: d */
    private final int f4117d;

    /* renamed from: e */
    private final HashMap f4118e;

    /* renamed from: f */
    private final HashMap f4119f;

    /* renamed from: g */
    private final HashMap f4120g;

    public static class Builder {

        /* renamed from: a */
        private final int f4121a;

        /* renamed from: b */
        private String f4122b;

        /* renamed from: c */
        private String f4123c;

        /* renamed from: d */
        private int f4124d;

        /* renamed from: e */
        private HashMap f4125e;

        /* renamed from: f */
        private HashMap f4126f;

        /* renamed from: g */
        private HashMap f4127g;

        public /* synthetic */ Builder(int r12, int r2) {
            this(r12);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f4127g = new HashMap(map);
            }
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f4125e = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f4126f = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f4122b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int r12) {
            this.f4124d = r12;
            return this;
        }

        public Builder withValue(String str) {
            this.f4123c = str;
            return this;
        }

        private Builder(int r2) {
            this.f4124d = 1;
            this.f4121a = r2;
        }
    }

    public /* synthetic */ ModuleEvent(Builder builder, int r2) {
        this(builder);
    }

    public static Builder newBuilder(int r2) {
        return new Builder(r2, 0);
    }

    public Map<String, Object> getAttributes() {
        return this.f4120g;
    }

    public Map<String, Object> getEnvironment() {
        return this.f4118e;
    }

    public Map<String, byte[]> getExtras() {
        return this.f4119f;
    }

    public String getName() {
        return this.f4115b;
    }

    public int getServiceDataReporterType() {
        return this.f4117d;
    }

    public int getType() {
        return this.f4114a;
    }

    public String getValue() {
        return this.f4116c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f4114a + ", name='" + this.f4115b + "', value='" + this.f4116c + "', serviceDataReporterType=" + this.f4117d + ", environment=" + this.f4118e + ", extras=" + this.f4119f + ", attributes=" + this.f4120g + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f4114a = builder.f4121a;
        this.f4115b = builder.f4122b;
        this.f4116c = builder.f4123c;
        this.f4117d = builder.f4124d;
        this.f4118e = builder.f4125e;
        this.f4119f = builder.f4126f;
        this.f4120g = builder.f4127g;
    }
}
