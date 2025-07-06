package p125s1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p002A1.AbstractC0008a;
import p036M1.AbstractC0379e;
import p103k0.AbstractC2480a;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public abstract class AbstractC2748c extends AbstractC0379e {
    /* renamed from: F */
    public static void m5340F(File file, File target) {
        AbstractC2492i.m4915e(file, "<this>");
        AbstractC2492i.m4915e(target, "target");
        if (!file.exists()) {
            throw new C2746a(file, null, "The source file doesn't exist.");
        }
        if (target.exists()) {
            throw new C2746a(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new C2747b(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                AbstractC2480a.m4885g(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0005b.m66l(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: G */
    public static String m5341G(File file) {
        Charset charset = AbstractC0008a.f6a;
        AbstractC2492i.m4915e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            AbstractC2492i.m4914d(stringWriter2, "toString(...)");
            inputStreamReader.close();
            return stringWriter2;
        } finally {
        }
    }

    /* renamed from: H */
    public static void m5342H(File file, String text) {
        Charset charset = AbstractC0008a.f6a;
        AbstractC2492i.m4915e(text, "text");
        AbstractC2492i.m4915e(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        AbstractC2492i.m4914d(bytes, "getBytes(...)");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } finally {
        }
    }
}
