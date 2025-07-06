package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class EnumC0702l {
    private static final /* synthetic */ EnumC0702l[] $VALUES;
    public static final C0700j Companion;
    public static final EnumC0702l ON_ANY;
    public static final EnumC0702l ON_CREATE;
    public static final EnumC0702l ON_DESTROY;
    public static final EnumC0702l ON_PAUSE;
    public static final EnumC0702l ON_RESUME;
    public static final EnumC0702l ON_START;
    public static final EnumC0702l ON_STOP;

    static {
        EnumC0702l enumC0702l = new EnumC0702l("ON_CREATE", 0);
        ON_CREATE = enumC0702l;
        EnumC0702l enumC0702l2 = new EnumC0702l("ON_START", 1);
        ON_START = enumC0702l2;
        EnumC0702l enumC0702l3 = new EnumC0702l("ON_RESUME", 2);
        ON_RESUME = enumC0702l3;
        EnumC0702l enumC0702l4 = new EnumC0702l("ON_PAUSE", 3);
        ON_PAUSE = enumC0702l4;
        EnumC0702l enumC0702l5 = new EnumC0702l("ON_STOP", 4);
        ON_STOP = enumC0702l5;
        EnumC0702l enumC0702l6 = new EnumC0702l("ON_DESTROY", 5);
        ON_DESTROY = enumC0702l6;
        EnumC0702l enumC0702l7 = new EnumC0702l("ON_ANY", 6);
        ON_ANY = enumC0702l7;
        $VALUES = new EnumC0702l[]{enumC0702l, enumC0702l2, enumC0702l3, enumC0702l4, enumC0702l5, enumC0702l6, enumC0702l7};
        Companion = new C0700j();
    }

    public static EnumC0702l valueOf(String str) {
        return (EnumC0702l) Enum.valueOf(EnumC0702l.class, str);
    }

    public static EnumC0702l[] values() {
        return (EnumC0702l[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0703m m1789a() {
        switch (AbstractC0701k.f2404a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0703m.f2407c;
            case 3:
            case 4:
                return EnumC0703m.f2408d;
            case 5:
                return EnumC0703m.f2409e;
            case 6:
                return EnumC0703m.f2405a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
