package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0686J;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.G */
/* loaded from: classes.dex */
public final class C0640G extends AbstractC0686J {

    /* renamed from: f */
    public final boolean f2168f;

    /* renamed from: c */
    public final HashMap f2165c = new HashMap();

    /* renamed from: d */
    public final HashMap f2166d = new HashMap();

    /* renamed from: e */
    public final HashMap f2167e = new HashMap();

    /* renamed from: g */
    public boolean f2169g = false;

    /* renamed from: h */
    public boolean f2170h = false;

    public C0640G(boolean z2) {
        this.f2168f = z2;
    }

    @Override // androidx.lifecycle.AbstractC0686J
    /* renamed from: a */
    public final void mo1414a() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2169g = true;
    }

    /* renamed from: b */
    public final void m1702b(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (this.f2170h) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2165c.remove(abstractComponentCallbacksC0666p.f2316e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0666p);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0640G.class != obj.getClass()) {
            return false;
        }
        C0640G c0640g = (C0640G) obj;
        return this.f2165c.equals(c0640g.f2165c) && this.f2166d.equals(c0640g.f2166d) && this.f2167e.equals(c0640g.f2167e);
    }

    public final int hashCode() {
        return this.f2167e.hashCode() + ((this.f2166d.hashCode() + (this.f2165c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2165c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2166d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2167e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
