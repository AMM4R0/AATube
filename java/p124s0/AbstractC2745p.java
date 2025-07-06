package p124s0;

import android.content.Context;
import android.util.Log;

/* renamed from: s0.p */
/* loaded from: classes.dex */
public abstract class AbstractC2745p {

    /* renamed from: a */
    public static final BinderC2741l f9002a;

    /* renamed from: b */
    public static final BinderC2741l f9003b;

    /* renamed from: c */
    public static Context f9004c;

    static {
        new BinderC2741l(0, AbstractBinderC2742m.m5338e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC2741l(1, AbstractBinderC2742m.m5338e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f9002a = new BinderC2741l(2, AbstractBinderC2742m.m5338e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f9003b = new BinderC2741l(3, AbstractBinderC2742m.m5338e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    }

    /* renamed from: a */
    public static synchronized void m5339a(Context context) {
        synchronized (AbstractC2745p.class) {
            if (f9004c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f9004c = context.getApplicationContext();
            }
        }
    }
}
