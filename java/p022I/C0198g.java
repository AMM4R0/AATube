package p022I;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;

/* renamed from: I.g */
/* loaded from: classes.dex */
public final class C0198g {

    /* renamed from: a */
    public final TextPaint f597a;

    /* renamed from: b */
    public final TextDirectionHeuristic f598b;

    /* renamed from: c */
    public final int f599c;

    /* renamed from: d */
    public final int f600d;

    public C0198g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int r5, int r6) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = AbstractC0197f.m575j(textPaint).setBreakStrategy(r5);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(r6);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f597a = textPaint;
        this.f598b = textDirectionHeuristic;
        this.f599c = r5;
        this.f600d = r6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r3.getTypeface() != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r5.getTypeface() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r7.f598b != r8.f598b) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p022I.C0198g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            I.g r8 = (p022I.C0198g) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            int r3 = r8.f599c
            int r4 = r7.f599c
            if (r4 == r3) goto L16
            goto Laf
        L16:
            int r3 = r7.f600d
            int r4 = r8.f600d
            if (r3 == r4) goto L1e
            goto Laf
        L1e:
            android.text.TextPaint r3 = r7.f597a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f597a
            float r6 = r5.getTextSize()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L30
            goto Laf
        L30:
            float r4 = r3.getTextScaleX()
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3e
            goto Laf
        L3e:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4b
            goto Laf
        L4b:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L58
            goto Laf
        L58:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L67
            goto Laf
        L67:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L72
            goto Laf
        L72:
            r4 = 24
            if (r1 < r4) goto L85
            android.os.LocaleList r1 = p017G.AbstractC0147k.m464i(r3)
            android.os.LocaleList r4 = p017G.AbstractC0147k.m464i(r5)
            boolean r1 = p017G.AbstractC0147k.m452A(r4, r1)
            if (r1 != 0) goto L94
            goto Laf
        L85:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L94
            goto Laf
        L94:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La1
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb0
            goto Laf
        La1:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb0
        Laf:
            return r2
        Lb0:
            android.text.TextDirectionHeuristic r1 = r7.f598b
            android.text.TextDirectionHeuristic r8 = r8.f598b
            if (r1 != r8) goto Lb7
            goto Lb8
        Lb7:
            r0 = r2
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p022I.C0198g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f598b;
        int r14 = Build.VERSION.SDK_INT;
        int r12 = this.f600d;
        int r2 = this.f599c;
        TextPaint textPaint = this.f597a;
        if (r14 < 24) {
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(r2), Integer.valueOf(r12));
        }
        Float valueOf = Float.valueOf(textPaint.getTextSize());
        Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
        Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
        Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
        Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
        textLocales = textPaint.getTextLocales();
        return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(r2), Integer.valueOf(r12));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f597a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int r12 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (r12 >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (r12 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f598b);
        sb.append(", breakStrategy=" + this.f599c);
        sb.append(", hyphenationFrequency=" + this.f600d);
        sb.append("}");
        return sb.toString();
    }

    public C0198g(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f597a = textPaint;
        textDirection = params.getTextDirection();
        this.f598b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f599c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f600d = hyphenationFrequency;
    }
}
