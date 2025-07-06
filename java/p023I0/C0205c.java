package p023I0;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.activity.result.C0600a;
import androidx.fragment.app.C0635B;
import androidx.fragment.app.C0639F;
import androidx.fragment.app.C0642I;
import androidx.fragment.app.C0652b;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.material.datepicker.C0746b;
import com.google.android.material.datepicker.C0748d;
import com.google.android.material.datepicker.C0759o;
import io.appmetrica.analytics.impl.C1842f9;
import p046Q.C0437k;
import p053S0.C0500b;
import p067a.C0563d;
import p080e0.C0846b0;
import p080e0.C0848c0;
import p080e0.C0868t;
import p104l.C2531P;
import p116p0.C2707b;
import p124s0.C2731b;
import p124s0.C2733d;
import p133v0.C2854i;

/* renamed from: I0.c */
/* loaded from: classes.dex */
public final class C0205c implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f615a;

    public /* synthetic */ C0205c(int r12) {
        this.f615a = r12;
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03e8  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p023I0.C0205c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch (this.f615a) {
            case 0:
                return new C0204b[r2];
            case 1:
                return new C0207e[r2];
            case 2:
                return new C0208f[r2];
            case 3:
                return new C0437k[r2];
            case 4:
                return new C0500b[r2];
            case 5:
                return new C0563d[r2];
            case 6:
                return new MediaBrowserCompat$MediaItem[r2];
            case 7:
                return new MediaDescriptionCompat[r2];
            case 8:
                return new MediaMetadataCompat[r2];
            case 9:
                return new RatingCompat[r2];
            case 10:
                return new C0600a[r2];
            case 11:
                return new C0652b[r2];
            case 12:
                return new C0635B[r2];
            case 13:
                return new C0639F[r2];
            case 14:
                return new C0642I[r2];
            case 15:
                return new C0746b[r2];
            case 16:
                return new C0748d[r2];
            case 17:
                return new C0759o[r2];
            case 18:
                return new C0868t[r2];
            case C1842f9.f6208E /* 19 */:
                return new C0846b0[r2];
            case C1842f9.f6209F /* 20 */:
                return new C0848c0[r2];
            case C1842f9.f6210G /* 21 */:
                return new ParcelImpl[r2];
            case 22:
                return new C2531P[r2];
            case 23:
                return new C2707b[r2];
            case 24:
                return new GoogleSignInAccount[r2];
            case C1842f9.f6211H /* 25 */:
                return new C2731b[r2];
            case C1842f9.f6212I /* 26 */:
                return new C2733d[r2];
            case C1842f9.f6213J /* 27 */:
                return new Scope[r2];
            case 28:
                return new Status[r2];
            default:
                return new C2854i[r2];
        }
    }
}
