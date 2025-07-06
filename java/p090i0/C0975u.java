package p090i0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p000A.AbstractC0002c;

/* renamed from: i0.u */
/* loaded from: classes.dex */
public final class C0975u {

    /* renamed from: b */
    public final View f4064b;

    /* renamed from: a */
    public final HashMap f4063a = new HashMap();

    /* renamed from: c */
    public final ArrayList f4065c = new ArrayList();

    public C0975u(View view) {
        this.f4064b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0975u)) {
            return false;
        }
        C0975u c0975u = (C0975u) obj;
        return this.f4064b == c0975u.f4064b && this.f4063a.equals(c0975u.f4063a);
    }

    public final int hashCode() {
        return this.f4063a.hashCode() + (this.f4064b.hashCode() * 31);
    }

    public final String toString() {
        String m15j = AbstractC0002c.m15j(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4064b + "\n", "    values:");
        HashMap hashMap = this.f4063a;
        for (String str : hashMap.keySet()) {
            m15j = m15j + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return m15j;
    }
}
