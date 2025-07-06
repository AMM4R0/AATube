package p044P0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p010D0.RunnableC0107e;
import p028K.AbstractC0283P;
import p050R0.RunnableC0458b;
import p124s0.C2733d;
import p130u0.InterfaceC2784h;

/* renamed from: P0.f */
/* loaded from: classes.dex */
public final class C0422f {

    /* renamed from: a */
    public final /* synthetic */ int f1092a;

    /* renamed from: b */
    public int f1093b;

    /* renamed from: c */
    public boolean f1094c;

    /* renamed from: d */
    public Object f1095d;

    /* renamed from: e */
    public Object f1096e;

    public /* synthetic */ C0422f() {
        this.f1092a = 2;
    }

    /* renamed from: a */
    public C0422f m1155a() {
        if (((InterfaceC2784h) this.f1095d) != null) {
            return new C0422f(this, (C2733d[]) this.f1096e, this.f1094c, this.f1093b);
        }
        throw new IllegalArgumentException("execute parameter required");
    }

    /* renamed from: b */
    public void m1156b(int r4) {
        switch (this.f1092a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1096e;
                WeakReference weakReference = bottomSheetBehavior.f2769U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1093b = r4;
                    if (!this.f1094c) {
                        View view = (View) bottomSheetBehavior.f2769U.get();
                        RunnableC0107e runnableC0107e = (RunnableC0107e) this.f1095d;
                        WeakHashMap weakHashMap = AbstractC0283P.f842a;
                        view.postOnAnimation(runnableC0107e);
                        this.f1094c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1096e;
                WeakReference weakReference2 = sideSheetBehavior.f2979p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1093b = r4;
                    if (!this.f1094c) {
                        View view2 = (View) sideSheetBehavior.f2979p.get();
                        RunnableC0458b runnableC0458b = (RunnableC0458b) this.f1095d;
                        WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                        view2.postOnAnimation(runnableC0458b);
                        this.f1094c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C0422f(C0422f c0422f, C2733d[] c2733dArr, boolean z2, int r5) {
        this.f1092a = 3;
        this.f1096e = c0422f;
        this.f1095d = c2733dArr;
        boolean z3 = false;
        if (c2733dArr != null && z2) {
            z3 = true;
        }
        this.f1094c = z3;
        this.f1093b = r5;
    }

    public C0422f(SideSheetBehavior sideSheetBehavior) {
        this.f1092a = 1;
        this.f1096e = sideSheetBehavior;
        this.f1095d = new RunnableC0458b(8, this);
    }

    public C0422f(BottomSheetBehavior bottomSheetBehavior) {
        this.f1092a = 0;
        this.f1096e = bottomSheetBehavior;
        this.f1095d = new RunnableC0107e(3, this);
    }
}
