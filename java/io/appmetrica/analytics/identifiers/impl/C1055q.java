package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.identifiers.impl.q */
/* loaded from: classes.dex */
public final class C1055q implements InterfaceC1040b {

    /* renamed from: a */
    public final C1044f f4437a;

    public C1055q(C1044f c1044f) {
        this.f4437a = c1044f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC1040b
    /* renamed from: a */
    public final C1041c mo2673a(Context context) {
        C1041c c1041c;
        try {
            try {
                try {
                    try {
                        C1041c m2683b = m2683b(context);
                        try {
                            this.f4437a.m2676b(context);
                            return m2683b;
                        } catch (Throwable unused) {
                            return m2683b;
                        }
                    } catch (C1050l e2) {
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "No yandex adv_id service";
                        }
                        c1041c = new C1041c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f4437a.m2676b(context);
                        return c1041c;
                    } catch (Throwable th) {
                        return new C1041c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                    }
                } catch (C1045g e3) {
                    String message2 = e3.getMessage();
                    if (message2 == null) {
                        message2 = "unknown exception while binding yandex adv_id service";
                    }
                    c1041c = new C1041c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f4437a.m2676b(context);
                    return c1041c;
                }
            } catch (Throwable unused2) {
                return c1041c;
            }
        } finally {
            try {
                this.f4437a.m2676b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: b */
    public final C1041c m2683b(Context context) {
        C1057s c1057s = (C1057s) ((InterfaceC1059u) this.f4437a.m2675a(context));
        c1057s.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            c1057s.f4439a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                c1057s.f4439a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                boolean z2 = obtain2.readInt() != 0;
                obtain2.recycle();
                obtain.recycle();
                return new C1041c(IdentifierStatus.OK, new C1039a("yandex", readString, Boolean.valueOf(z2)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1055q() {
        /*
            r4 = this;
            io.appmetrica.analytics.identifiers.impl.f r0 = new io.appmetrica.analytics.identifiers.impl.f
            android.content.Intent r1 = io.appmetrica.analytics.identifiers.impl.AbstractC1056r.m2684a()
            io.appmetrica.analytics.identifiers.impl.p r2 = io.appmetrica.analytics.identifiers.impl.C1054p.f4436a
            java.lang.String r3 = "yandex"
            r0.<init>(r1, r2, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.identifiers.impl.C1055q.<init>():void");
    }
}
