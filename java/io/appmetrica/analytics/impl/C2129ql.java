package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ql */
/* loaded from: classes.dex */
public final class C2129ql implements IParamsAppender {

    /* renamed from: a */
    public final C1274Id f7008a;

    /* renamed from: b */
    public final InterfaceC1647Xc f7009b;

    public C2129ql(C1274Id c1274Id, InterfaceC1647Xc interfaceC1647Xc) {
        this.f7008a = c1274Id;
        this.f7009b = interfaceC1647Xc;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C2229ul c2229ul) {
        C1500Rf c1500Rf;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.DEVICE_ID), c2229ul.getDeviceId());
        m4361a(builder, C2018ma.f6725C.m4200f(), c2229ul);
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.APP_SET_ID), c2229ul.getAppSetId());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.APP_SET_ID_SCOPE), c2229ul.getAppSetIdScope());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.APP_PLATFORM), c2229ul.getAppPlatform());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.PROTOCOL_VERSION), c2229ul.getProtocolVersion());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c2229ul.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.MODEL), c2229ul.getModel());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.MANUFACTURER), c2229ul.getManufacturer());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.OS_VERSION), c2229ul.getOsVersion());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c2229ul.getScreenWidth()));
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c2229ul.getScreenHeight()));
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.SCREEN_DPI), String.valueOf(c2229ul.getScreenDpi()));
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c2229ul.getScaleFactor()));
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.LOCALE), c2229ul.getLocale());
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.DEVICE_TYPE), c2229ul.getDeviceType());
        builder.appendQueryParameter(this.f7008a.m2958a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("query_hosts"), String.valueOf(2));
        String m2958a = this.f7008a.m2958a("features");
        List<String> mo2837g = ((C1405Nj) this.f7009b).mo2837g();
        String[] strArr = {this.f7008a.m2958a("permissions_collecting"), this.f7008a.m2958a("features_collecting"), this.f7008a.m2958a("google_aid"), this.f7008a.m2958a("huawei_oaid"), this.f7008a.m2958a("sim_info"), this.f7008a.m2958a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(mo2837g);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(m2958a, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.APP_ID), c2229ul.getPackageName());
        builder.appendQueryParameter(this.f7008a.m2958a("app_debuggable"), ((C1540T5) c2229ul).f5463a);
        if (c2229ul.f7237l) {
            String str = c2229ul.f7238m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f7008a.m2958a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f7008a.m2958a("detect_locale"), String.valueOf(1));
        }
        C1513S3 c1513s3 = c2229ul.f7234i;
        if (!AbstractC2356zn.m4703a(c1513s3.f5401a)) {
            builder.appendQueryParameter(this.f7008a.m2958a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f7008a.m2958a("clids_set"), AbstractC1730am.m3628a(c1513s3.f5401a));
            int ordinal = c1513s3.f5402b.ordinal();
            builder.appendQueryParameter(this.f7008a.m2958a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c2229ul.f7231f;
            String str3 = c2229ul.f7232g;
            if (TextUtils.isEmpty(str2) && (c1500Rf = c2229ul.f7240o.f5221b) != null) {
                str2 = c1500Rf.f5330a;
                str3 = c1500Rf.f5333d.f5260a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f7008a.m2958a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f7008a.m2958a("install_referrer_source"), str3);
            }
        }
        String uuid = c2229ul.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f7008a.m2958a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("app_system_flag"), ((C1540T5) c2229ul).f5464b);
        builder.appendQueryParameter(this.f7008a.m2958a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f7008a.m2958a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mo2833c = ((C1405Nj) this.f7009b).mo2833c();
        for (String str4 : mo2833c.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mo2833c.get(str4)));
        }
    }

    /* renamed from: a */
    public final void m4361a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, C2229ul c2229ul) {
        AdvertisingIdsHolder advertisingIdsHolder = c2229ul.getAdvertisingIdsHolder();
        if (advertisingIdsHolder != null && !dataSendingRestrictionController.isRestrictedForReporter()) {
            AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f7008a.m2958a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
