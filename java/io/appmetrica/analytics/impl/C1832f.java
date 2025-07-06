package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.f */
/* loaded from: classes.dex */
public final class C1832f {

    /* renamed from: g */
    public static final long f6173g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h */
    public static final String f6174h = "WatchDog-" + ThreadFactoryC1896hd.f6405a.incrementAndGet();

    /* renamed from: a */
    public final CopyOnWriteArrayList f6175a;

    /* renamed from: b */
    public final int f6176b;

    /* renamed from: c */
    public final Handler f6177c;

    /* renamed from: d */
    public final C1807e f6178d;

    /* renamed from: e */
    public final AtomicBoolean f6179e;

    /* renamed from: f */
    public final RunnableC1757c f6180f;

    public C1832f(C1720ac c1720ac, Integer num) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f6175a = copyOnWriteArrayList;
        this.f6177c = new Handler(Looper.getMainLooper());
        this.f6178d = new C1807e(this);
        this.f6179e = new AtomicBoolean();
        this.f6180f = new RunnableC1757c(this);
        copyOnWriteArrayList.add(c1720ac);
        this.f6176b = m3801a(num);
    }

    /* renamed from: a */
    public static int m3801a(Integer num) {
        if (num != null && num.intValue() >= 5) {
            return num.intValue();
        }
        return 5;
    }
}
