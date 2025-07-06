package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.t2 */
/* loaded from: classes.dex */
public final class C2185t2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1257Hl fromModel(C2160s2 c2160s2) {
        C1207Fl c1207Fl;
        C1257Hl c1257Hl = new C1257Hl();
        c1257Hl.f4827a = new C1232Gl[c2160s2.f7099a.size()];
        for (int r12 = 0; r12 < c2160s2.f7099a.size(); r12++) {
            C1232Gl c1232Gl = new C1232Gl();
            Pair pair = (Pair) c2160s2.f7099a.get(r12);
            c1232Gl.f4805a = (String) pair.first;
            if (pair.second != null) {
                c1232Gl.f4806b = new C1207Fl();
                C2135r2 c2135r2 = (C2135r2) pair.second;
                if (c2135r2 == null) {
                    c1207Fl = null;
                } else {
                    C1207Fl c1207Fl2 = new C1207Fl();
                    c1207Fl2.f4745a = c2135r2.f7014a;
                    c1207Fl = c1207Fl2;
                }
                c1232Gl.f4806b = c1207Fl;
            }
            c1257Hl.f4827a[r12] = c1232Gl;
        }
        return c1257Hl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2160s2 toModel(C1257Hl c1257Hl) {
        ArrayList arrayList = new ArrayList();
        for (C1232Gl c1232Gl : c1257Hl.f4827a) {
            String str = c1232Gl.f4805a;
            C1207Fl c1207Fl = c1232Gl.f4806b;
            arrayList.add(new Pair(str, c1207Fl == null ? null : new C2135r2(c1207Fl.f4745a)));
        }
        return new C2160s2(arrayList);
    }
}
