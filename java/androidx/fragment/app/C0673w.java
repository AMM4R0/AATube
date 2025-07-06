package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.C0600a;
import java.util.ArrayList;
import java.util.Map;
import p002A1.C0015h;

/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public final class C0673w {

    /* renamed from: a */
    public final /* synthetic */ int f2355a;

    /* renamed from: b */
    public final /* synthetic */ C0638E f2356b;

    public /* synthetic */ C0673w(C0638E c0638e, int r2) {
        this.f2355a = r2;
        this.f2356b = c0638e;
    }

    /* renamed from: a */
    public final void m1774a(Object obj) {
        switch (this.f2355a) {
            case 0:
                C0600a c0600a = (C0600a) obj;
                C0638E c0638e = this.f2356b;
                C0635B c0635b = (C0635B) c0638e.f2148w.pollFirst();
                if (c0635b == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    C0015h c0015h = c0638e.f2128c;
                    String str = c0635b.f2115a;
                    AbstractComponentCallbacksC0666p m115j = c0015h.m115j(str);
                    if (m115j == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        m115j.m1768k(c0635b.f2116b, c0600a.f1703a, c0600a.f1704b);
                        break;
                    }
                }
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] r5 = new int[arrayList.size()];
                for (int r2 = 0; r2 < arrayList.size(); r2++) {
                    r5[r2] = ((Boolean) arrayList.get(r2)).booleanValue() ? 0 : -1;
                }
                C0638E c0638e2 = this.f2356b;
                C0635B c0635b2 = (C0635B) c0638e2.f2148w.pollFirst();
                if (c0635b2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    C0015h c0015h2 = c0638e2.f2128c;
                    String str2 = c0635b2.f2115a;
                    if (c0015h2.m115j(str2) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                        break;
                    }
                }
                break;
            default:
                C0600a c0600a2 = (C0600a) obj;
                C0638E c0638e3 = this.f2356b;
                C0635B c0635b3 = (C0635B) c0638e3.f2148w.pollFirst();
                if (c0635b3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    C0015h c0015h3 = c0638e3.f2128c;
                    String str3 = c0635b3.f2115a;
                    AbstractComponentCallbacksC0666p m115j2 = c0015h3.m115j(str3);
                    if (m115j2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        m115j2.m1768k(c0635b3.f2116b, c0600a2.f1703a, c0600a2.f1704b);
                        break;
                    }
                }
        }
    }
}
