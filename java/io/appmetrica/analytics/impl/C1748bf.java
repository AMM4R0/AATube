package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.bf */
/* loaded from: classes.dex */
public final class C1748bf implements Parcelable {

    /* renamed from: a */
    public final ContentValues f5921a;

    /* renamed from: b */
    public final ResultReceiver f5922b;

    /* renamed from: c */
    public static final String f5920c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C1748bf> CREATOR = new C1723af();

    public C1748bf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f5921a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f5920c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f5922b = resultReceiver;
    }

    /* renamed from: a */
    public final void m3651a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap m3631b = AbstractC1730am.m3631b(map);
            synchronized (this) {
                this.f5921a.put("PROCESS_CFG_CLIDS", AbstractC1794db.m3754b(m3631b));
            }
        }
    }

    /* renamed from: b */
    public final void m3653b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f5921a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC1794db.m3753b(list));
            }
        }
    }

    /* renamed from: c */
    public final void m3655c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f5921a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            m3662j();
        }
    }

    /* renamed from: d */
    public final String m3656d() {
        return this.f5921a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m3657e() {
        return this.f5921a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public final String m3658f() {
        return this.f5921a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public final Integer m3659g() {
        return this.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public final String m3660h() {
        return this.f5921a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public final boolean m3661i() {
        return this.f5921a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    /* renamed from: j */
    public final synchronized void m3662j() {
        this.f5921a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f5921a + ", mDataResultReceiver=" + this.f5922b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f5921a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f5922b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public final HashMap m3650a() {
        return AbstractC1794db.m3756c(this.f5921a.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: b */
    public final ArrayList m3652b() {
        String asString = this.f5921a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC1794db.m3755b(asString);
    }

    /* renamed from: c */
    public final ResultReceiver m3654c() {
        return this.f5922b;
    }

    public C1748bf(C1748bf c1748bf) {
        synchronized (c1748bf) {
            this.f5921a = new ContentValues(c1748bf.f5921a);
            this.f5922b = c1748bf.f5922b;
        }
    }

    public C1748bf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f5921a = contentValues == null ? new ContentValues() : contentValues;
        this.f5922b = resultReceiver;
    }
}
