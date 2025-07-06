package p081e1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C0875a implements InterfaceC0877c {

    /* renamed from: a */
    public final float f3638a;

    public C0875a(float f) {
        this.f3638a = f;
    }

    @Override // p081e1.InterfaceC0877c
    /* renamed from: a */
    public final float mo2392a(RectF rectF) {
        return this.f3638a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0875a) && this.f3638a == ((C0875a) obj).f3638a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3638a)});
    }
}
