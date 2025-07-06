package androidx.media;

import android.media.AudioAttributes;
import p103k0.AbstractC2481b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC2481b abstractC2481b) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2440a = (AudioAttributes) abstractC2481b.m4903g(audioAttributesImplApi26.f2440a, 1);
        audioAttributesImplApi26.f2441b = abstractC2481b.m4902f(audioAttributesImplApi26.f2441b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC2481b abstractC2481b) {
        abstractC2481b.getClass();
        abstractC2481b.m4907k(audioAttributesImplApi26.f2440a, 1);
        abstractC2481b.m4906j(audioAttributesImplApi26.f2441b, 2);
    }
}
