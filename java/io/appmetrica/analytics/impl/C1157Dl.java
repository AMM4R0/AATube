package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Dl */
/* loaded from: classes.dex */
public final class C1157Dl {

    /* renamed from: A */
    public final C1656Xl f4648A;

    /* renamed from: B */
    public final Map f4649B;

    /* renamed from: C */
    public final C1095B9 f4650C;

    /* renamed from: a */
    public final String f4651a;

    /* renamed from: b */
    public final List f4652b;

    /* renamed from: c */
    public final String f4653c;

    /* renamed from: d */
    public final String f4654d;

    /* renamed from: e */
    public final String f4655e;

    /* renamed from: f */
    public final List f4656f;

    /* renamed from: g */
    public final List f4657g;

    /* renamed from: h */
    public final List f4658h;

    /* renamed from: i */
    public final Map f4659i;

    /* renamed from: j */
    public final String f4660j;

    /* renamed from: k */
    public final String f4661k;

    /* renamed from: l */
    public final String f4662l;

    /* renamed from: m */
    public final C1190F4 f4663m;

    /* renamed from: n */
    public final long f4664n;

    /* renamed from: o */
    public final boolean f4665o;

    /* renamed from: p */
    public final boolean f4666p;

    /* renamed from: q */
    public final String f4667q;

    /* renamed from: r */
    public final C1755bm f4668r;

    /* renamed from: s */
    public final C1648Xd f4669s;

    /* renamed from: t */
    public final RetryPolicyConfig f4670t;

    /* renamed from: u */
    public final long f4671u;

    /* renamed from: v */
    public final long f4672v;

    /* renamed from: w */
    public final boolean f4673w;

    /* renamed from: x */
    public final BillingConfig f4674x;

    /* renamed from: y */
    public final C1164E3 f4675y;

    /* renamed from: z */
    public final C2160s2 f4676z;

    public C1157Dl(C1132Cl c1132Cl) {
        String str;
        long j2;
        long j3;
        C1656Xl c1656Xl;
        Map map;
        C1095B9 c1095b9;
        this.f4651a = c1132Cl.f4588a;
        List list = c1132Cl.f4589b;
        this.f4652b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f4653c = c1132Cl.f4590c;
        this.f4654d = c1132Cl.f4591d;
        this.f4655e = c1132Cl.f4592e;
        List list2 = c1132Cl.f4593f;
        this.f4656f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c1132Cl.f4594g;
        this.f4657g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c1132Cl.f4595h;
        this.f4658h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c1132Cl.f4596i;
        this.f4659i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f4660j = c1132Cl.f4597j;
        this.f4661k = c1132Cl.f4598k;
        this.f4663m = c1132Cl.f4600m;
        this.f4669s = c1132Cl.f4601n;
        this.f4664n = c1132Cl.f4602o;
        this.f4665o = c1132Cl.f4603p;
        this.f4662l = c1132Cl.f4599l;
        this.f4666p = c1132Cl.f4604q;
        str = c1132Cl.f4605r;
        this.f4667q = str;
        this.f4668r = c1132Cl.f4606s;
        j2 = c1132Cl.f4607t;
        this.f4671u = j2;
        j3 = c1132Cl.f4608u;
        this.f4672v = j3;
        this.f4673w = c1132Cl.f4609v;
        RetryPolicyConfig retryPolicyConfig = c1132Cl.f4610w;
        if (retryPolicyConfig == null) {
            C1506Rl c1506Rl = new C1506Rl();
            this.f4670t = new RetryPolicyConfig(c1506Rl.f5391w, c1506Rl.f5392x);
        } else {
            this.f4670t = retryPolicyConfig;
        }
        this.f4674x = c1132Cl.f4611x;
        this.f4675y = c1132Cl.f4612y;
        this.f4676z = c1132Cl.f4613z;
        c1656Xl = c1132Cl.f4585A;
        this.f4648A = c1656Xl == null ? new C1656Xl(AbstractC1293J7.f4903a.f5234a) : c1132Cl.f4585A;
        map = c1132Cl.f4586B;
        this.f4649B = map == null ? Collections.emptyMap() : c1132Cl.f4586B;
        c1095b9 = c1132Cl.f4587C;
        this.f4650C = c1095b9;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f4651a + "', reportUrls=" + this.f4652b + ", getAdUrl='" + this.f4653c + "', reportAdUrl='" + this.f4654d + "', certificateUrl='" + this.f4655e + "', hostUrlsFromStartup=" + this.f4656f + ", hostUrlsFromClient=" + this.f4657g + ", diagnosticUrls=" + this.f4658h + ", customSdkHosts=" + this.f4659i + ", encodedClidsFromResponse='" + this.f4660j + "', lastClientClidsForStartupRequest='" + this.f4661k + "', lastChosenForRequestClids='" + this.f4662l + "', collectingFlags=" + this.f4663m + ", obtainTime=" + this.f4664n + ", hadFirstStartup=" + this.f4665o + ", startupDidNotOverrideClids=" + this.f4666p + ", countryInit='" + this.f4667q + "', statSending=" + this.f4668r + ", permissionsCollectingConfig=" + this.f4669s + ", retryPolicyConfig=" + this.f4670t + ", obtainServerTime=" + this.f4671u + ", firstStartupServerTime=" + this.f4672v + ", outdated=" + this.f4673w + ", autoInappCollectingConfig=" + this.f4674x + ", cacheControl=" + this.f4675y + ", attributionConfig=" + this.f4676z + ", startupUpdateConfig=" + this.f4648A + ", modulesRemoteConfigs=" + this.f4649B + ", externalAttributionConfig=" + this.f4650C + '}';
    }
}
