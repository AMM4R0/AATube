package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.a3 */
/* loaded from: classes.dex */
public abstract class AbstractC1711a3 implements InterfaceC1121Ca {

    /* renamed from: m */
    public static final HashSet f5833m = new HashSet(Arrays.asList(1, 13));

    /* renamed from: n */
    public static final C1662Y2 f5834n = new C1662Y2();

    /* renamed from: a */
    protected final Context f5835a;

    /* renamed from: b */
    protected final C2000lh f5836b;

    /* renamed from: c */
    protected final C2123qf f5837c;

    /* renamed from: d */
    protected final C1856fn f5838d;

    /* renamed from: e */
    protected final C1924ig f5839e;

    /* renamed from: f */
    protected final C2339z6 f5840f;

    /* renamed from: g */
    public final C1683Z f5841g;

    /* renamed from: h */
    protected final C1726ai f5842h;

    /* renamed from: i */
    public C1944jb f5843i;

    /* renamed from: j */
    public final InterfaceC1773cf f5844j;

    /* renamed from: k */
    public final C1370M9 f5845k;

    /* renamed from: l */
    public final C1947je f5846l;

    public AbstractC1711a3(Context context, C1726ai c1726ai, C2000lh c2000lh, C1370M9 c1370m9, C1671Yb c1671Yb, C1856fn c1856fn, C1924ig c1924ig, C2339z6 c2339z6, C1683Z c1683z, C1947je c1947je) {
        this.f5835a = context.getApplicationContext();
        this.f5842h = c1726ai;
        this.f5836b = c2000lh;
        this.f5845k = c1370m9;
        this.f5838d = c1856fn;
        this.f5839e = c1924ig;
        this.f5840f = c2339z6;
        this.f5841g = c1683z;
        this.f5846l = c1947je;
        C2123qf m3315a = AbstractC1521Sb.m3315a(c2000lh.m3978b().getApiKey());
        this.f5837c = m3315a;
        c2000lh.m4106a(new C1331Kk(m3315a, "Crash Environment"));
        if (AbstractC2336z3.m4672a(c2000lh.m3978b().isLogEnabled())) {
            m3315a.m3364a(true);
        }
        this.f5844j = c1671Yb;
    }

