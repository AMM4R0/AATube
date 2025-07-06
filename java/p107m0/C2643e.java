package p107m0;

import android.content.Intent;
import android.media.session.MediaSession;
import android.view.KeyEvent;
import com.carwizard.p075li.youtube.MainActivity;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: m0.e */
/* loaded from: classes.dex */
public final class C2643e extends MediaSession.Callback {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f8568a;

    public C2643e(MainActivity mainActivity) {
        this.f8568a = mainActivity;
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent mediaButtonEvent) {
        AbstractC2492i.m4915e(mediaButtonEvent, "mediaButtonEvent");
        KeyEvent keyEvent = (KeyEvent) mediaButtonEvent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        MainActivity mainActivity = this.f8568a;
        if (keyCode == 85) {
            MainActivity.m2021u(mainActivity, "togglePlayPause");
            return true;
        }
        if (keyCode == 87) {
            MainActivity.m2021u(mainActivity, "next");
            return true;
        }
        if (keyCode != 88) {
            return true;
        }
        MainActivity.m2021u(mainActivity, "previous");
        return true;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        MainActivity.m2021u(this.f8568a, "pause");
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        MainActivity.m2021u(this.f8568a, "play");
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        MainActivity.m2021u(this.f8568a, "next");
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        MainActivity.m2021u(this.f8568a, "previous");
    }
}
