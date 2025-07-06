package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Qd */
/* loaded from: classes.dex */
public final class C1474Qd implements InterfaceC1766c8 {

    /* renamed from: a */
    public final C1548Td f5252a;

    /* renamed from: b */
    public final C1314K3 f5253b;

    /* renamed from: c */
    public final C2143ra f5254c;

    /* renamed from: d */
    public final C1948jf f5255d;

    public C1474Qd() {
        this(new C1548Td(), new C1314K3(), new C2143ra(100), new C1948jf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1876gi> fromModel(C1449Pd c1449Pd) {
        C1876gi c1876gi;
        C2241v8 c2241v8 = new C2241v8();
        c2241v8.f7273a = c1449Pd.f5216a;
        c2241v8.f7278f = new C1966k8();
        C1498Rd c1498Rd = c1449Pd.f5217b;
        C1916i8 c1916i8 = new C1916i8();
        c1916i8.f6475a = StringUtils.getUTF8Bytes(c1498Rd.f5321a);
        C1731an mo3342a = this.f5254c.mo3342a(c1498Rd.f5322b);
        c1916i8.f6476b = StringUtils.getUTF8Bytes((String) mo3342a.f5895a);
        c1916i8.f6479e = c1498Rd.f5323c.size();
        Map<String, String> map = c1498Rd.f5324d;
        if (map != null) {
            c1876gi = this.f5252a.fromModel(map);
            c1916i8.f6477c = (C2016m8) c1876gi.f6330a;
        } else {
            c1876gi = null;
        }
        c2241v8.f7278f.f6568a = c1916i8;
        C1089B3 c1089b3 = new C1089B3(C1089B3.m2745b(mo3342a, c1876gi));
        List list = c1498Rd.f5323c;
        ArrayList arrayList = new ArrayList();
        this.f5255d.getClass();
        int computeInt32Size = c2241v8.f7273a != new C2241v8().f7273a ? CodedOutputByteBufferNano.computeInt32Size(1, c2241v8.f7273a) : 0;
        C2216u8 c2216u8 = c2241v8.f7274b;
        if (c2216u8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c2216u8);
        }
        C2166s8 c2166s8 = c2241v8.f7275c;
        if (c2166s8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c2166s8);
        }
        C2191t8 c2191t8 = c2241v8.f7276d;
        int r10 = 4;
        if (c2191t8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c2191t8);
        }
        C1816e8 c1816e8 = c2241v8.f7277e;
        if (c1816e8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c1816e8);
        }
        C1966k8 c1966k8 = c2241v8.f7278f;
        if (c1966k8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c1966k8);
        }
        ArrayList arrayList2 = new ArrayList();
        C2241v8 c2241v82 = new C2241v8();
        c2241v82.f7273a = c2241v8.f7273a;
        C1966k8 c1966k82 = new C1966k8();
        c2241v82.f7278f = c1966k82;
        c1966k82.f6568a = new C1916i8();
        C1916i8 c1916i82 = c2241v82.f7278f.f6568a;
        C1916i8 c1916i83 = c2241v8.f7278f.f6568a;
        c1916i82.f6476b = c1916i83.f6476b;
        c1916i82.f6475a = c1916i83.f6475a;
        c1916i82.f6479e = c1916i83.f6479e;
        c1916i82.f6477c = c1916i83.f6477c;
        int r12 = 0;
        C1089B3 c1089b32 = c1089b3;
        int r14 = computeInt32Size;
        while (r12 < list.size()) {
            C1339L3 c1339l3 = (C1339L3) list.get(r12);
            C1941j8 c1941j8 = new C1941j8();
            c1941j8.f6529a = r12;
            C1876gi fromModel = this.f5253b.fromModel(c1339l3);
            c1941j8.f6530b = (C1841f8) fromModel.f6330a;
            C1876gi c1876gi2 = new C1876gi(c1941j8, fromModel);
            C1948jf c1948jf = this.f5255d;
            C1941j8 c1941j82 = (C1941j8) c1876gi2.f6330a;
            c1948jf.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(r10);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c1941j82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && r14 + computeRawVarint32Size > 204800) {
                c2241v82.f7278f.f6568a.f6478d = (C1941j8[]) arrayList2.toArray(new C1941j8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C1876gi(c2241v82, c1089b32));
                C2241v8 c2241v83 = new C2241v8();
                c2241v83.f7273a = c2241v8.f7273a;
                C1966k8 c1966k83 = new C1966k8();
                c2241v83.f7278f = c1966k83;
                c1966k83.f6568a = new C1916i8();
                C1916i8 c1916i84 = c2241v83.f7278f.f6568a;
                C1916i8 c1916i85 = c2241v8.f7278f.f6568a;
                c1916i84.f6476b = c1916i85.f6476b;
                c1916i84.f6475a = c1916i85.f6475a;
                c1916i84.f6479e = c1916i85.f6479e;
                c1916i84.f6477c = c1916i85.f6477c;
                c1089b32 = c1089b3;
                r14 = computeInt32Size;
                c2241v82 = c2241v83;
                arrayList2 = arrayList3;
            }
            arrayList2.add(c1876gi2.f6330a);
            c1089b32 = new C1089B3(C1089B3.m2745b(c1089b32, c1876gi2.f6331b));
            r14 += computeRawVarint32Size;
            r12++;
            r10 = 4;
        }
        c2241v82.f7278f.f6568a.f6478d = (C1941j8[]) arrayList2.toArray(new C1941j8[arrayList2.size()]);
        arrayList.add(new C1876gi(c2241v82, c1089b32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1474Qd(C1548Td c1548Td, C1314K3 c1314k3, C2143ra c2143ra, C1948jf c1948jf) {
        this.f5252a = c1548Td;
        this.f5253b = c1314k3;
        this.f5254c = c2143ra;
        this.f5255d = c1948jf;
    }

    /* renamed from: a */
    public final C1449Pd m3234a(List<C1876gi> list) {
        throw new UnsupportedOperationException();
    }
}
