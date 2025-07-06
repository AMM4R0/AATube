package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.e7 */
/* loaded from: classes.dex */
public final class C1815e7 {

    /* renamed from: a */
    public final InterfaceC1367M6 f6138a;

    /* renamed from: b */
    public final ArrayList f6139b;

    public C1815e7() {
        ArrayList arrayList = new ArrayList();
        this.f6139b = arrayList;
        if (AndroidUtils.isApiAchieved(21)) {
            this.f6138a = new C1571Ub(new C1467Q6());
            arrayList.add(new C1571Ub(new C1349Ld()));
        } else {
            this.f6138a = new C2197te(new C2222ue());
            arrayList.add(new C2197te(new C1349Ld()));
        }
    }
}
