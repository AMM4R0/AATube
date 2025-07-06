package p022I;

/* renamed from: I.j */
/* loaded from: classes.dex */
public final class C0201j {

    /* renamed from: a */
    public final boolean f602a;

    /* renamed from: b */
    public final Object f603b;

    public /* synthetic */ C0201j(Object obj, boolean z2) {
        this.f603b = obj;
        this.f602a = z2;
    }

    /* renamed from: a */
    public boolean m592a() {
        return this.f602a;
    }

    /* renamed from: b */
    public boolean m593b(CharSequence charSequence, int r8) {
        if (charSequence == null || r8 < 0 || charSequence.length() - r8 < 0) {
            throw new IllegalArgumentException();
        }
        if (((C0200i) this.f603b) == null) {
            return m592a();
        }
        char c = 2;
        for (int r3 = 0; r3 < r8 && c == 2; r3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(r3));
            C0201j c0201j = AbstractC0202k.f604a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return m592a();
        }
        return false;
    }

    public C0201j(C0200i c0200i, boolean z2) {
        this.f603b = c0200i;
        this.f602a = z2;
    }
}
