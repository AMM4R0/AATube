package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p102k.InterfaceC2449B;
import p102k.MenuC2466m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC2449B {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p102k.InterfaceC2449B
    /* renamed from: d */
    public final void mo1492d(MenuC2466m menuC2466m) {
    }
}
