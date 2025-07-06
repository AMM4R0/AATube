package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C0749e extends BaseAdapter {

    /* renamed from: d */
    public static final int f2869d;

    /* renamed from: a */
    public final Calendar f2870a;

    /* renamed from: b */
    public final int f2871b;

    /* renamed from: c */
    public final int f2872c;

    static {
        f2869d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0749e() {
        Calendar m2124c = AbstractC0767w.m2124c(null);
        this.f2870a = m2124c;
        this.f2871b = m2124c.getMaximum(7);
        this.f2872c = m2124c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2871b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r3) {
        int r02 = this.f2871b;
        if (r3 >= r02) {
            return null;
        }
        int r32 = r3 + this.f2872c;
        if (r32 > r02) {
            r32 -= r02;
        }
        return Integer.valueOf(r32);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int r5, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int r52 = r5 + this.f2872c;
        int r6 = this.f2871b;
        if (r52 > r6) {
            r52 -= r6;
        }
        Calendar calendar = this.f2870a;
        calendar.set(7, r52);
        textView.setText(calendar.getDisplayName(7, f2869d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0749e(int r3) {
        Calendar m2124c = AbstractC0767w.m2124c(null);
        this.f2870a = m2124c;
        this.f2871b = m2124c.getMaximum(7);
        this.f2872c = r3;
    }
}
