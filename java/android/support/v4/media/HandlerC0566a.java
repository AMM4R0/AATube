package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.AbstractC0580g;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public final class HandlerC0566a extends Handler {

    /* renamed from: a */
    public final WeakReference f1589a;

    /* renamed from: b */
    public WeakReference f1590b;

    public HandlerC0566a(C0568c c0568c) {
        this.f1589a = new WeakReference(c0568c);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f1590b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f1589a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        AbstractC0580g.m1446k(data);
        C0568c c0568c = (C0568c) weakReference2.get();
        Messenger messenger = (Messenger) this.f1590b.get();
        try {
            int r7 = message.what;
            if (r7 == 1) {
                AbstractC0580g.m1446k(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                c0568c.getClass();
                return;
            }
            if (r7 == 2) {
                c0568c.getClass();
                return;
            }
            if (r7 != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            AbstractC0580g.m1446k(data.getBundle("data_options"));
            AbstractC0580g.m1446k(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (c0568c.f1598g != messenger) {
                return;
            }
            if (c0568c.f1596e.getOrDefault(string, null) != null) {
                throw new ClassCastException();
            }
            if (C0570e.f1600b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                c0568c.getClass();
            }
        }
    }
}
