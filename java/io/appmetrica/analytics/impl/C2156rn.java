package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.rn */
/* loaded from: classes.dex */
public final class C2156rn {

    /* renamed from: c */
    public static final int[] f7086c = {0, 1, 2, 3};

    /* renamed from: a */
    public final SparseArray f7087a = new SparseArray();

    /* renamed from: b */
    public int f7088b = 0;

    public C2156rn(int[] r6) {
        for (int r02 : r6) {
            this.f7087a.put(r02, new HashMap());
        }
    }
}
