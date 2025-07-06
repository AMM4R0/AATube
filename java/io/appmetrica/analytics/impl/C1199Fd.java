package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;

/* renamed from: io.appmetrica.analytics.impl.Fd */
/* loaded from: classes.dex */
public final class C1199Fd {
    /* renamed from: a */
    public static final C1070A9 m2875a(C1199Fd c1199Fd, EnumC1295J9 enumC1295J9) {
        int r12;
        c1199Fd.getClass();
        C1070A9 c1070a9 = new C1070A9();
        switch (enumC1295J9) {
            case UNKNOWN:
                r12 = 0;
                break;
            case APPSFLYER:
                r12 = 1;
                break;
            case ADJUST:
                r12 = 2;
                break;
            case KOCHAVA:
                r12 = 3;
                break;
            case TENJIN:
                r12 = 4;
                break;
            case AIRBRIDGE:
                r12 = 5;
                break;
            case SINGULAR:
                r12 = 6;
                break;
            default:
                throw new C0665o();
        }
        c1070a9.f4461a = r12;
        return c1070a9;
    }
}
