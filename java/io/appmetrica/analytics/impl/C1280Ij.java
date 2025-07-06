package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.Ij */
/* loaded from: classes.dex */
public final class C1280Ij {

    /* renamed from: a */
    public final C1255Hj f4873a;

    /* renamed from: b */
    public volatile C2342z9 f4874b;

    /* renamed from: c */
    public volatile C2342z9 f4875c;

    /* renamed from: d */
    public volatile C2342z9 f4876d;

    /* renamed from: e */
    public volatile C2342z9 f4877e;

    /* renamed from: f */
    public volatile C2342z9 f4878f;

    /* renamed from: g */
    public volatile C2342z9 f4879g;

    /* renamed from: h */
    public volatile ExecutorC1230Gj f4880h;

    public C1280Ij() {
        this(new C1255Hj());
    }

    /* renamed from: a */
    public final IHandlerExecutor m2962a() {
        if (this.f4879g == null) {
            synchronized (this) {
                try {
                    if (this.f4879g == null) {
                        this.f4873a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-SDE");
                        this.f4879g = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4879g;
    }

    /* renamed from: b */
    public final IHandlerExecutor m2963b() {
        if (this.f4874b == null) {
            synchronized (this) {
                try {
                    if (this.f4874b == null) {
                        this.f4873a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-SC");
                        this.f4874b = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4874b;
    }

    /* renamed from: c */
    public final IHandlerExecutor m2964c() {
        if (this.f4876d == null) {
            synchronized (this) {
                try {
                    if (this.f4876d == null) {
                        this.f4873a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-SMH-1");
                        this.f4876d = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4876d;
    }

    /* renamed from: d */
    public final IHandlerExecutor m2965d() {
        if (this.f4877e == null) {
            synchronized (this) {
                try {
                    if (this.f4877e == null) {
                        this.f4873a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-SNTPE");
                        this.f4877e = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4877e;
    }

    /* renamed from: e */
    public final IHandlerExecutor m2966e() {
        if (this.f4875c == null) {
            synchronized (this) {
                try {
                    if (this.f4875c == null) {
                        this.f4873a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-STE");
                        this.f4875c = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4875c;
    }

    /* renamed from: f */
    public final Executor m2967f() {
        if (this.f4880h == null) {
            synchronized (this) {
                try {
                    if (this.f4880h == null) {
                        this.f4873a.getClass();
                        this.f4880h = new ExecutorC1230Gj(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f4880h;
    }

    public C1280Ij(C1255Hj c1255Hj) {
        new HashMap();
        this.f4873a = c1255Hj;
    }
}
