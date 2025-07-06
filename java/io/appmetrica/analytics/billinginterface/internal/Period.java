package io.appmetrica.analytics.billinginterface.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Period {

    /* renamed from: a */
    private static final Pattern f4172a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;
    public final TimeUnit timeUnit;

    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int r12, TimeUnit timeUnit) {
        this.number = r12;
        this.timeUnit = timeUnit;
    }

    public static Period parse(String str) {
        Matcher matcher = f4172a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group == null || group2 == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(group);
            char charAt = group2.charAt(0);
            return new Period(parseInt, charAt != 'D' ? charAt != 'M' ? charAt != 'W' ? charAt != 'Y' ? TimeUnit.TIME_UNIT_UNKNOWN : TimeUnit.YEAR : TimeUnit.WEEK : TimeUnit.MONTH : TimeUnit.DAY);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Period period = (Period) obj;
        return this.number == period.number && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    public String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + "}";
    }
}
