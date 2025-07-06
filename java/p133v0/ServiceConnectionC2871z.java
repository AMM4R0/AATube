package p133v0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: v0.z */
/* loaded from: classes.dex */
public final class ServiceConnectionC2871z implements ServiceConnection {

    /* renamed from: a */
    public final HashMap f9477a = new HashMap();

    /* renamed from: b */
    public int f9478b = 2;

    /* renamed from: c */
    public boolean f9479c;

    /* renamed from: d */
    public IBinder f9480d;

    /* renamed from: e */
    public final C2870y f9481e;

    /* renamed from: f */
    public ComponentName f9482f;

    /* renamed from: g */
    public final /* synthetic */ C2842B f9483g;

    public ServiceConnectionC2871z(C2842B c2842b, C2870y c2870y) {
        this.f9483g = c2842b;
        this.f9481e = c2870y;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5477a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 3
            r10.f9478b = r0
            v0.B r0 = r10.f9483g
            y0.a r1 = r0.f9389d
            android.content.Context r2 = r0.f9387b
            v0.y r0 = r10.f9481e
            java.lang.String r3 = "ConnectionStatusConfig"
            java.lang.String r4 = r0.f9473a
            r5 = 0
            if (r4 == 0) goto L6e
            boolean r6 = r0.f9476d
            if (r6 == 0) goto L5e
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "serviceActionBundleKey"
            r6.putString(r7, r4)
            android.content.ContentResolver r7 = r2.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2d
            android.net.Uri r8 = p133v0.C2870y.f9472e     // Catch: java.lang.IllegalArgumentException -> L2d
            java.lang.String r9 = "serviceIntentCall"
            android.os.Bundle r6 = r7.call(r8, r9, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L3c
        L2d:
            r6 = move-exception
            java.lang.String r7 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r7.concat(r6)
            android.util.Log.w(r3, r6)
            r6 = r5
        L3c:
            if (r6 != 0) goto L3f
            goto L47
        L3f:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r6.getParcelable(r5)
            android.content.Intent r5 = (android.content.Intent) r5
        L47:
            if (r5 != 0) goto L5e
            int r6 = r4.length()
            java.lang.String r7 = "Dynamic lookup for intent failed for action: "
            if (r6 == 0) goto L56
            java.lang.String r6 = r7.concat(r4)
            goto L5b
        L56:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L5b:
            android.util.Log.w(r3, r6)
        L5e:
            if (r5 == 0) goto L61
            goto L77
        L61:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4)
            java.lang.String r0 = r0.f9474b
            android.content.Intent r0 = r3.setPackage(r0)
            r4 = r0
            goto L78
        L6e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r5 = r0.setComponent(r5)
        L77:
            r4 = r5
        L78:
            v0.y r0 = r10.f9481e
            int r6 = r0.f9475c
            r3 = r11
            r5 = r10
            boolean r11 = r1.m5486c(r2, r3, r4, r5, r6)
            r10.f9479c = r11
            if (r11 == 0) goto L9d
            v0.B r11 = r10.f9483g
            E0.e r11 = r11.f9388c
            v0.y r0 = r10.f9481e
            r1 = 1
            android.os.Message r11 = r11.obtainMessage(r1, r0)
            v0.B r0 = r10.f9483g
            E0.e r0 = r0.f9388c
            v0.B r1 = r10.f9483g
            long r1 = r1.f9391f
            r0.sendMessageDelayed(r11, r1)
            return
        L9d:
            r11 = 2
            r10.f9478b = r11
            v0.B r11 = r10.f9483g     // Catch: java.lang.IllegalArgumentException -> La9
            y0.a r0 = r11.f9389d     // Catch: java.lang.IllegalArgumentException -> La9
            android.content.Context r11 = r11.f9387b     // Catch: java.lang.IllegalArgumentException -> La9
            r0.m5485b(r11, r10)     // Catch: java.lang.IllegalArgumentException -> La9
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p133v0.ServiceConnectionC2871z.m5477a(java.lang.String):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9483g.f9386a) {
            try {
                this.f9483g.f9388c.removeMessages(1, this.f9481e);
                this.f9480d = iBinder;
                this.f9482f = componentName;
                Iterator it = this.f9477a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f9478b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9483g.f9386a) {
            try {
                this.f9483g.f9388c.removeMessages(1, this.f9481e);
                this.f9480d = null;
                this.f9482f = componentName;
                Iterator it = this.f9477a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f9478b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
