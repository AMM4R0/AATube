package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.xc */
/* loaded from: classes.dex */
public final class C2295xc {

    /* renamed from: c */
    public static final SparseArray f7430c;

    /* renamed from: a */
    public final String f7431a;

    /* renamed from: b */
    public final String f7432b;

    static {
        SparseArray sparseArray = new SparseArray();
        f7430c = sparseArray;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C2295xc("jvm", "binder"));
        sparseArray.put(5890, new C2295xc("jvm", "intent"));
        sparseArray.put(5889, new C2295xc("jvm", "file"));
        sparseArray.put(5897, new C2295xc("jni_native", "file"));
        sparseArray.put(5898, new C2295xc("jni_native", "file"));
    }

    public C2295xc(String str, String str2) {
        this.f7431a = str;
        this.f7432b = str2;
    }
}
