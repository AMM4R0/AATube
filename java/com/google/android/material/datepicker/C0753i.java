package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p080e0.AbstractC0824G;
import p080e0.AbstractC0827J;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C0753i extends AbstractC0827J {

    /* renamed from: a */
    public final /* synthetic */ C0763s f2879a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f2880b;

    /* renamed from: c */
    public final /* synthetic */ C0755k f2881c;

    public C0753i(C0755k c0755k, C0763s c0763s, MaterialButton materialButton) {
        this.f2881c = c0755k;
        this.f2879a = c0763s;
        this.f2880b = materialButton;
    }

    @Override // p080e0.AbstractC0827J
    /* renamed from: a */
    public final void mo2104a(RecyclerView recyclerView, int r2) {
        if (r2 == 0) {
            recyclerView.announceForAccessibility(this.f2880b.getText());
        }
    }

    @Override // p080e0.AbstractC0827J
    /* renamed from: b */
    public final void mo2105b(RecyclerView recyclerView, int r5, int r6) {
        int m1858K0;
        String formatDateTime;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        C0755k c0755k = this.f2881c;
        if (r5 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0755k.f2890Y.getLayoutManager();
            View m1861M0 = linearLayoutManager.m1861M0(0, linearLayoutManager.m2304v(), false);
            m1858K0 = m1861M0 == null ? -1 : AbstractC0824G.m2276H(m1861M0);
        } else {
            m1858K0 = ((LinearLayoutManager) c0755k.f2890Y.getLayoutManager()).m1858K0();
        }
        C0746b c0746b = this.f2879a.f2939c;
        Calendar m2122a = AbstractC0767w.m2122a(c0746b.f2859a.f2923a);
        m2122a.add(2, m1858K0);
        c0755k.f2886U = new C0759o(m2122a);
        Calendar m2122a2 = AbstractC0767w.m2122a(c0746b.f2859a.f2923a);
        m2122a2.add(2, m1858K0);
        m2122a2.set(5, 1);
        Calendar m2122a3 = AbstractC0767w.m2122a(m2122a2);
        m2122a3.get(2);
        m2122a3.get(1);
        m2122a3.getMaximum(7);
        m2122a3.getActualMaximum(5);
        m2122a3.getTimeInMillis();
        long timeInMillis = m2122a3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0767w.f2943a;
            instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            timeZone = TimeZone.getTimeZone("UTC");
            instanceForSkeleton.setTimeZone(timeZone);
            displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(displayContext);
            formatDateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f2880b.setText(formatDateTime);
    }
}
