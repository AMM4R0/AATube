package p082f0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import p009D.AbstractC0095a;
import p046Q.AbstractC0429c;
import p104l.C2606s;
import p109n.C2674c;
import p109n.C2677f;

/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C0900d {

    /* renamed from: a */
    public boolean f3745a;

    /* renamed from: b */
    public boolean f3746b;

    /* renamed from: c */
    public boolean f3747c;

    /* renamed from: d */
    public final Object f3748d;

    /* renamed from: e */
    public Parcelable f3749e;

    /* renamed from: f */
    public Object f3750f;

    public /* synthetic */ C0900d(TextView textView) {
        this.f3749e = null;
        this.f3750f = null;
        this.f3745a = false;
        this.f3746b = false;
        this.f3748d = textView;
    }

    /* renamed from: a */
    public void m2427a() {
        CompoundButton compoundButton = (CompoundButton) this.f3748d;
        Drawable m1166a = AbstractC0429c.m1166a(compoundButton);
        if (m1166a != null) {
            if (this.f3745a || this.f3746b) {
                Drawable mutate = m1166a.mutate();
                if (this.f3745a) {
                    AbstractC0095a.m319h(mutate, (ColorStateList) this.f3749e);
                }
                if (this.f3746b) {
                    AbstractC0095a.m320i(mutate, (PorterDuff.Mode) this.f3750f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public void m2428b() {
        C2606s c2606s = (C2606s) this.f3748d;
        Drawable checkMarkDrawable = c2606s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3745a || this.f3746b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3745a) {
                    AbstractC0095a.m319h(mutate, (ColorStateList) this.f3749e);
                }
                if (this.f3746b) {
                    AbstractC0095a.m320i(mutate, (PorterDuff.Mode) this.f3750f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c2606s.getDrawableState());
                }
                c2606s.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: c */
    public Bundle m2429c(String str) {
        if (!this.f3746b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3749e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3749e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3749e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f3749e = null;
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2430d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f3748d
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r3 = p076d.AbstractC0780a.f3126m
            A1.h r7 = p002A1.C0015h.m100A(r1, r10, r3, r11)
            java.lang.Object r1 = r7.f26c
            r8 = r1
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r2 = r0.getContext()
            java.lang.Object r1 = r7.f26c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r0
            r4 = r10
            r6 = r11
            p028K.AbstractC0283P.m778k(r1, r2, r3, r4, r5, r6)
            r10 = 1
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r11 == 0) goto L3e
            int r10 = r8.getResourceId(r10, r1)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L3e
            android.content.Context r11 = r0.getContext()     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r10 = android.support.v4.media.session.AbstractC0580g.m1449n(r11, r10)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3e
            r0.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3c:
            r10 = move-exception
            goto L7b
        L3e:
            boolean r10 = r8.hasValue(r1)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L55
            int r10 = r8.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L55
            android.content.Context r11 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r10 = android.support.v4.media.session.AbstractC0580g.m1449n(r11, r10)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L3c
        L55:
            r10 = 2
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L63
            android.content.res.ColorStateList r10 = r7.m120o(r10)     // Catch: java.lang.Throwable -> L3c
            p046Q.AbstractC0428b.m1164c(r0, r10)     // Catch: java.lang.Throwable -> L3c
        L63:
            r10 = 3
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L77
            r11 = -1
            int r10 = r8.getInt(r10, r11)     // Catch: java.lang.Throwable -> L3c
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = p104l.AbstractC2604r0.m5067c(r10, r11)     // Catch: java.lang.Throwable -> L3c
            p046Q.AbstractC0428b.m1165d(r0, r10)     // Catch: java.lang.Throwable -> L3c
        L77:
            r7.m102C()
            return
        L7b:
            r7.m102C()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p082f0.C0900d.m2430d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void m2431e(String str, InterfaceC0899c interfaceC0899c) {
        Object obj;
        C2677f c2677f = (C2677f) this.f3748d;
        C2674c mo5131a = c2677f.mo5131a(str);
        if (mo5131a != null) {
            obj = mo5131a.f8615b;
        } else {
            C2674c c2674c = new C2674c(str, interfaceC0899c);
            c2677f.f8624d++;
            C2674c c2674c2 = c2677f.f8622b;
            if (c2674c2 == null) {
                c2677f.f8621a = c2674c;
                c2677f.f8622b = c2674c;
            } else {
                c2674c2.f8616c = c2674c;
                c2674c.f8617d = c2674c2;
                c2677f.f8622b = c2674c;
            }
            obj = null;
        }
        if (((InterfaceC0899c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0900d() {
        this.f3748d = new C2677f();
        this.f3747c = true;
    }
}
