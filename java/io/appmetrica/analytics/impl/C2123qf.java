package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.qf */
/* loaded from: classes.dex */
public final class C2123qf extends AbstractC1546Tb {

    /* renamed from: d */
    public static final int[] f6996d = {3, 6, 4};

    /* renamed from: e */
    public static final C2123qf f6997e = new C2123qf("");

    public C2123qf(String str) {
        super(str);
    }

    /* renamed from: c */
    public static C2123qf m4356c() {
        return f6997e;
    }

    /* renamed from: a */
    public final void m4358a(C1842f9 c1842f9, String str) {
        String str2;
        int[] r02 = f6996d;
        for (int r12 = 0; r12 < 3; r12++) {
            if (c1842f9.f6234c == r02[r12]) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": ");
                if (c1842f9.f6234c == 3 && TextUtils.isEmpty(c1842f9.f6235d)) {
                    str2 = "Native crash of app";
                } else if (c1842f9.f6234c == 4) {
                    StringBuilder sb2 = new StringBuilder(c1842f9.f6235d);
                    byte[] bArr = c1842f9.f6236e;
                    if (bArr != null) {
                        String str3 = new String(bArr);
                        if (!TextUtils.isEmpty(str3)) {
                            sb2.append(" with value ");
                            sb2.append(str3);
                        }
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = c1842f9.f6235d;
                }
                sb.append(str2);
                m3358a(4, sb.toString());
                return;
            }
        }
    }

    public C2123qf() {
        this("");
    }

    /* renamed from: a */
    public final void m4359a(C1892h9 c1892h9, String str) {
        for (C1842f9 c1842f9 : c1892h9.f6402c) {
            if (c1842f9 != null) {
                m4358a(c1842f9, str);
            }
        }
    }

    /* renamed from: a */
    public final void m4357a(C1615W5 c1615w5, String str) {
        if (AbstractC2242v9.f7282d.contains(EnumC1670Ya.m3538a(c1615w5.f5624d))) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            sb.append(c1615w5.getName());
            if (AbstractC2242v9.f7283e.contains(EnumC1670Ya.m3538a(c1615w5.f5624d)) && !TextUtils.isEmpty(c1615w5.getValue())) {
                sb.append(" with value ");
                sb.append(c1615w5.getValue());
            }
            m3358a(4, sb.toString());
        }
    }
}
