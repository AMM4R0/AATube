package p028K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j */
/* loaded from: classes.dex */
public final class C0311j {

    /* renamed from: a */
    public final DisplayCutout f895a;

    public C0311j(DisplayCutout displayCutout) {
        this.f895a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0311j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f895a, ((C0311j) obj).f895a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f895a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f895a + "}";
    }
}
