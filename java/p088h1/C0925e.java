package p088h1;

import android.support.v4.media.session.AbstractC0580g;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: h1.e */
/* loaded from: classes.dex */
public final class C0925e extends AbstractC0934n {

    /* renamed from: e */
    public final /* synthetic */ int f3855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0925e(C0933m c0933m, int r2) {
        super(c0933m);
        this.f3855e = r2;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: r */
    public void mo2477r() {
        switch (this.f3855e) {
            case 0:
                C0933m c0933m = this.f3900b;
                c0933m.f3891o = null;
                CheckableImageButton checkableImageButton = c0933m.f3883g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0580g.m1457x(checkableImageButton, null);
                break;
        }
    }
}
