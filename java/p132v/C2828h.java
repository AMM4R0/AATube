package p132v;

import java.util.Arrays;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C2828h {

    /* renamed from: a */
    public int[] f9249a;

    /* renamed from: b */
    public int[] f9250b;

    /* renamed from: c */
    public int f9251c;

    /* renamed from: d */
    public int[] f9252d;

    /* renamed from: e */
    public float[] f9253e;

    /* renamed from: f */
    public int f9254f;

    /* renamed from: g */
    public int[] f9255g;

    /* renamed from: h */
    public String[] f9256h;

    /* renamed from: i */
    public int f9257i;

    /* renamed from: j */
    public int[] f9258j;

    /* renamed from: k */
    public boolean[] f9259k;

    /* renamed from: l */
    public int f9260l;

    /* renamed from: a */
    public final void m5438a(int r4, float f) {
        int r02 = this.f9254f;
        int[] r12 = this.f9252d;
        if (r02 >= r12.length) {
            this.f9252d = Arrays.copyOf(r12, r12.length * 2);
            float[] fArr = this.f9253e;
            this.f9253e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] r03 = this.f9252d;
        int r13 = this.f9254f;
        r03[r13] = r4;
        float[] fArr2 = this.f9253e;
        this.f9254f = r13 + 1;
        fArr2[r13] = f;
    }

    /* renamed from: b */
    public final void m5439b(int r4, int r5) {
        int r02 = this.f9251c;
        int[] r12 = this.f9249a;
        if (r02 >= r12.length) {
            this.f9249a = Arrays.copyOf(r12, r12.length * 2);
            int[] r03 = this.f9250b;
            this.f9250b = Arrays.copyOf(r03, r03.length * 2);
        }
        int[] r04 = this.f9249a;
        int r13 = this.f9251c;
        r04[r13] = r4;
        int[] r42 = this.f9250b;
        this.f9251c = r13 + 1;
        r42[r13] = r5;
    }

    /* renamed from: c */
    public final void m5440c(int r4, String str) {
        int r02 = this.f9257i;
        int[] r12 = this.f9255g;
        if (r02 >= r12.length) {
            this.f9255g = Arrays.copyOf(r12, r12.length * 2);
            String[] strArr = this.f9256h;
            this.f9256h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] r03 = this.f9255g;
        int r13 = this.f9257i;
        r03[r13] = r4;
        String[] strArr2 = this.f9256h;
        this.f9257i = r13 + 1;
        strArr2[r13] = str;
    }

    /* renamed from: d */
    public final void m5441d(int r4, boolean z2) {
        int r02 = this.f9260l;
        int[] r12 = this.f9258j;
        if (r02 >= r12.length) {
            this.f9258j = Arrays.copyOf(r12, r12.length * 2);
            boolean[] zArr = this.f9259k;
            this.f9259k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] r03 = this.f9258j;
        int r13 = this.f9260l;
        r03[r13] = r4;
        boolean[] zArr2 = this.f9259k;
        this.f9260l = r13 + 1;
        zArr2[r13] = z2;
    }
}
