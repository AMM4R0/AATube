package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.N3 */
/* loaded from: classes.dex */
public final class C1389N3 {

    /* renamed from: a */
    public final Context f5108a;

    /* renamed from: b */
    public final C2297xe f5109b;

    /* renamed from: c */
    public final String f5110c;

    /* renamed from: d */
    public final SafePackageManager f5111d;

    public C1389N3(Context context, C2297xe c2297xe, String str, SafePackageManager safePackageManager) {
        this.f5108a = context;
        this.f5109b = c2297xe;
        this.f5110c = str;
        this.f5111d = safePackageManager;
    }

    /* renamed from: a */
    public final List m3105a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> m4619f = this.f5109b.m4619f();
        boolean isEmpty = m4619f.isEmpty();
        List<String> list = m4619f;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f5111d.getPackageInfo(this.f5108a, this.f5110c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f5111d.getPackageInfo(this.f5108a, this.f5110c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f5109b.m4614a(arrayList).m4658b();
                list = arrayList;
            }
        }
        return list;
    }
}
