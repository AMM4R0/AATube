package androidx.media;

import android.media.AudioAttributes;
import p103k0.AbstractC2481b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC2481b abstractC2481b) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2440a = (AudioAttributes) abstractC2481b.m4903g(audioAttributesImplApi21.f2440a, 1);
        audioAttributesImplApi21.f2441b = abstractC2481b.m4902f(audioAttributesImplApi21.f2441b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC2481b abstractC2481b) {
        abstractC2481b.getClass();
        abstractC2481b.m4907k(audioAttributesImplApi21.f2440a, 1);
        abstractC2481b.m4906j(audioAttributesImplApi21.f2441b, 2);
    }
}
