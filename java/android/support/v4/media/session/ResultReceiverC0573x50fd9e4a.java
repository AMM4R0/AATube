package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p103k0.AbstractC2480a;
import p103k0.InterfaceC2483d;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* loaded from: classes.dex */
class ResultReceiverC0573x50fd9e4a extends ResultReceiver {

    /* renamed from: a */
    public WeakReference f1602a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r7, Bundle bundle) {
        InterfaceC0576c interfaceC0576c;
        C0577d c0577d = (C0577d) this.f1602a.get();
        if (c0577d == null || bundle == null) {
            return;
        }
        synchronized (c0577d.f1633b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c0577d.f1636e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int r3 = AbstractBinderC0575b.f1631a;
            InterfaceC2483d interfaceC2483d = null;
            if (binder == null) {
                interfaceC0576c = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0576c)) {
                    C0574a c0574a = new C0574a();
                    c0574a.f1630a = binder;
                    interfaceC0576c = c0574a;
                } else {
                    interfaceC0576c = (InterfaceC0576c) queryLocalInterface;
                }
            }
            mediaSessionCompat$Token.m1436a(interfaceC0576c);
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0577d.f1636e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(AbstractC2480a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC2483d = ((ParcelImpl) parcelable).f2576a;
                }
            } catch (RuntimeException unused) {
            }
            mediaSessionCompat$Token2.m1437b(interfaceC2483d);
            c0577d.m1438a();
        }
    }
}
