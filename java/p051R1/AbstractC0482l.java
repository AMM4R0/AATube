package p051R1;

import kotlin.jvm.internal.AbstractC2492i;
import p054S1.C0507f;
import p124s0.C2738i;

/* renamed from: R1.l */
/* loaded from: classes.dex */
public abstract class AbstractC0482l {

    /* renamed from: a */
    public static final C0488r f1225a;

    /* renamed from: b */
    public static final C0507f f1226b;

    static {
        C0488r c0488r;
        try {
            Class.forName("java.nio.file.Files");
            c0488r = new C0489s();
        } catch (ClassNotFoundException unused) {
            c0488r = new C0488r();
        }
        f1225a = c0488r;
        String str = C0492v.f1244b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC2492i.m4914d(property, "getProperty(...)");
        C2738i.m5333f(property, false);
        ClassLoader classLoader = C0507f.class.getClassLoader();
        AbstractC2492i.m4914d(classLoader, "getClassLoader(...)");
        f1226b = new C0507f(classLoader);
    }

    /* renamed from: a */
    public abstract C0487q mo1241a(C0492v c0492v);

    /* renamed from: b */
    public abstract InterfaceC0467D mo1242b(C0492v c0492v);
}
