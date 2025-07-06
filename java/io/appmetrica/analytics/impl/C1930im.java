package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.im */
/* loaded from: classes.dex */
public final class C1930im extends AbstractC2030mm {
    @Override // io.appmetrica.analytics.impl.AbstractC2030mm
    /* renamed from: a */
    public final ProtobufStateStorage mo3837a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C1138D2 c1138d2 = new C1138D2();
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
        return new C2023mf("auto_inapp_collecting_info_data", iBinaryDataHelper, new C1069A8(c1138d2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C1063A2(new C1986l3()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2030mm
    /* renamed from: c */
    public final IBinaryDataHelper mo3838c(Context context) {
        C2211u3 c2211u3;
        C1765c7 m3695a = C1765c7.m3695a(context);
        synchronized (m3695a) {
            try {
                if (m3695a.f6020k == null) {
                    m3695a.f6020k = new C2211u3(m3695a.m3703e());
                }
                c2211u3 = m3695a.f6020k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2211u3;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2030mm
    /* renamed from: d */
    public final IBinaryDataHelper mo3839d(Context context) {
        IBinaryDataHelper m3703e;
        C1765c7 m3695a = C1765c7.m3695a(context);
        synchronized (m3695a) {
            m3703e = m3695a.m3703e();
        }
        return m3703e;
    }
}
