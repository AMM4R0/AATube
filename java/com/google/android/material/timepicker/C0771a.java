package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p065Y0.AbstractC0555j;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C0771a extends AbstractC0555j {

    /* renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f3102a;

    public C0771a(ChipTextInputComboView chipTextInputComboView) {
        this.f3102a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f3102a;
        if (isEmpty) {
            chipTextInputComboView.f3070a.setText(ChipTextInputComboView.m2160a(chipTextInputComboView, "00"));
            return;
        }
        String m2160a = ChipTextInputComboView.m2160a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f3070a;
        if (TextUtils.isEmpty(m2160a)) {
            m2160a = ChipTextInputComboView.m2160a(chipTextInputComboView, "00");
        }
        chip.setText(m2160a);
    }
}
