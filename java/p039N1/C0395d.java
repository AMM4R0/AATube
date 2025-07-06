package p039N1;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: N1.d */
/* loaded from: classes.dex */
public final class C0395d extends Handler {

    /* renamed from: a */
    public static final C0395d f1059a = new C0395d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        AbstractC2492i.m4915e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC0394c.f1057a;
        String loggerName = record.getLoggerName();
        AbstractC2492i.m4914d(loggerName, "getLoggerName(...)");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int r12 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        AbstractC2492i.m4914d(message, "getMessage(...)");
        AbstractC0394c.m1146a(loggerName, r12, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
