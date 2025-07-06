package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;
import p103k0.AbstractC2480a;

/* renamed from: io.appmetrica.analytics.impl.xd */
/* loaded from: classes.dex */
public final class C2296xd {

    /* renamed from: a */
    public static final C2296xd f7433a = new C2296xd();

    /* renamed from: b */
    public static final LinkedHashMap f7434b = new LinkedHashMap();

    /* renamed from: c */
    public static final String f7435c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "6.5.0", "50073468");

    /* renamed from: a */
    public final synchronized ExponentialBackoffDataHolder m4610a(EnumC2246vd enumC2246vd) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f7434b;
            obj = linkedHashMap.get(enumC2246vd);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new C2243va(C2018ma.f6725C.m4216w(), enumC2246vd));
                linkedHashMap.put(enumC2246vd, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    /* renamed from: a */
    public static final NetworkTask m4609a(C2013m5 c2013m5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C1227Gg c1227Gg = new C1227Gg(aESRSARequestBodyEncrypter);
        C2194tb c2194tb = new C2194tb(c2013m5);
        return new NetworkTask(new BlockingExecutor(), new C2292x9(c2013m5.f6686a), new AllHostsExponentialBackoffPolicy(f7433a.m4610a(EnumC2246vd.REPORT)), new C1750bh(c2013m5, c1227Gg, c2194tb, new FullUrlFormer(c1227Gg, c2194tb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c2013m5.m4167h(), c2013m5.m4174o(), c2013m5.m4180u(), aESRSARequestBodyEncrypter), AbstractC2480a.m4863D(new C2331yn()), f7435c);
    }
}
