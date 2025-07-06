package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public final class C0760p extends BaseAdapter {

    /* renamed from: d */
    public static final int f2930d = AbstractC0767w.m2124c(null).getMaximum(4);

    /* renamed from: e */
    public static final int f2931e = (AbstractC0767w.m2124c(null).getMaximum(7) + AbstractC0767w.m2124c(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C0759o f2932a;

    /* renamed from: b */
    public C0747c f2933b;

    /* renamed from: c */
    public final C0746b f2934c;

    public C0760p(C0759o c0759o, C0746b c0746b) {
        this.f2932a = c0759o;
        this.f2934c = c0746b;
        throw null;
    }

    /* renamed from: a */
    public final int m2115a() {
        int r02 = this.f2934c.f2863e;
        C0759o c0759o = this.f2932a;
        Calendar calendar = c0759o.f2923a;
        int r3 = calendar.get(7);
        if (r02 <= 0) {
            r02 = calendar.getFirstDayOfWeek();
        }
        int r32 = r3 - r02;
        return r32 < 0 ? r32 + c0759o.f2926d : r32;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int r3) {
        if (r3 < m2115a() || r3 > m2117c()) {
            return null;
        }
        int m2115a = (r3 - m2115a()) + 1;
        Calendar m2122a = AbstractC0767w.m2122a(this.f2932a.f2923a);
        m2122a.set(5, m2115a);
        return Long.valueOf(m2122a.getTimeInMillis());
    }

    /* renamed from: c */
    public final int m2117c() {
        return (m2115a() + this.f2932a.f2927e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f2931e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3 / this.f2932a.f2926d;
    }

    @Override // android.widget.Adapter
    public final View getView(int r5, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f2933b == null) {
            this.f2933b = new C0747c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int m2115a = r5 - m2115a();
        if (m2115a >= 0) {
            C0759o c0759o = this.f2932a;
            if (m2115a < c0759o.f2927e) {
                textView.setTag(c0759o);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(m2115a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(r5) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                AbstractC0767w.m2123b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(r5) == null) {
            textView.getContext();
            AbstractC0767w.m2123b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