    /* renamed from: a */
    public void mo2757a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C1144D8 c1144d8 = this.f5836b.f6655c;
            c1144d8.f4634b.m3030b(c1144d8.f4633a, str, str2);
        } else if (this.f5837c.f5471b) {
            this.f5837c.m3359a(5, "Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    /* renamed from: b */
    public final void m3590b(Map<String, String> map) {
        if (AbstractC2356zn.m4703a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo2757a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m3591c(String str) {
        if (this.f5836b.mo3562f()) {
            return;
        }
        this.f5842h.f5885d.m3905c();
        C1944jb c1944jb = this.f5843i;
        c1944jb.f6536a.removeCallbacks(c1944jb.f6538c, c1944jb.f6537b.f5836b.f6458b.getApiKey());
        this.f5836b.f6657e = true;
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4("", str, 3, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3614a(new C1775ch(C1987l4.m4083n(), false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
    }

    /* renamed from: d */
    public final void m3593d(String str) {
        this.f5842h.f5885d.m3904b();
        C1944jb c1944jb = this.f5843i;
        C1944jb.m4037a(c1944jb.f6536a, c1944jb.f6537b, c1944jb.f6538c);
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4("", str, 6400, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        this.f5836b.f6657e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    /* renamed from: i */
    public String mo3594i() {
        return "[BaseReporter]";
    }

    /* renamed from: j */
    public void mo3595j() {
        C1499Re c1499Re;
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        C1599Ve c1599Ve = c2000lh.f6656d;
        String str = c2000lh.f6658f;
        C2123qf m3315a = AbstractC1521Sb.m3315a(c2000lh.f6458b.getApiKey());
        Set set = AbstractC2242v9.f7279a;
        JSONObject jSONObject = new JSONObject();
        if (c1599Ve != null && (c1499Re = c1599Ve.f5578a) != null) {
            try {
                jSONObject.put("preloadInfo", c1499Re.m3261c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(jSONObject2, "", 6144, 0, m3315a);
        c1987l4.mo3481c(str);
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Pause session");
        }
        m3591c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (this.f5837c.f5471b) {
                this.f5837c.m3359a(5, "Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            }
        } else {
            C1726ai c1726ai = this.f5842h;
            C2000lh c2000lh = this.f5836b;
            c1726ai.getClass();
            c1726ai.m3614a(new C1775ch(C1987l4.m4082b(str, str2), false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        for (C1876gi c1876gi : eCommerceEvent.toProto()) {
            C1987l4 c1987l4 = new C1987l4(AbstractC1521Sb.m3315a(c2000lh.f6458b.getApiKey()));
            EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
            c1987l4.f5624d = 41000;
            c1987l4.f5622b = c1987l4.m4090e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) c1876gi.f6330a)));
            c1987l4.f5627g = c1876gi.f6331b.getBytesTruncated();
            c1726ai.m3614a(new C1775ch(c1987l4, false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        C1899hg c1899hg = new C1899hg(str, m3587a(th));
        C1726ai c1726ai = this.f5842h;
        byte[] byteArray = MessageNano.toByteArray(this.f5839e.fromModel(c1899hg));
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(byteArray, str, 5892, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "Error received: %s", WrapUtils.wrapToTag(str));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        if (this.f5837c.f5471b && this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Event received: " + WrapUtils.wrapToTag(str));
        }
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4("", str, 1, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        C2126qi c2126qi = AbstractC1686Z2.f5782a;
        c2126qi.getClass();
        C1184En mo2706a = c2126qi.mo2706a(revenue);
        if (!mo2706a.f4714a) {
            if (this.f5837c.f5471b) {
                this.f5837c.m3358a(5, "Passed revenue is not valid. Reason: " + mo2706a.f4715b);
                return;
            }
            return;
        }
        C1726ai c1726ai = this.f5842h;
        C2151ri c2151ri = new C2151ri(revenue, this.f5837c);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3614a(new C1775ch(C1987l4.m4081a(AbstractC1521Sb.m3315a(c2000lh.f6458b.getApiKey()), c2151ri), false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency);
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        C1831en m3974a = AbstractC1906hn.m3974a(th, new C1559U(null, null, ((C1671Yb) this.f5844j).m3543c()), null, (String) this.f5845k.f5051a.m3832a(), (Boolean) this.f5845k.f5052b.m3832a());
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.f5885d.m3904b();
        c1726ai.m3614a(c1726ai.f5883b.m3897a(m3974a, c2000lh));
        m3589b(m3974a);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        C2156rn c2156rn = new C2156rn(C2156rn.f7086c);
        Iterator<UserProfileUpdate<? extends InterfaceC2181sn>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC2181sn userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((AbstractC1921id) userProfileUpdatePatcher).f6489e = this.f5837c;
            userProfileUpdatePatcher.mo3106a(c2156rn);
        }
        C2281wn c2281wn = new C2281wn();
        ArrayList arrayList = new ArrayList();
        for (int r2 = 0; r2 < c2156rn.f7087a.size(); r2++) {
            SparseArray sparseArray = c2156rn.f7087a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(r2))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C2206tn) it2.next());
            }
        }
        c2281wn.f7406a = (C2206tn[]) arrayList.toArray(new C2206tn[arrayList.size()]);
        C1184En mo2706a = f5834n.mo2706a(c2281wn);
        if (!mo2706a.f4714a) {
            if (this.f5837c.f5471b) {
                this.f5837c.m3358a(5, "UserInfo wasn't sent because " + mo2706a.f4715b);
                return;
            }
            return;
        }
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3614a(new C1775ch(C1987l4.m4079a(c2281wn), false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "User profile received");
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m3593d(null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Resume session");
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        C1726ai c1726ai = this.f5842h;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        C1987l4 c1987l4 = new C1987l4("", "", 256, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        this.f5836b.f6458b.setDataSendingEnabled(z2);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4("", null, 8193, 0, c2123qf);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c1987l4.f5636p = Collections.singletonMap(str, bArr);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        C1987l4 c1987l4 = new C1987l4(AbstractC1521Sb.m3315a(c2000lh.f6458b.getApiKey()));
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1987l4.f5624d = 40962;
        c1987l4.mo3481c(str);
        c1987l4.f5622b = c1987l4.m4090e(str);
        c1726ai.m3614a(new C1775ch(c1987l4, false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Set user profile ID: " + WrapUtils.wrapToTag(str));
        }
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
        C1726ai c1726ai = this.f5842h;
        C1110C c1110c = new C1110C(adRevenue, z2, this.f5837c);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3614a(new C1775ch(C1987l4.m4080a(AbstractC1521Sb.m3315a(c2000lh.f6458b.getApiKey()), c1110c), false, 1, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC1794db.m3754b(adRevenue.payload) + ", autoCollected=" + z2 + '}');
        }
    }

    /* renamed from: b */
    public final void m3589b(C1831en c1831en) {
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Unhandled exception received: " + c1831en.toString());
        }
    }

    /* renamed from: a */
    public final void m3588a(Map<String, String> map) {
        if (AbstractC2356zn.m4703a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: b */
    public final void mo2797b(String str, String str2) {
        m3592c(str, str2);
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(str2, str, 1, 0, c2123qf);
        c1987l4.f5632l = EnumC2042n9.JS;
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    /* renamed from: a */
    public final C1831en m3587a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C1511S1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return AbstractC1906hn.m3974a(th2, new C1559U(null, null, ((C1671Yb) this.f5844j).m3543c()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f5845k.f5051a.m3832a(), (Boolean) this.f5845k.f5052b.m3832a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        C2314y6 c2314y6 = new C2314y6(new C1899hg(str2, m3587a(th)), str);
        C1726ai c1726ai = this.f5842h;
        byte[] byteArray = MessageNano.toByteArray(this.f5840f.fromModel(c2314y6));
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(byteArray, str2, 5896, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        C1831en m4038a = this.f5846l.m4038a(pluginErrorDetails);
        C1726ai c1726ai = this.f5842h;
        C1582Um c1582Um = m4038a.f6165a;
        String str = c1582Um != null ? (String) WrapUtils.getOrDefault(c1582Um.f5547a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f5838d.fromModel(m4038a));
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(byteArray, str, 5891, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        if (this.f5837c.f5471b) {
            m3592c(str, str2);
        }
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(str2, str, 1, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: b */
    public final boolean mo2798b() {
        return this.f5836b.mo3562f();
    }

    /* renamed from: c */
    public final void m3592c(String str, String str2) {
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public void mo3056a(C1831en c1831en) {
        C1726ai c1726ai = this.f5842h;
        C2000lh c2000lh = this.f5836b;
        c1726ai.f5885d.m3904b();
        C1775ch m3897a = c1726ai.f5883b.m3897a(c1831en, c2000lh);
        C2000lh c2000lh2 = m3897a.f6054e;
        InterfaceC1929il interfaceC1929il = c1726ai.f5886e;
        if (interfaceC1929il != null) {
            c2000lh2.f6458b.setUuid(((C1904hl) interfaceC1929il).m3971g());
        } else {
            c2000lh2.getClass();
        }
        c1726ai.f5884c.m3674b(m3897a);
        m3589b(c1831en);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Map copyOf = CollectionUtils.copyOf(map);
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1726ai.m3613a(new C1987l4("", str, 1, 0, c2123qf), this.f5836b, 1, copyOf);
        if (this.f5837c.f5471b) {
            m3592c(str, copyOf == null ? null : copyOf.toString());
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C1831en c1831en;
        C1947je c1947je = this.f5846l;
        if (pluginErrorDetails != null) {
            c1831en = c1947je.m4038a(pluginErrorDetails);
        } else {
            c1947je.getClass();
            c1831en = null;
        }
        C1899hg c1899hg = new C1899hg(str, c1831en);
        C1726ai c1726ai = this.f5842h;
        byte[] byteArray = MessageNano.toByteArray(this.f5839e.fromModel(c1899hg));
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(byteArray, str, 5896, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "Error from plugin received: %s", WrapUtils.wrapToTag(str));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public final void mo3055a(C1559U c1559u) {
        C1659Y c1659y = new C1659Y(c1559u, (String) this.f5845k.f5051a.m3832a(), (Boolean) this.f5845k.f5052b.m3832a());
        C1726ai c1726ai = this.f5842h;
        byte[] byteArray = MessageNano.toByteArray(this.f5841g.fromModel(c1659y));
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(byteArray, "", 5968, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        if (f5833m.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        int type = moduleEvent.getType();
        String name = moduleEvent.getName();
        String value = moduleEvent.getValue();
        Map<String, Object> environment = moduleEvent.getEnvironment();
        Map<String, byte[]> extras = moduleEvent.getExtras();
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(value, name, 8192, type, c2123qf);
        c1987l4.f5623c = AbstractC1794db.m3754b(environment);
        if (extras != null) {
            c1987l4.f5636p = extras;
        }
        this.f5842h.m3613a(c1987l4, this.f5836b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C1831en c1831en;
        C1947je c1947je = this.f5846l;
        if (pluginErrorDetails != null) {
            c1831en = c1947je.m4038a(pluginErrorDetails);
        } else {
            c1947je.getClass();
            c1831en = null;
        }
        C2314y6 c2314y6 = new C2314y6(new C1899hg(str2, c1831en), str);
        C1726ai c1726ai = this.f5842h;
        byte[] byteArray = MessageNano.toByteArray(this.f5840f.fromModel(c2314y6));
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(byteArray, str2, 5896, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: a */
    public final void mo2796a(String str) {
        C1726ai c1726ai = this.f5842h;
        C1615W5 m3464a = C1615W5.m3464a(str);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(m3464a, c2000lh), c2000lh, 1, null);
    }
}
