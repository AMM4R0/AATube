package p117p1;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public abstract class AbstractC2709a {

    /* renamed from: a */
    public static final Method f8729a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC2492i.m4912b(methods);
        int length = methods.length;
        int r4 = 0;
        while (true) {
            method = null;
            if (r4 >= length) {
                break;
            }
            Method method2 = methods[r4];
            if (AbstractC2492i.m4911a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC2492i.m4914d(parameterTypes, "getParameterTypes(...)");
                if (AbstractC2492i.m4911a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            r4++;
        }
        f8729a = method;
        int length2 = methods.length;
        for (int r3 = 0; r3 < length2 && !AbstractC2492i.m4911a(methods[r3].getName(), "getSuppressed"); r3++) {
        }
    }
}
