package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Z1 */
/* loaded from: classes.dex */
public final class C1685Z1 implements ProtobufConverter {

    /* renamed from: a */
    public final C1363M2 f5781a;

    public C1685Z1() {
        this(new C1363M2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1760c2 fromModel(C1661Y1 c1661y1) {
        C1760c2 c1760c2 = new C1760c2();
        c1760c2.f5966a = new C1735b2[c1661y1.f5708a.size()];
        int r2 = 0;
        int r3 = 0;
        for (PermissionState permissionState : c1661y1.f5708a) {
            C1735b2[] c1735b2Arr = c1760c2.f5966a;
            C1735b2 c1735b2 = new C1735b2();
            c1735b2.f5902a = permissionState.name;
            c1735b2.f5903b = permissionState.granted;
            c1735b2Arr[r3] = c1735b2;
            r3++;
        }
        C1413O2 c1413o2 = c1661y1.f5709b;
        if (c1413o2 != null) {
            c1760c2.f5967b = this.f5781a.fromModel(c1413o2);
        }
        c1760c2.f5968c = new String[c1661y1.f5710c.size()];
        Iterator it = c1661y1.f5710c.iterator();
        while (it.hasNext()) {
            c1760c2.f5968c[r2] = (String) it.next();
            r2++;
        }
        return c1760c2;
    }

    public C1685Z1(C1363M2 c1363m2) {
        this.f5781a = c1363m2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1661Y1 toModel(C1760c2 c1760c2) {
        ArrayList arrayList = new ArrayList();
        int r12 = 0;
        int r2 = 0;
        while (true) {
            C1735b2[] c1735b2Arr = c1760c2.f5966a;
            if (r2 >= c1735b2Arr.length) {
                break;
            }
            C1735b2 c1735b2 = c1735b2Arr[r2];
            arrayList.add(new PermissionState(c1735b2.f5902a, c1735b2.f5903b));
            r2++;
        }
        C1710a2 c1710a2 = c1760c2.f5967b;
        C1413O2 model = c1710a2 != null ? this.f5781a.toModel(c1710a2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c1760c2.f5968c;
            if (r12 < strArr.length) {
                arrayList2.add(strArr[r12]);
                r12++;
            } else {
                return new C1661Y1(arrayList, model, arrayList2);
            }
        }
    }
}
