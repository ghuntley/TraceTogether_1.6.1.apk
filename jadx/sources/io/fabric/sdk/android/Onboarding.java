package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import o.C3263ac;
import o.C3269ai;
import o.C3276ap;
import o.C3281au;
import o.C3285aw;
import o.C3287ay;
import o.C3300bk;
import o.C3301bl;
import o.C3309bt;
import o.C3313bx;
import o.C3608mu;
import o.aD;
import o.bA;
import o.bE;
import o.bH;
import o.bM;
import o.bV;

public class Onboarding extends C3269ai<Boolean> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3301bl f1007 = new C3300bk();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f1008;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f1009;

    /* renamed from: ɩ  reason: contains not printable characters */
    private PackageInfo f1010;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f1011;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final Collection<C3269ai> f1012;

    /* renamed from: Ι  reason: contains not printable characters */
    private PackageManager f1013;

    /* renamed from: ι  reason: contains not printable characters */
    private String f1014;

    /* renamed from: І  reason: contains not printable characters */
    private String f1015;

    /* renamed from: г  reason: contains not printable characters */
    private final Future<Map<String, C3608mu>> f1016;

    /* renamed from: ӏ  reason: contains not printable characters */
    private String f1017;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m1140() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public String m1141() {
        return "1.4.8.32";
    }

    public Onboarding(Future<Map<String, C3608mu>> future, Collection<C3269ai> collection) {
        this.f1016 = future;
        this.f1012 = collection;
    }

    public boolean e_() {
        try {
            aD r1 = m1595();
            this.f1015 = r1.f1393.m1482(r1.f1391);
            this.f1013 = m1589().getPackageManager();
            this.f1009 = m1589().getPackageName();
            this.f1010 = this.f1013.getPackageInfo(this.f1009, 0);
            this.f1014 = Integer.toString(this.f1010.versionCode);
            this.f1008 = this.f1010.versionName == null ? "0.0" : this.f1010.versionName;
            this.f1011 = this.f1013.getApplicationLabel(m1589().getApplicationInfo()).toString();
            this.f1017 = Integer.toString(m1589().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            C3263ac.m1563();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Boolean m1139() {
        Map map;
        boolean z;
        String r0 = C3285aw.m1680(m1589());
        bM r1 = m1138();
        boolean z2 = false;
        if (r1 != null) {
            try {
                if (this.f1016 != null) {
                    map = this.f1016.get();
                } else {
                    map = new HashMap();
                }
                Map<String, C3608mu> r3 = m1137(map, this.f1012);
                bA bAVar = r1.f1619;
                Collection<C3608mu> values = r3.values();
                if ("new".equals(bAVar.f1578)) {
                    if (new C3313bx(this, C3285aw.m1660(m1589(), "com.crashlytics.ApiEndpoint"), bAVar.f1580, this.f1007).m1840(m1135(bE.m1704(m1589(), r0), values))) {
                        z = bH.C0122.f1602.m1711();
                    } else {
                        C3263ac.m1563();
                    }
                } else if ("configured".equals(bAVar.f1578)) {
                    z = bH.C0122.f1602.m1711();
                } else {
                    if (bAVar.f1577) {
                        C3263ac.m1563();
                        new bV(this, C3285aw.m1660(m1589(), "com.crashlytics.ApiEndpoint"), bAVar.f1580, this.f1007).m1731(m1135(bE.m1704(m1589(), r0), values));
                    }
                    z2 = true;
                }
                z2 = z;
            } catch (Exception unused) {
                C3263ac.m1563();
            }
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Map<String, C3608mu> m1137(Map<String, C3608mu> map, Collection<C3269ai> collection) {
        for (C3269ai next : collection) {
            if (!map.containsKey(next.m1591())) {
                map.put(next.m1591(), new C3608mu(next.m1591(), next.m1597(), "binary"));
            }
        }
        return map;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C3309bt m1135(bE bEVar, Collection<C3608mu> collection) {
        Context r0 = m1589();
        return new C3309bt(C3276ap.m1615(r0), m1595().f1399, this.f1008, this.f1014, C3285aw.m1676(C3285aw.m1678(r0)), this.f1011, C3287ay.m1698(this.f1015).f1575, this.f1017, "0", bEVar, collection);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private bM m1138() {
        try {
            bH.C0122.f1602.m1710(this, this.f1512, this.f1007, this.f1014, this.f1008, C3285aw.m1660(m1589(), "com.crashlytics.ApiEndpoint"), C3281au.m1627(m1589())).m1712();
            return bH.C0122.f1602.m1709();
        } catch (Exception unused) {
            C3263ac.m1563();
            return null;
        }
    }
}
