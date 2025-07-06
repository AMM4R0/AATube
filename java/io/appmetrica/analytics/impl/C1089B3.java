package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.B3 */
/* loaded from: classes.dex */
public class C1089B3 implements InterfaceC1114C3 {

    /* renamed from: a */
    public final int f4514a;

    public C1089B3(int r12) {
        this.f4514a = r12;
    }

    /* renamed from: a */
    public static InterfaceC1114C3 m2744a(InterfaceC1114C3... interfaceC1114C3Arr) {
        return new C1089B3(m2745b(interfaceC1114C3Arr));
    }

    /* renamed from: b */
    public static int m2745b(InterfaceC1114C3... interfaceC1114C3Arr) {
        int r2 = 0;
        for (InterfaceC1114C3 interfaceC1114C3 : interfaceC1114C3Arr) {
            if (interfaceC1114C3 != null) {
                r2 = interfaceC1114C3.getBytesTruncated() + r2;
            }
        }
        return r2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1114C3
    public final int getBytesTruncated() {
        return this.f4514a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f4514a + '}';
    }
}
