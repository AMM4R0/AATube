package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0651a implements InterfaceC0636C {

    /* renamed from: a */
    public final ArrayList f2215a;

    /* renamed from: b */
    public int f2216b;

    /* renamed from: c */
    public int f2217c;

    /* renamed from: d */
    public int f2218d;

    /* renamed from: e */
    public int f2219e;

    /* renamed from: f */
    public int f2220f;

    /* renamed from: g */
    public boolean f2221g;

    /* renamed from: h */
    public String f2222h;

    /* renamed from: i */
    public int f2223i;

    /* renamed from: j */
    public CharSequence f2224j;

    /* renamed from: k */
    public int f2225k;

    /* renamed from: l */
    public CharSequence f2226l;

    /* renamed from: m */
    public ArrayList f2227m;

    /* renamed from: n */
    public ArrayList f2228n;

    /* renamed from: o */
    public boolean f2229o;

    /* renamed from: p */
    public final C0638E f2230p;

    /* renamed from: q */
    public boolean f2231q;

    /* renamed from: r */
    public int f2232r;

    public C0651a(C0638E c0638e) {
        c0638e.m1657A();
        C0669s c0669s = c0638e.f2139n;
        if (c0669s != null) {
            c0669s.f2343e.getClassLoader();
        }
        this.f2215a = new ArrayList();
        this.f2229o = false;
        this.f2232r = -1;
        this.f2230p = c0638e;
    }

    @Override // androidx.fragment.app.InterfaceC0636C
    /* renamed from: a */
    public final boolean mo1652a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2221g) {
            return true;
        }
        C0638E c0638e = this.f2230p;
        if (c0638e.f2129d == null) {
            c0638e.f2129d = new ArrayList();
        }
        c0638e.f2129d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m1731b(C0645L c0645l) {
        this.f2215a.add(c0645l);
        c0645l.f2193c = this.f2216b;
        c0645l.f2194d = this.f2217c;
        c0645l.f2195e = this.f2218d;
        c0645l.f2196f = this.f2219e;
    }

    /* renamed from: c */
    public final void m1732c(int r9) {
        if (this.f2221g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + r9);
            }
            ArrayList arrayList = this.f2215a;
            int size = arrayList.size();
            for (int r4 = 0; r4 < size; r4++) {
                C0645L c0645l = (C0645L) arrayList.get(r4);
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0645l.f2192b;
                if (abstractComponentCallbacksC0666p != null) {
                    abstractComponentCallbacksC0666p.f2328q += r9;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0645l.f2192b + " to " + c0645l.f2192b.f2328q);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final int m1733d(boolean z2) {
        if (this.f2231q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0647N());
            m1735f("  ", printWriter, true);
            printWriter.close();
        }
        this.f2231q = true;
        boolean z3 = this.f2221g;
        C0638E c0638e = this.f2230p;
        if (z3) {
            this.f2232r = c0638e.f2134i.getAndIncrement();
        } else {
            this.f2232r = -1;
        }
        c0638e.m1695u(this, z2);
        return this.f2232r;
    }

    /* renamed from: e */
    public final void m1734e(int r4, AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p, String str, int r7) {
        Class<?> cls = abstractComponentCallbacksC0666p.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = abstractComponentCallbacksC0666p.f2335x;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0666p + ": was " + abstractComponentCallbacksC0666p.f2335x + " now " + str);
            }
            abstractComponentCallbacksC0666p.f2335x = str;
        }
        if (r4 != 0) {
            if (r4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0666p + " with tag " + str + " to container view with no id");
            }
            int r6 = abstractComponentCallbacksC0666p.f2333v;
            if (r6 != 0 && r6 != r4) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0666p + ": was " + abstractComponentCallbacksC0666p.f2333v + " now " + r4);
            }
            abstractComponentCallbacksC0666p.f2333v = r4;
            abstractComponentCallbacksC0666p.f2334w = r4;
        }
        m1731b(new C0645L(r7, abstractComponentCallbacksC0666p));
        abstractComponentCallbacksC0666p.f2329r = this.f2230p;
    }

    /* renamed from: f */
    public final void m1735f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2222h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2232r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2231q);
            if (this.f2220f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2220f));
            }
            if (this.f2216b != 0 || this.f2217c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2216b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2217c));
            }
            if (this.f2218d != 0 || this.f2219e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2218d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2219e));
            }
            if (this.f2223i != 0 || this.f2224j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2223i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2224j);
            }
            if (this.f2225k != 0 || this.f2226l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2225k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2226l);
            }
        }
        ArrayList arrayList = this.f2215a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            C0645L c0645l = (C0645L) arrayList.get(r2);
            switch (c0645l.f2191a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0645l.f2191a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(r2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0645l.f2192b);
            if (z2) {
                if (c0645l.f2193c != 0 || c0645l.f2194d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0645l.f2193c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0645l.f2194d));
                }
                if (c0645l.f2195e != 0 || c0645l.f2196f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0645l.f2195e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0645l.f2196f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2232r >= 0) {
            sb.append(" #");
            sb.append(this.f2232r);
        }
        if (this.f2222h != null) {
            sb.append(" ");
            sb.append(this.f2222h);
        }
        sb.append("}");
        return sb.toString();
    }
}
