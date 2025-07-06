package p017G;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: G.l */
/* loaded from: classes.dex */
public final class C0148l implements InterfaceC0146j {

    /* renamed from: a */
    public final LocaleList f415a;

    public C0148l(Object obj) {
        this.f415a = AbstractC0147k.m465j(obj);
    }

    @Override // p017G.InterfaceC0146j
    /* renamed from: a */
    public final Object mo450a() {
        return this.f415a;
    }

    @Override // p017G.InterfaceC0146j
    /* renamed from: b */
    public final String mo451b() {
        String languageTags;
        languageTags = this.f415a.toLanguageTags();
        return languageTags;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f415a.equals(((InterfaceC0146j) obj).mo450a());
        return equals;
    }

    @Override // p017G.InterfaceC0146j
    public final Locale get(int r2) {
        Locale locale;
        locale = this.f415a.get(r2);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f415a.hashCode();
        return hashCode;
    }

    @Override // p017G.InterfaceC0146j
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f415a.isEmpty();
        return isEmpty;
    }

    @Override // p017G.InterfaceC0146j
    public final int size() {
        int size;
        size = this.f415a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f415a.toString();
        return localeList;
    }
}
