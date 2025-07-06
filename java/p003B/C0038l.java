package p003B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: B.l */
/* loaded from: classes.dex */
public final class C0038l {

    /* renamed from: a */
    public final ColorStateList f61a;

    /* renamed from: b */
    public final Configuration f62b;

    /* renamed from: c */
    public final int f63c;

    public C0038l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f61a = colorStateList;
        this.f62b = configuration;
        this.f63c = theme == null ? 0 : theme.hashCode();
    }
}
