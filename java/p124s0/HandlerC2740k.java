package p124s0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p013E0.HandlerC0128e;
import p015F0.AbstractC0132c;

/* renamed from: s0.k */
/* loaded from: classes.dex */
public final class HandlerC2740k extends HandlerC0128e {

    /* renamed from: a */
    public final Context f8994a;

    /* renamed from: b */
    public final /* synthetic */ C2734e f8995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2740k(C2734e c2734e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f8995b = c2734e;
        this.f8994a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int r6 = message.what;
        if (r6 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(r6);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int r62 = C2735f.f8983a;
        C2734e c2734e = this.f8995b;
        Context context = this.f8994a;
        int m5329b = c2734e.m5329b(context, r62);
        int r3 = AbstractC2737h.f8987c;
        if (m5329b == 1 || m5329b == 2 || m5329b == 3 || m5329b == 9) {
            Intent m5328a = c2734e.m5328a(context, "n", m5329b);
            c2734e.m5326f(context, m5329b, m5328a == null ? null : PendingIntent.getActivity(context, 0, m5328a, AbstractC0132c.f380a | 134217728));
        }
    }
}
