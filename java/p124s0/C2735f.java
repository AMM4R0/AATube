package p124s0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import p001A0.C0006c;
import p001A0.C0007d;
import p133v0.AbstractC2843C;

/* renamed from: s0.f */
/* loaded from: classes.dex */
public class C2735f {

    /* renamed from: a */
    public static final int f8983a;

    /* renamed from: b */
    public static final C2735f f8984b;

    static {
        int r02 = AbstractC2737h.f8987c;
        f8983a = 12451000;
        f8984b = new C2735f();
    }

    /* renamed from: a */
    public Intent m5328a(Context context, String str, int r6) {
        if (r6 != 1 && r6 != 2) {
            if (r6 != 3) {
                return null;
            }
            int r4 = AbstractC2843C.f9392a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC0580g.m1452q(context)) {
            int r42 = AbstractC2843C.f9392a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f8983a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                C0006c m96a = C0007d.m96a(context);
                sb.append(m96a.f3a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        int r5 = AbstractC2843C.f9392a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m5329b(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p124s0.C2735f.m5329b(android.content.Context, int):int");
    }
}
