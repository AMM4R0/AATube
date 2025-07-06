package p028K;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: K.O */
/* loaded from: classes.dex */
public final class C0282O {

    /* renamed from: d */
    public static final ArrayList f838d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f839a;

    /* renamed from: b */
    public SparseArray f840b;

    /* renamed from: c */
    public WeakReference f841c;

    /* renamed from: a */
    public final View m767a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f839a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View m767a = m767a(viewGroup.getChildAt(childCount));
                    if (m767a != null) {
                        return m767a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
