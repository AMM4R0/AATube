package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p036M1.AbstractC0379e;

/* renamed from: androidx.emoji2.text.t */
/* loaded from: classes.dex */
public final class C0630t extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f2107a;

    /* renamed from: b */
    public final ArrayList f2108b;

    public C0630t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2108b = new ArrayList();
        AbstractC0379e.m1073d(cls, "watcherClass cannot be null");
        this.f2107a = cls;
    }

    /* renamed from: a */
    public final void m1645a() {
        int r02 = 0;
        while (true) {
            ArrayList arrayList = this.f2108b;
            if (r02 >= arrayList.size()) {
                return;
            }
            ((C0629s) arrayList.get(r02)).f2106b.incrementAndGet();
            r02++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m1646b() {
        m1649e();
        int r12 = 0;
        while (true) {
            ArrayList arrayList = this.f2108b;
            if (r12 >= arrayList.size()) {
                return;
            }
            ((C0629s) arrayList.get(r12)).onTextChanged(this, 0, length(), length());
            r12++;
        }
    }

    /* renamed from: c */
    public final C0629s m1647c(Object obj) {
        int r02 = 0;
        while (true) {
            ArrayList arrayList = this.f2108b;
            if (r02 >= arrayList.size()) {
                return null;
            }
            C0629s c0629s = (C0629s) arrayList.get(r02);
            if (c0629s.f2105a == obj) {
                return c0629s;
            }
            r02++;
        }
    }

    /* renamed from: d */
    public final boolean m1648d(Object obj) {
        if (obj != null) {
            if (this.f2107a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int r12, int r2) {
        super.delete(r12, r2);
        return this;
    }

    /* renamed from: e */
    public final void m1649e() {
        int r02 = 0;
        while (true) {
            ArrayList arrayList = this.f2108b;
            if (r02 >= arrayList.size()) {
                return;
            }
            ((C0629s) arrayList.get(r02)).f2106b.decrementAndGet();
            r02++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0629s m1647c;
        if (m1648d(obj) && (m1647c = m1647c(obj)) != null) {
            obj = m1647c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0629s m1647c;
        if (m1648d(obj) && (m1647c = m1647c(obj)) != null) {
            obj = m1647c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0629s m1647c;
        if (m1648d(obj) && (m1647c = m1647c(obj)) != null) {
            obj = m1647c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class cls) {
        if (this.f2107a != cls) {
            return super.getSpans(r2, r3, cls);
        }
        C0629s[] c0629sArr = (C0629s[]) super.getSpans(r2, r3, C0629s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0629sArr.length);
        for (int r4 = 0; r4 < c0629sArr.length; r4++) {
            objArr[r4] = c0629sArr[r4].f2105a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int r12, CharSequence charSequence) {
        super.insert(r12, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class cls) {
        if (cls == null || this.f2107a == cls) {
            cls = C0629s.class;
        }
        return super.nextSpanTransition(r2, r3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0629s c0629s;
        if (m1648d(obj)) {
            c0629s = m1647c(obj);
            if (c0629s != null) {
                obj = c0629s;
            }
        } else {
            c0629s = null;
        }
        super.removeSpan(obj);
        if (c0629s != null) {
            this.f2108b.remove(c0629s);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r12, int r2, CharSequence charSequence) {
        replace(r12, r2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int r3, int r4, int r5) {
        if (m1648d(obj)) {
            C0629s c0629s = new C0629s(obj);
            this.f2108b.add(c0629s);
            obj = c0629s;
        }
        super.setSpan(obj, r3, r4, r5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int r3, int r4) {
        return new C0630t(this.f2107a, this, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int r12, int r2) {
        super.delete(r12, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int r12, CharSequence charSequence) {
        super.insert(r12, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r12, int r2, CharSequence charSequence, int r4, int r5) {
        replace(r12, r2, charSequence, r4, r5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int r12, CharSequence charSequence, int r3, int r4) {
        super.insert(r12, charSequence, r3, r4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r12, int r2, CharSequence charSequence) {
        m1645a();
        super.replace(r12, r2, charSequence);
        m1649e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int r12, CharSequence charSequence, int r3, int r4) {
        super.insert(r12, charSequence, r3, r4);
        return this;
    }

    public C0630t(Class cls, C0630t c0630t, int r3, int r4) {
        super(c0630t, r3, r4);
        this.f2108b = new ArrayList();
        AbstractC0379e.m1073d(cls, "watcherClass cannot be null");
        this.f2107a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r12, int r2, CharSequence charSequence, int r4, int r5) {
        m1645a();
        super.replace(r12, r2, charSequence, r4, r5);
        m1649e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int r2, int r3) {
        super.append(charSequence, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int r2, int r3) {
        super.append(charSequence, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int r2, int r3) {
        super.append(charSequence, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int r3) {
        super.append(charSequence, obj, r3);
        return this;
    }
}
