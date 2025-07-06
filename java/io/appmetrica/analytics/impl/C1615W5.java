package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.W5 */
/* loaded from: classes.dex */
public class C1615W5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C1615W5> CREATOR = new C1590V5();

    /* renamed from: a */
    protected String f5621a;

    /* renamed from: b */
    protected String f5622b;

    /* renamed from: c */
    public String f5623c;

    /* renamed from: d */
    public int f5624d;

    /* renamed from: e */
    public int f5625e;

    /* renamed from: f */
    public Pair f5626f;

    /* renamed from: g */
    public int f5627g;

    /* renamed from: h */
    public String f5628h;

    /* renamed from: i */
    public long f5629i;

    /* renamed from: j */
    public long f5630j;

    /* renamed from: k */
    public EnumC1768ca f5631k;

    /* renamed from: l */
    public EnumC2042n9 f5632l;

    /* renamed from: m */
    public Bundle f5633m;

    /* renamed from: n */
    public Boolean f5634n;

    /* renamed from: o */
    public Integer f5635o;

    /* renamed from: p */
    public Map f5636p;

    public C1615W5() {
        this("", 0);
    }

    /* renamed from: a */
    public final void m3475a(String str, String str2) {
        if (this.f5626f == null) {
            this.f5626f = new Pair(str, str2);
        }
    }

    /* renamed from: b */
    public final Pair<String, String> m3476b() {
        return this.f5626f;
    }

    /* renamed from: c */
    public final void m3480c(Bundle bundle) {
        this.f5633m = bundle;
    }

    /* renamed from: d */
    public final long m3482d() {
        return this.f5629i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m3484e() {
        return this.f5630j;
    }

    /* renamed from: f */
    public final String m3485f() {
        return this.f5623c;
    }

    /* renamed from: g */
    public final EnumC1768ca m3486g() {
        return this.f5631k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f5627g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f5625e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f5636p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f5621a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f5624d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f5622b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f5622b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: h */
    public final Integer m3487h() {
        return this.f5635o;
    }

    /* renamed from: i */
    public final Bundle m3488i() {
        return this.f5633m;
    }

    /* renamed from: j */
    public final String m3489j() {
        return this.f5628h;
    }

    /* renamed from: k */
    public final EnumC2042n9 m3490k() {
        return this.f5632l;
    }

    /* renamed from: l */
    public final boolean m3491l() {
        return this.f5621a == null;
    }

    /* renamed from: m */
    public final boolean m3492m() {
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        return -1 == this.f5624d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int r12) {
        this.f5627g = r12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int r12) {
        this.f5625e = r12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f5636p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f5621a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int r12) {
        this.f5624d = r12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f5622b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f5622b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f5621a;
        String str2 = EnumC1670Ya.m3538a(this.f5624d).f5767b;
        String str3 = this.f5622b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        StringBuilder sb = new StringBuilder("[event: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(str2);
        sb.append(", value: ");
        return AbstractC0002c.m17l(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f5621a);
        bundle.putString("CounterReport.Value", this.f5622b);
        bundle.putInt("CounterReport.Type", this.f5624d);
        bundle.putInt("CounterReport.CustomType", this.f5625e);
        bundle.putInt("CounterReport.TRUNCATED", this.f5627g);
        bundle.putString("CounterReport.ProfileID", this.f5628h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f5631k.f6047a);
        Bundle bundle2 = this.f5633m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f5623c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f5626f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f5629i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f5630j);
        EnumC2042n9 enumC2042n9 = this.f5632l;
        if (enumC2042n9 != null) {
            bundle.putInt("CounterReport.Source", enumC2042n9.f6804a);
        }
        Boolean bool = this.f5634n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f5635o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f5636p));
        parcel.writeBundle(bundle);
    }

    public C1615W5(String str, int r3) {
        this("", str, r3);
    }

    /* renamed from: e */
    public static C1615W5 m3469e(C1615W5 c1615w5) {
        return m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: b */
    public final void m3478b(String str) {
        this.f5623c = str;
    }

    /* renamed from: c */
    public void mo3481c(String str) {
        this.f5628h = str;
    }

    /* renamed from: d */
    public final Bundle m3483d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C1615W5(String str, String str2, int r4) {
        this(str, str2, r4, new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m3470a(long j2) {
        this.f5629i = j2;
    }

    /* renamed from: b */
    public final void m3477b(long j2) {
        this.f5630j = j2;
    }

    /* renamed from: c */
    public final Boolean m3479c() {
        return this.f5634n;
    }

    public C1615W5(String str, String str2, int r4, SystemTimeProvider systemTimeProvider) {
        this.f5631k = EnumC1768ca.UNKNOWN;
        this.f5636p = new HashMap();
        this.f5621a = str2;
        this.f5624d = r4;
        this.f5622b = str;
        this.f5629i = systemTimeProvider.elapsedRealtime();
        this.f5630j = systemTimeProvider.currentTimeMillis();
    }

    /* renamed from: b */
    public static C1615W5 m3465b(Bundle bundle) {
        if (bundle != null) {
            try {
                C1615W5 c1615w5 = (C1615W5) bundle.getParcelable("CounterReport.Object");
                if (c1615w5 != null) {
                    return c1615w5;
                }
            } catch (Throwable unused) {
                return new C1615W5("", 0);
            }
        }
        return new C1615W5("", 0);
    }

    /* renamed from: c */
    public static C1615W5 m3467c(C1615W5 c1615w5) {
        return m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_INIT);
    }

    /* renamed from: d */
    public static C1615W5 m3468d(C1615W5 c1615w5) {
        C1615W5 c1615w52 = new C1615W5("", 0);
        c1615w52.f5630j = c1615w5.f5630j;
        c1615w52.f5629i = c1615w5.f5629i;
        c1615w52.f5626f = c1615w5.f5626f;
        c1615w52.f5623c = c1615w5.f5623c;
        c1615w52.f5633m = c1615w5.f5633m;
        c1615w52.f5636p = c1615w5.f5636p;
        c1615w52.f5628h = c1615w5.f5628h;
        return c1615w52;
    }

    /* renamed from: a */
    public final void m3471a(EnumC1768ca enumC1768ca) {
        this.f5631k = enumC1768ca;
    }

    /* renamed from: a */
    public final void m3472a(EnumC2042n9 enumC2042n9) {
        this.f5632l = enumC2042n9;
    }

    /* renamed from: a */
    public final void m3473a(Boolean bool) {
        this.f5634n = bool;
    }

    /* renamed from: a */
    public final void m3474a(Integer num) {
        this.f5635o = num;
    }

    /* renamed from: a */
    public static Pair m3456a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    /* renamed from: b */
    public static C1615W5 m3466b(C1615W5 c1615w5) {
        return m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* renamed from: a */
    public static C1615W5 m3460a(C1615W5 c1615w5, EnumC1670Ya enumC1670Ya) {
        C1615W5 m3468d = m3468d(c1615w5);
        m3468d.f5624d = enumC1670Ya.f5766a;
        return m3468d;
    }

    /* renamed from: a */
    public static C1615W5 m3458a(C1615W5 c1615w5) {
        return m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_ALIVE);
    }

    /* renamed from: a */
    public static C1615W5 m3459a(C1615W5 c1615w5, C1370M9 c1370m9) {
        C1615W5 m3460a = m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_START);
        m3460a.setValueBytes(MessageNano.toByteArray(new C2117q9().fromModel(new C2092p9((String) c1370m9.f5051a.m3832a()))));
        m3460a.f5630j = c1615w5.f5630j;
        m3460a.f5629i = c1615w5.f5629i;
        return m3460a;
    }

    /* renamed from: a */
    public static C1615W5 m3462a(C1615W5 c1615w5, Collection<PermissionState> collection, C1413O2 c1413o2, C1885h2 c1885h2, List<String> list) {
        String str;
        String str2;
        C1615W5 m3468d = m3468d(c1615w5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c1413o2 != null) {
                jSONObject.put("background_restricted", c1413o2.f5147b);
                EnumC1388N2 enumC1388N2 = c1413o2.f5146a;
                c1885h2.getClass();
                if (enumC1388N2 != null) {
                    int ordinal = enumC1388N2.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        m3468d.f5624d = 12288;
        m3468d.setValue(str);
        return m3468d;
    }

    /* renamed from: a */
    public static C1615W5 m3461a(C1615W5 c1615w5, String str) {
        C1615W5 m3468d = m3468d(c1615w5);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        m3468d.f5624d = 12289;
        m3468d.setValue(str);
        return m3468d;
    }

    /* renamed from: a */
    public static C1615W5 m3457a() {
        C1615W5 c1615w5 = new C1615W5("", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 16384;
        return c1615w5;
    }

    /* renamed from: a */
    public static C1615W5 m3463a(C1873gf c1873gf) {
        String str = "";
        int r2 = 0;
        C1615W5 c1615w5 = new C1615W5("", "", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 40976;
        ProductInfo productInfo = c1873gf.f6327a;
        C2101pi c2101pi = new C2101pi();
        c2101pi.f6923a = productInfo.quantity;
        c2101pi.f6928f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        c2101pi.f6924b = str.getBytes();
        c2101pi.f6925c = productInfo.sku.getBytes();
        C1976ki c1976ki = new C1976ki();
        c1976ki.f6589a = productInfo.purchaseOriginalJson.getBytes();
        c1976ki.f6590b = productInfo.signature.getBytes();
        c2101pi.f6927e = c1976ki;
        c2101pi.f6929g = true;
        c2101pi.f6930h = 1;
        c2101pi.f6931i = AbstractC1848ff.f6266a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        C2076oi c2076oi = new C2076oi();
        c2076oi.f6868a = productInfo.purchaseToken.getBytes();
        c2076oi.f6869b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        c2101pi.f6932j = c2076oi;
        if (productInfo.type == ProductType.SUBS) {
            C2051ni c2051ni = new C2051ni();
            c2051ni.f6824a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                C2026mi c2026mi = new C2026mi();
                c2026mi.f6775a = period.number;
                int r6 = AbstractC1848ff.f6267b[period.timeUnit.ordinal()];
                c2026mi.f6776b = r6 != 1 ? r6 != 2 ? r6 != 3 ? r6 != 4 ? 0 : 4 : 3 : 2 : 1;
                c2051ni.f6825b = c2026mi;
            }
            C2001li c2001li = new C2001li();
            c2001li.f6660a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                C2026mi c2026mi2 = new C2026mi();
                c2026mi2.f6775a = period2.number;
                int r9 = AbstractC1848ff.f6267b[period2.timeUnit.ordinal()];
                if (r9 == 1) {
                    r2 = 1;
                } else if (r9 == 2) {
                    r2 = 2;
                } else if (r9 == 3) {
                    r2 = 3;
                } else if (r9 == 4) {
                    r2 = 4;
                }
                c2026mi2.f6776b = r2;
                c2001li.f6661b = c2026mi2;
            }
            c2001li.f6662c = productInfo.introductoryPriceCycles;
            c2051ni.f6826c = c2001li;
            c2101pi.f6933k = c2051ni;
        }
        c1615w5.setValueBytes(MessageNano.toByteArray(c2101pi));
        return c1615w5;
    }

    /* renamed from: a */
    public static C1615W5 m3464a(String str) {
        C1615W5 c1615w5 = new C1615W5("", 0);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 12320;
        c1615w5.f5622b = str;
        c1615w5.f5632l = EnumC2042n9.JS;
        return c1615w5;
    }
}
