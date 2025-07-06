package p051R1;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: R1.r */
/* loaded from: classes.dex */
public class C0488r extends AbstractC0482l {
    @Override // p051R1.AbstractC0482l
    /* renamed from: a */
    public final C0487q mo1241a(C0492v c0492v) {
        return new C0487q(new RandomAccessFile(new File(c0492v.f1245a.m1279o()), "r"));
    }

    @Override // p051R1.AbstractC0482l
    /* renamed from: b */
    public final InterfaceC0467D mo1242b(C0492v file) {
        AbstractC2492i.m4915e(file, "file");
        File file2 = new File(file.f1245a.m1279o());
        Logger logger = AbstractC0490t.f1242a;
        return new C0474d(new FileInputStream(file2), 1, C0469F.f1191d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
