package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.A3 */
/* loaded from: classes.dex */
public final class C1064A3 extends AbstractC1811e3 {
    public C1064A3(int r12, String str, C2123qf c2123qf) {
        super(r12, str, c2123qf);
    }

    /* renamed from: b */
    public final int m2690b() {
        return this.f6117a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1706Zm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] mo2687a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int r2 = this.f6117a;
        if (length <= r2) {
            return bArr;
        }
        byte[] bArr2 = new byte[r2];
        System.arraycopy(bArr, 0, bArr2, 0, r2);
        if (this.f6119c.f5471b) {
            this.f6119c.m3359a(5, "\"%s\" %s exceeded limit of %d bytes", this.f6118b, bArr, Integer.valueOf(this.f6117a));
        }
        return bArr2;
    }

    /* renamed from: a */
    public final String m2688a() {
        return this.f6118b;
    }
}
