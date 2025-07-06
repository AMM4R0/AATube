package p058V;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0616f;
import androidx.emoji2.text.C0620j;
import java.nio.ByteBuffer;
import p057U.C0524b;
import p081e1.C0879e;

/* renamed from: V.b */
/* loaded from: classes.dex */
public final class C0526b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f1438a;

    /* renamed from: b */
    public final C0879e f1439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C0879e c0879e = new C0879e();
        this.f1438a = editText;
        this.f1439b = c0879e;
        if (C0620j.f2070j != null) {
            C0620j m1629a = C0620j.m1629a();
            if (m1629a.m1630b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0616f c0616f = m1629a.f2075e;
            c0616f.getClass();
            Bundle bundle = editorInfo.extras;
            C0524b c0524b = (C0524b) c0616f.f2065c.f219a;
            int m689a = c0524b.m689a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", m689a != 0 ? ((ByteBuffer) c0524b.f833d).getInt(m689a + c0524b.f830a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0616f.f2063a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
        Editable editableText = this.f1438a.getEditableText();
        this.f1439b.getClass();
        return C0879e.m2397j(this, editableText, r3, r4, false) || super.deleteSurroundingText(r3, r4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
        Editable editableText = this.f1438a.getEditableText();
        this.f1439b.getClass();
        return C0879e.m2397j(this, editableText, r3, r4, true) || super.deleteSurroundingTextInCodePoints(r3, r4);
    }
}
