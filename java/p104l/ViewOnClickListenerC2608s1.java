package p104l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import p102k.C2454a;

/* renamed from: l.s1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2608s1 implements View.OnClickListener {

    /* renamed from: a */
    public final C2454a f8468a;

    /* renamed from: b */
    public final /* synthetic */ C2611t1 f8469b;

    public ViewOnClickListenerC2608s1(C2611t1 c2611t1) {
        this.f8469b = c2611t1;
        Context context = c2611t1.f8477a.getContext();
        CharSequence charSequence = c2611t1.f8484h;
        C2454a c2454a = new C2454a();
        c2454a.f8002e = Base64Utils.IO_BUFFER_SIZE;
        c2454a.f8004g = Base64Utils.IO_BUFFER_SIZE;
        c2454a.f8009l = null;
        c2454a.f8010m = null;
        c2454a.f8011n = false;
        c2454a.f8012o = false;
        c2454a.f8013p = 16;
        c2454a.f8006i = context;
        c2454a.f7998a = charSequence;
        this.f8468a = c2454a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2611t1 c2611t1 = this.f8469b;
        Window.Callback callback = c2611t1.f8487k;
        if (callback == null || !c2611t1.f8488l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f8468a);
    }
}
