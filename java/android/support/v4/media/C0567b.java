package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.AbstractBinderC0575b;
import android.support.v4.media.session.C0574a;
import android.support.v4.media.session.C0577d;
import android.support.v4.media.session.C0578e;
import android.support.v4.media.session.InterfaceC0576c;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import p008C1.C0091w;
import p010D0.C0109g;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public final class C0567b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final /* synthetic */ C0091w f1591a;

    public C0567b(C0091w c0091w) {
        this.f1591a = c0091w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.support.v4.media.session.c] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        C0574a c0574a;
        C0091w c0091w = this.f1591a;
        C0568c c0568c = (C0568c) c0091w.f295c;
        if (c0568c != null) {
            MediaBrowser mediaBrowser = c0568c.f1593b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        C0109g c0109g = new C0109g(5);
                        c0109g.f338b = new Messenger(binder);
                        c0109g.f339c = c0568c.f1594c;
                        c0568c.f1597f = c0109g;
                        HandlerC0566a handlerC0566a = c0568c.f1595d;
                        Messenger messenger = new Messenger(handlerC0566a);
                        c0568c.f1598g = messenger;
                        handlerC0566a.getClass();
                        handlerC0566a.f1590b = new WeakReference(messenger);
                        try {
                            C0109g c0109g2 = c0568c.f1597f;
                            Context context = c0568c.f1592a;
                            Messenger messenger2 = c0568c.f1598g;
                            c0109g2.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) c0109g2.f339c);
                            c0109g2.m349D(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int r5 = AbstractBinderC0575b.f1631a;
                    if (binder2 == null) {
                        c0574a = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0576c)) {
                            C0574a c0574a2 = new C0574a();
                            c0574a2.f1630a = binder2;
                            c0574a = c0574a2;
                        } else {
                            c0574a = (InterfaceC0576c) queryLocalInterface;
                        }
                    }
                    if (c0574a != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        c0568c.f1599h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, c0574a) : null;
                    }
                }
            } catch (IllegalStateException e2) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
            }
        }
        C0568c c0568c2 = ((C0570e) c0091w.f299g).f1601a;
        if (c0568c2.f1599h == null) {
            MediaSession.Token sessionToken2 = c0568c2.f1593b.getSessionToken();
            c0568c2.f1599h = sessionToken2 != null ? new MediaSessionCompat$Token(sessionToken2, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = c0568c2.f1599h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        int r2 = Build.VERSION.SDK_INT;
        Context context2 = (Context) c0091w.f296d;
        C0577d c0578e = r2 >= 29 ? new C0578e(context2, mediaSessionCompat$Token) : new C0577d(context2, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) ((Intent) c0091w.f297e).getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        c0578e.f1632a.dispatchMediaButtonEvent(keyEvent);
        c0091w.m307c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        C0091w c0091w = this.f1591a;
        C0568c c0568c = (C0568c) c0091w.f295c;
        if (c0568c != null) {
            c0568c.getClass();
        }
        c0091w.m307c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C0091w c0091w = this.f1591a;
        C0568c c0568c = (C0568c) c0091w.f295c;
        if (c0568c != null) {
            c0568c.f1597f = null;
            c0568c.f1598g = null;
            c0568c.f1599h = null;
            HandlerC0566a handlerC0566a = c0568c.f1595d;
            handlerC0566a.getClass();
            handlerC0566a.f1590b = new WeakReference(null);
        }
        c0091w.m307c();
    }
}
