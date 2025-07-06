package p072b1;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextPaint;

/* renamed from: b1.c */
/* loaded from: classes.dex */
public final class C0723c extends AbstractC0580g {

    /* renamed from: e */
    public final /* synthetic */ Context f2595e;

    /* renamed from: f */
    public final /* synthetic */ TextPaint f2596f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC0580g f2597g;

    /* renamed from: h */
    public final /* synthetic */ C0724d f2598h;

    public C0723c(C0724d c0724d, Context context, TextPaint textPaint, AbstractC0580g abstractC0580g) {
        this.f2598h = c0724d;
        this.f2595e = context;
        this.f2596f = textPaint;
        this.f2597g = abstractC0580g;
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: r */
    public final void mo1350r(int r2) {
        this.f2597g.mo1350r(r2);
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: s */
    public final void mo1351s(Typeface typeface, boolean z2) {
        this.f2598h.m1985g(this.f2595e, this.f2596f, typeface);
        this.f2597g.mo1351s(typeface, z2);
    }
}
