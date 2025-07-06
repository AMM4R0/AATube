package p022I;

/* renamed from: I.a */
/* loaded from: classes.dex */
public final class C0192a {

    /* renamed from: e */
    public static final byte[] f586e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f587a;

    /* renamed from: b */
    public final int f588b;

    /* renamed from: c */
    public int f589c;

    /* renamed from: d */
    public char f590d;

    static {
        for (int r12 = 0; r12 < 1792; r12++) {
            f586e[r12] = Character.getDirectionality(r12);
        }
    }

    public C0192a(CharSequence charSequence) {
        this.f587a = charSequence;
        this.f588b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m555a() {
        int r02 = this.f589c - 1;
        CharSequence charSequence = this.f587a;
        char charAt = charSequence.charAt(r02);
        this.f590d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f589c);
            this.f589c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f589c--;
        char c = this.f590d;
        return c < 1792 ? f586e[c] : Character.getDirectionality(c);
    }
}
