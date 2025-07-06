package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.q4 */
/* loaded from: classes.dex */
public final class C2112q4 {

    /* renamed from: a */
    public final C2087p4 f6961a;

    /* renamed from: b */
    public volatile C2342z9 f6962b;

    /* renamed from: c */
    public volatile C2342z9 f6963c;

    /* renamed from: d */
    public volatile C2342z9 f6964d;

    /* renamed from: e */
    public volatile Handler f6965e;

    public C2112q4() {
        this(new C2087p4());
    }

    /* renamed from: a */
    public final ICommonExecutor m4338a() {
        if (this.f6963c == null) {
            synchronized (this) {
                try {
                    if (this.f6963c == null) {
                        this.f6961a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-CAPT");
                        this.f6963c = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6963c;
    }

    /* renamed from: b */
    public final IHandlerExecutor m4339b() {
        if (this.f6962b == null) {
            synchronized (this) {
                try {
                    if (this.f6962b == null) {
                        this.f6961a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-CDE");
                        this.f6962b = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6962b;
    }

    /* renamed from: c */
    public final ICommonExecutor m4340c() {
        if (this.f6964d == null) {
            synchronized (this) {
                try {
                    if (this.f6964d == null) {
                        this.f6961a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-CRS");
                        this.f6964d = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6964d;
    }

    public C2112q4(C2087p4 c2087p4) {
        this.f6961a = c2087p4;
    }
}
