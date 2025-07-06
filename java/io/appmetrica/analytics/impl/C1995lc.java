package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002A1.AbstractC0025r;

/* renamed from: io.appmetrica.analytics.impl.lc */
/* loaded from: classes.dex */
public final class C1995lc extends C2138r5 {

    /* renamed from: m */
    public final C1280Ij f6649m;

    public C1995lc(Context context, C1838f5 c1838f5, C1265I4 r13, AbstractC1963k5 abstractC1963k5, C2354zl c2354zl, InterfaceC1427Og interfaceC1427Og, ICommonExecutor iCommonExecutor, int r18, C1280Ij c1280Ij, C2294xb c2294xb) {
        super(context, c1838f5, r13, abstractC1963k5, c2354zl, interfaceC1427Og, iCommonExecutor, r18, c2294xb);
        this.f6649m = c1280Ij;
    }

    /* renamed from: a */
    public final C2161s3 m4102a(C1970kc c1970kc) {
        Field field;
        Context context = this.f7032c;
        IHandlerExecutor m2962a = this.f6649m.m2962a();
        Executor m2967f = this.f6649m.m2967f();
        String str = null;
        try {
            Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        return new C2161s3(context, m2962a, m2967f, (str == null || AbstractC0025r.m152E(str)) ? BillingType.NONE : AbstractC0025r.m156I(str, "2.", false) ? BillingType.NONE : AbstractC0025r.m156I(str, "3.", false) ? BillingType.NONE : AbstractC0025r.m156I(str, "4.", false) ? BillingType.NONE : AbstractC0025r.m156I(str, "5.", false) ? BillingType.LIBRARY_V6 : AbstractC0025r.m156I(str, "6.", false) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6, new C2061o3(C2005lm.m4116a(C2335z2.class).m4227a(this.f7032c)), new C2036n3(c1970kc, C2018ma.m4192h().m4214u().m2966e()));
    }

    /* renamed from: b */
    public final C1550Tf m4103b(C1970kc c1970kc) {
        C1374Md c1374Md = new C1374Md(c1970kc);
        Objects.requireNonNull(c1970kc);
        return new C1550Tf(c1374Md, new C1945jc(c1970kc), c1970kc);
    }
}
