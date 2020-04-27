package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import o.C3185;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u0004:\u0001\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lC;", "ǃ", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
public final class lC {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C0217 f2731 = new C0217((fL) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007"}, d2 = {"Lo/lC$ǃ;", "Landroid/content/Context;", "p0", "", "p1", "Landroid/app/Notification;", "ǃ", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification;", "ı", "Ι", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lC$ǃ  reason: contains not printable characters */
    public static final class C0217 {
        private C0217() {
        }

        public /* synthetic */ C0217(fL fLVar) {
            this();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Notification m3377(Context context, String str) {
            fM.m2254(context, "");
            fM.m2254(str, "");
            Notification r5 = new C3185.Cif(context, str).m16079(context.getText(R.string.f171442131886316)).m16086(context.getText(R.string.f171432131886315)).m16081(true).m16076(-1).m16088(2131231157).m16092(PendingIntent.getActivity(context, lR.f2769.m3505(), new Intent(context, C3573lo.class), 0)).m16073(context.getText(R.string.f171432131886315)).m16080((C3185.If) new C3185.C3187().m16105(context.getText(R.string.f171432131886315))).m16078(System.currentTimeMillis()).m16085((Uri) null).m16090((long[]) null).m16083(C0651.m5450(context, R.color.f156802131099862)).m16075();
            fM.m2252((Object) r5, "");
            return r5;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Notification m3378(Context context, String str) {
            fM.m2254(context, "");
            fM.m2254(str, "");
            Intent intent = new Intent(context, C3570lk.class);
            intent.putExtra("page", 3);
            PendingIntent activity = PendingIntent.getActivity(context, lR.f2769.m3519(), intent, 0);
            Notification r5 = new C3185.Cif(context, str).m16079(context.getText(R.string.f171422131886314)).m16086(context.getText(R.string.f171412131886313)).m16081(true).m16076(-1).m16088((int) R.drawable.f163562131231160).m16073(context.getText(R.string.f171412131886313)).m16077(R.drawable.f163552131231159, context.getText(R.string.f171402131886312), activity).m16092(activity).m16078(System.currentTimeMillis()).m16085((Uri) null).m16090((long[]) null).m16083(C0651.m5450(context, R.color.f156802131099862)).m16075();
            fM.m2252((Object) r5, "");
            return r5;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Notification m3376(Context context, String str) {
            fM.m2254(context, "");
            fM.m2254(str, "");
            Notification r5 = new C3185.Cif(context, str).m16079((CharSequence) context.getString(R.string.f171572131886341)).m16086((CharSequence) context.getString(R.string.f171552131886334)).m16081(true).m16076(-1).m16088(2131231157).m16078(System.currentTimeMillis()).m16085((Uri) null).m16090((long[]) null).m16092(PendingIntent.getActivity(context, lR.f2769.m3505(), new Intent(context, C3573lo.class), 0)).m16083(C0651.m5450(context, R.color.f156802131099862)).m16075();
            fM.m2252((Object) r5, "");
            return r5;
        }
    }
}
