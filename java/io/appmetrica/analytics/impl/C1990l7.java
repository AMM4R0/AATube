package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.C2497n;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.l7 */
/* loaded from: classes.dex */
public final class C1990l7 {

    /* renamed from: a */
    public final Context f6625a;

    /* renamed from: b */
    public final int f6626b;

    /* renamed from: c */
    public final C1518S8 f6627c;

    /* renamed from: d */
    public final C2341z8 f6628d;

    /* renamed from: e */
    public final C1733b0 f6629e;

    /* renamed from: f */
    public final C1269I8 f6630f;

    /* renamed from: g */
    public final C2065o7 f6631g;

    /* renamed from: h */
    public final C1615W5 f6632h;

    public C1990l7(Context context, C1953jk c1953jk, int r3, C1518S8 c1518s8, C2341z8 c2341z8, C1733b0 c1733b0, C1269I8 r7, C2065o7 c2065o7) {
        this.f6625a = context;
        this.f6626b = r3;
        this.f6627c = c1518s8;
        this.f6628d = c2341z8;
        this.f6629e = c1733b0;
        this.f6630f = r7;
        this.f6631g = c2065o7;
        this.f6632h = c2341z8.f7518a;
    }

    /* renamed from: b */
    public static String m4093b() {
        C2497n c2497n = new C2497n();
        C1183Em m4219z = C2018ma.f6725C.m4219z();
        C1965k7 c1965k7 = new C1965k7(c2497n);
        synchronized (m4219z) {
            m4219z.f4713b.mo2922a(c1965k7);
        }
        return (String) c2497n.f8174a;
    }

    /* renamed from: a */
    public final C1890h7 m4094a() {
        JSONObject optJSONObject;
        C1658Xn c1658Xn;
        Location location;
        Integer valueOf = Integer.valueOf(this.f6632h.f5625e);
        String name = this.f6632h.getName();
        String value = this.f6632h.getValue();
        C1518S8 c1518s8 = this.f6627c;
        int r6 = this.f6626b;
        C1409Nn c1409Nn = c1518s8.f5410a.f5466a;
        synchronized (c1409Nn) {
            optJSONObject = c1409Nn.f5142a.m3193a().optJSONObject("numbers_of_type");
        }
        long optLong = optJSONObject != null ? optJSONObject.optLong(String.valueOf(r6)) : 0L;
        c1518s8.f5410a.m3353a(r6, 1 + optLong);
        Long valueOf2 = Long.valueOf(optLong);
        C2065o7 c2065o7 = this.f6631g;
        C1501Rg c1501Rg = c2065o7.f6843a;
        Location location2 = c1501Rg.f5335e;
        if (location2 != null) {
            int r7 = C1658Xn.f5701b;
            Location location3 = new Location(location2);
            String provider = location3.getProvider();
            location3.setProvider("");
            c1658Xn = new C1658Xn(location3, provider);
        } else {
            c1658Xn = (!c1501Rg.f5334d || (location = C2018ma.f6725C.m4203j().getLocation()) == null) ? null : new C1658Xn(new Location(location), "");
        }
        boolean z2 = c2065o7.f6843a.f5334d;
        Double valueOf3 = c1658Xn != null ? Double.valueOf(c1658Xn.getLatitude()) : null;
        Double valueOf4 = c1658Xn != null ? Double.valueOf(c1658Xn.getLongitude()) : null;
        Long valueOf5 = c1658Xn != null ? Long.valueOf(c1658Xn.getTime()) : null;
        Integer valueOf6 = c1658Xn != null ? Integer.valueOf((int) c1658Xn.getAccuracy()) : null;
        C2015m7 c2015m7 = new C2015m7(Boolean.valueOf(z2), valueOf4, valueOf3, c1658Xn != null ? Integer.valueOf((int) c1658Xn.getAltitude()) : null, c1658Xn != null ? Integer.valueOf((int) c1658Xn.getBearing()) : null, valueOf6, c1658Xn != null ? Integer.valueOf((int) c1658Xn.getSpeed()) : null, valueOf5, c1658Xn != null ? c1658Xn.getProvider() : null, c1658Xn != null ? c1658Xn.f5702a : null);
        String str = this.f6632h.f5623c;
        C1733b0 c1733b0 = this.f6629e;
        String str2 = c1733b0.f5898a;
        Long valueOf7 = Long.valueOf(c1733b0.f5899b);
        Integer valueOf8 = Integer.valueOf(this.f6632h.f5627g);
        Context context = this.f6625a;
        SafePackageManager safePackageManager = AbstractC1872ge.f6323a;
        Integer num = (Integer) AbstractC1872ge.f6326d.m4482a((EnumC1847fe) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC1847fe.UNDEFINED, new C1822ee()));
        num.intValue();
        String m4093b = m4093b();
        EnumC1244H8 enumC1244H8 = this.f6628d.f7519b;
        C1615W5 c1615w5 = this.f6632h;
        return new C1890h7(valueOf, name, value, valueOf2, c2015m7, str, str2, valueOf7, valueOf8, num, m4093b, enumC1244H8, c1615w5.f5628h, c1615w5.f5631k, c1615w5.f5632l, c1615w5.f5634n, c1615w5.f5635o, this.f6630f.fromModel(c1615w5.f5636p));
    }

    public /* synthetic */ C1990l7(Context context, C1953jk c1953jk, int r12, C1518S8 c1518s8, C2341z8 c2341z8, C1501Rg c1501Rg, C1733b0 c1733b0) {
        this(context, c1953jk, r12, c1518s8, c2341z8, c1733b0, new C1269I8(), new C2065o7(c1501Rg));
    }
}
