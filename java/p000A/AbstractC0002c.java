package p000A;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p118q.AbstractC2714e;

/* renamed from: A.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0002c {
    /* renamed from: a */
    public static final void m6a(View view, int r5) {
        int m5234a = AbstractC2714e.m5234a(r5);
        if (m5234a == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (m5234a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (m5234a == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (m5234a != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* renamed from: b */
    public static int m7b(int r2) {
        if (r2 == 0) {
            return 2;
        }
        if (r2 == 4) {
            return 4;
        }
        if (r2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(m11f(r2, "Unknown visibility "));
    }

    /* renamed from: c */
    public static int m8c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m7b(view.getVisibility());
    }

    /* renamed from: d */
    public static int m9d(String str, int r12, int r2) {
        return (str.hashCode() + r12) * r2;
    }

    /* renamed from: e */
    public static ClassCastException m10e(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* renamed from: f */
    public static String m11f(int r12, String str) {
        return str + r12;
    }

    /* renamed from: g */
    public static String m12g(String str, int r2, int r3, String str2) {
        return str + r2 + str2 + r3;
    }

    /* renamed from: h */
    public static String m13h(String str, int r2, String str2) {
        return str + r2 + str2;
    }

    /* renamed from: i */
    public static String m14i(String str, long j2) {
        return str + j2;
    }

    /* renamed from: j */
    public static String m15j(String str, String str2) {
        return str + str2;
    }

    /* renamed from: k */
    public static String m16k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: l */
    public static String m17l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: m */
    public static /* synthetic */ String m18m(int r02) {
        switch (r02) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* renamed from: n */
    public static /* synthetic */ String m19n(int r12) {
        return r12 != 1 ? r12 != 2 ? r12 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* renamed from: o */
    public static /* synthetic */ String m20o(int r12) {
        return r12 != 1 ? r12 != 2 ? r12 != 3 ? r12 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
