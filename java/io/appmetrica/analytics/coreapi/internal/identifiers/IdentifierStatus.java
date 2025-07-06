package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.AbstractC2489f;
import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");

    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f4253a;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2489f abstractC2489f) {
            this();
        }

        public final IdentifierStatus from(String str) {
            IdentifierStatus identifierStatus;
            IdentifierStatus[] values = IdentifierStatus.values();
            int length = values.length;
            int r2 = 0;
            while (true) {
                if (r2 >= length) {
                    identifierStatus = null;
                    break;
                }
                identifierStatus = values[r2];
                if (AbstractC2492i.m4911a(identifierStatus.getValue(), str)) {
                    break;
                }
                r2++;
            }
            return identifierStatus == null ? IdentifierStatus.UNKNOWN : identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.f4253a = str;
    }

    public static final IdentifierStatus from(String str) {
        return Companion.from(str);
    }

    public final String getValue() {
        return this.f4253a;
    }
}
