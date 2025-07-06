package androidx.media;

import p103k0.AbstractC2481b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC2481b abstractC2481b) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2442a = abstractC2481b.m4902f(audioAttributesImplBase.f2442a, 1);
        audioAttributesImplBase.f2443b = abstractC2481b.m4902f(audioAttributesImplBase.f2443b, 2);
        audioAttributesImplBase.f2444c = abstractC2481b.m4902f(audioAttributesImplBase.f2444c, 3);
        audioAttributesImplBase.f2445d = abstractC2481b.m4902f(audioAttributesImplBase.f2445d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC2481b abstractC2481b) {
        abstractC2481b.getClass();
        abstractC2481b.m4906j(audioAttributesImplBase.f2442a, 1);
        abstractC2481b.m4906j(audioAttributesImplBase.f2443b, 2);
        abstractC2481b.m4906j(audioAttributesImplBase.f2444c, 3);
        abstractC2481b.m4906j(audioAttributesImplBase.f2445d, 4);
    }
}
