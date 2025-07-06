package p121r0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C2718a {

    /* renamed from: c */
    public static final ReentrantLock f8780c = new ReentrantLock();

    /* renamed from: d */
    public static C2718a f8781d;

    /* renamed from: a */
    public final ReentrantLock f8782a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f8783b;

    public C2718a(Context context) {
        this.f8783b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final String m5240a(String str) {
        ReentrantLock reentrantLock = this.f8782a;
        reentrantLock.lock();
        try {
            return this.f8783b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
