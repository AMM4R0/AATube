package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: J1.H */
/* loaded from: classes.dex */
public final class C0240H extends IOException {

    /* renamed from: a */
    public final EnumC0242b f704a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240H(EnumC0242b errorCode) {
        super("stream was reset: " + errorCode);
        AbstractC2492i.m4915e(errorCode, "errorCode");
        this.f704a = errorCode;
    }
}
