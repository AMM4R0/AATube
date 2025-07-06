package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Fk */
/* loaded from: classes.dex */
public final class C1206Fk implements InterfaceC1258Hm {

    /* renamed from: d */
    public static final long f4740d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a */
    public final Context f4741a;

    /* renamed from: b */
    public final PermissionExtractor f4742b;

    /* renamed from: c */
    public final CachedDataProvider.CachedData f4743c;

    public C1206Fk(Context context) {
        long j2 = f4740d;
        this.f4743c = new CachedDataProvider.CachedData(j2, j2, "sim-info");
        this.f4741a = context;
        this.f4742b = C2018ma.m4192h().m4201g();
    }

    /* renamed from: b */
    public final C1081Ak m2876b() {
        return new C1081Ak((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f4741a, "phone", "getting SimMcc", "TelephonyManager", new C1106Bk()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f4741a, "phone", "getting SimMnc", "TelephonyManager", new C1131Ck()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f4741a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C1181Ek(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f4741a, "phone", "getting SimOperatorName", "TelephonyManager", new C1156Dk()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1258Hm
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C1081Ak> mo2767a() {
        List<C1081Ak> list;
        try {
            List<C1081Ak> list2 = (List) this.f4743c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f4743c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C2018ma.f6725C.f6748u.m2778a().f7552n.f4725d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f4742b.hasPermission(this.f4741a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C1256Hk.m2942a(this.f4741a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(m2876b());
                    }
                } else {
                    arrayList.add(m2876b());
                }
            }
            this.f4743c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
