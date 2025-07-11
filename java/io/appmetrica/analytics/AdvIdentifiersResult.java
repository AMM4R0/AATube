package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AdvIdentifiersResult {
    public final AdvId googleAdvId;
    public final AdvId huaweiAdvId;
    public final AdvId yandexAdvId;

    public static class AdvId {
        public final String advId;
        public final Details details;
        public final String errorExplanation;

        public AdvId(String str, Details details, String str2) {
            this.advId = str;
            this.details = details;
            this.errorExplanation = str2;
        }
    }

    public enum Details {
        OK,
        IDENTIFIER_PROVIDER_UNAVAILABLE,
        INVALID_ADV_ID,
        FEATURE_DISABLED,
        NO_STARTUP,
        INTERNAL_ERROR
    }

    public AdvIdentifiersResult(AdvId advId, AdvId advId2, AdvId advId3) {
        this.googleAdvId = advId;
        this.huaweiAdvId = advId2;
        this.yandexAdvId = advId3;
    }
}
