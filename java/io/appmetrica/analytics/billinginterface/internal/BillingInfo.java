package io.appmetrica.analytics.billinginterface.internal;

/* loaded from: classes.dex */
public class BillingInfo {
    public final String productId;
    public final long purchaseTime;
    public final String purchaseToken;
    public long sendTime;
    public final ProductType type;

    public BillingInfo(ProductType productType, String str, String str2, long j2, long j3) {
        this.type = productType;
        this.productId = str;
        this.purchaseToken = str2;
        this.purchaseTime = j2;
        this.sendTime = j3;
    }

    public String toString() {
        return "BillingInfo{type=" + this.type + "productId='" + this.productId + "'purchaseToken='" + this.purchaseToken + "'purchaseTime=" + this.purchaseTime + "sendTime=" + this.sendTime + "}";
    }
}
