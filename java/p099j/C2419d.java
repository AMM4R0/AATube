package p099j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.carwizard.p075li.youtube.R;

/* renamed from: j.d */
/* loaded from: classes.dex */
public final class C2419d extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f7821f;

    /* renamed from: a */
    public int f7822a;

    /* renamed from: b */
    public Resources.Theme f7823b;

    /* renamed from: c */
    public LayoutInflater f7824c;

    /* renamed from: d */
    public Configuration f7825d;

    /* renamed from: e */
    public Resources f7826e;

    public C2419d(Context context, int r2) {
        super(context);
        this.f7822a = r2;
    }

    /* renamed from: a */
    public final void m4776a(Configuration configuration) {
        if (this.f7826e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f7825d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f7825d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m4777b() {
        if (this.f7823b == null) {
            this.f7823b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7823b.setTo(theme);
            }
        }
        this.f7823b.applyStyle(this.f7822a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(p099j.C2419d.f7821f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f7826e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f7825d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p099j.C2419d.f7821f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p099j.C2419d.f7821f = r1
        L1c:
            android.content.res.Configuration r1 = p099j.C2419d.f7821f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f7825d
            android.content.Context r0 = p099j.AbstractC2418c.m4775a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f7826e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f7826e = r0
        L38:
            android.content.res.Resources r0 = r3.f7826e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099j.C2419d.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7824c == null) {
            this.f7824c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7824c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f7823b;
        if (theme != null) {
            return theme;
        }
        if (this.f7822a == 0) {
            this.f7822a = R.style.Theme_AppCompat_Light;
        }
        m4777b();
        return this.f7823b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        if (this.f7822a != r2) {
            this.f7822a = r2;
            m4777b();
        }
    }
}
