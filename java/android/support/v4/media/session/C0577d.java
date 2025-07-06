package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p010D0.BinderC0111i;

/* renamed from: android.support.v4.media.session.d */
/* loaded from: classes.dex */
public class C0577d {

    /* renamed from: a */
    public final MediaController f1632a;

    /* renamed from: b */
    public final Object f1633b = new Object();

    /* renamed from: c */
    public final ArrayList f1634c = new ArrayList();

    /* renamed from: d */
    public final HashMap f1635d = new HashMap();

    /* renamed from: e */
    public final MediaSessionCompat$Token f1636e;

    public C0577d(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        InterfaceC0576c interfaceC0576c;
        this.f1636e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f1607b);
        this.f1632a = mediaController;
        synchronized (mediaSessionCompat$Token.f1606a) {
            interfaceC0576c = mediaSessionCompat$Token.f1608c;
        }
        if (interfaceC0576c == null) {
            ResultReceiverC0573x50fd9e4a resultReceiverC0573x50fd9e4a = new ResultReceiverC0573x50fd9e4a(null);
            resultReceiverC0573x50fd9e4a.f1602a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiverC0573x50fd9e4a);
        }
    }

    /* renamed from: a */
    public final void m1438a() {
        InterfaceC0576c interfaceC0576c;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f1636e;
        synchronized (mediaSessionCompat$Token.f1606a) {
            interfaceC0576c = mediaSessionCompat$Token.f1608c;
        }
        if (interfaceC0576c == null) {
            return;
        }
        ArrayList arrayList = this.f1634c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f1635d.put(null, new BinderC0111i());
            throw null;
        }
    }
}
