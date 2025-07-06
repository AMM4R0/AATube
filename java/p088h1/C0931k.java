package p088h1;

import android.text.Editable;
import p065Y0.AbstractC0555j;

/* renamed from: h1.k */
/* loaded from: classes.dex */
public final class C0931k extends AbstractC0555j {

    /* renamed from: a */
    public final /* synthetic */ C0933m f3875a;

    public C0931k(C0933m c0933m) {
        this.f3875a = c0933m;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3875a.m2492b().mo2469a();
    }

    @Override // p065Y0.AbstractC0555j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        this.f3875a.m2492b().mo2505b();
    }
}
