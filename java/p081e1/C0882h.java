package p081e1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: e1.h */
/* loaded from: classes.dex */
public final class C0882h implements InterfaceC0877c {

    /* renamed from: a */
    public final float f3681a;

    public C0882h(float f) {
        this.f3681a = f;
    }

    @Override // p081e1.InterfaceC0877c
    /* renamed from: a */
    public final float mo2392a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f3681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0882h) && this.f3681a == ((C0882h) obj).f3681a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3681a)});
    }
}
