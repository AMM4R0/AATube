package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.fm */
/* loaded from: classes.dex */
public final class C1855fm extends AbstractC2030mm {
    @Override // io.appmetrica.analytics.impl.AbstractC2030mm
    /* renamed from: a */
    public final ProtobufStateStorage mo3837a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C1531Sl c1531Sl = new C1531Sl();
        try {
            bArr = AbstractC1354Li.m3058a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC1354Li.m3058a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new C2023mf("startup_state", iBinaryDataHelper, new C1069A8(c1531Sl, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C1082Al());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2030mm
    /* renamed from: c */
    public final IBinaryDataHelper mo3838c(Context context) {
        C2211u3 c2211u3;
        C1765c7 m3695a = C1765c7.m3695a(context);
        synchronized (m3695a) {
            try {
                if (m3695a.f6018i == null) {
                    m3695a.f6018i = new C2211u3(m3695a.m3705g());
                }
                c2211u3 = m3695a.f6018i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2211u3;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2030mm
    /* renamed from: d */
    public final IBinaryDataHelper mo3839d(Context context) {
        IBinaryDataHelper m3705g;
        C1765c7 m3695a = C1765c7.m3695a(context);
        synchronized (m3695a) {
            m3705g = m3695a.m3705g();
        }
        return m3705g;
    }
}
