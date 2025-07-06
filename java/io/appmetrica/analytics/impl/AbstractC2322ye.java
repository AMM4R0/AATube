package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.ye */
/* loaded from: classes.dex */
public abstract class AbstractC2322ye {

    /* renamed from: c */
    public static final String f7496c = "ye";

    /* renamed from: a */
    public final InterfaceC1221Ga f7497a;

    /* renamed from: b */
    public final String f7498b;

    public AbstractC2322ye(InterfaceC1221Ga interfaceC1221Ga) {
        this(interfaceC1221Ga, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC2322ye> T m4649a(String str, float f) {
        synchronized (this) {
            this.f7497a.mo2900a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC2322ye> T m4656b(String str, String str2) {
        synchronized (this) {
            this.f7497a.mo2902a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public final C2347ze m4660c(String str) {
        return new C2347ze(str, this.f7498b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final <T extends AbstractC2322ye> T m4661d(String str) {
        synchronized (this) {
            this.f7497a.remove(str);
        }
        return this;
    }

    public AbstractC2322ye(InterfaceC1221Ga interfaceC1221Ga, String str) {
        this.f7497a = interfaceC1221Ga;
        this.f7498b = str;
    }

    /* renamed from: c */
    public Set<String> mo2721c() {
        return this.f7497a.mo2904a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC2322ye> T m4651a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f7497a.mo2902a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC2322ye> T m4655b(String str, long j2) {
        synchronized (this) {
            this.f7497a.mo2901a(str, j2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC2322ye> T m4654b(String str, int r3) {
        synchronized (this) {
            this.f7497a.mo2899a(r3, str);
        }
        return this;
    }

    /* renamed from: a */
    public final <T extends AbstractC2322ye> T m4650a(String str, List<String> list) {
        return (T) m4651a(str, (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    public final long m4648a(String str, long j2) {
        return this.f7497a.getLong(str, j2);
    }

    /* renamed from: a */
    public final int m4647a(String str, int r3) {
        return this.f7497a.getInt(str, r3);
    }

    /* renamed from: a */
    public final String m4652a(String str, String str2) {
        return this.f7497a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC2322ye> T m4657b(String str, boolean z2) {
        synchronized (this) {
            this.f7497a.mo2903a(str, z2);
        }
        return this;
    }

    /* renamed from: a */
    public final boolean m4653a(String str, boolean z2) {
        return this.f7497a.getBoolean(str, z2);
    }

    /* renamed from: b */
    public final void m4658b() {
        synchronized (this) {
            this.f7497a.mo2906b();
        }
    }

    /* renamed from: b */
    public final boolean m4659b(String str) {
        return this.f7497a.mo2905a(str);
    }
}
