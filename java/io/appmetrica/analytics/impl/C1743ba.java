package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import java.io.File;
import p125s1.AbstractC2748c;

/* renamed from: io.appmetrica.analytics.impl.ba */
/* loaded from: classes.dex */
public final class C1743ba implements InterfaceC1508Rn {

    /* renamed from: a */
    public final Context f5916a;

    /* renamed from: b */
    public final String f5917b;

    public C1743ba(Context context, String str) {
        this.f5916a = context;
        this.f5917b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1508Rn
    /* renamed from: a */
    public final String mo2712a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5916a, this.f5917b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f5916a, this.f5917b);
                if (fileFromAppStorage != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                return AbstractC2748c.m5341G(fileFromSdkStorage);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1508Rn
    /* renamed from: a */
    public final void mo2713a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5916a, this.f5917b);
            if (fileFromSdkStorage != null) {
                AbstractC2748c.m5342H(fileFromSdkStorage, str);
            }
        } catch (Throwable unused) {
        }
    }
}
