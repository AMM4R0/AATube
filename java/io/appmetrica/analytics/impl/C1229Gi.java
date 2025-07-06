package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.impl.Gi */
/* loaded from: classes.dex */
public final class C1229Gi implements InterfaceC2064o6 {

    /* renamed from: a */
    public static final C1229Gi f4801a = new C1229Gi();

    @Override // io.appmetrica.analytics.impl.InterfaceC2064o6
    /* renamed from: a */
    public final boolean mo2916a(Throwable th) {
        String str;
        Pattern pattern = AbstractC1329Ki.f4968a;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && AbstractC1329Ki.f4969b.matcher(str).find();
    }
}
