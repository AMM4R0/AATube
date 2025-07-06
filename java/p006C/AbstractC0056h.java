package p006C;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p036M1.AbstractC0379e;
import p112o.C2686f;

/* renamed from: C.h */
/* loaded from: classes.dex */
public abstract class AbstractC0056h {

    /* renamed from: a */
    public static final AbstractC0379e f108a;

    /* renamed from: b */
    public static final C2686f f109b;

    static {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 29) {
            f108a = new C0061m();
        } else if (r02 >= 28) {
            f108a = new C0060l();
        } else if (r02 >= 26) {
            f108a = new C0059k();
        } else {
            if (r02 >= 24) {
                Method method = C0058j.f117h;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f108a = new C0058j();
                }
            }
            f108a = new C0057i();
        }
        f109b = new C2686f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r4) == false) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m226a(android.content.Context r15, p003B.InterfaceC0032f r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, p003B.AbstractC0028b r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p006C.AbstractC0056h.m226a(android.content.Context, B.f, android.content.res.Resources, int, java.lang.String, int, int, B.b, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m227b(Resources resources, int r2, String str, int r4, int r5) {
        return resources.getResourcePackageName(r2) + '-' + str + '-' + r4 + '-' + r2 + '-' + r5;
    }
}
