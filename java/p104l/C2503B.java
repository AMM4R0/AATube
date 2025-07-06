package p104l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.C0620j;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p002A1.C0015h;
import p006C.C0055g;
import p009D.AbstractC0102h;
import p009D.InterfaceC0101g;
import p010D0.C0109g;
import p036M1.AbstractC0379e;
import p058V.C0526b;
import p058V.C0529e;
import p058V.C0532h;
import p058V.C0533i;
import p076d.AbstractC0780a;

/* renamed from: l.B */
/* loaded from: classes.dex */
public class C2503B {

    /* renamed from: d */
    public static final int[] f8187d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final /* synthetic */ int f8188a = 2;

    /* renamed from: b */
    public View f8189b;

    /* renamed from: c */
    public Object f8190c;

    public /* synthetic */ C2503B() {
    }

    /* renamed from: a */
    public KeyListener m4923a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0109g) ((C0055g) this.f8190c).f107b).getClass();
        if (keyListener instanceof C0529e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0529e(keyListener);
    }

    /* renamed from: b */
    public void mo4924b(AttributeSet attributeSet, int r10) {
        switch (this.f8188a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f8189b;
                C0015h m100A = C0015h.m100A(absSeekBar.getContext(), attributeSet, f8187d, r10);
                Drawable m122q = m100A.m122q(0);
                if (m122q != null) {
                    if (m122q instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) m122q;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int r5 = 0; r5 < numberOfFrames; r5++) {
                            Drawable m4927e = m4927e(animationDrawable.getFrame(r5), true);
                            m4927e.setLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                            animationDrawable2.addFrame(m4927e, animationDrawable.getDuration(r5));
                        }
                        animationDrawable2.setLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                        m122q = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(m122q);
                }
                Drawable m122q2 = m100A.m122q(1);
                if (m122q2 != null) {
                    absSeekBar.setProgressDrawable(m4927e(m122q2, false));
                }
                m100A.m102C();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f8189b).getContext().obtainStyledAttributes(attributeSet, AbstractC0780a.f3122i, r10, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    m4926d(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* renamed from: c */
    public C0526b m4925c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0055g c0055g = (C0055g) this.f8190c;
        if (inputConnection == null) {
            c0055g.getClass();
            inputConnection = null;
        } else {
            C0109g c0109g = (C0109g) c0055g.f107b;
            c0109g.getClass();
            if (!(inputConnection instanceof C0526b)) {
                inputConnection = new C0526b((EditText) c0109g.f338b, inputConnection, editorInfo);
            }
        }
        return (C0526b) inputConnection;
    }

    /* renamed from: d */
    public void m4926d(boolean z2) {
        C0533i c0533i = (C0533i) ((C0109g) ((C0055g) this.f8190c).f107b).f339c;
        if (c0533i.f1454c != z2) {
            if (c0533i.f1453b != null) {
                C0620j m1629a = C0620j.m1629a();
                C0532h c0532h = c0533i.f1453b;
                m1629a.getClass();
                AbstractC0379e.m1073d(c0532h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = m1629a.f2071a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    m1629a.f2072b.remove(c0532h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0533i.f1454c = z2;
            if (z2) {
                C0533i.m1388a(c0533i.f1452a, C0620j.m1629a().m1630b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public Drawable m4927e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0101g) {
            ((AbstractC0102h) ((InterfaceC0101g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int r3 = 0; r3 < numberOfLayers; r3++) {
                    int id = layerDrawable.getId(r3);
                    drawableArr[r3] = m4927e(layerDrawable.getDrawable(r3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int r2 = 0; r2 < numberOfLayers; r2++) {
                    layerDrawable2.setId(r2, layerDrawable.getId(r2));
                    layerDrawable2.setLayerGravity(r2, layerDrawable.getLayerGravity(r2));
                    layerDrawable2.setLayerWidth(r2, layerDrawable.getLayerWidth(r2));
                    layerDrawable2.setLayerHeight(r2, layerDrawable.getLayerHeight(r2));
                    layerDrawable2.setLayerInsetLeft(r2, layerDrawable.getLayerInsetLeft(r2));
                    layerDrawable2.setLayerInsetRight(r2, layerDrawable.getLayerInsetRight(r2));
                    layerDrawable2.setLayerInsetTop(r2, layerDrawable.getLayerInsetTop(r2));
                    layerDrawable2.setLayerInsetBottom(r2, layerDrawable.getLayerInsetBottom(r2));
                    layerDrawable2.setLayerInsetStart(r2, layerDrawable.getLayerInsetStart(r2));
                    layerDrawable2.setLayerInsetEnd(r2, layerDrawable.getLayerInsetEnd(r2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f8190c) == null) {
                    this.f8190c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C2503B(AbsSeekBar absSeekBar) {
        this.f8189b = absSeekBar;
    }

    public C2503B(EditText editText) {
        this.f8189b = editText;
        this.f8190c = new C0055g(editText);
    }
}
