package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import java.util.regex.Pattern;
import o.C1757;

public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1757 f998;

    @Keep
    static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.m1077(cls);
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, C1757 r2) {
        firebaseApp.m1074();
        f998 = r2;
    }

    static {
        Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }
}
