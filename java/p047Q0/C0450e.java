package p047Q0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C0755k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p028K.C0295b;
import p031L.C0355i;
import p031L.C0356j;

/* renamed from: Q0.e */
/* loaded from: classes.dex */
public final class C0450e extends C0295b {

    /* renamed from: d */
    public final /* synthetic */ int f1157d;

    /* renamed from: e */
    public final /* synthetic */ Object f1158e;

    public /* synthetic */ C0450e(int r12, Object obj) {
        this.f1157d = r12;
        this.f1158e = obj;
    }

    @Override // p028K.C0295b
    /* renamed from: c */
    public void mo806c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1157d) {
            case 1:
                super.mo806c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1158e).f2948d);
                break;
            default:
                super.mo806c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p028K.C0295b
    /* renamed from: d */
    public final void mo807d(View view, C0356j c0356j) {
        Object obj = this.f1158e;
        View.AccessibilityDelegate accessibilityDelegate = this.f856a;
        switch (this.f1157d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0356j.f998a);
                int r2 = MaterialButtonToggleGroup.f2821k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int r4 = -1;
                if (view instanceof MaterialButton) {
                    int r22 = 0;
                    int r5 = 0;
                    while (true) {
                        if (r22 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(r22) == view) {
                                r4 = r5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(r22) instanceof MaterialButton) && materialButtonToggleGroup.m2085c(r22)) {
                                    r5++;
                                }
                                r22++;
                            }
                        }
                    }
                }
                c0356j.m1032i(C0355i.m1023a(((MaterialButton) view).f2818o, 0, 1, r4, 1));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2949e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2948d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0356j.f998a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2960x);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0356j.f998a);
                C0755k c0755k = (C0755k) obj;
                c0356j.m1033j(c0755k.f2894c0.getVisibility() == 0 ? c0755k.m1770w().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0755k.m1770w().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
