package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0600a;
import androidx.activity.result.C0601b;
import androidx.fragment.app.C0673w;
import java.util.ArrayList;
import java.util.HashMap;
import p001A0.AbstractC0005b;
import p010D0.C0113k;
import p079e.AbstractActivityC0798g;
import p134v1.AbstractC2875d;

/* renamed from: androidx.activity.g */
/* loaded from: classes.dex */
public final class C0588g {

    /* renamed from: a */
    public final HashMap f1663a = new HashMap();

    /* renamed from: b */
    public final HashMap f1664b = new HashMap();

    /* renamed from: c */
    public final HashMap f1665c = new HashMap();

    /* renamed from: d */
    public ArrayList f1666d = new ArrayList();

    /* renamed from: e */
    public final transient HashMap f1667e = new HashMap();

    /* renamed from: f */
    public final HashMap f1668f = new HashMap();

    /* renamed from: g */
    public final Bundle f1669g = new Bundle();

    public C0588g(AbstractActivityC0798g abstractActivityC0798g) {
    }

    /* renamed from: a */
    public final boolean m1468a(int r4, int r5, Intent intent) {
        String str = (String) this.f1663a.get(Integer.valueOf(r4));
        if (str == null) {
            return false;
        }
        C0601b c0601b = (C0601b) this.f1667e.get(str);
        if (c0601b != null) {
            C0673w c0673w = c0601b.f1705a;
            if (this.f1666d.contains(str)) {
                c0673w.m1774a(c0601b.f1706b.mo81G(r5, intent));
                this.f1666d.remove(str);
                return true;
            }
        }
        this.f1668f.remove(str);
        this.f1669g.putParcelable(str, new C0600a(r5, intent));
        return true;
    }

    /* renamed from: b */
    public final C0113k m1469b(String str, AbstractC0005b abstractC0005b, C0673w c0673w) {
        int r12;
        HashMap hashMap;
        HashMap hashMap2 = this.f1664b;
        if (((Integer) hashMap2.get(str)) == null) {
            AbstractC2875d.f9485a.getClass();
            int nextInt = AbstractC2875d.f9486b.mo5478a().nextInt(2147418112);
            while (true) {
                r12 = nextInt + 65536;
                hashMap = this.f1663a;
                if (!hashMap.containsKey(Integer.valueOf(r12))) {
                    break;
                }
                AbstractC2875d.f9485a.getClass();
                nextInt = AbstractC2875d.f9486b.mo5478a().nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(r12), str);
            hashMap2.put(str, Integer.valueOf(r12));
        }
        this.f1667e.put(str, new C0601b(c0673w, abstractC0005b));
        HashMap hashMap3 = this.f1668f;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            c0673w.m1774a(obj);
        }
        Bundle bundle = this.f1669g;
        C0600a c0600a = (C0600a) bundle.getParcelable(str);
        if (c0600a != null) {
            bundle.remove(str);
            c0673w.m1774a(abstractC0005b.mo81G(c0600a.f1703a, c0600a.f1704b));
        }
        return new C0113k(this, str, abstractC0005b, 6);
    }
}
