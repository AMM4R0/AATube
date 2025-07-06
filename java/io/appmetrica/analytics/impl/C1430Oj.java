package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.Oj */
/* loaded from: classes.dex */
public final class C1430Oj implements ServiceStorageProvider {

    /* renamed from: a */
    public final Context f5185a;

    /* renamed from: b */
    public final InterfaceC1406Nk f5186b;

    /* renamed from: c */
    public final SQLiteOpenHelper f5187c;

    public C1430Oj(Context context, InterfaceC1406Nk interfaceC1406Nk, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f5185a = context;
        this.f5186b = interfaceC1406Nk;
        this.f5187c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f5185a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f5185a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f5187c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f5185a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C1308Jm c1308Jm;
        C1765c7 m3695a = C1765c7.m3695a(this.f5185a);
        synchronized (m3695a) {
            try {
                if (m3695a.f6024o == null) {
                    Context context = m3695a.f6014e;
                    EnumC2055nm enumC2055nm = EnumC2055nm.SERVICE;
                    if (m3695a.f6023n == null) {
                        m3695a.f6023n = new C1283Im(new C1306Jk(m3695a.m3706h()), "temp_cache");
                    }
                    m3695a.f6024o = new C1308Jm(context, enumC2055nm, m3695a.f6023n);
                }
                c1308Jm = m3695a.f6024o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1308Jm;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new C2219ub(this.f5186b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C1323Kc(str, this.f5186b);
    }
}
