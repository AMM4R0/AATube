package p104l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: l.t1 */
/* loaded from: classes.dex */
public final class C2611t1 implements InterfaceC2595o0 {

    /* renamed from: a */
    public Toolbar f8477a;

    /* renamed from: b */
    public int f8478b;

    /* renamed from: c */
    public View f8479c;

    /* renamed from: d */
    public Drawable f8480d;

    /* renamed from: e */
    public Drawable f8481e;

    /* renamed from: f */
    public Drawable f8482f;

    /* renamed from: g */
    public boolean f8483g;

    /* renamed from: h */
    public CharSequence f8484h;

    /* renamed from: i */
    public CharSequence f8485i;

    /* renamed from: j */
    public CharSequence f8486j;

    /* renamed from: k */
    public Window.Callback f8487k;

    /* renamed from: l */
    public boolean f8488l;

    /* renamed from: m */
    public C2582k f8489m;

    /* renamed from: n */
    public int f8490n;

    /* renamed from: o */
    public Drawable f8491o;

    /* renamed from: a */
    public final void m5074a(int r5) {
        View view;
        int r02 = this.f8478b ^ r5;
        this.f8478b = r5;
        if (r02 != 0) {
            if ((r02 & 4) != 0) {
                if ((r5 & 4) != 0) {
                    m5075b();
                }
                int r12 = this.f8478b & 4;
                Toolbar toolbar = this.f8477a;
                if (r12 != 0) {
                    Drawable drawable = this.f8482f;
                    if (drawable == null) {
                        drawable = this.f8491o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((r02 & 3) != 0) {
                m5076c();
            }
            int r13 = r02 & 8;
            Toolbar toolbar2 = this.f8477a;
            if (r13 != 0) {
                if ((r5 & 8) != 0) {
                    toolbar2.setTitle(this.f8484h);
                    toolbar2.setSubtitle(this.f8485i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((r02 & 16) == 0 || (view = this.f8479c) == null) {
                return;
            }
            if ((r5 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m5075b() {
        if ((this.f8478b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f8486j);
            Toolbar toolbar = this.f8477a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f8490n);
            } else {
                toolbar.setNavigationContentDescription(this.f8486j);
            }
        }
    }

    /* renamed from: c */
    public final void m5076c() {
        Drawable drawable;
        int r02 = this.f8478b;
        if ((r02 & 2) == 0) {
            drawable = null;
        } else if ((r02 & 1) != 0) {
            drawable = this.f8481e;
            if (drawable == null) {
                drawable = this.f8480d;
            }
        } else {
            drawable = this.f8480d;
        }
        this.f8477a.setLogo(drawable);
    }
}
