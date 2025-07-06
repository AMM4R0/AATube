package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.AbstractC2395e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Response {

    /* renamed from: a */
    private final boolean f7699a;

    /* renamed from: b */
    private final int f7700b;

    /* renamed from: c */
    private final byte[] f7701c;

    /* renamed from: d */
    private final byte[] f7702d;

    /* renamed from: e */
    private final Map f7703e;

    /* renamed from: f */
    private final Throwable f7704f;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f7700b;
    }

    public byte[] getErrorData() {
        return this.f7702d;
    }

    public Throwable getException() {
        return this.f7704f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f7703e;
    }

    public byte[] getResponseData() {
        return this.f7701c;
    }

    public boolean isCompleted() {
        return this.f7699a;
    }

    public String toString() {
        return "Response{completed=" + this.f7699a + ", code=" + this.f7700b + ", responseDataLength=" + this.f7701c.length + ", errorDataLength=" + this.f7702d.length + ", headers=" + this.f7703e + ", exception=" + this.f7704f + '}';
    }

    public Response(boolean z2, int r2, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this.f7699a = z2;
        this.f7700b = r2;
        this.f7701c = bArr;
        this.f7702d = bArr2;
        this.f7703e = map == null ? Collections.emptyMap() : AbstractC2395e.m4753a(map);
        this.f7704f = th;
    }
}
