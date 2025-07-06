package p102k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p104l.AbstractViewOnTouchListenerC2501A0;
import p104l.C2567f;
import p104l.C2570g;
import p104l.C2576i;
import p104l.C2582k;

/* renamed from: k.b */
/* loaded from: classes.dex */
public final class C2455b extends AbstractViewOnTouchListenerC2501A0 {

    /* renamed from: j */
    public final /* synthetic */ int f8014j = 0;

    /* renamed from: k */
    public final /* synthetic */ View f8015k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2455b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f8015k = actionMenuItemView;
    }

    @Override // p104l.AbstractViewOnTouchListenerC2501A0
    /* renamed from: b */
    public final InterfaceC2451D mo4823b() {
        C2567f c2567f;
        switch (this.f8014j) {
            case 0:
                AbstractC2456c abstractC2456c = ((ActionMenuItemView) this.f8015k).f1722m;
                if (abstractC2456c == null || (c2567f = ((C2570g) abstractC2456c).f8353a.f8402t) == null) {
                    return null;
                }
                return c2567f.m4858a();
            default:
                C2567f c2567f2 = ((C2576i) this.f8015k).f8373d.f8401s;
                if (c2567f2 == null) {
                    return null;
                }
                return c2567f2.m4858a();
        }
    }

    @Override // p104l.AbstractViewOnTouchListenerC2501A0
    /* renamed from: c */
    public final boolean mo4824c() {
        InterfaceC2451D mo4823b;
        switch (this.f8014j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f8015k;
                InterfaceC2465l interfaceC2465l = actionMenuItemView.f1720k;
                return interfaceC2465l != null && interfaceC2465l.mo1491a(actionMenuItemView.f1717h) && (mo4823b = mo4823b()) != null && mo4823b.mo4798b();
            default:
                ((C2576i) this.f8015k).f8373d.m5039l();
                return true;
        }
    }

    @Override // p104l.AbstractViewOnTouchListenerC2501A0
    /* renamed from: d */
    public boolean mo4825d() {
        switch (this.f8014j) {
            case 1:
                C2582k c2582k = ((C2576i) this.f8015k).f8373d;
                if (c2582k.f8403u != null) {
                    return false;
                }
                c2582k.m5037f();
                return true;
            default:
                return super.mo4825d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2455b(C2576i c2576i, C2576i c2576i2) {
        super(c2576i2);
        this.f8015k = c2576i;
    }
}
