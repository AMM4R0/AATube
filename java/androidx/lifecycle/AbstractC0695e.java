package androidx.lifecycle;

/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0695e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2403a;

    static {
        int[] r02 = new int[EnumC0702l.values().length];
        try {
            r02[EnumC0702l.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            r02[EnumC0702l.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            r02[EnumC0702l.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            r02[EnumC0702l.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            r02[EnumC0702l.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            r02[EnumC0702l.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            r02[EnumC0702l.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f2403a = r02;
    }
}
