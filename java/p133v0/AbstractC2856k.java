package p133v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.Log;
import com.carwizard.p075li.youtube.R;
import io.appmetrica.analytics.impl.C1842f9;
import java.util.Locale;
import p001A0.C0007d;
import p017G.AbstractC0141e;
import p017G.C0144h;
import p017G.C0148l;
import p112o.C2691k;
import p124s0.AbstractC2737h;

/* renamed from: v0.k */
/* loaded from: classes.dex */
public abstract class AbstractC2856k {

    /* renamed from: a */
    public static final C2691k f9435a = new C2691k();

    /* renamed from: b */
    public static Locale f9436b;

    /* renamed from: a */
    public static String m5460a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C0007d.m96a(context).f3a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m5461b(Context context, int r6) {
        Resources resources = context.getResources();
        String m5460a = m5460a(context);
        if (r6 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, m5460a);
        }
        if (r6 == 2) {
            return AbstractC0580g.m1452q(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, m5460a);
        }
        if (r6 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, m5460a);
        }
        if (r6 == 5) {
            return m5463d(context, "common_google_play_services_invalid_account_text", m5460a);
        }
        if (r6 == 7) {
            return m5463d(context, "common_google_play_services_network_error_text", m5460a);
        }
        if (r6 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, m5460a);
        }
        if (r6 == 20) {
            return m5463d(context, "common_google_play_services_restricted_profile_text", m5460a);
        }
        switch (r6) {
            case 16:
                return m5463d(context, "common_google_play_services_api_unavailable_text", m5460a);
            case 17:
                return m5463d(context, "common_google_play_services_sign_in_failed_text", m5460a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, m5460a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, m5460a);
        }
    }

    /* renamed from: c */
    public static String m5462c(Context context, int r4) {
        Resources resources = context.getResources();
        switch (r4) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m5464e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m5464e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case C1842f9.f6208E /* 19 */:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(r4);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m5464e(context, "common_google_play_services_sign_in_failed_title");
            case C1842f9.f6209F /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m5464e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: d */
    public static String m5463d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m5464e = m5464e(context, str);
        if (m5464e == null) {
            m5464e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m5464e, str2);
    }

    /* renamed from: e */
    public static String m5464e(Context context, String str) {
        Resources resources;
        C2691k c2691k = f9435a;
        synchronized (c2691k) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new C0144h(new C0148l(AbstractC0141e.m441a(configuration))) : C0144h.m448a(configuration.locale)).f411a.get(0);
                if (!locale.equals(f9436b)) {
                    c2691k.clear();
                    f9436b = locale;
                }
                String str2 = (String) c2691k.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int r2 = AbstractC2737h.f8987c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                    return null;
                }
                f9435a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
