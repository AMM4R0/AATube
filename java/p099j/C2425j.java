package p099j;

import android.support.v4.media.session.AbstractC0580g;
import p104l.C2611t1;

/* renamed from: j.j */
/* loaded from: classes.dex */
public final class C2425j extends AbstractC0580g {

    /* renamed from: e */
    public final /* synthetic */ int f7875e;

    /* renamed from: f */
    public boolean f7876f;

    /* renamed from: g */
    public int f7877g;

    /* renamed from: h */
    public final /* synthetic */ Object f7878h;

    public C2425j(C2426k c2426k) {
        this.f7875e = 0;
        this.f7878h = c2426k;
        this.f7876f = false;
        this.f7877g = 0;
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: a */
    public final void mo800a() {
        switch (this.f7875e) {
            case 0:
                int r02 = this.f7877g + 1;
                this.f7877g = r02;
                C2426k c2426k = (C2426k) this.f7878h;
                if (r02 == c2426k.f7879a.size()) {
                    AbstractC0580g abstractC0580g = c2426k.f7882d;
                    if (abstractC0580g != null) {
                        abstractC0580g.mo800a();
                    }
                    this.f7877g = 0;
                    this.f7876f = false;
                    c2426k.f7883e = false;
                    break;
                }
                break;
            default:
                if (!this.f7876f) {
                    ((C2611t1) this.f7878h).f8477a.setVisibility(this.f7877g);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.AbstractC0580g, p028K.InterfaceC0292Z
    /* renamed from: b */
    public void mo801b() {
        switch (this.f7875e) {
            case 1:
                this.f7876f = true;
                break;
        }
    }

    @Override // android.support.v4.media.session.AbstractC0580g, p028K.InterfaceC0292Z
    /* renamed from: c */
    public final void mo802c() {
        switch (this.f7875e) {
            case 0:
                if (!this.f7876f) {
                    this.f7876f = true;
                    AbstractC0580g abstractC0580g = ((C2426k) this.f7878h).f7882d;
                    if (abstractC0580g != null) {
                        abstractC0580g.mo802c();
                        break;
                    }
                }
                break;
            default:
                ((C2611t1) this.f7878h).f8477a.setVisibility(0);
                break;
        }
    }

    public C2425j(C2611t1 c2611t1, int r3) {
        this.f7875e = 1;
        this.f7878h = c2611t1;
        this.f7877g = r3;
        this.f7876f = false;
    }
}
