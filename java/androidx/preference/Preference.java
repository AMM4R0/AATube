package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.carwizard.p075li.youtube.R;
import p003B.AbstractC0028b;
import p071b0.AbstractC0720b;
import p071b0.InterfaceC0719a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a */
    public final Context f2449a;

    /* renamed from: b */
    public final int f2450b;

    /* renamed from: c */
    public final CharSequence f2451c;

    /* renamed from: d */
    public final CharSequence f2452d;

    /* renamed from: e */
    public final String f2453e;

    /* renamed from: f */
    public final Object f2454f;

    /* renamed from: g */
    public InterfaceC0719a f2455g;

    public Preference(Context context, AttributeSet attributeSet, int r7) {
        this.f2450b = Integer.MAX_VALUE;
        this.f2449a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0720b.f2584f, r7, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f2453e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f2451c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2452d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2450b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        AbstractC0028b.m163e(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f2454f = mo1810c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f2454f = mo1810c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public CharSequence mo1811a() {
        InterfaceC0719a interfaceC0719a = this.f2455g;
        return interfaceC0719a != null ? interfaceC0719a.mo1978c(this) : this.f2452d;
    }

    /* renamed from: b */
    public void mo1809b() {
    }

    /* renamed from: c */
    public Object mo1810c(TypedArray typedArray, int r2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int r02 = preference2.f2450b;
        int r12 = this.f2450b;
        if (r12 != r02) {
            return r12 - r02;
        }
        CharSequence charSequence = preference2.f2451c;
        CharSequence charSequence2 = this.f2451c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f2451c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence mo1811a = mo1811a();
        if (!TextUtils.isEmpty(mo1811a)) {
            sb.append(mo1811a);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0028b.m160b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
