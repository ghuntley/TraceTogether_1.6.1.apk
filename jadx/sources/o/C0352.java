package o;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C3185;

/* renamed from: o.ıɾ  reason: contains not printable characters */
class C0352 implements C2974 {

    /* renamed from: ı  reason: contains not printable characters */
    private RemoteViews f3779;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3185.Cif f3780;

    /* renamed from: ɩ  reason: contains not printable characters */
    private RemoteViews f3781;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Notification.Builder f3782;

    /* renamed from: ι  reason: contains not printable characters */
    private final List<Bundle> f3783 = new ArrayList();

    /* renamed from: І  reason: contains not printable characters */
    private final Bundle f3784 = new Bundle();

    /* renamed from: і  reason: contains not printable characters */
    private RemoteViews f3785;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f3786;

    C0352(C3185.Cif ifVar) {
        this.f3780 = ifVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3782 = new Notification.Builder(ifVar.f14480, ifVar.f14484);
        } else {
            this.f3782 = new Notification.Builder(ifVar.f14480);
        }
        Notification notification = ifVar.f14491;
        this.f3782.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, ifVar.f14492).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(ifVar.f14461).setContentText(ifVar.f14479).setContentInfo(ifVar.f14489).setContentIntent(ifVar.f14470).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(ifVar.f14483, (notification.flags & 128) != 0).setLargeIcon(ifVar.f14457).setNumber(ifVar.f14493).setProgress(ifVar.f14455, ifVar.f14477, ifVar.f14485);
        if (Build.VERSION.SDK_INT < 21) {
            this.f3782.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3782.setSubText(ifVar.f14454).setUsesChronometer(ifVar.f14466).setPriority(ifVar.f14473);
            Iterator<C3185.C3186> it = ifVar.f14467.iterator();
            while (it.hasNext()) {
                m4506(it.next());
            }
            if (ifVar.f14464 != null) {
                this.f3784.putAll(ifVar.f14464);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (ifVar.f14456) {
                    this.f3784.putBoolean("android.support.localOnly", true);
                }
                if (ifVar.f14459 != null) {
                    this.f3784.putString("android.support.groupKey", ifVar.f14459);
                    if (ifVar.f14463) {
                        this.f3784.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f3784.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (ifVar.f14458 != null) {
                    this.f3784.putString("android.support.sortKey", ifVar.f14458);
                }
            }
            this.f3781 = ifVar.f14478;
            this.f3779 = ifVar.f14486;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3782.setShowWhen(ifVar.f14462);
            if (Build.VERSION.SDK_INT < 21 && ifVar.f14476 != null && !ifVar.f14476.isEmpty()) {
                this.f3784.putStringArray("android.people", (String[]) ifVar.f14476.toArray(new String[ifVar.f14476.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f3782.setLocalOnly(ifVar.f14456).setGroup(ifVar.f14459).setGroupSummary(ifVar.f14463).setSortKey(ifVar.f14458);
            this.f3786 = ifVar.f14488;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3782.setCategory(ifVar.f14460).setColor(ifVar.f14471).setVisibility(ifVar.f14465).setPublicVersion(ifVar.f14482).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = ifVar.f14476.iterator();
            while (it2.hasNext()) {
                this.f3782.addPerson(it2.next());
            }
            this.f3785 = ifVar.f14481;
            if (ifVar.f14453.size() > 0) {
                Bundle bundle = ifVar.m16082().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new Bundle() : bundle;
                Bundle bundle2 = new Bundle();
                for (int i = 0; i < ifVar.f14453.size(); i++) {
                    bundle2.putBundle(Integer.toString(i), C0338.m4458(ifVar.f14453.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                ifVar.m16082().putBundle("android.car.EXTENSIONS", bundle);
                this.f3784.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3782.setExtras(ifVar.f14464).setRemoteInputHistory(ifVar.f14474);
            if (ifVar.f14478 != null) {
                this.f3782.setCustomContentView(ifVar.f14478);
            }
            if (ifVar.f14486 != null) {
                this.f3782.setCustomBigContentView(ifVar.f14486);
            }
            if (ifVar.f14481 != null) {
                this.f3782.setCustomHeadsUpContentView(ifVar.f14481);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3782.setBadgeIconType(ifVar.f14487).setShortcutId(ifVar.f14490).setTimeoutAfter(ifVar.f14469).setGroupAlertBehavior(ifVar.f14488);
            if (ifVar.f14472) {
                this.f3782.setColorized(ifVar.f14475);
            }
            if (!TextUtils.isEmpty(ifVar.f14484)) {
                this.f3782.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Notification.Builder m4509() {
        return this.f3782;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Notification m4507() {
        Bundle r1;
        RemoteViews r12;
        RemoteViews r13;
        C3185.If ifR = this.f3780.f14468;
        if (ifR != null) {
            ifR.m16063(this);
        }
        RemoteViews r14 = ifR != null ? ifR.m16066(this) : null;
        Notification r2 = m4508();
        if (r14 != null) {
            r2.contentView = r14;
        } else if (this.f3780.f14478 != null) {
            r2.contentView = this.f3780.f14478;
        }
        if (!(Build.VERSION.SDK_INT < 16 || ifR == null || (r13 = ifR.m16061(this)) == null)) {
            r2.bigContentView = r13;
        }
        if (!(Build.VERSION.SDK_INT < 21 || ifR == null || (r12 = this.f3780.f14468.m16064((C2974) this)) == null)) {
            r2.headsUpContentView = r12;
        }
        if (!(Build.VERSION.SDK_INT < 16 || ifR == null || (r1 = C3185.m16060(r2)) == null)) {
            ifR.m16065(r1);
        }
        return r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m4506(C3185.C3186 r6) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(r6.m16098(), r6.m16100(), r6.m16095());
            if (r6.m16103() != null) {
                for (RemoteInput addRemoteInput : C0370.m4566(r6.m16103())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (r6.m16097() != null) {
                bundle = new Bundle(r6.m16097());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", r6.m16101());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(r6.m16101());
            }
            bundle.putInt("android.support.action.semanticAction", r6.m16099());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(r6.m16099());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", r6.m16096());
            builder.addExtras(bundle);
            this.f3782.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f3783.add(C0338.m4459(this.f3782, r6));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public Notification m4508() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3782.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.f3782.build();
            if (this.f3786 != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f3786 != 2)) {
                    m4505(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f3786 == 1) {
                    m4505(build);
                }
            }
            return build;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f3782.setExtras(this.f3784);
            Notification build2 = this.f3782.build();
            RemoteViews remoteViews = this.f3781;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f3779;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f3785;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f3786 != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f3786 != 2)) {
                    m4505(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f3786 == 1) {
                    m4505(build2);
                }
            }
            return build2;
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f3782.setExtras(this.f3784);
            Notification build3 = this.f3782.build();
            RemoteViews remoteViews4 = this.f3781;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f3779;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f3786 != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f3786 != 2)) {
                    m4505(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f3786 == 1) {
                    m4505(build3);
                }
            }
            return build3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> r0 = C0338.m4455(this.f3783);
            if (r0 != null) {
                this.f3784.putSparseParcelableArray("android.support.actionExtras", r0);
            }
            this.f3782.setExtras(this.f3784);
            Notification build4 = this.f3782.build();
            RemoteViews remoteViews6 = this.f3781;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f3779;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (Build.VERSION.SDK_INT < 16) {
            return this.f3782.getNotification();
        } else {
            Notification build5 = this.f3782.build();
            Bundle r1 = C3185.m16060(build5);
            Bundle bundle = new Bundle(this.f3784);
            for (String str : this.f3784.keySet()) {
                if (r1.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            r1.putAll(bundle);
            SparseArray<Bundle> r12 = C0338.m4455(this.f3783);
            if (r12 != null) {
                C3185.m16060(build5).putSparseParcelableArray("android.support.actionExtras", r12);
            }
            RemoteViews remoteViews8 = this.f3781;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f3779;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m4505(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
