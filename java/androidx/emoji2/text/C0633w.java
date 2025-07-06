package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p081e1.C0879e;

/* renamed from: androidx.emoji2.text.w */
/* loaded from: classes.dex */
public final class C0633w implements Spannable {

    /* renamed from: a */
    public boolean f2112a = false;

    /* renamed from: b */
    public Spannable f2113b;

    public C0633w(Spannable spannable) {
        this.f2113b = spannable;
    }

    /* renamed from: a */
    public final void m1651a() {
        Spannable spannable = this.f2113b;
        if (!this.f2112a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0879e() : new C0632v()).mo1650k(spannable)) {
                this.f2113b = new SpannableString(spannable);
            }
        }
        this.f2112a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
        return this.f2113b.charAt(r2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f2113b.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f2113b.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2113b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2113b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2113b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class cls) {
        return this.f2113b.getSpans(r2, r3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2113b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class cls) {
        return this.f2113b.nextSpanTransition(r2, r3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1651a();
        this.f2113b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int r3, int r4, int r5) {
        m1651a();
        this.f2113b.setSpan(obj, r3, r4, r5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r2, int r3) {
        return this.f2113b.subSequence(r2, r3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2113b.toString();
    }

    public C0633w(CharSequence charSequence) {
        this.f2113b = new SpannableString(charSequence);
    }
}
