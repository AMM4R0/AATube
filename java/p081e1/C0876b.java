package p081e1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C0876b implements InterfaceC0877c {

    /* renamed from: a */
    public final InterfaceC0877c f3639a;

    /* renamed from: b */
    public final float f3640b;

    public C0876b(float f, InterfaceC0877c interfaceC0877c) {
        while (interfaceC0877c instanceof C0876b) {
            interfaceC0877c = ((C0876b) interfaceC0877c).f3639a;
            f += ((C0876b) interfaceC0877c).f3640b;
        }
        this.f3639a = interfaceC0877c;
        this.f3640b = f;
    }

    @Override // p081e1.InterfaceC0877c
    /* renamed from: a */
    public final float mo2392a(RectF rectF) {
        return Math.max(0.0f, this.f3639a.mo2392a(rectF) + this.f3640b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0876b)) {
            return false;
        }
        C0876b c0876b = (C0876b) obj;
        return this.f3639a.equals(c0876b.f3639a) && this.f3640b == c0876b.f3640b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3639a, Float.valueOf(this.f3640b)});
    }
}
