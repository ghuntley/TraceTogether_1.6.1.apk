package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import o.C1965;
import o.C2117;
import o.C2294;
import o.C2382;

public final class MaterialTextInputPicker<S> extends C2294<S> {

    /* renamed from: ı  reason: contains not printable characters */
    private C2117<S> f819;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1965 f820;

    /* renamed from: ι  reason: contains not printable characters */
    static <T> MaterialTextInputPicker<T> m950(C2117<T> r3, C1965 r4) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", r3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", r4);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f819);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f820);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f819 = (C2117) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f820 = (C1965) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2117<S> r1 = this.f819;
        new C2382<S>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m951(S s) {
                Iterator<C2382<S>> it = MaterialTextInputPicker.this.f10691.iterator();
                while (it.hasNext()) {
                    it.next().m12378(s);
                }
            }
        };
        return r1.m11279();
    }
}
