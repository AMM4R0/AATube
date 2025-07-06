package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p008C1.C0091w;
import p010D0.C0109g;
import p112o.C2682b;

/* renamed from: android.support.v4.media.c */
/* loaded from: classes.dex */
public class C0568c {

    /* renamed from: a */
    public final Context f1592a;

    /* renamed from: b */
    public final MediaBrowser f1593b;

    /* renamed from: c */
    public final Bundle f1594c;

    /* renamed from: d */
    public final HandlerC0566a f1595d = new HandlerC0566a(this);

    /* renamed from: e */
    public final C2682b f1596e = new C2682b();

    /* renamed from: f */
    public C0109g f1597f;

    /* renamed from: g */
    public Messenger f1598g;

    /* renamed from: h */
    public MediaSessionCompat$Token f1599h;

    public C0568c(Context context, ComponentName componentName, C0091w c0091w) {
        this.f1592a = context;
        Bundle bundle = new Bundle();
        this.f1594c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c0091w.f295c = this;
        this.f1593b = new MediaBrowser(context, componentName, (C0567b) c0091w.f294b, bundle);
    }
}
