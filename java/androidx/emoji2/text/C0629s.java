package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.s */
/* loaded from: classes.dex */
public final class C0629s implements TextWatcher, SpanWatcher {

    /* renamed from: a */
    public final Object f2105a;

    /* renamed from: b */
    public final AtomicInteger f2106b = new AtomicInteger(0);

    public C0629s(Object obj) {
        this.f2105a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f2105a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int r3, int r4, int r5) {
        ((TextWatcher) this.f2105a).beforeTextChanged(charSequence, r3, r4, r5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int r4, int r5) {
        if (this.f2106b.get() <= 0 || !(obj instanceof C0631u)) {
            ((SpanWatcher) this.f2105a).onSpanAdded(spannable, obj, r4, r5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int r11, int r12, int r13, int r14) {
        int r4;
        int r6;
        if (this.f2106b.get() <= 0 || !(obj instanceof C0631u)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (r11 > r12) {
                    r11 = 0;
                }
                if (r13 > r14) {
                    r4 = r11;
                    r6 = 0;
                    ((SpanWatcher) this.f2105a).onSpanChanged(spannable, obj, r4, r12, r6, r14);
                }
            }
            r4 = r11;
            r6 = r13;
            ((SpanWatcher) this.f2105a).onSpanChanged(spannable, obj, r4, r12, r6, r14);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int r4, int r5) {
        if (this.f2106b.get() <= 0 || !(obj instanceof C0631u)) {
            ((SpanWatcher) this.f2105a).onSpanRemoved(spannable, obj, r4, r5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int r3, int r4, int r5) {
        ((TextWatcher) this.f2105a).onTextChanged(charSequence, r3, r4, r5);
    }
}
