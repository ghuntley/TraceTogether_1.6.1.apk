package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import o.C2177;
import o.C2338;
import o.C2340;
import o.C2362;

@Keep
public class CctBackendFactory implements C2340 {
    public C2362 create(C2338 r4) {
        return new C2177(r4.m12193(), r4.m12195(), r4.m12194());
    }
}
