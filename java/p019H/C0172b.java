package p019H;

import java.util.Comparator;

/* renamed from: H.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0172b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int r12 = 0; r12 < bArr.length; r12++) {
            byte b2 = bArr[r12];
            byte b3 = bArr2[r12];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }
}
