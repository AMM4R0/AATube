package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import p080e0.AbstractC0824G;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0750f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2873a;

    /* renamed from: b */
    public final /* synthetic */ C0763s f2874b;

    /* renamed from: c */
    public final /* synthetic */ C0755k f2875c;

    public /* synthetic */ ViewOnClickListenerC0750f(C0755k c0755k, C0763s c0763s, int r3) {
        this.f2873a = r3;
        this.f2875c = c0755k;
        this.f2874b = c0763s;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2873a) {
            case 0:
                C0755k c0755k = this.f2875c;
                int m1858K0 = ((LinearLayoutManager) c0755k.f2890Y.getLayoutManager()).m1858K0() - 1;
                if (m1858K0 >= 0) {
                    Calendar m2122a = AbstractC0767w.m2122a(this.f2874b.f2939c.f2859a.f2923a);
                    m2122a.add(2, m1858K0);
                    c0755k.m2106A(new C0759o(m2122a));
                    break;
                }
                break;
            default:
                C0755k c0755k2 = this.f2875c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0755k2.f2890Y.getLayoutManager();
                View m1861M0 = linearLayoutManager.m1861M0(0, linearLayoutManager.m2304v(), false);
                int m2276H = (m1861M0 == null ? -1 : AbstractC0824G.m2276H(m1861M0)) + 1;
                if (m2276H < c0755k2.f2890Y.getAdapter().mo2118a()) {
                    Calendar m2122a2 = AbstractC0767w.m2122a(this.f2874b.f2939c.f2859a.f2923a);
                    m2122a2.add(2, m2276H);
                    c0755k2.m2106A(new C0759o(m2122a2));
                    break;
                }
                break;
        }
    }
}
