package p102k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p099j.InterfaceC2417b;

/* renamed from: k.q */
/* loaded from: classes.dex */
public final class C2470q extends FrameLayout implements InterfaceC2417b {

    /* renamed from: a */
    public final CollapsibleActionView f8124a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2470q(View view) {
        super(view.getContext());
        this.f8124a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p099j.InterfaceC2417b
    /* renamed from: b */
    public final void mo1515b() {
        this.f8124a.onActionViewExpanded();
    }

    @Override // p099j.InterfaceC2417b
    /* renamed from: e */
    public final void mo1516e() {
        this.f8124a.onActionViewCollapsed();
    }
}
