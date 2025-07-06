package p051R1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p036M1.AbstractC0387m;

/* renamed from: R1.C */
/* loaded from: classes.dex */
public final class C0466C extends C0475e {

    /* renamed from: m */
    public final Socket f1190m;

    public C0466C(Socket socket) {
        this.f1190m = socket;
    }

    @Override // p051R1.C0475e
    /* renamed from: j */
    public final void mo508j() {
        Socket socket = this.f1190m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!AbstractC0387m.m1099A(e2)) {
                throw e2;
            }
            AbstractC0490t.f1242a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e3) {
            AbstractC0490t.f1242a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        }
    }

    /* renamed from: k */
    public final IOException m1233k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
