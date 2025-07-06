package p144z;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import p010D0.C0109g;

/* renamed from: z.g */
/* loaded from: classes.dex */
public final class C2909g {

    /* renamed from: a */
    public Context f9553a;

    /* renamed from: b */
    public ArrayList f9554b;

    /* renamed from: c */
    public ArrayList f9555c;

    /* renamed from: d */
    public ArrayList f9556d;

    /* renamed from: e */
    public CharSequence f9557e;

    /* renamed from: f */
    public CharSequence f9558f;

    /* renamed from: g */
    public PendingIntent f9559g;

    /* renamed from: h */
    public int f9560h;

    /* renamed from: i */
    public boolean f9561i;

    /* renamed from: j */
    public C0109g f9562j;

    /* renamed from: k */
    public boolean f9563k;

    /* renamed from: l */
    public Bundle f9564l;

    /* renamed from: m */
    public String f9565m;

    /* renamed from: n */
    public boolean f9566n;

    /* renamed from: o */
    public Notification f9567o;

    /* renamed from: p */
    public ArrayList f9568p;

    /* renamed from: a */
    public static CharSequence m5494a(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    /* renamed from: b */
    public final void m5495b(C0109g c0109g) {
        if (this.f9562j != c0109g) {
            this.f9562j = c0109g;
            if (((C2909g) c0109g.f338b) != this) {
                c0109g.f338b = this;
                m5495b(c0109g);
            }
        }
    }
}
