package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$ı  reason: contains not printable characters */
    public interface C0018 {
        /* renamed from: ɩ  reason: contains not printable characters */
        Object m160();
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m159(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m159(super.instantiateApplication(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m159(super.instantiateReceiver(classLoader, str, intent));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m159(super.instantiateProvider(classLoader, str));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m159(super.instantiateService(classLoader, str, intent));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.core.app.CoreComponentFactory.C0018) r1).m160();
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T m159(T r1) {
        /*
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.C0018
            if (r0 == 0) goto L_0x000e
            r0 = r1
            androidx.core.app.CoreComponentFactory$ı r0 = (androidx.core.app.CoreComponentFactory.C0018) r0
            java.lang.Object r0 = r0.m160()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.CoreComponentFactory.m159(java.lang.Object):java.lang.Object");
    }
}
