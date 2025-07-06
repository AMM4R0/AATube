package androidx.preference;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903472(0x7f0301b0, float:1.7413763E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = p003B.AbstractC0028b.m160b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = p071b0.AbstractC0720b.f2581c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2d
            e1.e r5 = p081e1.C0879e.f3641a
            if (r5 != 0) goto L29
            e1.e r5 = new e1.e
            r5.<init>()
            p081e1.C0879e.f3641a = r5
        L29:
            e1.e r5 = p081e1.C0879e.f3641a
            r3.f2455g = r5
        L2d:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final Object mo1810c(TypedArray typedArray, int r2) {
        return typedArray.getString(r2);
    }
}
