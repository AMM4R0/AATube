package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.Gg */
/* loaded from: classes.dex */
public final class C1227Gg implements IParamsAppender {

    /* renamed from: a */
    public final AdvIdWithLimitedAppender f4794a;

    /* renamed from: b */
    public final NetworkTaskForSendingDataParamsAppender f4795b;

    /* renamed from: c */
    public C2090p7 f4796c;

    /* renamed from: d */
    public long f4797d;

    public C1227Gg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    /* renamed from: a */
    public final void m2915a(C2090p7 c2090p7) {
        this.f4796c = c2090p7;
    }

    public C1227Gg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f4794a = advIdWithLimitedAppender;
        this.f4795b = networkTaskForSendingDataParamsAppender;
    }

    /* renamed from: a */
    public final void m2913a(long j2) {
        this.f4797d = j2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C1501Rg c1501Rg) {
        builder.path("report");
        this.f4795b.appendEncryptedData(builder);
        C2090p7 c2090p7 = this.f4796c;
        if (c2090p7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c2090p7.f6887a, c1501Rg.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f4796c.f6888b, c1501Rg.getUuid()));
            m2912a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f4796c.f6889c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f4796c.f6892f, c1501Rg.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f4796c.f6894h, c1501Rg.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f4796c.f6895i, c1501Rg.getOsVersion()));
            m2912a(builder, CommonUrlParts.OS_API_LEVEL, this.f4796c.f6896j);
            m2912a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f4796c.f6890d);
            m2912a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f4796c.f6891e);
            m2912a(builder, "app_debuggable", this.f4796c.f6893g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f4796c.f6897k, c1501Rg.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f4796c.f6898l, c1501Rg.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f4796c.f6899m, c1501Rg.getAppFramework()));
            m2912a(builder, "attribution_id", this.f4796c.f6900n);
        }
        builder.appendQueryParameter("api_key_128", c1501Rg.f5344n);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c1501Rg.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c1501Rg.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c1501Rg.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c1501Rg.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c1501Rg.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c1501Rg.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c1501Rg.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c1501Rg.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c1501Rg.getDeviceType());
        m2912a(builder, "clids_set", (String) WrapUtils.getOrDefault(c1501Rg.f5347q, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c1501Rg.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c1501Rg.getAppSetIdScope());
        this.f4794a.appendParams(builder, c1501Rg.getAdvertisingIdsHolder());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f4797d));
    }

    /* renamed from: a */
    public static void m2912a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
