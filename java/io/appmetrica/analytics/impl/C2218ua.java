package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ua */
/* loaded from: classes.dex */
public final class C2218ua extends AbstractC1537T2 {

    /* renamed from: b */
    public final C2143ra f7217b;

    /* renamed from: c */
    public final C2143ra f7218c;

    /* renamed from: d */
    public final C2193ta f7219d;

    public C2218ua(int r2, int r3, int r4) {
        this(r2, new C2143ra(r3), new C2143ra(r4));
    }

    public C2218ua(int r12, C2143ra c2143ra, C2143ra c2143ra2) {
        super(r12);
        this.f7219d = new C2193ta();
        this.f7217b = c2143ra;
        this.f7218c = c2143ra2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1537T2, io.appmetrica.analytics.impl.InterfaceC2168sa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1731an mo3342a(Map<String, String> map) {
        HashMap hashMap;
        int r3;
        int r02 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f7219d);
            int length = entryArr.length;
            r3 = 0;
            int r4 = 0;
            boolean z2 = false;
            int r6 = 0;
            while (r02 < length) {
                Map.Entry entry = entryArr[r02];
                C1731an mo3342a = this.f7217b.mo3342a((String) entry.getKey());
                C1731an mo3342a2 = this.f7218c.mo3342a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) mo3342a2.f5895a) + StringUtils.getUtf8BytesLength((String) mo3342a.f5895a);
                if (z2 || utf8BytesLength2 + r6 > this.f5459a) {
                    r4++;
                    r3 += utf8BytesLength;
                    z2 = true;
                } else {
                    r3 = mo3342a2.f5896b.getBytesTruncated() + mo3342a.f5896b.getBytesTruncated() + r3;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) mo3342a2.f5895a) + StringUtils.getUtf8BytesLength((String) mo3342a.f5895a) + r6;
                    hashMap.put(mo3342a.f5895a, mo3342a2.f5895a);
                    r6 = utf8BytesLength3;
                }
                r02++;
            }
            r02 = r4;
        } else {
            hashMap = null;
            r3 = 0;
        }
        return new C1731an(hashMap, new C1240H4(r02, r3));
    }
}
