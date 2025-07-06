package p081e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.carwizard.p075li.youtube.R;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0008a;
import p002A1.AbstractC0025r;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p051R1.C0480j;
import p051R1.C0492v;
import p054S1.AbstractC0503b;
import p054S1.AbstractC0504c;
import p054S1.C0507f;
import p071b0.InterfaceC0719a;
import p073c0.InterfaceC0729e;
import p102k.InterfaceC2478y;
import p102k.MenuC2466m;

/* renamed from: e1.e */
/* loaded from: classes.dex */
public class C0879e implements InterfaceC0719a, InterfaceC0729e, InterfaceC2478y {

    /* renamed from: a */
    public static C0879e f3641a;

    public C0879e(View view) {
    }

    /* renamed from: d */
    public static final boolean m2393d(C0492v c0492v) {
        C0492v c0492v2 = C0507f.f1303f;
        c0492v.getClass();
        C0480j c0480j = AbstractC0504c.f1293a;
        C0480j c0480j2 = c0492v.f1245a;
        int m1276i = C0480j.m1276i(c0480j2, c0480j);
        if (m1276i == -1) {
            m1276i = C0480j.m1276i(c0480j2, AbstractC0504c.f1294b);
        }
        if (m1276i != -1) {
            c0480j2 = C0480j.m1277m(c0480j2, m1276i + 1, 0, 2);
        } else if (c0492v.m1286c() != null && c0480j2.mo1220b() == 2) {
            c0480j2 = C0480j.f1218d;
        }
        return !AbstractC0025r.m151D(c0480j2.m1279o(), ".class", true);
    }

    /* renamed from: f */
    public static C0879e m2394f(Context context, int r7) {
        AbstractC0379e.m1071b("Cannot create a CalendarItemStyle with a styleResId of 0", r7 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r7, AbstractC0345a.f961m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0387m.m1121s(context, obtainStyledAttributes, 4);
        AbstractC0387m.m1121s(context, obtainStyledAttributes, 9);
        AbstractC0387m.m1121s(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0885k.m2413a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0875a(0)).m2412a();
        obtainStyledAttributes.recycle();
        C0879e c0879e = new C0879e();
        AbstractC0379e.m1072c(rect.left);
        AbstractC0379e.m1072c(rect.top);
        AbstractC0379e.m1072c(rect.right);
        AbstractC0379e.m1072c(rect.bottom);
        return c0879e;
    }

    /* renamed from: h */
    public static C0480j m2395h(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int r2 = 0; r2 < length; r2++) {
            int r3 = r2 * 2;
            bArr[r2] = (byte) (AbstractC0503b.m1312a(str.charAt(r3 + 1)) + (AbstractC0503b.m1312a(str.charAt(r3)) << 4));
        }
        return new C0480j(bArr);
    }

    /* renamed from: i */
    public static C0480j m2396i(String str) {
        AbstractC2492i.m4915e(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC0008a.f6a);
        AbstractC2492i.m4914d(bytes, "getBytes(...)");
        C0480j c0480j = new C0480j(bytes);
        c0480j.f1221c = str;
        return c0480j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2397j(p058V.C0526b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p081e1.C0879e.m2397j(V.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: b */
    public boolean mo2227b(MenuC2466m menuC2466m) {
        return false;
    }

    @Override // p071b0.InterfaceC0719a
    /* renamed from: c */
    public CharSequence mo1978c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f2449a.getString(R.string.not_set);
        }
        return null;
    }

    /* renamed from: k */
    public boolean mo1650k(CharSequence charSequence) {
        return false;
    }

    @Override // p073c0.InterfaceC0729e
    /* renamed from: g */
    public void mo209g() {
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: a */
    public void mo2226a(MenuC2466m menuC2466m, boolean z2) {
    }

    @Override // p073c0.InterfaceC0729e
    /* renamed from: e */
    public void mo207e(int r12, Serializable serializable) {
    }
}
