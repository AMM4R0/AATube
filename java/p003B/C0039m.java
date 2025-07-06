package p003B;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: B.m */
/* loaded from: classes.dex */
public final class C0039m {

    /* renamed from: a */
    public final Resources f64a;

    /* renamed from: b */
    public final Resources.Theme f65b;

    public C0039m(Resources resources, Resources.Theme theme) {
        this.f64a = resources;
        this.f65b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0039m.class != obj.getClass()) {
            return false;
        }
        C0039m c0039m = (C0039m) obj;
        return this.f64a.equals(c0039m.f64a) && Objects.equals(this.f65b, c0039m.f65b);
    }

    public final int hashCode() {
        return Objects.hash(this.f64a, this.f65b);
    }
}
