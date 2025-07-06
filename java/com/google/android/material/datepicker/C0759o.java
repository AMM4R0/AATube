package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p023I0.C0205c;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class C0759o implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0759o> CREATOR = new C0205c(17);

    /* renamed from: a */
    public final Calendar f2923a;

    /* renamed from: b */
    public final int f2924b;

    /* renamed from: c */
    public final int f2925c;

    /* renamed from: d */
    public final int f2926d;

    /* renamed from: e */
    public final int f2927e;

    /* renamed from: f */
    public final long f2928f;

    /* renamed from: g */
    public String f2929g;

    public C0759o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m2122a = AbstractC0767w.m2122a(calendar);
        this.f2923a = m2122a;
        this.f2924b = m2122a.get(2);
        this.f2925c = m2122a.get(1);
        this.f2926d = m2122a.getMaximum(7);
        this.f2927e = m2122a.getActualMaximum(5);
        this.f2928f = m2122a.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0759o m2111a(int r2, int r3) {
        Calendar m2124c = AbstractC0767w.m2124c(null);
        m2124c.set(1, r2);
        m2124c.set(2, r3);
        return new C0759o(m2124c);
    }

    /* renamed from: b */
    public static C0759o m2112b(long j2) {
        Calendar m2124c = AbstractC0767w.m2124c(null);
        m2124c.setTimeInMillis(j2);
        return new C0759o(m2124c);
    }

    /* renamed from: c */
    public final String m2113c() {
        String formatDateTime;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        if (this.f2929g == null) {
            long timeInMillis = this.f2923a.getTimeInMillis();
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
            this.f2929g = formatDateTime;
        }
        return this.f2929g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2923a.compareTo(((C0759o) obj).f2923a);
    }

    /* renamed from: d */
    public final int m2114d(C0759o c0759o) {
        if (!(this.f2923a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0759o.f2924b - this.f2924b) + ((c0759o.f2925c - this.f2925c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0759o)) {
            return false;
        }
        C0759o c0759o = (C0759o) obj;
        return this.f2924b == c0759o.f2924b && this.f2925c == c0759o.f2925c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2924b), Integer.valueOf(this.f2925c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f2925c);
        parcel.writeInt(this.f2924b);
    }
}
