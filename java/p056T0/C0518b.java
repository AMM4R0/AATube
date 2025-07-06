package p056T0;

import android.graphics.Typeface;
import android.support.v4.media.session.AbstractC0580g;
import com.google.android.material.chip.Chip;
import p065Y0.C0554i;
import p065Y0.InterfaceC0553h;

/* renamed from: T0.b */
/* loaded from: classes.dex */
public final class C0518b extends AbstractC0580g {

    /* renamed from: e */
    public final /* synthetic */ int f1369e;

    /* renamed from: f */
    public final /* synthetic */ Object f1370f;

    public /* synthetic */ C0518b(int r12, Object obj) {
        this.f1369e = r12;
        this.f1370f = obj;
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: r */
    public final void mo1350r(int r2) {
        switch (this.f1369e) {
            case 0:
                break;
            default:
                C0554i c0554i = (C0554i) this.f1370f;
                c0554i.f1557d = true;
                InterfaceC0553h interfaceC0553h = (InterfaceC0553h) c0554i.f1558e.get();
                if (interfaceC0553h != null) {
                    C0522f c0522f = (C0522f) interfaceC0553h;
                    c0522f.m1380u();
                    c0522f.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: s */
    public final void mo1351s(Typeface typeface, boolean z2) {
        switch (this.f1369e) {
            case 0:
                Chip chip = (Chip) this.f1370f;
                C0522f c0522f = chip.f2838e;
                chip.setText(c0522f.f1380C0 ? c0522f.f1383E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    C0554i c0554i = (C0554i) this.f1370f;
                    c0554i.f1557d = true;
                    InterfaceC0553h interfaceC0553h = (InterfaceC0553h) c0554i.f1558e.get();
                    if (interfaceC0553h != null) {
                        C0522f c0522f2 = (C0522f) interfaceC0553h;
                        c0522f2.m1380u();
                        c0522f2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    /* renamed from: B */
    private final void m1349B(int r12) {
    }
}
