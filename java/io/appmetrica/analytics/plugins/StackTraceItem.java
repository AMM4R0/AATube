package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a */
    private final String f7781a;

    /* renamed from: b */
    private final String f7782b;

    /* renamed from: c */
    private final Integer f7783c;

    /* renamed from: d */
    private final Integer f7784d;

    /* renamed from: e */
    private final String f7785e;

    public static class Builder {

        /* renamed from: a */
        private String f7786a;

        /* renamed from: b */
        private String f7787b;

        /* renamed from: c */
        private Integer f7788c;

        /* renamed from: d */
        private Integer f7789d;

        /* renamed from: e */
        private String f7790e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f7786a, this.f7787b, this.f7788c, this.f7789d, this.f7790e, 0);
        }

        public Builder withClassName(String str) {
            this.f7786a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f7789d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f7787b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f7788c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f7790e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int r6) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f7781a;
    }

    public Integer getColumn() {
        return this.f7784d;
    }

    public String getFileName() {
        return this.f7782b;
    }

    public Integer getLine() {
        return this.f7783c;
    }

    public String getMethodName() {
        return this.f7785e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f7781a = str;
        this.f7782b = str2;
        this.f7783c = num;
        this.f7784d = num2;
        this.f7785e = str3;
    }
}
