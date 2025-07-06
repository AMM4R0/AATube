package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Wk */
/* loaded from: classes.dex */
public final class C1630Wk {

    /* renamed from: a */
    public final String f5655a;

    /* renamed from: b */
    public final String f5656b;

    /* renamed from: c */
    public final Integer f5657c;

    /* renamed from: d */
    public final Integer f5658d;

    /* renamed from: e */
    public final String f5659e;

    /* renamed from: f */
    public final Boolean f5660f;

    public C1630Wk(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f5655a = str;
        this.f5656b = str2;
        this.f5657c = num;
        this.f5658d = num2;
        this.f5659e = str3;
        this.f5660f = bool;
    }

    public C1630Wk(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
