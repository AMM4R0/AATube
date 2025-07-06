package p088h1;

import android.view.View;

/* renamed from: h1.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0921a implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f3840a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0934n f3841b;

    public /* synthetic */ ViewOnFocusChangeListenerC0921a(AbstractC0934n abstractC0934n, int r2) {
        this.f3840a = r2;
        this.f3841b = abstractC0934n;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f3840a) {
            case 0:
                C0924d c0924d = (C0924d) this.f3841b;
                c0924d.m2479t(c0924d.m2480u());
                break;
            default:
                C0930j c0930j = (C0930j) this.f3841b;
                c0930j.f3868l = z2;
                c0930j.m2507q();
                if (!z2) {
                    c0930j.m2488t(false);
                    c0930j.f3869m = false;
                    break;
                }
                break;
        }
    }
}
