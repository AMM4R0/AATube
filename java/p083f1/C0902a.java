package p083f1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p103k0.AbstractC2480a;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public final class C0902a extends AbstractC2480a {

    /* renamed from: i */
    public final /* synthetic */ int f3751i;

    /* renamed from: j */
    public final SideSheetBehavior f3752j;

    public /* synthetic */ C0902a(SideSheetBehavior sideSheetBehavior, int r2) {
        this.f3751i = r2;
        this.f3752j = sideSheetBehavior;
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: B */
    public final boolean mo2432B(View view) {
        switch (this.f3751i) {
            case 0:
                if (view.getRight() < (mo2438n() - mo2439o()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo2438n() + this.f3752j.f2976m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: C */
    public final boolean mo2433C(float f, float f2) {
        switch (this.f3751i) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs = Math.abs(f);
                    this.f3752j.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs2 = Math.abs(f);
                    this.f3752j.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: S */
    public final boolean mo2434S(View view, float f) {
        switch (this.f3751i) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f3752j;
                float abs = Math.abs((f * sideSheetBehavior.f2974k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f3752j;
                float abs2 = Math.abs((f * sideSheetBehavior2.f2974k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: U */
    public final void mo2435U(ViewGroup.MarginLayoutParams marginLayoutParams, int r3, int r4) {
        switch (this.f3751i) {
            case 0:
                if (r3 <= this.f3752j.f2976m) {
                    marginLayoutParams.leftMargin = r4;
                    break;
                }
                break;
            default:
                int r42 = this.f3752j.f2976m;
                if (r3 <= r42) {
                    marginLayoutParams.rightMargin = r42 - r3;
                    break;
                }
                break;
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: c */
    public final int mo2436c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f3751i) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: d */
    public final float mo2437d(int r3) {
        switch (this.f3751i) {
            case 0:
                float mo2439o = mo2439o();
                return (r3 - mo2439o) / (mo2438n() - mo2439o);
            default:
                float f = this.f3752j.f2976m;
                return (f - r3) / (f - mo2438n());
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: n */
    public final int mo2438n() {
        switch (this.f3751i) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f3752j;
                return Math.max(0, sideSheetBehavior.f2977n + sideSheetBehavior.f2978o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f3752j;
                return Math.max(0, (sideSheetBehavior2.f2976m - sideSheetBehavior2.f2975l) - sideSheetBehavior2.f2978o);
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: o */
    public final int mo2439o() {
        switch (this.f3751i) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f3752j;
                return (-sideSheetBehavior.f2975l) - sideSheetBehavior.f2978o;
            default:
                return this.f3752j.f2976m;
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: q */
    public final int mo2440q() {
        switch (this.f3751i) {
            case 0:
                return this.f3752j.f2978o;
            default:
                return this.f3752j.f2976m;
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: r */
    public final int mo2441r() {
        switch (this.f3751i) {
            case 0:
                return -this.f3752j.f2975l;
            default:
                return mo2438n();
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: s */
    public final int mo2442s(View view) {
        switch (this.f3751i) {
            case 0:
                return view.getRight() + this.f3752j.f2978o;
            default:
                return view.getLeft() - this.f3752j.f2978o;
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: t */
    public final int mo2443t(CoordinatorLayout coordinatorLayout) {
        switch (this.f3751i) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: u */
    public final int mo2444u() {
        switch (this.f3751i) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p103k0.AbstractC2480a
    /* renamed from: z */
    public final boolean mo2445z(float f) {
        switch (this.f3751i) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }
}
