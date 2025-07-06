package p084g;

import android.graphics.drawable.Animatable;
import p001A0.AbstractC0005b;
import p100j0.C2434e;

/* renamed from: g.a */
/* loaded from: classes.dex */
public final class C0905a extends AbstractC0005b {

    /* renamed from: d */
    public final /* synthetic */ int f3756d;

    /* renamed from: e */
    public final Animatable f3757e;

    public /* synthetic */ C0905a(Animatable animatable, int r2) {
        this.f3756d = r2;
        this.f3757e = animatable;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: N */
    public final void mo85N() {
        switch (this.f3756d) {
            case 0:
                this.f3757e.start();
                break;
            default:
                ((C2434e) this.f3757e).start();
                break;
        }
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: O */
    public final void mo86O() {
        switch (this.f3756d) {
            case 0:
                this.f3757e.stop();
                break;
            default:
                ((C2434e) this.f3757e).stop();
                break;
        }
    }
}
