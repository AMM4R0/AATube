package p028K;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: K.m */
/* loaded from: classes.dex */
public final class C0317m {

    /* renamed from: a */
    public ViewParent f907a;

    /* renamed from: b */
    public ViewParent f908b;

    /* renamed from: c */
    public final ViewGroup f909c;

    /* renamed from: d */
    public boolean f910d;

    /* renamed from: e */
    public int[] f911e;

    public C0317m(ViewGroup viewGroup) {
        this.f909c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m895a(float f, float f2, boolean z2) {
        ViewParent m899e;
        if (!this.f910d || (m899e = m899e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0288V.m788a(m899e, this.f909c, f, f2, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + m899e + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m896b(float f, float f2) {
        ViewParent m899e;
        if (!this.f910d || (m899e = m899e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0288V.m789b(m899e, this.f909c, f, f2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + m899e + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m897c(int r16, int r17, int[] r18, int[] r19, int r20) {
        ViewParent m899e;
        int r12;
        int r13;
        int[] r14;
        if (!this.f910d || (m899e = m899e(r20)) == null) {
            return false;
        }
        if (r16 == 0 && r17 == 0) {
            if (r19 == null) {
                return false;
            }
            r19[0] = 0;
            r19[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f909c;
        if (r19 != null) {
            viewGroup.getLocationInWindow(r19);
            r12 = r19[0];
            r13 = r19[1];
        } else {
            r12 = 0;
            r13 = 0;
        }
        if (r18 == null) {
            if (this.f911e == null) {
                this.f911e = new int[2];
            }
            r14 = this.f911e;
        } else {
            r14 = r18;
        }
        r14[0] = 0;
        r14[1] = 0;
        if (m899e instanceof InterfaceC0319n) {
            ((InterfaceC0319n) m899e).mo935c(viewGroup, r16, r17, r14, r20);
        } else if (r20 == 0) {
            try {
                AbstractC0288V.m790c(m899e, viewGroup, r16, r17, r14);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + m899e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (r19 != null) {
            viewGroup.getLocationInWindow(r19);
            r19[0] = r19[0] - r12;
            r19[1] = r19[1] - r13;
        }
        return (r14[0] == 0 && r14[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m898d(int r17, int r18, int r19, int r20, int[] r21, int r22, int[] r23) {
        ViewParent m899e;
        int r14;
        int r15;
        int[] r9;
        if (!this.f910d || (m899e = m899e(r22)) == null) {
            return false;
        }
        if (r17 == 0 && r18 == 0 && r19 == 0 && r20 == 0) {
            if (r21 != null) {
                r21[0] = 0;
                r21[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f909c;
        if (r21 != null) {
            viewGroup.getLocationInWindow(r21);
            r14 = r21[0];
            r15 = r21[1];
        } else {
            r14 = 0;
            r15 = 0;
        }
        if (r23 == null) {
            if (this.f911e == null) {
                this.f911e = new int[2];
            }
            int[] r2 = this.f911e;
            r2[0] = 0;
            r2[1] = 0;
            r9 = r2;
        } else {
            r9 = r23;
        }
        if (m899e instanceof InterfaceC0321o) {
            ((InterfaceC0321o) m899e).mo941d(viewGroup, r17, r18, r19, r20, r22, r9);
        } else {
            r9[0] = r9[0] + r19;
            r9[1] = r9[1] + r20;
            if (m899e instanceof InterfaceC0319n) {
                ((InterfaceC0319n) m899e).mo936e(viewGroup, r17, r18, r19, r20, r22);
            } else if (r22 == 0) {
                try {
                    AbstractC0288V.m791d(m899e, viewGroup, r17, r18, r19, r20);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m899e + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (r21 != null) {
            viewGroup.getLocationInWindow(r21);
            r21[0] = r21[0] - r14;
            r21[1] = r21[1] - r15;
        }
        return true;
    }

    /* renamed from: e */
    public final ViewParent m899e(int r2) {
        if (r2 == 0) {
            return this.f907a;
        }
        if (r2 != 1) {
            return null;
        }
        return this.f908b;
    }

    /* renamed from: f */
    public final boolean m900f(int r12) {
        return m899e(r12) != null;
    }

    /* renamed from: g */
    public final boolean m901g(int r12, int r13) {
        boolean m793f;
        if (m900f(r13)) {
            return true;
        }
        if (this.f910d) {
            ViewGroup viewGroup = this.f909c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0319n;
                if (z2) {
                    m793f = ((InterfaceC0319n) parent).mo937f(view, viewGroup, r12, r13);
                } else {
                    if (r13 == 0) {
                        try {
                            m793f = AbstractC0288V.m793f(parent, view, viewGroup, r12);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    m793f = false;
                }
                if (m793f) {
                    if (r13 == 0) {
                        this.f907a = parent;
                    } else if (r13 == 1) {
                        this.f908b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0319n) parent).mo933a(view, viewGroup, r12, r13);
                    } else if (r13 == 0) {
                        try {
                            AbstractC0288V.m792e(parent, view, viewGroup, r12);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m902h(int r5) {
        ViewParent m899e = m899e(r5);
        if (m899e != null) {
            boolean z2 = m899e instanceof InterfaceC0319n;
            ViewGroup viewGroup = this.f909c;
            if (z2) {
                ((InterfaceC0319n) m899e).mo934b(viewGroup, r5);
            } else if (r5 == 0) {
                try {
                    AbstractC0288V.m794g(m899e, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m899e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (r5 == 0) {
                this.f907a = null;
            } else {
                if (r5 != 1) {
                    return;
                }
                this.f908b = null;
            }
        }
    }
}
