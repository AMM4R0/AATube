package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;

@DoNotInline
@TargetApi(C1842f9.f6210G)
/* renamed from: io.appmetrica.analytics.impl.Ub */
/* loaded from: classes.dex */
public final class C1571Ub implements InterfaceC1367M6 {

    /* renamed from: a */
    private final InterfaceC2049ng f5533a;

    public C1571Ub(InterfaceC2049ng interfaceC2049ng) {
        this.f5533a = interfaceC2049ng;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1367M6
    /* renamed from: a */
    public File mo3081a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), this.f5533a.mo3050a(str));
    }
}
