package p055T;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p031L.C0356j;
import p056T0.C0520d;

/* renamed from: T.a */
/* loaded from: classes.dex */
public final class C0512a extends C0055g {

    /* renamed from: d */
    public final /* synthetic */ AbstractC0513b f1327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512a(AbstractC0513b abstractC0513b) {
        super(9);
        this.f1327d = abstractC0513b;
    }

    @Override // p006C.C0055g
    /* renamed from: r */
    public final C0356j mo219r(int r2) {
        return new C0356j(AccessibilityNodeInfo.obtain(this.f1327d.m1328n(r2).f998a));
    }

    @Override // p006C.C0055g
    /* renamed from: s */
    public final C0356j mo220s(int r3) {
        AbstractC0513b abstractC0513b = this.f1327d;
        int r32 = r3 == 2 ? abstractC0513b.f1338k : abstractC0513b.f1339l;
        if (r32 == Integer.MIN_VALUE) {
            return null;
        }
        return mo219r(r32);
    }

    @Override // p006C.C0055g
    /* renamed from: v */
    public final boolean mo223v(int r7, int r8, Bundle bundle) {
        int r82;
        AbstractC0513b abstractC0513b = this.f1327d;
        Chip chip = abstractC0513b.f1336i;
        if (r7 == -1) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            return chip.performAccessibilityAction(r8, bundle);
        }
        boolean z2 = true;
        if (r8 == 1) {
            return abstractC0513b.m1330p(r7);
        }
        if (r8 == 2) {
            return abstractC0513b.m1324j(r7);
        }
        boolean z3 = false;
        if (r8 == 64) {
            AccessibilityManager accessibilityManager = abstractC0513b.f1335h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (r82 = abstractC0513b.f1338k) != r7) {
                if (r82 != Integer.MIN_VALUE) {
                    abstractC0513b.f1338k = Integer.MIN_VALUE;
                    abstractC0513b.f1336i.invalidate();
                    abstractC0513b.m1331q(r82, 65536);
                }
                abstractC0513b.f1338k = r7;
                chip.invalidate();
                abstractC0513b.m1331q(r7, 32768);
            }
            z2 = false;
        } else {
            if (r8 != 128) {
                C0520d c0520d = (C0520d) abstractC0513b;
                if (r8 != 16) {
                    return false;
                }
                Chip chip2 = c0520d.f1372q;
                if (r7 == 0) {
                    return chip2.performClick();
                }
                if (r7 != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2841h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f2852s) {
                    return z3;
                }
                chip2.f2851r.m1331q(1, 1);
                return z3;
            }
            if (abstractC0513b.f1338k == r7) {
                abstractC0513b.f1338k = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC0513b.m1331q(r7, 65536);
            }
            z2 = false;
        }
        return z2;
    }
}
