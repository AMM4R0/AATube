package p056T0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p031L.C0351e;
import p031L.C0356j;
import p055T.AbstractC0513b;

/* renamed from: T0.d */
/* loaded from: classes.dex */
public final class C0520d extends AbstractC0513b {

    /* renamed from: q */
    public final /* synthetic */ Chip f1372q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520d(Chip chip, Chip chip2) {
        super(chip2);
        this.f1372q = chip;
    }

    @Override // p055T.AbstractC0513b
    /* renamed from: l */
    public final void mo1326l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2835w;
        Chip chip = this.f1372q;
        if (chip.m2096c()) {
            C0522f c0522f = chip.f2838e;
            if (c0522f != null && c0522f.f1390K) {
                z2 = true;
            }
            if (!z2 || chip.f2841h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p055T.AbstractC0513b
    /* renamed from: o */
    public final void mo1329o(int r7, C0356j c0356j) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        if (r7 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2835w);
            return;
        }
        Chip chip = this.f1372q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        c0356j.m1026b(C0351e.f984e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
