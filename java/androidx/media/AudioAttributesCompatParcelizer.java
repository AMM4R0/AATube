package androidx.media;

import p103k0.AbstractC2481b;
import p103k0.InterfaceC2483d;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC2481b abstractC2481b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC2483d interfaceC2483d = audioAttributesCompat.f2439a;
        if (abstractC2481b.mo4901e(1)) {
            interfaceC2483d = abstractC2481b.m4904h();
        }
        audioAttributesCompat.f2439a = (AudioAttributesImpl) interfaceC2483d;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC2481b abstractC2481b) {
        abstractC2481b.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2439a;
        abstractC2481b.mo4905i(1);
        abstractC2481b.m4908l(audioAttributesImpl);
    }
}
