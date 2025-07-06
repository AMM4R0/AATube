package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C1842f9;
import java.util.Arrays;
import p001A0.AbstractC0005b;
import p010D0.C0109g;
import p023I0.C0205c;
import p124s0.C2731b;
import p133v0.AbstractC2863r;
import p136w0.AbstractC2877a;

/* loaded from: classes.dex */
public final class Status extends AbstractC2877a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C0205c(28);

    /* renamed from: a */
    public final int f2693a;

    /* renamed from: b */
    public final int f2694b;

    /* renamed from: c */
    public final String f2695c;

    /* renamed from: d */
    public final PendingIntent f2696d;

    /* renamed from: e */
    public final C2731b f2697e;

    public Status(int r12, int r2, String str, PendingIntent pendingIntent, C2731b c2731b) {
        this.f2693a = r12;
        this.f2694b = r2;
        this.f2695c = str;
        this.f2696d = pendingIntent;
        this.f2697e = c2731b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2693a == status.f2693a && this.f2694b == status.f2694b && AbstractC2863r.m5476e(this.f2695c, status.f2695c) && AbstractC2863r.m5476e(this.f2696d, status.f2696d) && AbstractC2863r.m5476e(this.f2697e, status.f2697e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2693a), Integer.valueOf(this.f2694b), this.f2695c, this.f2696d, this.f2697e});
    }

    public final String toString() {
        C0109g c0109g = new C0109g(this);
        String str = this.f2695c;
        if (str == null) {
            int r12 = this.f2694b;
            switch (r12) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(r12);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case C1842f9.f6208E /* 19 */:
                    str = "REMOTE_EXCEPTION";
                    break;
                case C1842f9.f6209F /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case C1842f9.f6210G /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c0109g.m352b(str, "statusCode");
        c0109g.m352b(this.f2696d, "resolution");
        return c0109g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f2694b);
        AbstractC0005b.m56V(parcel, 2, this.f2695c);
        AbstractC0005b.m55U(parcel, 3, this.f2696d, r6);
        AbstractC0005b.m55U(parcel, 4, this.f2697e, r6);
        AbstractC0005b.m61a0(parcel, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 4);
        parcel.writeInt(this.f2693a);
        AbstractC0005b.m60Z(parcel, m59Y);
    }

    public Status(int r7, String str) {
        this(1, r7, str, null, null);
    }
}
