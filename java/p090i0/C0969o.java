package p090i0;

import java.util.ArrayList;
import p112o.C2682b;

/* renamed from: i0.o */
/* loaded from: classes.dex */
public final class C0969o extends AbstractC0968n {

    /* renamed from: a */
    public final /* synthetic */ C2682b f4053a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0970p f4054b;

    public C0969o(ViewTreeObserverOnPreDrawListenerC0970p viewTreeObserverOnPreDrawListenerC0970p, C2682b c2682b) {
        this.f4054b = viewTreeObserverOnPreDrawListenerC0970p;
        this.f4053a = c2682b;
    }

    @Override // p090i0.InterfaceC0965k
    /* renamed from: c */
    public final void mo2533c(AbstractC0967m abstractC0967m) {
        ((ArrayList) this.f4053a.getOrDefault(this.f4054b.f4056b, null)).remove(abstractC0967m);
        abstractC0967m.mo2555x(this);
    }
}
