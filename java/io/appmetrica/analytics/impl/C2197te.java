package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.te */
/* loaded from: classes.dex */
public final class C2197te implements InterfaceC1367M6 {

    /* renamed from: a */
    public final InterfaceC2049ng f7169a;

    public C2197te(InterfaceC2049ng interfaceC2049ng) {
        this.f7169a = interfaceC2049ng;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1367M6
    /* renamed from: a */
    public final File mo3081a(Context context, String str) {
        return context.getDatabasePath(this.f7169a.mo3050a(str));
    }
}
