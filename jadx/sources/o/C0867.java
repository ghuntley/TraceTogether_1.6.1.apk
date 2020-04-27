package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;

/* renamed from: o.ǀІ  reason: contains not printable characters */
class C0867 {

    /* renamed from: ı  reason: contains not printable characters */
    private final AlertDialog.Builder f5639;

    /* renamed from: Ι  reason: contains not printable characters */
    private final If f5640;

    /* renamed from: o.ǀІ$ı  reason: contains not printable characters */
    interface C0868 {
        /* renamed from: ı  reason: contains not printable characters */
        void m6443(boolean z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m6435(float f, int i) {
        return (int) (f * ((float) i));
    }

    /* renamed from: o.ǀІ$If */
    static class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean f5645;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final CountDownLatch f5646;

        private If() {
            this.f5645 = false;
            this.f5646 = new CountDownLatch(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m6441(boolean z) {
            this.f5645 = z;
            this.f5646.countDown();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m6442() {
            return this.f5645;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public void m6440() {
            try {
                this.f5646.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0867 m6434(Activity activity, bL bLVar, final C0868 r7) {
        final If ifR = new If();
        C1114 r1 = new C1114(activity, bLVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView r5 = m6436(activity, r1.m7523());
        builder.setView(r5).setTitle(r1.m7524()).setCancelable(false).setNeutralButton(r1.m7526(), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ifR.m6441(true);
                dialogInterface.dismiss();
            }
        });
        if (bLVar.f1613) {
            builder.setNegativeButton(r1.m7522(), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ifR.m6441(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (bLVar.f1615) {
            builder.setPositiveButton(r1.m7525(), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    r7.m6443(true);
                    ifR.m6441(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new C0867(builder, ifR);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static ScrollView m6436(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int r1 = m6435(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(r1, r1, r1, r1);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(m6435(f, 14), m6435(f, 2), m6435(f, 10), m6435(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    private C0867(AlertDialog.Builder builder, If ifR) {
        this.f5640 = ifR;
        this.f5639 = builder;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m6439() {
        this.f5639.show();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m6437() {
        this.f5640.m6440();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m6438() {
        return this.f5640.m6442();
    }
}
