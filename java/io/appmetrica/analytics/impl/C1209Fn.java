package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Fn */
/* loaded from: classes.dex */
public final class C1209Fn implements InterfaceC1234Gn {
    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(List<C1184En> list) {
        LinkedList linkedList = new LinkedList();
        boolean z2 = true;
        for (C1184En c1184En : list) {
            if (!c1184En.f4714a) {
                linkedList.add(c1184En.f4715b);
                z2 = false;
            }
        }
        return z2 ? new C1184En(this, true, "") : new C1184En(this, false, TextUtils.join(", ", linkedList));
    }
}
