package androidx.media;

import android.util.SparseIntArray;
import p103k0.InterfaceC2483d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC2483d {

    /* renamed from: b */
    public static final /* synthetic */ int f2438b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f2439a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2439a;
        return audioAttributesImpl == null ? audioAttributesCompat.f2439a == null : audioAttributesImpl.equals(audioAttributesCompat.f2439a);
    }

    public final int hashCode() {
        return this.f2439a.hashCode();
    }

    public final String toString() {
        return this.f2439a.toString();
    }
}
