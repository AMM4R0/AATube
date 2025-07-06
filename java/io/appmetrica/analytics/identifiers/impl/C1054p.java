package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.identifiers.impl.p */
/* loaded from: classes.dex */
public final class C1054p extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: a */
    public static final C1054p f4436a = new C1054p();

    public C1054p() {
        super(1);
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int r02 = AbstractBinderC1058t.f4440a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1059u)) ? new C1057s(iBinder) : (InterfaceC1059u) queryLocalInterface;
    }
}
