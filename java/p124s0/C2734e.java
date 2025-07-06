package p124s0;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.C0638E;
import androidx.fragment.app.C0651a;
import androidx.fragment.app.C0669s;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.AbstractC0002c;
import p001A0.AbstractC0004a;
import p009D.AbstractC0097c;
import p010D0.C0109g;
import p079e.AbstractActivityC0798g;
import p112o.C2683c;
import p130u0.InterfaceC2781e;
import p133v0.AbstractC2856k;
import p133v0.AbstractC2863r;
import p133v0.DialogInterfaceOnClickListenerC2857l;
import p144z.AbstractC2910h;
import p144z.AbstractC2911i;
import p144z.AbstractC2912j;
import p144z.AbstractC2913k;
import p144z.AbstractC2914l;
import p144z.AbstractC2915m;
import p144z.AbstractC2916n;
import p144z.AbstractC2917o;
import p144z.C2908f;
import p144z.C2909g;

/* renamed from: s0.e */
/* loaded from: classes.dex */
public final class C2734e extends C2735f {

    /* renamed from: c */
    public static final Object f8981c = new Object();

    /* renamed from: d */
    public static final C2734e f8982d = new C2734e();

    /* renamed from: d */
    public static AlertDialog m5323d(Activity activity, int r6, DialogInterfaceOnClickListenerC2857l dialogInterfaceOnClickListenerC2857l, DialogInterface.OnCancelListener onCancelListener) {
        if (r6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC2856k.m5461b(activity, r6));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = r6 != 1 ? r6 != 2 ? r6 != 3 ? resources.getString(R.string.ok) : resources.getString(com.carwizard.p075li.youtube.R.string.common_google_play_services_enable_button) : resources.getString(com.carwizard.p075li.youtube.R.string.common_google_play_services_update_button) : resources.getString(com.carwizard.p075li.youtube.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC2857l);
        }
        String m5462c = AbstractC2856k.m5462c(activity, r6);
        if (m5462c != null) {
            builder.setTitle(m5462c);
        }
        Log.w("GoogleApiAvailability", AbstractC0002c.m11f(r6, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: e */
    public static void m5324e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0798g) {
                C0669s c0669s = (C0669s) ((AbstractActivityC0798g) activity).f3243p.f107b;
                C2739j c2739j = new C2739j();
                AbstractC2863r.m5475d(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c2739j.f8991f0 = alertDialog;
                if (onCancelListener != null) {
                    c2739j.f8992g0 = onCancelListener;
                }
                c2739j.f2280c0 = false;
                c2739j.f2281d0 = true;
                C0638E c0638e = c0669s.f2345g;
                c0638e.getClass();
                C0651a c0651a = new C0651a(c0638e);
                c0651a.m1734e(0, c2739j, str, 1);
                c0651a.m1733d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC2732c dialogFragmentC2732c = new DialogFragmentC2732c();
        AbstractC2863r.m5475d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC2732c.f8975a = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC2732c.f8976b = onCancelListener;
        }
        dialogFragmentC2732c.show(fragmentManager, str);
    }

    /* renamed from: c */
    public final void m5325c(GoogleApiActivity googleApiActivity, int r5, GoogleApiActivity googleApiActivity2) {
        AlertDialog m5323d = m5323d(googleApiActivity, r5, new DialogInterfaceOnClickListenerC2857l(super.m5328a(googleApiActivity, "d", r5), googleApiActivity, 0), googleApiActivity2);
        if (m5323d == null) {
            return;
        }
        m5324e(googleApiActivity, m5323d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* renamed from: f */
    public final void m5326f(Context context, int r20, PendingIntent pendingIntent) {
        NotificationManager notificationManager;
        ?? r3;
        CharSequence charSequence;
        Notification build;
        int r12;
        Bundle bundle;
        int r9;
        ArrayList arrayList;
        int r14;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", AbstractC0002c.m13h("GMS core API Availability. ConnectionResult=", r20, ", tag=null"), new IllegalArgumentException());
        if (r20 == 18) {
            new HandlerC2740k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (r20 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m5464e = r20 == 6 ? AbstractC2856k.m5464e(context, "common_google_play_services_resolution_required_title") : AbstractC2856k.m5462c(context, r20);
        if (m5464e == null) {
            m5464e = context.getResources().getString(com.carwizard.p075li.youtube.R.string.common_google_play_services_notification_ticker);
        }
        String m5463d = (r20 == 6 || r20 == 19) ? AbstractC2856k.m5463d(context, "common_google_play_services_resolution_required_text", AbstractC2856k.m5460a(context)) : AbstractC2856k.m5461b(context, r20);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC2863r.m5474c(systemService);
        NotificationManager notificationManager2 = (NotificationManager) systemService;
        C2909g c2909g = new C2909g();
        ArrayList arrayList2 = new ArrayList();
        c2909g.f9554b = arrayList2;
        c2909g.f9555c = new ArrayList();
        c2909g.f9556d = new ArrayList();
        c2909g.f9561i = true;
        c2909g.f9563k = false;
        Notification notification = new Notification();
        c2909g.f9567o = notification;
        c2909g.f9553a = context;
        c2909g.f9565m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        c2909g.f9560h = 0;
        c2909g.f9568p = new ArrayList();
        c2909g.f9566n = true;
        c2909g.f9563k = true;
        notification.flags |= 16;
        c2909g.f9557e = C2909g.m5494a(m5464e);
        C0109g c0109g = new C0109g(14);
        c0109g.f339c = C2909g.m5494a(m5463d);
        c2909g.m5495b(c0109g);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0580g.f1638a == null) {
            AbstractC0580g.f1638a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0580g.f1638a.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            c2909g.f9560h = 2;
            if (AbstractC0580g.m1452q(context)) {
                arrayList2.add(new C2908f(resources.getString(com.carwizard.p075li.youtube.R.string.common_open_on_phone), pendingIntent));
            } else {
                c2909g.f9559g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = C2909g.m5494a(resources.getString(com.carwizard.p075li.youtube.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            c2909g.f9559g = pendingIntent;
            c2909g.f9558f = C2909g.m5494a(m5463d);
        }
        int r2 = Build.VERSION.SDK_INT;
        if (r2 >= 26) {
            if (r2 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f8981c) {
            }
            notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.carwizard.p075li.youtube.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager2.createNotificationChannel(AbstractC0004a.m26d(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager2.createNotificationChannel(notificationChannel);
                }
            }
            c2909g.f9565m = "com.google.android.gms.availability";
        }
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder m5520a = Build.VERSION.SDK_INT >= 26 ? AbstractC2914l.m5520a(c2909g.f9553a, c2909g.f9565m) : new Notification.Builder(c2909g.f9553a);
        Notification notification2 = c2909g.f9567o;
        m5520a.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c2909g.f9557e).setContentText(c2909g.f9558f).setContentInfo(null).setContentIntent(c2909g.f9559g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        AbstractC2912j.m5513b(m5520a, null);
        m5520a.setSubText(null).setUsesChronometer(false).setPriority(c2909g.f9560h);
        Iterator it = c2909g.f9554b.iterator();
        while (it.hasNext()) {
            C2908f c2908f = (C2908f) it.next();
            if (c2908f.f9547b == null && (r14 = c2908f.f9550e) != 0) {
                c2908f.f9547b = IconCompat.m1587b(r14);
            }
            IconCompat iconCompat = c2908f.f9547b;
            Notification.Action.Builder m5512a = AbstractC2912j.m5512a(iconCompat != null ? AbstractC0097c.m325c(iconCompat, null) : null, c2908f.f9551f, c2908f.f9552g);
            Bundle bundle3 = c2908f.f9546a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z2 = c2908f.f9548c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z2);
            int r11 = Build.VERSION.SDK_INT;
            if (r11 >= 24) {
                AbstractC2913k.m5515a(m5512a, z2);
            }
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (r11 >= 28) {
                AbstractC2915m.m5528b(m5512a, 0);
            }
            if (r11 >= 29) {
                AbstractC2916n.m5531c(m5512a, false);
            }
            if (r11 >= 31) {
                AbstractC2917o.m5533a(m5512a, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", c2908f.f9549d);
            AbstractC2910h.m5497b(m5512a, bundle4);
            AbstractC2910h.m5496a(m5520a, AbstractC2910h.m5499d(m5512a));
        }
        Bundle bundle5 = c2909g.f9564l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int r4 = Build.VERSION.SDK_INT;
        m5520a.setShowWhen(c2909g.f9561i);
        AbstractC2910h.m5504i(m5520a, c2909g.f9563k);
        AbstractC2910h.m5502g(m5520a, null);
        AbstractC2910h.m5505j(m5520a, null);
        AbstractC2910h.m5503h(m5520a, false);
        AbstractC2911i.m5507b(m5520a, null);
        AbstractC2911i.m5508c(m5520a, 0);
        AbstractC2911i.m5511f(m5520a, 0);
        AbstractC2911i.m5509d(m5520a, null);
        AbstractC2911i.m5510e(m5520a, notification2.sound, notification2.audioAttributes);
        ArrayList arrayList3 = c2909g.f9568p;
        ArrayList arrayList4 = c2909g.f9555c;
        if (r4 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it2 = arrayList4.iterator();
                if (it2.hasNext()) {
                    throw AbstractC0002c.m10e(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C2683c c2683c = new C2683c(arrayList3.size() + arrayList.size());
                    c2683c.addAll(arrayList);
                    c2683c.addAll(arrayList3);
                    arrayList3 = new ArrayList(c2683c);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                AbstractC2911i.m5506a(m5520a, (String) it3.next());
            }
        }
        ArrayList arrayList5 = c2909g.f9556d;
        if (arrayList5.size() > 0) {
            if (c2909g.f9564l == null) {
                c2909g.f9564l = new Bundle();
            }
            Bundle bundle6 = c2909g.f9564l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int r13 = 0;
            while (r13 < arrayList5.size()) {
                String num = Integer.toString(r13);
                C2908f c2908f2 = (C2908f) arrayList5.get(r13);
                ArrayList arrayList6 = arrayList5;
                Bundle bundle9 = new Bundle();
                NotificationManager notificationManager3 = notificationManager2;
                if (c2908f2.f9547b == null && (r9 = c2908f2.f9550e) != 0) {
                    c2908f2.f9547b = IconCompat.m1587b(r9);
                }
                IconCompat iconCompat2 = c2908f2.f9547b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.m1588c() : 0);
                bundle9.putCharSequence("title", c2908f2.f9551f);
                bundle9.putParcelable("actionIntent", c2908f2.f9552g);
                Bundle bundle10 = c2908f2.f9546a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", c2908f2.f9548c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c2908f2.f9549d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                r13++;
                arrayList5 = arrayList6;
                notificationManager2 = notificationManager3;
            }
            notificationManager = notificationManager2;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (c2909g.f9564l == null) {
                c2909g.f9564l = new Bundle();
            }
            c2909g.f9564l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            notificationManager = notificationManager2;
        }
        int r15 = Build.VERSION.SDK_INT;
        if (r15 >= 24) {
            m5520a.setExtras(c2909g.f9564l);
            r3 = 0;
            AbstractC2913k.m5519e(m5520a, null);
        } else {
            r3 = 0;
        }
        if (r15 >= 26) {
            AbstractC2914l.m5521b(m5520a, 0);
            AbstractC2914l.m5524e(m5520a, r3);
            AbstractC2914l.m5525f(m5520a, r3);
            AbstractC2914l.m5526g(m5520a, 0L);
            AbstractC2914l.m5523d(m5520a, 0);
            if (!TextUtils.isEmpty(c2909g.f9565m)) {
                m5520a.setSound(r3).setDefaults(0).setLights(0, 0, 0).setVibrate(r3);
            }
        }
        if (r15 >= 28) {
            Iterator it4 = arrayList4.iterator();
            if (it4.hasNext()) {
                throw AbstractC0002c.m10e(it4);
            }
        }
        if (r15 >= 29) {
            AbstractC2916n.m5529a(m5520a, c2909g.f9566n);
            charSequence = null;
            AbstractC2916n.m5530b(m5520a, null);
        } else {
            charSequence = null;
        }
        C0109g c0109g2 = c2909g.f9562j;
        if (c0109g2 != null) {
            new Notification.BigTextStyle(m5520a).setBigContentTitle(charSequence).bigText((CharSequence) c0109g2.f339c);
        }
        if (r2 >= 26) {
            build = m5520a.build();
        } else if (r2 >= 24) {
            build = m5520a.build();
        } else {
            m5520a.setExtras(bundle2);
            build = m5520a.build();
        }
        if (c0109g2 != null) {
            c2909g.f9562j.getClass();
        }
        if (c0109g2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (r20 == 1 || r20 == 2 || r20 == 3) {
            AbstractC2737h.f8985a.set(false);
            r12 = 10436;
        } else {
            r12 = 39789;
        }
        notificationManager.notify(r12, build);
    }

    /* renamed from: g */
    public final void m5327g(Activity activity, InterfaceC2781e interfaceC2781e, int r6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog m5323d = m5323d(activity, r6, new DialogInterfaceOnClickListenerC2857l(super.m5328a(activity, "d", r6), interfaceC2781e, 1), onCancelListener);
        if (m5323d == null) {
            return;
        }
        m5324e(activity, m5323d, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
