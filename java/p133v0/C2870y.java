package p133v0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: v0.y */
/* loaded from: classes.dex */
public final class C2870y {

    /* renamed from: e */
    public static final Uri f9472e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f9473a;

    /* renamed from: b */
    public final String f9474b;

    /* renamed from: c */
    public final int f9475c;

    /* renamed from: d */
    public final boolean f9476d;

    public C2870y(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f9473a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f9474b = "com.google.android.gms";
        this.f9475c = 4225;
        this.f9476d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2870y)) {
            return false;
        }
        C2870y c2870y = (C2870y) obj;
        return AbstractC2863r.m5476e(this.f9473a, c2870y.f9473a) && AbstractC2863r.m5476e(this.f9474b, c2870y.f9474b) && AbstractC2863r.m5476e(null, null) && this.f9475c == c2870y.f9475c && this.f9476d == c2870y.f9476d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9473a, this.f9474b, null, Integer.valueOf(this.f9475c), Boolean.valueOf(this.f9476d)});
    }

    public final String toString() {
        String str = this.f9473a;
        if (str != null) {
            return str;
        }
        AbstractC2863r.m5474c(null);
        throw null;
    }
}
