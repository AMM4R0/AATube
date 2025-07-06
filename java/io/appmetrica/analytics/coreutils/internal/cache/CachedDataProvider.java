package io.appmetrica.analytics.coreutils.internal.cache;

import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a */
        private final String f4309a;

        /* renamed from: b */
        private volatile long f4310b;

        /* renamed from: c */
        private volatile long f4311c;

        /* renamed from: d */
        private long f4312d = 0;

        /* renamed from: e */
        private Object f4313e = null;

        public CachedData(long j2, long j3, String str) {
            this.f4309a = AbstractC0002c.m16k("[CachedData-", str, "]");
            this.f4310b = j2;
            this.f4311c = j3;
        }

        public T getData() {
            return (T) this.f4313e;
        }

        public long getExpiryTime() {
            return this.f4311c;
        }

        public long getRefreshTime() {
            return this.f4310b;
        }

        public final boolean isEmpty() {
            return this.f4313e == null;
        }

        public void setData(T t2) {
            this.f4313e = t2;
            this.f4312d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j2, long j3) {
            this.f4310b = j2;
            this.f4311c = j3;
        }

        public final boolean shouldClearData() {
            if (this.f4312d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f4312d;
            return currentTimeMillis > this.f4311c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f4312d;
            return currentTimeMillis > this.f4310b || currentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f4309a + "', refreshTime=" + this.f4310b + ", expiryTime=" + this.f4311c + ", mCachedTime=" + this.f4312d + ", mCachedData=" + this.f4313e + '}';
        }
    }
}
