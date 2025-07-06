package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p006C.C0055g;
import p073c0.AbstractC0730f;
import p073c0.ExecutorC0728d;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0730f.m2006s(context, new ExecutorC0728d(), new C0055g(22, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C0055g c0055g = new C0055g(22, this);
                try {
                    AbstractC0730f.m1992e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c0055g.mo207e(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    c0055g.mo207e(7, e2);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C0055g c0055g2 = new C0055g(22, this);
            if (Build.VERSION.SDK_INT < 24) {
                c0055g2.mo207e(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                c0055g2.mo207e(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C0055g c0055g3 = new C0055g(22, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            c0055g3.mo207e(16, null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
        } else {
            codeCacheDir = context.getCodeCacheDir();
        }
        if (AbstractC0730f.m1990c(codeCacheDir)) {
            c0055g3.mo207e(14, null);
        } else {
            c0055g3.mo207e(15, null);
        }
    }
}
