package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.M7 */
/* loaded from: classes.dex */
public final class C1368M7 {

    /* renamed from: a */
    public final boolean f5027a;

    /* renamed from: b */
    public DeferredDeeplinkListener f5028b;

    /* renamed from: c */
    public DeferredDeeplinkParametersListener f5029c;

    /* renamed from: d */
    public C1318K7 f5030d;

    public C1368M7(boolean z2) {
        this.f5027a = z2;
    }

    /* renamed from: a */
    public final void m3083a(int r9) {
        C1318K7 c1318k7 = this.f5030d;
        String str = c1318k7 == null ? null : c1318k7.f4950c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f5028b;
        if (deferredDeeplinkListener != null) {
            if (r9 == 0) {
                throw null;
            }
            int r6 = r9 - 1;
            deferredDeeplinkListener.onError(r6 != 0 ? r6 != 1 ? r6 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f5028b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f5029c;
        if (deferredDeeplinkParametersListener != null) {
            if (r9 == 0) {
                throw null;
            }
            int r92 = r9 - 1;
            deferredDeeplinkParametersListener.onError(r92 != 0 ? r92 != 1 ? r92 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f5029c = null;
        }
    }

    /* renamed from: a */
    public final void m3082a() {
        C1318K7 c1318k7 = this.f5030d;
        if (c1318k7 != null) {
            String str = c1318k7.f4949b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f5028b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f5028b = null;
                }
                if (!AbstractC2356zn.m4703a(this.f5030d.f4948a)) {
                    Map<String, String> map = this.f5030d.f4948a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f5029c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f5029c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f5030d.f4950c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f5029c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f5029c = null;
                    return;
                }
                return;
            }
            if (c1318k7.f4950c != null) {
                m3083a(2);
            } else {
                m3083a(3);
            }
        }
    }
}
