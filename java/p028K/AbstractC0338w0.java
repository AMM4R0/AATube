package p028K;

import android.view.WindowInsets;

/* renamed from: K.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC0338w0 {
    /* renamed from: a */
    public static int m973a(int r4) {
        int statusBars;
        int r02 = 0;
        for (int r2 = 1; r2 <= 256; r2 <<= 1) {
            if ((r4 & r2) != 0) {
                if (r2 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (r2 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (r2 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (r2 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (r2 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (r2 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (r2 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (r2 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                r02 |= statusBars;
            }
        }
        return r02;
    }
}
