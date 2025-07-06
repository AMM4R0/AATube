package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.c0 */
/* loaded from: classes.dex */
public final class C1758c0 {

    /* renamed from: a */
    public C2270wc f5957a;

    /* renamed from: b */
    public long f5958b;

    /* renamed from: c */
    public boolean f5959c;

    /* renamed from: d */
    public final C1331Kk f5960d;

    public C1758c0(String str, long j2, C1331Kk c1331Kk) {
        this.f5958b = j2;
        try {
            this.f5957a = new C2270wc(str);
        } catch (Throwable unused) {
            this.f5957a = new C2270wc();
        }
        this.f5960d = c1331Kk;
    }

    /* renamed from: a */
    public final synchronized void m3682a(Pair pair) {
        if (this.f5960d.m3030b(this.f5957a, (String) pair.first, (String) pair.second)) {
            this.f5959c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f5957a.size() + ". Is changed " + this.f5959c + ". Current revision " + this.f5958b;
    }

    /* renamed from: a */
    public final synchronized C1733b0 m3681a() {
        try {
            if (this.f5959c) {
                this.f5958b++;
                this.f5959c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C1733b0(AbstractC1794db.m3754b(this.f5957a), this.f5958b);
    }
}
