package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p008C1.C0080l;
import p036M1.AbstractC0387m;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public final class C0622l extends AbstractC0387m {

    /* renamed from: e */
    public final /* synthetic */ AbstractC0387m f2082e;

    /* renamed from: f */
    public final /* synthetic */ ThreadPoolExecutor f2083f;

    public C0622l(AbstractC0387m abstractC0387m, ThreadPoolExecutor threadPoolExecutor) {
        this.f2082e = abstractC0387m;
        this.f2083f = threadPoolExecutor;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: H */
    public final void mo1129H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2083f;
        try {
            this.f2082e.mo1129H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: I */
    public final void mo1130I(C0080l c0080l) {
        ThreadPoolExecutor threadPoolExecutor = this.f2083f;
        try {
            this.f2082e.mo1130I(c0080l);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
