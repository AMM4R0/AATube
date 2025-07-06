package p073c0;

import android.content.Context;

/* renamed from: c0.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0731g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2643a;

    /* renamed from: b */
    public final /* synthetic */ Context f2644b;

    public /* synthetic */ RunnableC0731g(Context context, int r2) {
        this.f2643a = r2;
        this.f2644b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f2643a
            switch(r0) {
                case 0: goto L99;
                case 1: goto L8b;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L88
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r11.f2644b
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L88
            boolean r3 = p017G.AbstractC0138b.m439a()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L61
            o.c r3 = p079e.AbstractC0802k.f3255g
            java.util.Iterator r3 = r3.iterator()
        L2d:
            r5 = r3
            o.g r5 = (p112o.C2687g) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r5 = r5.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            e.k r5 = (p079e.AbstractC0802k) r5
            if (r5 == 0) goto L2d
            e.x r5 = (p079e.LayoutInflaterFactory2C0815x) r5
            android.content.Context r5 = r5.f3328k
            if (r5 == 0) goto L2d
            java.lang.Object r3 = r5.getSystemService(r4)
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 == 0) goto L66
            android.os.LocaleList r3 = p079e.AbstractC0801j.m2213a(r3)
            G.h r5 = new G.h
            G.l r6 = new G.l
            r6.<init>(r3)
            r5.<init>(r6)
            goto L68
        L61:
            G.h r5 = p079e.AbstractC0802k.f3251c
            if (r5 == 0) goto L66
            goto L68
        L66:
            G.h r5 = p017G.C0144h.f410b
        L68:
            G.j r3 = r5.f411a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L81
            java.lang.String r3 = android.support.v4.media.session.AbstractC0580g.m1455v(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L81
            android.os.LocaleList r3 = p079e.AbstractC0800i.m2212a(r3)
            p079e.AbstractC0801j.m2214b(r4, r3)
        L81:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L88:
            p079e.AbstractC0802k.f3254f = r2
            return
        L8b:
            c0.d r0 = new c0.d
            r0.<init>()
            e1.e r1 = p073c0.AbstractC0730f.f2633a
            r2 = 0
            android.content.Context r3 = r11.f2644b
            p073c0.AbstractC0730f.m2006s(r3, r0, r1, r2)
            return
        L99:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            c0.g r1 = new c0.g
            android.content.Context r2 = r11.f2644b
            r3 = 1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073c0.RunnableC0731g.run():void");
    }
}
