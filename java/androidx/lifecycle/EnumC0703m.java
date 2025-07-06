package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class EnumC0703m {

    /* renamed from: a */
    public static final EnumC0703m f2405a;

    /* renamed from: b */
    public static final EnumC0703m f2406b;

    /* renamed from: c */
    public static final EnumC0703m f2407c;

    /* renamed from: d */
    public static final EnumC0703m f2408d;

    /* renamed from: e */
    public static final EnumC0703m f2409e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC0703m[] f2410f;

    static {
        EnumC0703m enumC0703m = new EnumC0703m("DESTROYED", 0);
        f2405a = enumC0703m;
        EnumC0703m enumC0703m2 = new EnumC0703m("INITIALIZED", 1);
        f2406b = enumC0703m2;
        EnumC0703m enumC0703m3 = new EnumC0703m("CREATED", 2);
        f2407c = enumC0703m3;
        EnumC0703m enumC0703m4 = new EnumC0703m("STARTED", 3);
        f2408d = enumC0703m4;
        EnumC0703m enumC0703m5 = new EnumC0703m("RESUMED", 4);
        f2409e = enumC0703m5;
        f2410f = new EnumC0703m[]{enumC0703m, enumC0703m2, enumC0703m3, enumC0703m4, enumC0703m5};
    }

    public static EnumC0703m valueOf(String str) {
        return (EnumC0703m) Enum.valueOf(EnumC0703m.class, str);
    }

    public static EnumC0703m[] values() {
        return (EnumC0703m[]) f2410f.clone();
    }
}
