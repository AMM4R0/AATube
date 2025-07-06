package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import p079e.C0796e;
import p099j.AbstractC2416a;
import p102k.C2468o;
import p104l.C2596o1;

/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0754j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2882a;

    /* renamed from: b */
    public final /* synthetic */ Object f2883b;

    public /* synthetic */ ViewOnClickListenerC0754j(int r12, Object obj) {
        this.f2882a = r12;
        this.f2883b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2882a) {
            case 0:
                C0755k c0755k = (C0755k) this.f2883b;
                int r02 = c0755k.f2887V;
                if (r02 != 2) {
                    if (r02 == 1) {
                        c0755k.m2107B(2);
                        break;
                    }
                } else {
                    c0755k.m2107B(1);
                    break;
                }
                break;
            case 1:
                C0796e c0796e = (C0796e) this.f2883b;
                Button button = c0796e.f3219f;
                c0796e.f3235v.obtainMessage(1, c0796e.f3215b).sendToTarget();
                break;
            case 2:
                ((AbstractC2416a) this.f2883b).mo2170a();
                break;
            default:
                C2596o1 c2596o1 = ((Toolbar) this.f2883b).f1928L;
                C2468o c2468o = c2596o1 == null ? null : c2596o1.f8436b;
                if (c2468o != null) {
                    c2468o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
