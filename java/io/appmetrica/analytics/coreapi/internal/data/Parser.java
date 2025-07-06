package io.appmetrica.analytics.coreapi.internal.data;

import p105l1.C2633d;

/* loaded from: classes.dex */
public interface Parser<IN, OUT> {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <IN, OUT> OUT parseOrNull(Parser<? super IN, ? extends OUT> parser, IN r12) {
            OUT out;
            try {
                out = parser.parse(r12);
            } catch (Throwable th) {
                out = (OUT) new C2633d(th);
            }
            if (out instanceof C2633d) {
                return null;
            }
            return out;
        }
    }

    OUT parse(IN r12);

    OUT parseOrNull(IN r12);
}
