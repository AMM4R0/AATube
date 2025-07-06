package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.w */
/* loaded from: classes.dex */
public abstract class AbstractC0767w {

    /* renamed from: a */
    public static final AtomicReference f2943a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m2122a(Calendar calendar) {
        Calendar m2124c = m2124c(calendar);
        Calendar m2124c2 = m2124c(null);
        m2124c2.set(m2124c.get(1), m2124c.get(2), m2124c.get(5));
        return m2124c2;
    }

    /* renamed from: b */
    public static Calendar m2123b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m2124c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
