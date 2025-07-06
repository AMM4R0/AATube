package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.g */
/* loaded from: classes.dex */
public abstract class AbstractC0572g {
    /* renamed from: a */
    public static Uri m1434a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* renamed from: b */
    public static void m1435b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
