package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import p013E0.HandlerC0128e;
import p124s0.C2731b;
import p124s0.C2734e;
import p130u0.C2779c;
import p133v0.AbstractC2863r;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public static final /* synthetic */ int f2689b = 0;

    /* renamed from: a */
    public int f2690a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int r4, int r5, Intent intent) {
        super.onActivityResult(r4, r5, intent);
        if (r4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2690a = 0;
            setResult(r5, intent);
            if (booleanExtra) {
                C2779c m5394e = C2779c.m5394e(this);
                if (r5 == -1) {
                    HandlerC0128e handlerC0128e = m5394e.f9099m;
                    handlerC0128e.sendMessage(handlerC0128e.obtainMessage(3));
                } else if (r5 == 0) {
                    m5394e.m5398f(new C2731b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (r4 == 2) {
            this.f2690a = 0;
            setResult(r5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2690a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2690a = bundle.getInt("resolution");
        }
        if (this.f2690a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                AbstractC2863r.m5474c(num);
                C2734e.f8982d.m5325c(this, num.intValue(), this);
                this.f2690a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f2690a = 1;
            } catch (ActivityNotFoundException e2) {
                if (extras.getBoolean("notify_manager", true)) {
                    C2779c.m5394e(this).m5398f(new C2731b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb2, e2);
                }
                this.f2690a = 1;
                finish();
            } catch (IntentSender.SendIntentException e3) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e3);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2690a);
        super.onSaveInstanceState(bundle);
    }
}
