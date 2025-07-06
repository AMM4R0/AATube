package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.f */
/* loaded from: classes.dex */
public abstract class AbstractC0571f {
    /* renamed from: a */
    public static MediaDescription m1418a(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static MediaDescription.Builder m1419b() {
        return new MediaDescription.Builder();
    }

    /* renamed from: c */
    public static CharSequence m1420c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* renamed from: d */
    public static Bundle m1421d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* renamed from: e */
    public static Bitmap m1422e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m1423f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* renamed from: g */
    public static String m1424g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* renamed from: h */
    public static CharSequence m1425h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* renamed from: i */
    public static CharSequence m1426i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* renamed from: j */
    public static void m1427j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: k */
    public static void m1428k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: l */
    public static void m1429l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* renamed from: m */
    public static void m1430m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* renamed from: n */
    public static void m1431n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* renamed from: o */
    public static void m1432o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: p */
    public static void m1433p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
