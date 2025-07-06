package p056T0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: T0.c */
/* loaded from: classes.dex */
public final class C0519c extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f1371a;

    public C0519c(Chip chip) {
        this.f1371a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0522f c0522f = this.f1371a.f2838e;
        if (c0522f != null) {
            c0522f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
