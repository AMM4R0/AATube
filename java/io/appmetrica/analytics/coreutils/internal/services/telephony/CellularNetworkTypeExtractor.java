package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public final class CellularNetworkTypeExtractor {
    public static final Companion Companion = new Companion(null);
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* renamed from: a */
    private final Context f4365a;

    /* renamed from: b */
    private final FunctionWithThrowable f4366b;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2489f abstractC2489f) {
            this();
        }

        private Companion() {
        }
    }

    @DoNotInline
    @TargetApi(24)
    /* renamed from: io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor$a */
    public static final class C1034a implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(TelephonyManager telephonyManager) {
            int dataNetworkType;
            dataNetworkType = telephonyManager.getDataNetworkType();
            return Integer.valueOf(dataNetworkType);
        }
    }

    @DoNotInline
    /* renamed from: io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor$b */
    public static final class C1035b implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(Context context) {
        this.f4365a = context;
        this.f4366b = AndroidUtils.isApiAchieved(24) ? new C1034a() : new C1035b();
    }

    public final Context getContext() {
        return this.f4365a;
    }

    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f4365a, "phone", "Extracting cellular networkType", "TelephonyManager", this.f4366b));
    }
}
