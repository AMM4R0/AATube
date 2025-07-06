package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Km */
/* loaded from: classes.dex */
public final class C1333Km implements TempCacheStorage.Entry {

    /* renamed from: a */
    public final long f4976a;

    /* renamed from: b */
    public final String f4977b;

    /* renamed from: c */
    public final long f4978c;

    /* renamed from: d */
    public final byte[] f4979d;

    public C1333Km(long j2, String str, long j3, byte[] bArr) {
        this.f4976a = j2;
        this.f4977b = str;
        this.f4978c = j3;
        this.f4979d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1333Km.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C1333Km c1333Km = (C1333Km) obj;
        if (this.f4976a == c1333Km.f4976a && AbstractC2492i.m4911a(this.f4977b, c1333Km.f4977b) && this.f4978c == c1333Km.f4978c) {
            return Arrays.equals(this.f4979d, c1333Km.f4979d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f4979d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f4976a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f4977b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f4978c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4979d) + ((Long.valueOf(this.f4978c).hashCode() + AbstractC0002c.m9d(this.f4977b, Long.valueOf(this.f4976a).hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f4976a + ", scope='" + this.f4977b + "', timestamp=" + this.f4978c + ", data=array[" + this.f4979d.length + "])";
    }
}
