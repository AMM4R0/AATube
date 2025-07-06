package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p103k0.AbstractC2481b;
import p103k0.C2482c;
import p103k0.InterfaceC2483d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC2481b abstractC2481b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC2483d interfaceC2483d = remoteActionCompat.f2010a;
        if (abstractC2481b.mo4901e(1)) {
            interfaceC2483d = abstractC2481b.m4904h();
        }
        remoteActionCompat.f2010a = (IconCompat) interfaceC2483d;
        CharSequence charSequence = remoteActionCompat.f2011b;
        if (abstractC2481b.mo4901e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2482c) abstractC2481b).f8156e);
        }
        remoteActionCompat.f2011b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2012c;
        if (abstractC2481b.mo4901e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2482c) abstractC2481b).f8156e);
        }
        remoteActionCompat.f2012c = charSequence2;
        remoteActionCompat.f2013d = (PendingIntent) abstractC2481b.m4903g(remoteActionCompat.f2013d, 4);
        boolean z2 = remoteActionCompat.f2014e;
        if (abstractC2481b.mo4901e(5)) {
            z2 = ((C2482c) abstractC2481b).f8156e.readInt() != 0;
        }
        remoteActionCompat.f2014e = z2;
        boolean z3 = remoteActionCompat.f2015f;
        if (abstractC2481b.mo4901e(6)) {
            z3 = ((C2482c) abstractC2481b).f8156e.readInt() != 0;
        }
        remoteActionCompat.f2015f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC2481b abstractC2481b) {
        abstractC2481b.getClass();
        IconCompat iconCompat = remoteActionCompat.f2010a;
        abstractC2481b.mo4905i(1);
        abstractC2481b.m4908l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2011b;
        abstractC2481b.mo4905i(2);
        Parcel parcel = ((C2482c) abstractC2481b).f8156e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2012c;
        abstractC2481b.mo4905i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC2481b.m4907k(remoteActionCompat.f2013d, 4);
        boolean z2 = remoteActionCompat.f2014e;
        abstractC2481b.mo4905i(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f2015f;
        abstractC2481b.mo4905i(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
