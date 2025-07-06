package p073c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p115p.AbstractFutureC2704g;
import p115p.C2705h;
import p124s0.C2738i;

/* renamed from: c0.m */
/* loaded from: classes.dex */
public abstract class AbstractC0737m {

    /* renamed from: a */
    public static final C2705h f2650a = new C2705h();

    /* renamed from: b */
    public static final Object f2651b = new Object();

    /* renamed from: c */
    public static C2738i f2652c = null;

    /* renamed from: a */
    public static long m2014a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0735k.m2011a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C2738i m2015b() {
        C2738i c2738i = new C2738i();
        f2652c = c2738i;
        C2705h c2705h = f2650a;
        c2705h.getClass();
        if (AbstractFutureC2704g.f8718f.mo1137e(c2705h, null, c2738i)) {
            AbstractFutureC2704g.m5190b(c2705h);
        }
        return f2652c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2016c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p073c0.AbstractC0737m.m2016c(android.content.Context, boolean):void");
    }
}
