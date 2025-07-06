package p019H;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* renamed from: H.c */
/* loaded from: classes.dex */
public final class C0173c {

    /* renamed from: a */
    public final /* synthetic */ int f545a;

    /* renamed from: b */
    public final ContentProviderClient f546b;

    public C0173c(Context context, Uri uri, int r3) {
        this.f545a = r3;
        switch (r3) {
            case 1:
                this.f546b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f546b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* renamed from: a */
    public final void m535a() {
        switch (this.f545a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f546b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f546b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    break;
                }
                break;
        }
    }
}
