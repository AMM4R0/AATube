package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import p067a.C0563d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0563d {
    @Override // p067a.C0563d
    /* renamed from: a */
    public final void mo1415a(int r3, Bundle bundle) {
        if (bundle != null) {
            bundle = AbstractC0580g.m1439A(bundle);
        }
        if (r3 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
