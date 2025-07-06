package p021H1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p011D1.AbstractC0122i;

/* renamed from: H1.b */
/* loaded from: classes.dex */
public final class C0186b extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f575a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f575a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC0122i.f369b);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
