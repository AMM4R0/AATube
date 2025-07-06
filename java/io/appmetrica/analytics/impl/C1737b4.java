package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b4 */
/* loaded from: classes.dex */
public final class C1737b4 extends AbstractC1492R7 {
    @Override // io.appmetrica.analytics.impl.AbstractC1492R7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean mo3052a(C1513S3 c1513s3, C1513S3 c1513s32) {
        if (!AbstractC2356zn.m4703a(c1513s32.f5401a)) {
            if (AbstractC2356zn.m4703a(c1513s3.f5401a)) {
                return false;
            }
            EnumC1517S7 enumC1517S7 = c1513s3.f5402b;
            if (enumC1517S7 == EnumC1517S7.f5405c) {
                if (((Number) this.f5311a.m4482a(enumC1517S7)).intValue() < ((Number) this.f5311a.m4482a(c1513s32.f5402b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f5311a.m4482a(enumC1517S7)).intValue() <= ((Number) this.f5311a.m4482a(c1513s32.f5402b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
