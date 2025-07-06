package io.appmetrica.analytics;

import java.util.Objects;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a */
    private final String f4155a;

    /* renamed from: b */
    private final StartupParamsItemStatus f4156b;

    /* renamed from: c */
    private final String f4157c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f4155a = str;
        this.f4156b = startupParamsItemStatus;
        this.f4157c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f4155a, startupParamsItem.f4155a) && this.f4156b == startupParamsItem.f4156b && Objects.equals(this.f4157c, startupParamsItem.f4157c);
    }

    public String getErrorDetails() {
        return this.f4157c;
    }

    public String getId() {
        return this.f4155a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f4156b;
    }

    public int hashCode() {
        return Objects.hash(this.f4155a, this.f4156b, this.f4157c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f4155a);
        sb.append("', status=");
        sb.append(this.f4156b);
        sb.append(", errorDetails='");
        return AbstractC0002c.m17l(sb, this.f4157c, "'}");
    }
}
