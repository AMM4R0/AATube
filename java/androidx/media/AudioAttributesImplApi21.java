package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f2440a;

    /* renamed from: b */
    public int f2441b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2440a.equals(((AudioAttributesImplApi21) obj).f2440a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2440a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2440a;
    }
}
