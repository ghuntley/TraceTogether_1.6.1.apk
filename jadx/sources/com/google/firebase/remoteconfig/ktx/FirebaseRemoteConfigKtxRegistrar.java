package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import o.C2344;
import o.C2745;
import o.dN;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/firebase/remoteconfig/ktx/FirebaseRemoteConfigKtxRegistrar;", "", "Lo/Б;", "getComponents", "()Ljava/util/List;", "<init>", "()V", "Lcom/google/firebase/components/ComponentRegistrar;"}, k = 1, mv = {1, 1, 13})
@Keep
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    public final List<C2344<?>> getComponents() {
        return dN.m2073(C2745.m14502("fire-cfg-ktx", "19.1.2"));
    }
}
