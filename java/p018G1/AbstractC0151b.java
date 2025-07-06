package p018G1;

import java.net.Proxy;

/* renamed from: G1.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0151b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f418a;

    static {
        int[] r02 = new int[Proxy.Type.values().length];
        try {
            r02[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            r02[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f418a = r02;
    }
}
