package p043P;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: P.g */
/* loaded from: classes.dex */
public final class C0415g implements InterfaceC0416h {

    /* renamed from: a */
    public final InputContentInfo f1077a;

    public C0415g(Object obj) {
        this.f1077a = (InputContentInfo) obj;
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: a */
    public final void mo106a() {
        this.f1077a.requestPermission();
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: b */
    public final Uri mo107b() {
        return this.f1077a.getLinkUri();
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: c */
    public final Object mo108c() {
        return this.f1077a;
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: d */
    public final Uri mo109d() {
        return this.f1077a.getContentUri();
    }

    @Override // p043P.InterfaceC0416h
    public final ClipDescription getDescription() {
        return this.f1077a.getDescription();
    }

    public C0415g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1077a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
