package p080e0;

import android.view.View;
import androidx.emoji2.text.AbstractC0617g;

/* renamed from: e0.q */
/* loaded from: classes.dex */
public final class C0865q {

    /* renamed from: a */
    public AbstractC0617g f3590a;

    /* renamed from: b */
    public int f3591b;

    /* renamed from: c */
    public int f3592c;

    /* renamed from: d */
    public boolean f3593d;

    /* renamed from: e */
    public boolean f3594e;

    public C0865q() {
        m2371d();
    }

    /* renamed from: a */
    public final void m2368a() {
        this.f3592c = this.f3593d ? this.f3590a.mo1619g() : this.f3590a.mo1623k();
    }

    /* renamed from: b */
    public final void m2369b(View view, int r3) {
        if (this.f3593d) {
            this.f3592c = this.f3590a.m1625m() + this.f3590a.mo1614b(view);
        } else {
            this.f3592c = this.f3590a.mo1617e(view);
        }
        this.f3591b = r3;
    }

    /* renamed from: c */
    public final void m2370c(View view, int r6) {
        int m1625m = this.f3590a.m1625m();
        if (m1625m >= 0) {
            m2369b(view, r6);
            return;
        }
        this.f3591b = r6;
        if (!this.f3593d) {
            int mo1617e = this.f3590a.mo1617e(view);
            int mo1623k = mo1617e - this.f3590a.mo1623k();
            this.f3592c = mo1617e;
            if (mo1623k > 0) {
                int mo1619g = (this.f3590a.mo1619g() - Math.min(0, (this.f3590a.mo1619g() - m1625m) - this.f3590a.mo1614b(view))) - (this.f3590a.mo1615c(view) + mo1617e);
                if (mo1619g < 0) {
                    this.f3592c -= Math.min(mo1623k, -mo1619g);
                    return;
                }
                return;
            }
            return;
        }
        int mo1619g2 = (this.f3590a.mo1619g() - m1625m) - this.f3590a.mo1614b(view);
        this.f3592c = this.f3590a.mo1619g() - mo1619g2;
        if (mo1619g2 > 0) {
            int mo1615c = this.f3592c - this.f3590a.mo1615c(view);
            int mo1623k2 = this.f3590a.mo1623k();
            int min = mo1615c - (Math.min(this.f3590a.mo1617e(view) - mo1623k2, 0) + mo1623k2);
            if (min < 0) {
                this.f3592c = Math.min(mo1619g2, -min) + this.f3592c;
            }
        }
    }

    /* renamed from: d */
    public final void m2371d() {
        this.f3591b = -1;
        this.f3592c = Integer.MIN_VALUE;
        this.f3593d = false;
        this.f3594e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3591b + ", mCoordinate=" + this.f3592c + ", mLayoutFromEnd=" + this.f3593d + ", mValid=" + this.f3594e + '}';
    }
}
