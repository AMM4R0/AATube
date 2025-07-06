package p104l;

import androidx.appcompat.widget.ActionBarContextView;
import p028K.InterfaceC0292Z;

/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C2552a implements InterfaceC0292Z {

    /* renamed from: a */
    public boolean f8312a = false;

    /* renamed from: b */
    public int f8313b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f8314c;

    public C2552a(ActionBarContextView actionBarContextView) {
        this.f8314c = actionBarContextView;
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: a */
    public final void mo800a() {
        if (this.f8312a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f8314c;
        actionBarContextView.f1761f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f8313b);
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: b */
    public final void mo801b() {
        this.f8312a = true;
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: c */
    public final void mo802c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f8312a = false;
    }
}
