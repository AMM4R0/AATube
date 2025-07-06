package p044P0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p036M1.AbstractC0387m;
import p138x.AbstractC2879a;

/* renamed from: P0.c */
/* loaded from: classes.dex */
public final class C0419c extends AbstractC0005b {

    /* renamed from: d */
    public final /* synthetic */ int f1084d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC2879a f1085e;

    public /* synthetic */ C0419c(AbstractC2879a abstractC2879a, int r2) {
        this.f1084d = r2;
        this.f1085e = abstractC2879a;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: B */
    public final void mo78B(int r3) {
        switch (this.f1084d) {
            case 0:
                if (r3 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1085e;
                    if (bottomSheetBehavior.f2759K) {
                        bottomSheetBehavior.m2061C(1);
                        break;
                    }
                }
                break;
            default:
                if (r3 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1085e;
                    if (sideSheetBehavior.f2970g) {
                        sideSheetBehavior.m2126r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: C */
    public final void mo79C(View view, int r6, int r7) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1084d) {
            case 0:
                ((BottomSheetBehavior) this.f1085e).m2074u(r7);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1085e;
                WeakReference weakReference = sideSheetBehavior.f2980q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2964a.mo2435U(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2984u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2964a.mo2437d(r6);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC0002c.m10e(it);
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f2964a.mo2432B(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2964a.mo2438n()) < java.lang.Math.abs(r7 - r0.f2964a.mo2439o())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r7 > r4.f2753E) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.m2075x()) < java.lang.Math.abs(r6.getTop() - r4.f2753E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2752D) < java.lang.Math.abs(r7 - r4.f2755G)) goto L27;
     */
    @Override // p001A0.AbstractC0005b
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo80D(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p044P0.C0419c.mo80D(android.view.View, float, float):void");
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: R */
    public final boolean mo87R(View view, int r7) {
        WeakReference weakReference;
        switch (this.f1084d) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1085e;
                int r12 = bottomSheetBehavior.f2760L;
                if (r12 != 1 && !bottomSheetBehavior.f2776a0) {
                    if (r12 == 3 && bottomSheetBehavior.f2773Y == r7) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2770V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f2769U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1085e;
                if (sideSheetBehavior.f2971h != 1 && (weakReference = sideSheetBehavior.f2979p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: j */
    public final int mo89j(View view, int r3) {
        switch (this.f1084d) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1085e;
                return AbstractC0387m.m1111i(r3, sideSheetBehavior.f2964a.mo2441r(), sideSheetBehavior.f2964a.mo2440q());
        }
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: k */
    public final int mo90k(View view, int r3) {
        switch (this.f1084d) {
            case 0:
                return AbstractC0387m.m1111i(r3, ((BottomSheetBehavior) this.f1085e).m2075x(), mo92x());
            default:
                return view.getTop();
        }
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: w */
    public int mo91w(View view) {
        switch (this.f1084d) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1085e;
                return sideSheetBehavior.f2975l + sideSheetBehavior.f2978o;
            default:
                return super.mo91w(view);
        }
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: x */
    public int mo92x() {
        switch (this.f1084d) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1085e;
                return bottomSheetBehavior.f2757I ? bottomSheetBehavior.f2768T : bottomSheetBehavior.f2755G;
            default:
                return super.mo92x();
        }
    }
}
