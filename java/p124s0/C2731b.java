package p124s0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.C1842f9;
import java.util.Arrays;
import p001A0.AbstractC0005b;
import p010D0.C0109g;
import p023I0.C0205c;
import p133v0.AbstractC2863r;
import p136w0.AbstractC2877a;

/* renamed from: s0.b */
/* loaded from: classes.dex */
public final class C2731b extends AbstractC2877a {

    /* renamed from: a */
    public final int f8971a;

    /* renamed from: b */
    public final int f8972b;

    /* renamed from: c */
    public final PendingIntent f8973c;

    /* renamed from: d */
    public final String f8974d;

    /* renamed from: e */
    public static final C2731b f8970e = new C2731b(0);
    public static final Parcelable.Creator<C2731b> CREATOR = new C0205c(25);

    public C2731b(int r12, int r2, PendingIntent pendingIntent, String str) {
        this.f8971a = r12;
        this.f8972b = r2;
        this.f8973c = pendingIntent;
        this.f8974d = str;
    }

    /* renamed from: a */
    public static String m5321a(int r2) {
        if (r2 == 99) {
            return "UNFINISHED";
        }
        if (r2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (r2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (r2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case C1842f9.f6208E /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C1842f9.f6209F /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case C1842f9.f6210G /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(r2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2731b)) {
            return false;
        }
        C2731b c2731b = (C2731b) obj;
        return this.f8972b == c2731b.f8972b && AbstractC2863r.m5476e(this.f8973c, c2731b.f8973c) && AbstractC2863r.m5476e(this.f8974d, c2731b.f8974d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8972b), this.f8973c, this.f8974d});
    }

    public final String toString() {
        C0109g c0109g = new C0109g(this);
        c0109g.m352b(m5321a(this.f8972b), "statusCode");
        c0109g.m352b(this.f8973c, "resolution");
        c0109g.m352b(this.f8974d, "message");
        return c0109g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f8971a);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(this.f8972b);
        AbstractC0005b.m55U(parcel, 3, this.f8973c, r6);
        AbstractC0005b.m56V(parcel, 4, this.f8974d);
        AbstractC0005b.m60Z(parcel, m59Y);
    }

    public C2731b(int r3) {
        this(1, r3, null, null);
    }

    public C2731b(int r3, PendingIntent pendingIntent) {
        this(1, r3, pendingIntent, null);
    }
}
