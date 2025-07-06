package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: io.appmetrica.analytics.impl.pm */
/* loaded from: classes.dex */
public final class C2105pm extends AbstractC1811e3 {
    public C2105pm(int r2, String str) {
        this(r2, str, AbstractC1521Sb.m3314a());
    }

    /* renamed from: b */
    public final int m4305b() {
        return this.f6117a;
    }

    public C2105pm(int r12, String str, C2123qf c2123qf) {
        super(r12, str, c2123qf);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1706Zm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String mo2687a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int r4 = this.f6117a;
            if (length <= r4) {
                return str;
            }
            String str2 = new String(bytes, 0, r4, "UTF-8");
            try {
                if (this.f6119c.f5471b) {
                    this.f6119c.m3359a(5, "\"%s\" %s exceeded limit of %d bytes", this.f6118b, str, Integer.valueOf(this.f6117a));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }

    /* renamed from: a */
    public final String m4303a() {
        return this.f6118b;
    }
}
