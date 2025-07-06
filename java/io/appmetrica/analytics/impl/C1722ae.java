package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import p002A1.AbstractC0025r;

/* renamed from: io.appmetrica.analytics.impl.ae */
/* loaded from: classes.dex */
public final class C1722ae {

    /* renamed from: a */
    public final Context f5869a;

    /* renamed from: b */
    public final C1134Cn f5870b;

    /* renamed from: c */
    public final C1159Dn f5871c;

    public C1722ae(Context context) {
        this(context, new C1134Cn(), new C1159Dn());
    }

    /* renamed from: a */
    public final String m3609a(String str) {
        try {
            this.f5871c.getClass();
            if (!C1159Dn.m2846a(str)) {
                this.f5870b.getClass();
                str = AbstractC0025r.m154G(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5869a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC1271Ia.m2956a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C1722ae(Context context, C1134Cn c1134Cn, C1159Dn c1159Dn) {
        this.f5869a = context;
        this.f5870b = c1134Cn;
        this.f5871c = c1159Dn;
    }

    /* renamed from: a */
    public final void m3610a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5869a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f5869a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
