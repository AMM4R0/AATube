package p049R;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import p104l.ViewOnClickListenerC2572g1;

/* renamed from: R.a */
/* loaded from: classes.dex */
public final class C0453a extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ ViewOnClickListenerC2572g1 f1165a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453a(ViewOnClickListenerC2572g1 viewOnClickListenerC2572g1) {
        super(new Handler());
        this.f1165a = viewOnClickListenerC2572g1;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        ViewOnClickListenerC2572g1 viewOnClickListenerC2572g1 = this.f1165a;
        if (!viewOnClickListenerC2572g1.f1169b || (cursor = viewOnClickListenerC2572g1.f1170c) == null || cursor.isClosed()) {
            return;
        }
        viewOnClickListenerC2572g1.f1168a = viewOnClickListenerC2572g1.f1170c.requery();
    }
}
