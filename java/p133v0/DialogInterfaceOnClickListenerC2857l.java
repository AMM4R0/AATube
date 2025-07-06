package p133v0;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: v0.l */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2857l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f9437a;

    /* renamed from: b */
    public final /* synthetic */ Intent f9438b;

    /* renamed from: c */
    public final /* synthetic */ Object f9439c;

    public /* synthetic */ DialogInterfaceOnClickListenerC2857l(Intent intent, Object obj, int r3) {
        this.f9437a = r3;
        this.f9438b = intent;
        this.f9439c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u0.e] */
    /* renamed from: a */
    public final void m5465a() {
        switch (this.f9437a) {
            case 0:
                Intent intent = this.f9438b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f9439c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f9438b;
                if (intent2 != null) {
                    this.f9439c.m5399a(2, intent2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r6) {
        try {
            m5465a();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
