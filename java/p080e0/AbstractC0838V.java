package p080e0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;

/* renamed from: e0.V */
/* loaded from: classes.dex */
public abstract class AbstractC0838V {

    /* renamed from: s */
    public static final List f3423s = Collections.emptyList();

    /* renamed from: a */
    public final View f3424a;

    /* renamed from: b */
    public WeakReference f3425b;

    /* renamed from: j */
    public int f3433j;

    /* renamed from: r */
    public RecyclerView f3441r;

    /* renamed from: c */
    public int f3426c = -1;

    /* renamed from: d */
    public int f3427d = -1;

    /* renamed from: e */
    public long f3428e = -1;

    /* renamed from: f */
    public int f3429f = -1;

    /* renamed from: g */
    public int f3430g = -1;

    /* renamed from: h */
    public AbstractC0838V f3431h = null;

    /* renamed from: i */
    public AbstractC0838V f3432i = null;

    /* renamed from: k */
    public final ArrayList f3434k = null;

    /* renamed from: l */
    public final List f3435l = null;

    /* renamed from: m */
    public int f3436m = 0;

    /* renamed from: n */
    public C0830M f3437n = null;

    /* renamed from: o */
    public boolean f3438o = false;

    /* renamed from: p */
    public int f3439p = 0;

    /* renamed from: q */
    public int f3440q = -1;

    public AbstractC0838V(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3424a = view;
    }

    /* renamed from: a */
    public final void m2324a(int r2) {
        this.f3433j = r2 | this.f3433j;
    }

    /* renamed from: b */
    public final int m2325b() {
        int r02 = this.f3430g;
        return r02 == -1 ? this.f3426c : r02;
    }

    /* renamed from: c */
    public final List m2326c() {
        ArrayList arrayList;
        return ((this.f3433j & 1024) != 0 || (arrayList = this.f3434k) == null || arrayList.size() == 0) ? f3423s : this.f3435l;
    }

    /* renamed from: d */
    public final boolean m2327d(int r2) {
        return (r2 & this.f3433j) != 0;
    }

    /* renamed from: e */
    public final boolean m2328e() {
        View view = this.f3424a;
        return (view.getParent() == null || view.getParent() == this.f3441r) ? false : true;
    }

    /* renamed from: f */
    public final boolean m2329f() {
        return (this.f3433j & 1) != 0;
    }

    /* renamed from: g */
    public final boolean m2330g() {
        return (this.f3433j & 4) != 0;
    }

    /* renamed from: h */
    public final boolean m2331h() {
        if ((this.f3433j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if (!this.f3424a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m2332i() {
        return (this.f3433j & 8) != 0;
    }

    /* renamed from: j */
    public final boolean m2333j() {
        return this.f3437n != null;
    }

    /* renamed from: k */
    public final boolean m2334k() {
        return (this.f3433j & 256) != 0;
    }

    /* renamed from: l */
    public final boolean m2335l() {
        return (this.f3433j & 2) != 0;
    }

    /* renamed from: m */
    public final void m2336m(int r3, boolean z2) {
        if (this.f3427d == -1) {
            this.f3427d = this.f3426c;
        }
        if (this.f3430g == -1) {
            this.f3430g = this.f3426c;
        }
        if (z2) {
            this.f3430g += r3;
        }
        this.f3426c += r3;
        View view = this.f3424a;
        if (view.getLayoutParams() != null) {
            ((C0825H) view.getLayoutParams()).f3378c = true;
        }
    }

    /* renamed from: n */
    public final void m2337n() {
        this.f3433j = 0;
        this.f3426c = -1;
        this.f3427d = -1;
        this.f3428e = -1L;
        this.f3430g = -1;
        this.f3436m = 0;
        this.f3431h = null;
        this.f3432i = null;
        ArrayList arrayList = this.f3434k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3433j &= -1025;
        this.f3439p = 0;
        this.f3440q = -1;
        RecyclerView.m1897j(this);
    }

    /* renamed from: o */
    public final void m2338o(boolean z2) {
        int r12 = this.f3436m;
        int r13 = z2 ? r12 - 1 : r12 + 1;
        this.f3436m = r13;
        if (r13 < 0) {
            this.f3436m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && r13 == 1) {
            this.f3433j |= 16;
        } else if (z2 && r13 == 0) {
            this.f3433j &= -17;
        }
    }

    /* renamed from: p */
    public final boolean m2339p() {
        return (this.f3433j & 128) != 0;
    }

    /* renamed from: q */
    public final boolean m2340q() {
        return (this.f3433j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3426c + " id=" + this.f3428e + ", oldPos=" + this.f3427d + ", pLpos:" + this.f3430g);
        if (m2333j()) {
            sb.append(" scrap ");
            sb.append(this.f3438o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m2330g()) {
            sb.append(" invalid");
        }
        if (!m2329f()) {
            sb.append(" unbound");
        }
        if ((this.f3433j & 2) != 0) {
            sb.append(" update");
        }
        if (m2332i()) {
            sb.append(" removed");
        }
        if (m2339p()) {
            sb.append(" ignored");
        }
        if (m2334k()) {
            sb.append(" tmpDetached");
        }
        if (!m2331h()) {
            sb.append(" not recyclable(" + this.f3436m + ")");
        }
        if ((this.f3433j & 512) != 0 || m2330g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3424a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
