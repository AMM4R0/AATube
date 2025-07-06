package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a */
    private final AdTrackingInfoResult f4244a;

    /* renamed from: b */
    private final AdTrackingInfoResult f4245b;

    /* renamed from: c */
    private final AdTrackingInfoResult f4246c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f4244a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f4245b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f4246c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f4244a + ", mHuawei=" + this.f4245b + ", yandex=" + this.f4246c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f4244a = adTrackingInfoResult;
        this.f4245b = adTrackingInfoResult2;
        this.f4246c = adTrackingInfoResult3;
    }
}
