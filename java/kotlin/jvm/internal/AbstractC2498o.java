package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.o */
/* loaded from: classes.dex */
public abstract class AbstractC2498o {

    /* renamed from: a */
    public static final C2499p f8175a;

    static {
        C2499p c2499p = null;
        try {
            c2499p = (C2499p) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2499p == null) {
            c2499p = new C2499p();
        }
        f8175a = c2499p;
    }
}
