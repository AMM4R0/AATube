package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.C0600a;
import java.util.ArrayList;
import java.util.Iterator;
import p001A0.AbstractC0005b;
import p105l1.C2632c;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2661k;
import p108m1.AbstractC2671u;
import p108m1.C2669s;

/* renamed from: androidx.fragment.app.A */
/* loaded from: classes.dex */
public final class C0634A extends AbstractC0005b {

    /* renamed from: d */
    public final /* synthetic */ int f2114d;

    public /* synthetic */ C0634A(int r12) {
        this.f2114d = r12;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: G */
    public final Object mo81G(int r6, Intent intent) {
        switch (this.f2114d) {
            case 0:
                return new C0600a(r6, intent);
            case 1:
                C2669s c2669s = C2669s.f8608a;
                if (r6 != -1 || intent == null) {
                    return c2669s;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c2669s;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int r02 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(r02 == 0));
                }
                ArrayList m5109G = AbstractC2658h.m5109G(stringArrayExtra);
                Iterator it = m5109G.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC2661k.m5122Z(m5109G), AbstractC2661k.m5122Z(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C2632c(it.next(), it2.next()));
                }
                return AbstractC2671u.m5129f0(arrayList2);
            default:
                return new C0600a(r6, intent);
        }
    }
}
