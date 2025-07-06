package io.appmetrica.analytics.modulesapi.internal.service;

import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.io.File;

/* loaded from: classes.dex */
public interface ServiceStorageProvider {
    File getAppDataStorage();

    File getAppFileStorage();

    SQLiteOpenHelper getDbStorage();

    File getSdkDataStorage();

    TempCacheStorage getTempCacheStorage();

    ModulePreferences legacyModulePreferences();

    ModulePreferences modulePreferences(String str);
}
