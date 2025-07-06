package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import java.util.ArrayList;
import p067a.C0563d;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0563d {
    @Override // p067a.C0563d
    /* renamed from: a */
    public final void mo1415a(int r5, Bundle bundle) {
        if (bundle != null) {
            bundle = AbstractC0580g.m1439A(bundle);
        }
        if (r5 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
