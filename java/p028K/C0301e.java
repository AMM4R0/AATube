package p028K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000A.AbstractC0002c;
import p032L0.AbstractC0367a;

/* renamed from: K.e */
/* loaded from: classes.dex */
public final class C0301e implements InterfaceC0299d, InterfaceC0303f {

    /* renamed from: a */
    public final /* synthetic */ int f868a;

    /* renamed from: b */
    public Object f869b;

    /* renamed from: c */
    public int f870c;

    /* renamed from: d */
    public int f871d;

    /* renamed from: e */
    public Object f872e;

    /* renamed from: f */
    public Cloneable f873f;

    public /* synthetic */ C0301e() {
        this.f868a = 0;
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: a */
    public ClipData mo203a() {
        return (ClipData) this.f869b;
    }

    /* renamed from: b */
    public void m829b(C0340x0 c0340x0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0312j0) it.next()).f896a.mo869c() & 8) != 0) {
                ((View) this.f872e).setTranslationY(AbstractC0367a.m1037c(this.f871d, 0, r3.f896a.mo868b()));
                return;
            }
        }
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: d */
    public C0305g mo206d() {
        return new C0305g(new C0301e(this));
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: f */
    public int mo208f() {
        return this.f871d;
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: i */
    public ContentInfo mo211i() {
        return null;
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: j */
    public void mo212j(Bundle bundle) {
        this.f873f = bundle;
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: k */
    public void mo213k(Uri uri) {
        this.f872e = uri;
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: l */
    public int mo214l() {
        return this.f870c;
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: p */
    public void mo217p(int r12) {
        this.f871d = r12;
    }

    public String toString() {
        String str;
        switch (this.f868a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f869b).getDescription());
                sb.append(", source=");
                int r12 = this.f870c;
                sb.append(r12 != 0 ? r12 != 1 ? r12 != 2 ? r12 != 3 ? r12 != 4 ? r12 != 5 ? String.valueOf(r12) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int r13 = this.f871d;
                sb.append((r13 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(r13));
                Uri uri = (Uri) this.f872e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0002c.m17l(sb, ((Bundle) this.f873f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0301e(View view) {
        this.f868a = 2;
        this.f873f = new int[2];
        this.f872e = view;
    }

    public C0301e(C0301e c0301e) {
        this.f868a = 1;
        ClipData clipData = (ClipData) c0301e.f869b;
        clipData.getClass();
        this.f869b = clipData;
        int r02 = c0301e.f870c;
        if (r02 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (r02 <= 5) {
            this.f870c = r02;
            int r03 = c0301e.f871d;
            if ((r03 & 1) == r03) {
                this.f871d = r03;
                this.f872e = (Uri) c0301e.f872e;
                this.f873f = (Bundle) c0301e.f873f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(r03) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
