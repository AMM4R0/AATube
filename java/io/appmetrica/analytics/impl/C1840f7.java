package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2489f;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.f7 */
/* loaded from: classes.dex */
public final class C1840f7 implements ProtobufConverter {

    /* renamed from: a */
    public final C1399Nd f6197a;

    /* renamed from: b */
    public final C2040n7 f6198b;

    public C1840f7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2115q7 fromModel(C1890h7 c1890h7) {
        C2115q7 c2115q7 = new C2115q7();
        Integer num = c1890h7.f6365a;
        if (num != null) {
            c2115q7.f6969a = num.intValue();
        }
        String str = c1890h7.f6366b;
        if (str != null) {
            c2115q7.f6970b = str;
        }
        String str2 = c1890h7.f6367c;
        if (str2 != null) {
            c2115q7.f6971c = str2;
        }
        Long l2 = c1890h7.f6368d;
        if (l2 != null) {
            c2115q7.f6972d = l2.longValue();
        }
        C2015m7 c2015m7 = c1890h7.f6369e;
        if (c2015m7 != null) {
            c2115q7.f6973e = this.f6198b.fromModel(c2015m7);
        }
        String str3 = c1890h7.f6370f;
        if (str3 != null) {
            c2115q7.f6974f = str3;
        }
        String str4 = c1890h7.f6371g;
        if (str4 != null) {
            c2115q7.f6975g = str4;
        }
        Long l3 = c1890h7.f6372h;
        if (l3 != null) {
            c2115q7.f6976h = l3.longValue();
        }
        Integer num2 = c1890h7.f6373i;
        if (num2 != null) {
            c2115q7.f6977i = num2.intValue();
        }
        Integer num3 = c1890h7.f6374j;
        if (num3 != null) {
            c2115q7.f6978j = num3.intValue();
        }
        String str5 = c1890h7.f6375k;
        if (str5 != null) {
            c2115q7.f6979k = str5;
        }
        EnumC1244H8 enumC1244H8 = c1890h7.f6376l;
        if (enumC1244H8 != null) {
            c2115q7.f6980l = enumC1244H8.f4820a;
        }
        String str6 = c1890h7.f6377m;
        if (str6 != null) {
            c2115q7.f6981m = str6;
        }
        EnumC1768ca enumC1768ca = c1890h7.f6378n;
        if (enumC1768ca != null) {
            c2115q7.f6982n = enumC1768ca.f6047a;
        }
        EnumC2042n9 enumC2042n9 = c1890h7.f6379o;
        if (enumC2042n9 != null) {
            c2115q7.f6983o = enumC2042n9.f6804a;
        }
        Boolean bool = c1890h7.f6380p;
        if (bool != null) {
            c2115q7.f6984p = this.f6197a.fromModel(bool).intValue();
        }
        Integer num4 = c1890h7.f6381q;
        if (num4 != null) {
            c2115q7.f6985q = num4.intValue();
        }
        byte[] bArr = c1890h7.f6382r;
        if (bArr != null) {
            c2115q7.f6986r = bArr;
        }
        return c2115q7;
    }

    public C1840f7(C1399Nd c1399Nd, C2040n7 c2040n7) {
        this.f6197a = c1399Nd;
        this.f6198b = c2040n7;
    }

    public /* synthetic */ C1840f7(C1399Nd c1399Nd, C2040n7 c2040n7, int r3, AbstractC2489f abstractC2489f) {
        this((r3 & 1) != 0 ? new C1399Nd() : c1399Nd, (r3 & 2) != 0 ? new C2040n7(null, 1, null) : c2040n7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1890h7 toModel(C2115q7 c2115q7) {
        EnumC2042n9 enumC2042n9;
        C2115q7 c2115q72 = new C2115q7();
        int r3 = c2115q7.f6969a;
        Integer valueOf = r3 != c2115q72.f6969a ? Integer.valueOf(r3) : null;
        String str = c2115q7.f6970b;
        String str2 = !AbstractC2492i.m4911a(str, c2115q72.f6970b) ? str : null;
        String str3 = c2115q7.f6971c;
        String str4 = !AbstractC2492i.m4911a(str3, c2115q72.f6971c) ? str3 : null;
        long j2 = c2115q7.f6972d;
        Long valueOf2 = j2 != c2115q72.f6972d ? Long.valueOf(j2) : null;
        C2015m7 model = this.f6198b.toModel(c2115q7.f6973e);
        String str5 = c2115q7.f6974f;
        String str6 = !AbstractC2492i.m4911a(str5, c2115q72.f6974f) ? str5 : null;
        String str7 = c2115q7.f6975g;
        String str8 = !AbstractC2492i.m4911a(str7, c2115q72.f6975g) ? str7 : null;
        long j3 = c2115q7.f6976h;
        Long valueOf3 = Long.valueOf(j3);
        if (j3 == c2115q72.f6976h) {
            valueOf3 = null;
        }
        int r32 = c2115q7.f6977i;
        Integer valueOf4 = r32 != c2115q72.f6977i ? Integer.valueOf(r32) : null;
        int r33 = c2115q7.f6978j;
        Integer valueOf5 = r33 != c2115q72.f6978j ? Integer.valueOf(r33) : null;
        String str9 = c2115q7.f6979k;
        String str10 = !AbstractC2492i.m4911a(str9, c2115q72.f6979k) ? str9 : null;
        int r34 = c2115q7.f6980l;
        Integer valueOf6 = Integer.valueOf(r34);
        if (r34 == c2115q72.f6980l) {
            valueOf6 = null;
        }
        EnumC1244H8 m2926a = valueOf6 != null ? EnumC1244H8.m2926a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c2115q7.f6981m;
        String str12 = !AbstractC2492i.m4911a(str11, c2115q72.f6981m) ? str11 : null;
        int r35 = c2115q7.f6982n;
        Integer valueOf7 = Integer.valueOf(r35);
        if (r35 == c2115q72.f6982n) {
            valueOf7 = null;
        }
        EnumC1768ca m3712a = valueOf7 != null ? EnumC1768ca.m3712a(Integer.valueOf(valueOf7.intValue())) : null;
        int r36 = c2115q7.f6983o;
        Integer valueOf8 = Integer.valueOf(r36);
        if (r36 == c2115q72.f6983o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC2042n9[] values = EnumC2042n9.values();
            int length = values.length;
            int r7 = 0;
            while (true) {
                if (r7 < length) {
                    EnumC2042n9 enumC2042n92 = values[r7];
                    EnumC2042n9[] enumC2042n9Arr = values;
                    if (enumC2042n92.f6804a == intValue) {
                        enumC2042n9 = enumC2042n92;
                        break;
                    }
                    r7++;
                    values = enumC2042n9Arr;
                } else {
                    enumC2042n9 = EnumC2042n9.NATIVE;
                    break;
                }
            }
        } else {
            enumC2042n9 = null;
        }
        Boolean m3112a = this.f6197a.m3112a(c2115q7.f6984p);
        int r4 = c2115q7.f6985q;
        Integer valueOf9 = r4 != c2115q72.f6985q ? Integer.valueOf(r4) : null;
        byte[] bArr = c2115q7.f6986r;
        return new C1890h7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, m2926a, str12, m3712a, enumC2042n9, m3112a, valueOf9, !Arrays.equals(bArr, c2115q72.f6986r) ? bArr : null);
    }
}
