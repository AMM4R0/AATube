package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C1149Dd;
import io.appmetrica.analytics.impl.C1532Sm;
import java.util.Currency;

/* loaded from: classes.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g */
        private static final C1532Sm f4146g = new C1532Sm(new C1149Dd("revenue currency"));

        /* renamed from: a */
        final long f4147a;

        /* renamed from: b */
        final Currency f4148b;

        /* renamed from: c */
        Integer f4149c;

        /* renamed from: d */
        String f4150d;

        /* renamed from: e */
        String f4151e;

        /* renamed from: f */
        Receipt f4152f;

        public /* synthetic */ Builder(long j2, Currency currency, int r4) {
            this(j2, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f4151e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f4150d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f4149c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f4152f = receipt;
            return this;
        }

        private Builder(long j2, Currency currency) {
            f4146g.mo2706a(currency);
            this.f4147a = j2;
            this.f4148b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a */
            private String f4153a;

            /* renamed from: b */
            private String f4154b;

            public /* synthetic */ Builder(int r12) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f4153a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f4154b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int r2) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f4153a;
            this.signature = builder.f4154b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int r2) {
        this(builder);
    }

    public static Builder newBuilder(long j2, Currency currency) {
        return new Builder(j2, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f4147a;
        this.currency = builder.f4148b;
        this.quantity = builder.f4149c;
        this.productID = builder.f4150d;
        this.payload = builder.f4151e;
        this.receipt = builder.f4152f;
    }
}
