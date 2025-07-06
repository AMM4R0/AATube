package p130u0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p010D0.C0109g;
import p010D0.RunnableC0107e;

/* renamed from: u0.o */
/* loaded from: classes.dex */
public final class C2791o extends BroadcastReceiver {

    /* renamed from: a */
    public Context f9123a;

    /* renamed from: b */
    public final C0109g f9124b;

    public C2791o(C0109g c0109g) {
        this.f9124b = c0109g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((RunnableC0107e) this.f9124b.f339c).getClass();
            throw null;
        }
    }
}
