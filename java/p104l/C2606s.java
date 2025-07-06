package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p001A0.AbstractC0005b;
import p036M1.AbstractC0387m;
import p046Q.InterfaceC0445s;
import p082f0.C0900d;

/* renamed from: l.s */
/* loaded from: classes.dex */
public final class C2606s extends CheckedTextView implements InterfaceC0445s {

    /* renamed from: a */
    public final C0900d f8464a;

    /* renamed from: b */
    public final C2597p f8465b;

    /* renamed from: c */
    public final C2553a0 f8466c;

    /* renamed from: d */
    public C2618w f8467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2606s(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            p104l.AbstractC2581j1.m5035a(r9)
            r6 = 2130903238(0x7f0300c6, float:1.7413288E38)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            p104l.AbstractC2578i1.m5030a(r8, r9)
            l.a0 r9 = new l.a0
            r9.<init>(r8)
            r8.f8466c = r9
            r9.m5006f(r10, r6)
            r9.m5003b()
            l.p r9 = new l.p
            r9.<init>(r8)
            r8.f8465b = r9
            r9.m5058d(r10, r6)
            f0.d r9 = new f0.d
            r9.<init>(r8)
            r8.f8464a = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = p076d.AbstractC0780a.f3125l
            A1.h r9 = p002A1.C0015h.m100A(r9, r10, r2, r6)
            java.lang.Object r0 = r9.f26c
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f26c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r3 = r10
            r5 = r6
            p028K.AbstractC0283P.m778k(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L66
            r2 = 0
            if (r1 == 0) goto L68
            int r0 = r7.getResourceId(r0, r2)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L68
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L68
            android.graphics.drawable.Drawable r0 = android.support.v4.media.session.AbstractC0580g.m1449n(r1, r0)     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L68
            r8.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L68
            goto L7f
        L66:
            r10 = move-exception
            goto Lac
        L68:
            boolean r0 = r7.hasValue(r2)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L7f
            int r0 = r7.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L7f
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L66
            android.graphics.drawable.Drawable r0 = android.support.v4.media.session.AbstractC0580g.m1449n(r1, r0)     // Catch: java.lang.Throwable -> L66
            r8.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L66
        L7f:
            r0 = 2
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L8d
            android.content.res.ColorStateList r0 = r9.m120o(r0)     // Catch: java.lang.Throwable -> L66
            r8.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> L66
        L8d:
            r0 = 3
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto La1
            r1 = -1
            int r0 = r7.getInt(r0, r1)     // Catch: java.lang.Throwable -> L66
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = p104l.AbstractC2604r0.m5067c(r0, r1)     // Catch: java.lang.Throwable -> L66
            r8.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> L66
        La1:
            r9.m102C()
            l.w r9 = r8.getEmojiTextViewHelper()
            r9.m5085b(r10, r6)
            return
        Lac:
            r9.m102C()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.C2606s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C2618w getEmojiTextViewHelper() {
        if (this.f8467d == null) {
            this.f8467d = new C2618w(this);
        }
        return this.f8467d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2553a0 c2553a0 = this.f8466c;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C0900d c0900d = this.f8464a;
        if (c0900d != null) {
            c0900d.m2428b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0005b.m53S(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0900d c0900d = this.f8464a;
        if (c0900d != null) {
            return (ColorStateList) c0900d.f3749e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0900d c0900d = this.f8464a;
        if (c0900d != null) {
            return (PorterDuff.Mode) c0900d.f3750f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8466c.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8466c.m5005e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0387m.m1104G(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m5086c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0900d c0900d = this.f8464a;
        if (c0900d != null) {
            if (c0900d.f3747c) {
                c0900d.f3747c = false;
            } else {
                c0900d.f3747c = true;
                c0900d.m2428b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8466c;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8466c;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0005b.m54T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m5087d(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8465b;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0900d c0900d = this.f8464a;
        if (c0900d != null) {
            c0900d.f3749e = colorStateList;
            c0900d.f3745a = true;
            c0900d.m2428b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0900d c0900d = this.f8464a;
        if (c0900d != null) {
            c0900d.f3750f = mode;
            c0900d.f3746b = true;
            c0900d.m2428b();
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8466c;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8466c;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C2553a0 c2553a0 = this.f8466c;
        if (c2553a0 != null) {
            c2553a0.m5007g(context, r3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
        setCheckMarkDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }
}
